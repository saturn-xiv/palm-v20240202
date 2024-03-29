package com.github.saturn_xiv.palm.plugins.musa.wechatpay.repositories;

import com.github.saturn_xiv.palm.plugins.musa.wechatpay.models.TradeBill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("palm.musa.repository.wechat-pay.trade-bill")
public interface WechatPayTradeBillRepository extends CrudRepository<TradeBill, Integer> {
    TradeBill findById(int id);

    TradeBill findByBillDateAndBillType(String billDate, int billType);

    List<TradeBill> findAllByBillType(int billType);

    List<TradeBill> findAllByBillDate(String billDate);

}
