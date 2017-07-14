// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/broker/broker.proto

package org.thethingsnetwork.api.broker;

public interface ActivationChallengeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:broker.ActivationChallengeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes payload = 1;</code>
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>.protocol.Message message = 2;</code>
   */
  boolean hasMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  org.thethingsnetwork.api.protocol.Message getMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  org.thethingsnetwork.api.protocol.MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>bytes dev_eui = 11 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI"];</code>
   */
  com.google.protobuf.ByteString getDevEui();

  /**
   * <code>bytes app_eui = 12 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
   */
  com.google.protobuf.ByteString getAppEui();

  /**
   * <code>string app_id = 13;</code>
   */
  java.lang.String getAppId();
  /**
   * <code>string app_id = 13;</code>
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <code>string dev_id = 14;</code>
   */
  java.lang.String getDevId();
  /**
   * <code>string dev_id = 14;</code>
   */
  com.google.protobuf.ByteString
      getDevIdBytes();
}
