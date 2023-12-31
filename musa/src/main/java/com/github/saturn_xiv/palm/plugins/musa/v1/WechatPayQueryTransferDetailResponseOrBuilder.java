// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musa.proto

// Protobuf Java Version: 3.25.0
package com.github.saturn_xiv.palm.plugins.musa.v1;

public interface WechatPayQueryTransferDetailResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:palm.musa.v1.WechatPayQueryTransferDetailResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string app_id = 1;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <code>string app_id = 1;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <code>string mch_id = 2;</code>
   * @return The mchId.
   */
  java.lang.String getMchId();
  /**
   * <code>string mch_id = 2;</code>
   * @return The bytes for mchId.
   */
  com.google.protobuf.ByteString
      getMchIdBytes();

  /**
   * <code>string open_id = 3;</code>
   * @return The openId.
   */
  java.lang.String getOpenId();
  /**
   * <code>string open_id = 3;</code>
   * @return The bytes for openId.
   */
  com.google.protobuf.ByteString
      getOpenIdBytes();

  /**
   * <code>optional string user_name = 4;</code>
   * @return Whether the userName field is set.
   */
  boolean hasUserName();
  /**
   * <code>optional string user_name = 4;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>optional string user_name = 4;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string batch_id = 11;</code>
   * @return The batchId.
   */
  java.lang.String getBatchId();
  /**
   * <code>string batch_id = 11;</code>
   * @return The bytes for batchId.
   */
  com.google.protobuf.ByteString
      getBatchIdBytes();

  /**
   * <code>string out_batch_no = 12;</code>
   * @return The outBatchNo.
   */
  java.lang.String getOutBatchNo();
  /**
   * <code>string out_batch_no = 12;</code>
   * @return The bytes for outBatchNo.
   */
  com.google.protobuf.ByteString
      getOutBatchNoBytes();

  /**
   * <code>string out_detail_no = 13;</code>
   * @return The outDetailNo.
   */
  java.lang.String getOutDetailNo();
  /**
   * <code>string out_detail_no = 13;</code>
   * @return The bytes for outDetailNo.
   */
  com.google.protobuf.ByteString
      getOutDetailNoBytes();

  /**
   * <code>string detail_id = 14;</code>
   * @return The detailId.
   */
  java.lang.String getDetailId();
  /**
   * <code>string detail_id = 14;</code>
   * @return The bytes for detailId.
   */
  com.google.protobuf.ByteString
      getDetailIdBytes();

  /**
   * <code>string detail_status = 15;</code>
   * @return The detailStatus.
   */
  java.lang.String getDetailStatus();
  /**
   * <code>string detail_status = 15;</code>
   * @return The bytes for detailStatus.
   */
  com.google.protobuf.ByteString
      getDetailStatusBytes();

  /**
   * <code>int64 transfer_amount = 16;</code>
   * @return The transferAmount.
   */
  long getTransferAmount();

  /**
   * <code>string transfer_remark = 17;</code>
   * @return The transferRemark.
   */
  java.lang.String getTransferRemark();
  /**
   * <code>string transfer_remark = 17;</code>
   * @return The bytes for transferRemark.
   */
  com.google.protobuf.ByteString
      getTransferRemarkBytes();

  /**
   * <code>optional string fail_reason = 18;</code>
   * @return Whether the failReason field is set.
   */
  boolean hasFailReason();
  /**
   * <code>optional string fail_reason = 18;</code>
   * @return The failReason.
   */
  java.lang.String getFailReason();
  /**
   * <code>optional string fail_reason = 18;</code>
   * @return The bytes for failReason.
   */
  com.google.protobuf.ByteString
      getFailReasonBytes();

  /**
   * <code>string initiate_time = 19;</code>
   * @return The initiateTime.
   */
  java.lang.String getInitiateTime();
  /**
   * <code>string initiate_time = 19;</code>
   * @return The bytes for initiateTime.
   */
  com.google.protobuf.ByteString
      getInitiateTimeBytes();

  /**
   * <code>string update_time = 20;</code>
   * @return The updateTime.
   */
  java.lang.String getUpdateTime();
  /**
   * <code>string update_time = 20;</code>
   * @return The bytes for updateTime.
   */
  com.google.protobuf.ByteString
      getUpdateTimeBytes();
}
