package com.github.saturn_xiv.palm.plugins.musa.wechatpay.services.impl;

import com.github.saturn_xiv.palm.plugins.musa.v1.*;
import com.github.saturn_xiv.palm.plugins.musa.wechatpay.models.*;
import com.github.saturn_xiv.palm.plugins.musa.wechatpay.models.transfer.ReceiptAcceptType;
import com.github.saturn_xiv.palm.plugins.musa.wechatpay.models.transfer.ReceiptSignatureStatus;
import com.github.saturn_xiv.palm.plugins.musa.wechatpay.models.transfer.TransferDetailElectronicReceipt;
import com.github.saturn_xiv.palm.plugins.musa.wechatpay.repositories.*;
import com.github.saturn_xiv.palm.plugins.musa.wechatpay.services.WechatPayStorageService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service("palm.musa.service.wechat-pay-storage")
public class WechatPayStorageServiceImpl implements WechatPayStorageService {


    @Override
    public void addNotification(com.wechat.pay.java.core.notification.Notification notification, String resource) {
        var it = new Notification();
        it.setUid(notification.getId());
        it.setCreateTime(notification.getCreateTime());
        it.setEventType(notification.getEventType());
        it.setSummary(notification.getSummary());
        it.setResourceType(notification.getResourceType());
        it.setResource(resource);
        it.setCreatedAt(new Date());
        notificationRepository.save(it);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addRefund(String outTradeNo, String outRefundNo, WechatPayCreateRefundRequest.Amount amount, String reason) {
        var it = new Refund();
        it.setOutRefundNo(outRefundNo);
        it.setOutTradeNo(outTradeNo);
        it.setAmountTotal(amount.getTotal());
        it.setAmountRefund(amount.getRefund());
        it.setAmountCurrency(amount.getCurrency().getNumber());
        it.setReason(reason);
        it.setCreatedAt(new Date());
        refundRepository.save(it);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addOrder(String appId, String payerOpenId, String outTradeNo, WechatPayPrepayRequest.Amount amount,
                         String description, String response) {
        var it = new Order();
        it.setAppId(appId);
        it.setPayerOpenId(payerOpenId);
        it.setOutTradeNo(outTradeNo);
        it.setAmountTotal(amount.getTotal());
        it.setAmountCurrency(amount.getCurrency().getNumber());
        it.setDescription(description);
        it.setResponse(response);
        it.setCreatedAt(new Date());
        orderRepository.save(it);
    }

    @Transactional(readOnly = true)
    @Override
    public FundFlowBill getFundFlowBill(@NotNull String billDate, @NotNull WechatPayFundFlowBillRequest.AccountType accountType) {
        return fundFlowBillRepository.findByBillDateAndAccountType(billDate, accountType.getNumber());
    }

    @Transactional(readOnly = true)
    @Override
    public TradeBill getTradeBill(@NotNull String billDate, @NotNull WechatPayTradeBillRequest.BillType billType) {
        return tradeBillRepository.findByBillDateAndBillType(billDate, billType.getNumber());
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addFundFlowBill(String billDate, WechatPayFundFlowBillRequest.AccountType accountType, WechatPayTarType tarType, byte[] content) {
        var it = new FundFlowBill();

        it.setBillDate(billDate);
        it.setAccountType(accountType.getNumber());
        it.setTarType(tarType.getNumber());
        it.setContent(content);
        it.setCreatedAt(new Date());
        fundFlowBillRepository.save(it);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addTradeBill(String billDate, WechatPayTradeBillRequest.BillType billType, WechatPayTarType tarType, byte[] content) {
        var it = new TradeBill();
        it.setBillDate(billDate);
        it.setBillType(billType.getNumber());
        it.setTarType(tarType.getNumber());
        it.setContent(content);
        it.setCreatedAt(new Date());
        tradeBillRepository.save(it);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void acceptBatchTransferReceipts(String outBatchNo, String... outDetailNos) {
        {
            var it = transferBillReceiptRepository.findByOutBatchNo(outBatchNo);
            it.setSignatureStatus(ReceiptSignatureStatus.ACCEPTED);
            it.setUpdatedAt(new Date());
            transferBillReceiptRepository.save(it);
        }

        for (var outDetailNo : outDetailNos) {
            var it = new TransferDetailElectronicReceipt();
            it.setOutBatchNo(outBatchNo);
            it.setOutDetailNo(outDetailNo);
            it.setAcceptType(ReceiptAcceptType.BATCH_TRANSFER);
            it.setSignatureStatus(ReceiptSignatureStatus.ACCEPTED);
            var now = new Date();
            it.setUpdatedAt(now);
            it.setCreatedAt(now);
            transferDetailElectronicReceiptRepository.save(it);
        }

    }

    @Override
    public void finishBatchTransferReceipt(String outBatchNo, byte[] content) {
        var it = transferBillReceiptRepository.findByOutBatchNo(outBatchNo);
        it.setSignatureStatus(ReceiptSignatureStatus.FINISHED);
        it.setContent(content);
        it.setUpdatedAt(new Date());
        transferBillReceiptRepository.save(it);
    }

    @Override
    public void finishDetailElectronicReceipt(String acceptType, String outBatchNo, String outDetailNo, byte[] content) {
        var it = transferDetailElectronicReceiptRepository.findByOutBatchNoAndOutDetailNoAndAcceptType(outBatchNo, outDetailNo, acceptType);
        it.setSignatureStatus(ReceiptSignatureStatus.FINISHED);
        it.setContent(content);
        it.setUpdatedAt(new Date());
        transferDetailElectronicReceiptRepository.save(it);
    }

    @Autowired
    WechatPayTradeBillRepository tradeBillRepository;
    @Autowired
    WechatPayFundFlowBillRepository fundFlowBillRepository;
    @Autowired
    WechatPayOrderRepository orderRepository;
    @Autowired
    WechatPayRefundRepository refundRepository;
    @Autowired
    WechatPayNotificationRepository notificationRepository;
    @Autowired
    WechatPayTransferBillReceiptRepository transferBillReceiptRepository;
    @Autowired
    WechatPayTransferDetailElectronicReceiptRepository transferDetailElectronicReceiptRepository;


}
