// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/broker/broker.proto

package org.thethingsnetwork.api.broker;

public interface DeviceActivationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:broker.DeviceActivationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes payload = 1;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>.protocol.Message message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   * @return The message.
   */
  org.thethingsnetwork.api.protocol.Message getMessage();
  /**
   * <code>.protocol.Message message = 2;</code>
   */
  org.thethingsnetwork.api.protocol.MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>.broker.DownlinkOption downlink_option = 11;</code>
   * @return Whether the downlinkOption field is set.
   */
  boolean hasDownlinkOption();
  /**
   * <code>.broker.DownlinkOption downlink_option = 11;</code>
   * @return The downlinkOption.
   */
  org.thethingsnetwork.api.broker.DownlinkOption getDownlinkOption();
  /**
   * <code>.broker.DownlinkOption downlink_option = 11;</code>
   */
  org.thethingsnetwork.api.broker.DownlinkOptionOrBuilder getDownlinkOptionOrBuilder();

  /**
   * <code>.trace.Trace trace = 21;</code>
   * @return Whether the trace field is set.
   */
  boolean hasTrace();
  /**
   * <code>.trace.Trace trace = 21;</code>
   * @return The trace.
   */
  org.thethingsnetwork.api.trace.Trace getTrace();
  /**
   * <code>.trace.Trace trace = 21;</code>
   */
  org.thethingsnetwork.api.trace.TraceOrBuilder getTraceOrBuilder();
}