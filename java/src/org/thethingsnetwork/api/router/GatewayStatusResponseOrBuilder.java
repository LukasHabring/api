// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/router/router.proto

package org.thethingsnetwork.api.router;

public interface GatewayStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:router.GatewayStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 last_seen = 1;</code>
   */
  long getLastSeen();

  /**
   * <code>.gateway.Status status = 2;</code>
   */
  boolean hasStatus();
  /**
   * <code>.gateway.Status status = 2;</code>
   */
  org.thethingsnetwork.api.gateway.Status getStatus();
  /**
   * <code>.gateway.Status status = 2;</code>
   */
  org.thethingsnetwork.api.gateway.StatusOrBuilder getStatusOrBuilder();
}
