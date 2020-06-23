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
   * @return The timestamp.
   */
  int getTimestamp();

  /**
   * <pre>
   * Time in Unix nanoseconds
   * </pre>
   *
   * <code>int64 time = 2;</code>
   * @return The time.
   */
  long getTime();

  /**
   * <pre>
   * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
   * </pre>
   *
   * <code>bool gateway_trusted = 3;</code>
   * @return The gatewayTrusted.
   */
  boolean getGatewayTrusted();

  /**
   * <pre>
   * Boot time in Unix nanoseconds
   * </pre>
   *
   * <code>int64 boot_time = 4;</code>
   * @return The bootTime.
   */
  long getBootTime();

  /**
   * <code>repeated string ip = 11 [(.gogoproto.customname) = "IP"];</code>
   * @return A list containing the ip.
   */
  java.util.List<java.lang.String>
      getIpList();
  /**
   * <code>repeated string ip = 11 [(.gogoproto.customname) = "IP"];</code>
   * @return The count of ip.
   */
  int getIpCount();
  /**
   * <code>repeated string ip = 11 [(.gogoproto.customname) = "IP"];</code>
   * @param index The index of the element to return.
   * @return The ip at the given index.
   */
  java.lang.String getIp(int index);
  /**
   * <code>repeated string ip = 11 [(.gogoproto.customname) = "IP"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ip at the given index.
   */
  com.google.protobuf.ByteString
      getIpBytes(int index);

  /**
   * <code>string platform = 12;</code>
   * @return The platform.
   */
  java.lang.String getPlatform();
  /**
   * <code>string platform = 12;</code>
   * @return The bytes for platform.
   */
  com.google.protobuf.ByteString
      getPlatformBytes();

  /**
   * <code>string contact_email = 13;</code>
   * @return The contactEmail.
   */
  java.lang.String getContactEmail();
  /**
   * <code>string contact_email = 13;</code>
   * @return The bytes for contactEmail.
   */
  com.google.protobuf.ByteString
      getContactEmailBytes();

  /**
   * <code>string description = 14;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 14;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923
   * </pre>
   *
   * <code>string frequency_plan = 15;</code>
   * @return The frequencyPlan.
   */
  java.lang.String getFrequencyPlan();
  /**
   * <pre>
   * The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923
   * </pre>
   *
   * <code>string frequency_plan = 15;</code>
   * @return The bytes for frequencyPlan.
   */
  com.google.protobuf.ByteString
      getFrequencyPlanBytes();

  /**
   * <pre>
   * The value of Bridge is set by the Bridge
   * </pre>
   *
   * <code>string bridge = 16;</code>
   * @return The bridge.
   */
  java.lang.String getBridge();
  /**
   * <pre>
   * The value of Bridge is set by the Bridge
   * </pre>
   *
   * <code>string bridge = 16;</code>
   * @return The bytes for bridge.
   */
  com.google.protobuf.ByteString
      getBridgeBytes();

  /**
   * <pre>
   * The value of Router is set by the Router
   * </pre>
   *
   * <code>string router = 17;</code>
   * @return The router.
   */
  java.lang.String getRouter();
  /**
   * <pre>
   * The value of Router is set by the Router
   * </pre>
   *
   * <code>string router = 17;</code>
   * @return The bytes for router.
   */
  com.google.protobuf.ByteString
      getRouterBytes();

  /**
   * <pre>
   * Version of Gateway FPGA
   * </pre>
   *
   * <code>uint32 fpga = 18 [(.gogoproto.customname) = "FPGA"];</code>
   * @return The fpga.
   */
  int getFpga();

  /**
   * <pre>
   * Version of Gateway DSP software
   * </pre>
   *
   * <code>uint32 dsp = 19 [(.gogoproto.customname) = "DSP"];</code>
   * @return The dsp.
   */
  int getDsp();

  /**
   * <pre>
   * Version of gateway driver (in X.X.X format)
   * </pre>
   *
   * <code>string hal = 20 [(.gogoproto.customname) = "HAL"];</code>
   * @return The hal.
   */
  java.lang.String getHal();
  /**
   * <pre>
   * Version of gateway driver (in X.X.X format)
   * </pre>
   *
   * <code>string hal = 20 [(.gogoproto.customname) = "HAL"];</code>
   * @return The bytes for hal.
   */
  com.google.protobuf.ByteString
      getHalBytes();

  /**
   * <code>.gateway.LocationMetadata location = 21;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.gateway.LocationMetadata location = 21;</code>
   * @return The location.
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
   * <code>uint32 rtt = 31 [(.gogoproto.customname) = "RTT"];</code>
   * @return The rtt.
   */
  int getRtt();

  /**
   * <pre>
   * Total number of received uplink packets since boot
   * </pre>
   *
   * <code>uint32 rx_in = 41;</code>
   * @return The rxIn.
   */
  int getRxIn();

  /**
   * <pre>
   * Total number of successful (correct) uplink packets since boot
   * </pre>
   *
   * <code>uint32 rx_ok = 42;</code>
   * @return The rxOk.
   */
  int getRxOk();

  /**
   * <pre>
   * Total number of received downlink packets since boot
   * </pre>
   *
   * <code>uint32 tx_in = 43;</code>
   * @return The txIn.
   */
  int getTxIn();

  /**
   * <pre>
   * Total number of successfully sent downlink packets since boot
   * </pre>
   *
   * <code>uint32 tx_ok = 44;</code>
   * @return The txOk.
   */
  int getTxOk();

  /**
   * <pre>
   * Total number of packets received from link testing mote, with CRC OK
   * </pre>
   *
   * <code>uint32 lm_ok = 45;</code>
   * @return The lmOk.
   */
  int getLmOk();

  /**
   * <pre>
   * Sequence number of the first packet received from the link testing mote
   * </pre>
   *
   * <code>uint32 lm_st = 46;</code>
   * @return The lmSt.
   */
  int getLmSt();

  /**
   * <pre>
   * Sequence number of the last packet received from the link testing mote
   * </pre>
   *
   * <code>uint32 lm_nw = 47;</code>
   * @return The lmNw.
   */
  int getLmNw();

  /**
   * <pre>
   * Number of lost PPS pulses
   * </pre>
   *
   * <code>uint32 l_pps = 48 [(.gogoproto.customname) = "LPPS"];</code>
   * @return The lPps.
   */
  int getLPps();

  /**
   * <code>.gateway.Status.OSMetrics os = 51 [(.gogoproto.customname) = "OS"];</code>
   * @return Whether the os field is set.
   */
  boolean hasOs();
  /**
   * <code>.gateway.Status.OSMetrics os = 51 [(.gogoproto.customname) = "OS"];</code>
   * @return The os.
   */
  org.thethingsnetwork.api.gateway.Status.OSMetrics getOs();
  /**
   * <code>.gateway.Status.OSMetrics os = 51 [(.gogoproto.customname) = "OS"];</code>
   */
  org.thethingsnetwork.api.gateway.Status.OSMetricsOrBuilder getOsOrBuilder();

  /**
   * <pre>
   * debug or warning messages from the gateway
   * </pre>
   *
   * <code>repeated string messages = 52;</code>
   * @return A list containing the messages.
   */
  java.util.List<java.lang.String>
      getMessagesList();
  /**
   * <pre>
   * debug or warning messages from the gateway
   * </pre>
   *
   * <code>repeated string messages = 52;</code>
   * @return The count of messages.
   */
  int getMessagesCount();
  /**
   * <pre>
   * debug or warning messages from the gateway
   * </pre>
   *
   * <code>repeated string messages = 52;</code>
   * @param index The index of the element to return.
   * @return The messages at the given index.
   */
  java.lang.String getMessages(int index);
  /**
   * <pre>
   * debug or warning messages from the gateway
   * </pre>
   *
   * <code>repeated string messages = 52;</code>
   * @param index The index of the value to return.
   * @return The bytes of the messages at the given index.
   */
  com.google.protobuf.ByteString
      getMessagesBytes(int index);
}