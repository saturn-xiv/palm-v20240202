// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: casbin.proto

// Protobuf Java Version: 3.25.0
package com.github.saturn_xiv.palm.plugins.casbin.v1;

public interface EnforceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:palm.lily.v1.EnforceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 enforcerHandler = 1;</code>
   * @return The enforcerHandler.
   */
  int getEnforcerHandler();

  /**
   * <code>repeated string params = 2;</code>
   * @return A list containing the params.
   */
  java.util.List<java.lang.String>
      getParamsList();
  /**
   * <code>repeated string params = 2;</code>
   * @return The count of params.
   */
  int getParamsCount();
  /**
   * <code>repeated string params = 2;</code>
   * @param index The index of the element to return.
   * @return The params at the given index.
   */
  java.lang.String getParams(int index);
  /**
   * <code>repeated string params = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the params at the given index.
   */
  com.google.protobuf.ByteString
      getParamsBytes(int index);
}
