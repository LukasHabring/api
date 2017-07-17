// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

public interface DryUplinkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:handler.DryUplinkMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The binary payload to use
   * </pre>
   *
   * <code>bytes payload = 1;</code>
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <pre>
   * The Application containing the payload functions that should be executed
   * </pre>
   *
   * <code>.handler.Application app = 2;</code>
   */
  boolean hasApp();
  /**
   * <pre>
   * The Application containing the payload functions that should be executed
   * </pre>
   *
   * <code>.handler.Application app = 2;</code>
   */
  org.thethingsnetwork.api.handler.Application getApp();
  /**
   * <pre>
   * The Application containing the payload functions that should be executed
   * </pre>
   *
   * <code>.handler.Application app = 2;</code>
   */
  org.thethingsnetwork.api.handler.ApplicationOrBuilder getAppOrBuilder();

  /**
   * <pre>
   * The port number that should be passed to the payload function
   * </pre>
   *
   * <code>uint32 port = 3;</code>
   */
  int getPort();
}