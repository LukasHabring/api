// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lorawan.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  boolean hasMHdr();
  /**
   * <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.MHDR getMHdr();
  /**
   * <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.MHDROrBuilder getMHdrOrBuilder();

  /**
   * <code>bytes mic = 2;</code>
   */
  com.google.protobuf.ByteString getMic();

  /**
   * <code>.lorawan.MACPayload mac_payload = 3;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.MACPayload getMacPayload();
  /**
   * <code>.lorawan.MACPayload mac_payload = 3;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.MACPayloadOrBuilder getMacPayloadOrBuilder();

  /**
   * <code>.lorawan.JoinRequestPayload join_request_payload = 4;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload getJoinRequestPayload();
  /**
   * <code>.lorawan.JoinRequestPayload join_request_payload = 4;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayloadOrBuilder getJoinRequestPayloadOrBuilder();

  /**
   * <code>.lorawan.JoinAcceptPayload join_accept_payload = 5;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.JoinAcceptPayload getJoinAcceptPayload();
  /**
   * <code>.lorawan.JoinAcceptPayload join_accept_payload = 5;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.JoinAcceptPayloadOrBuilder getJoinAcceptPayloadOrBuilder();

  public org.thethingsnetwork.api.protocol.lorawan.Message.PayloadCase getPayloadCase();
}
