// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/gateway/gateway.proto

package org.thethingsnetwork.api.gateway;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gateway.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp (uptime of gateway) in microseconds with rollover
   * </pre>
   *
   * <code>uint32 timestamp = 1;</code>
   */
  int getTimestamp();

  /**
   * <pre>
   * Time in Unix nanoseconds
   * </pre>
   *
   * <code>int64 time = 2;</code>
   */
  long getTime();

  /**
   * <pre>
   * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
   * </pre>
   *
   * <code>bool gateway_trusted = 3;</code>
   */
  boolean getGatewayTrusted();

  /**
   * <pre>
   * Boot time in Unix nanoseconds
   * </pre>
   *
   * <code>int64 boot_time = 4;</code>
   */
  long getBootTime();

  /**
   * <code>repeated string ip = 11;</code>
   */
  java.util.List<java.lang.String>
      getIpList();
  /**
   * <code>repeated string ip = 11;</code>
   */
  int getIpCount();
  /**
   * <code>repeated string ip = 11;</code>
   */
  java.lang.String getIp(int index);
  /**
   * <code>repeated string ip = 11;</code>
   */
  com.google.protobuf.ByteString
      getIpBytes(int index);

  /**
   * <code>string platform = 12;</code>
   */
  java.lang.String getPlatform();
  /**
   * <code>string platform = 12;</code>
   */
  com.google.protobuf.ByteString
      getPlatformBytes();

  /**
   * <code>string contact_email = 13;</code>
   */
  java.lang.String getContactEmail();
  /**
   * <code>string contact_email = 13;</code>
   */
  com.google.protobuf.ByteString
      getContactEmailBytes();

  /**
   * <code>string description = 14;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 14;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923
   * </pre>
   *
   * <code>string frequency_plan = 15;</code>
   */
  java.lang.String getFrequencyPlan();
  /**
   * <pre>
   * The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923
   * </pre>
   *
   * <code>string frequency_plan = 15;</code>
   */
  com.google.protobuf.ByteString
      getFrequencyPlanBytes();

  /**
   * <pre>
   * The value of Bridge is set by the Bridge
   * </pre>
   *
   * <code>string bridge = 16;</code>
   */
  java.lang.String getBridge();
  /**
   * <pre>
   * The value of Bridge is set by the Bridge
   * </pre>
   *
   * <code>string bridge = 16;</code>
   */
  com.google.protobuf.ByteString
      getBridgeBytes();

  /**
   * <pre>
   * The value of Router is set by the Router
   * </pre>
   *
   * <code>string router = 17;</code>
   */
  java.lang.String getRouter();
  /**
   * <pre>
   * The value of Router is set by the Router
   * </pre>
   *
   * <code>string router = 17;</code>
   */
  com.google.protobuf.ByteString
      getRouterBytes();

  /**
   * <pre>
   * Version of Gateway FPGA
   * </pre>
   *
   * <code>uint32 fpga = 18;</code>
   */
  int getFpga();

  /**
   * <pre>
   * Version of Gateway DSP software
   * </pre>
   *
   * <code>uint32 dsp = 19;</code>
   */
  int getDsp();

  /**
   * <pre>
   * Version of gateway driver (in X.X.X format)
   * </pre>
   *
   * <code>string hal = 20;</code>
   */
  java.lang.String getHal();
  /**
   * <pre>
   * Version of gateway driver (in X.X.X format)
   * </pre>
   *
   * <code>string hal = 20;</code>
   */
  com.google.protobuf.ByteString
      getHalBytes();

  /**
   * <code>.gateway.LocationMetadata location = 21;</code>
   */
  boolean hasLocation();
  /**
   * <code>.gateway.LocationMetadata location = 21;</code>
   */
  org.thethingsnetwork.api.gateway.LocationMetadata getLocation();
  /**
   * <code>.gateway.LocationMetadata location = 21;</code>
   */
  org.thethingsnetwork.api.gateway.LocationMetadataOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Round-trip time to the server in milliseconds
   * </pre>
   *
   * <code>uint32 rtt = 31;</code>
   */
  int getRtt();

  /**
   * <pre>
   * Total number of received uplink packets since boot
   * </pre>
   *
   * <code>uint32 rx_in = 41;</code>
   */
  int getRxIn();

  /**
   * <pre>
   * Total number of successful (correct) uplink packets since boot
   * </pre>
   *
   * <code>uint32 rx_ok = 42;</code>
   */
  int getRxOk();

  /**
   * <pre>
   * Total number of received downlink packets since boot
   * </pre>
   *
   * <code>uint32 tx_in = 43;</code>
   */
  int getTxIn();

  /**
   * <pre>
   * Total number of successfully sent downlink packets since boot
   * </pre>
   *
   * <code>uint32 tx_ok = 44;</code>
   */
  int getTxOk();

  /**
   * <pre>
   * Total number of packets received from link testing mote, with CRC OK
   * </pre>
   *
   * <code>uint32 lm_ok = 45;</code>
   */
  int getLmOk();

  /**
   * <pre>
   * Sequence number of the first packet received from the link testing mote
   * </pre>
   *
   * <code>uint32 lm_st = 46;</code>
   */
  int getLmSt();

  /**
   * <pre>
   * Sequence number of the last packet received from the link testing mote
   * </pre>
   *
   * <code>uint32 lm_nw = 47;</code>
   */
  int getLmNw();

  /**
   * <pre>
   * Number of lost PPS pulses
   * </pre>
   *
   * <code>uint32 l_pps = 48;</code>
   */
  int getLPps();

  /**
   * <code>.gateway.Status.OSMetrics os = 51;</code>
   */
  boolean hasOs();
  /**
   * <code>.gateway.Status.OSMetrics os = 51;</code>
   */
  org.thethingsnetwork.api.gateway.Status.OSMetrics getOs();
  /**
   * <code>.gateway.Status.OSMetrics os = 51;</code>
   */
  org.thethingsnetwork.api.gateway.Status.OSMetricsOrBuilder getOsOrBuilder();

  /**
   * <pre>
   * debug or warning messages from the gateway
   * </pre>
   *
   * <code>repeated string messages = 52;</code>
   */
  java.util.List<java.lang.String>
      getMessagesList();
  /**
   * <pre>
   * debug or warning messages from the gateway
   * </pre>
   *
   * <code>repeated string messages = 52;</code>
   */
  int getMessagesCount();
  /**
   * <pre>
   * debug or warning messages from the gateway
   * </pre>
   *
   * <code>repeated string messages = 52;</code>
   */
  java.lang.String getMessages(int index);
  /**
   * <pre>
   * debug or warning messages from the gateway
   * </pre>
   *
   * <code>repeated string messages = 52;</code>
   */
  com.google.protobuf.ByteString
      getMessagesBytes(int index);
}
