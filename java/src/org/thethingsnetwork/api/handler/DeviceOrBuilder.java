// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

public interface DeviceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:handler.Device)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string app_id = 1;</code>
   */
  java.lang.String getAppId();
  /**
   * <code>string app_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <code>string dev_id = 2;</code>
   */
  java.lang.String getDevId();
  /**
   * <code>string dev_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getDevIdBytes();

  /**
   * <code>.lorawan.Device lorawan_device = 3;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.Device getLorawanDevice();
  /**
   * <code>.lorawan.Device lorawan_device = 3;</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.DeviceOrBuilder getLorawanDeviceOrBuilder();

  /**
   * <code>float latitude = 10;</code>
   */
  float getLatitude();

  /**
   * <code>float longitude = 11;</code>
   */
  float getLongitude();

  /**
   * <code>int32 altitude = 12;</code>
   */
  int getAltitude();

  /**
   * <code>map&lt;string, string&gt; attributes = 13;</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, string&gt; attributes = 13;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <code>map&lt;string, string&gt; attributes = 13;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <code>map&lt;string, string&gt; attributes = 13;</code>
   */

  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attributes = 13;</code>
   */

  java.lang.String getAttributesOrThrow(
      java.lang.String key);

  /**
   * <code>string description = 20;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 20;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  public org.thethingsnetwork.api.handler.Device.DeviceCase getDeviceCase();
}
