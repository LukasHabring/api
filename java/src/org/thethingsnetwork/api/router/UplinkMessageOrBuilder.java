// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/router/router.proto

package org.thethingsnetwork.api.router;

public interface UplinkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:router.UplinkMessage)
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
   * <code>.protocol.RxMetadata protocol_metadata = 11;</code>
   */
  boolean hasProtocolMetadata();
  /**
   * <code>.protocol.RxMetadata protocol_metadata = 11;</code>
   */
  org.thethingsnetwork.api.protocol.RxMetadata getProtocolMetadata();
  /**
   * <code>.protocol.RxMetadata protocol_metadata = 11;</code>
   */
  org.thethingsnetwork.api.protocol.RxMetadataOrBuilder getProtocolMetadataOrBuilder();

  /**
   * <code>.gateway.RxMetadata gateway_metadata = 12;</code>
   */
  boolean hasGatewayMetadata();
  /**
   * <code>.gateway.RxMetadata gateway_metadata = 12;</code>
   */
  org.thethingsnetwork.api.gateway.RxMetadata getGatewayMetadata();
  /**
   * <code>.gateway.RxMetadata gateway_metadata = 12;</code>
   */
  org.thethingsnetwork.api.gateway.RxMetadataOrBuilder getGatewayMetadataOrBuilder();

  /**
   * <code>.trace.Trace trace = 21;</code>
   */
  boolean hasTrace();
  /**
   * <code>.trace.Trace trace = 21;</code>
   */
  org.thethingsnetwork.api.trace.Trace getTrace();
  /**
   * <code>.trace.Trace trace = 21;</code>
   */
  org.thethingsnetwork.api.trace.TraceOrBuilder getTraceOrBuilder();
}
