/* Generated by the protocol buffer compiler.  DO NOT EDIT! */
/* Generated from: github.com/TheThingsNetwork/api/gateway/gateway.proto */

/* Do not generate deprecated warnings for self */
#ifndef PROTOBUF_C__NO_DEPRECATED
#define PROTOBUF_C__NO_DEPRECATED
#endif

#include "github.com/TheThingsNetwork/api/gateway/gateway.pb-c.h"
void   gateway__location_metadata__init
                     (Gateway__LocationMetadata         *message)
{
  static const Gateway__LocationMetadata init_value = GATEWAY__LOCATION_METADATA__INIT;
  *message = init_value;
}
size_t gateway__location_metadata__get_packed_size
                     (const Gateway__LocationMetadata *message)
{
  assert(message->base.descriptor == &gateway__location_metadata__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t gateway__location_metadata__pack
                     (const Gateway__LocationMetadata *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &gateway__location_metadata__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t gateway__location_metadata__pack_to_buffer
                     (const Gateway__LocationMetadata *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &gateway__location_metadata__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Gateway__LocationMetadata *
       gateway__location_metadata__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Gateway__LocationMetadata *)
     protobuf_c_message_unpack (&gateway__location_metadata__descriptor,
                                allocator, len, data);
}
void   gateway__location_metadata__free_unpacked
                     (Gateway__LocationMetadata *message,
                      ProtobufCAllocator *allocator)
{
  if(!message)
    return;
  assert(message->base.descriptor == &gateway__location_metadata__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
void   gateway__rx_metadata__antenna__init
                     (Gateway__RxMetadata__Antenna         *message)
{
  static const Gateway__RxMetadata__Antenna init_value = GATEWAY__RX_METADATA__ANTENNA__INIT;
  *message = init_value;
}
void   gateway__rx_metadata__init
                     (Gateway__RxMetadata         *message)
{
  static const Gateway__RxMetadata init_value = GATEWAY__RX_METADATA__INIT;
  *message = init_value;
}
size_t gateway__rx_metadata__get_packed_size
                     (const Gateway__RxMetadata *message)
{
  assert(message->base.descriptor == &gateway__rx_metadata__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t gateway__rx_metadata__pack
                     (const Gateway__RxMetadata *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &gateway__rx_metadata__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t gateway__rx_metadata__pack_to_buffer
                     (const Gateway__RxMetadata *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &gateway__rx_metadata__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Gateway__RxMetadata *
       gateway__rx_metadata__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Gateway__RxMetadata *)
     protobuf_c_message_unpack (&gateway__rx_metadata__descriptor,
                                allocator, len, data);
}
void   gateway__rx_metadata__free_unpacked
                     (Gateway__RxMetadata *message,
                      ProtobufCAllocator *allocator)
{
  if(!message)
    return;
  assert(message->base.descriptor == &gateway__rx_metadata__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
void   gateway__tx_configuration__init
                     (Gateway__TxConfiguration         *message)
{
  static const Gateway__TxConfiguration init_value = GATEWAY__TX_CONFIGURATION__INIT;
  *message = init_value;
}
size_t gateway__tx_configuration__get_packed_size
                     (const Gateway__TxConfiguration *message)
{
  assert(message->base.descriptor == &gateway__tx_configuration__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t gateway__tx_configuration__pack
                     (const Gateway__TxConfiguration *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &gateway__tx_configuration__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t gateway__tx_configuration__pack_to_buffer
                     (const Gateway__TxConfiguration *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &gateway__tx_configuration__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Gateway__TxConfiguration *
       gateway__tx_configuration__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Gateway__TxConfiguration *)
     protobuf_c_message_unpack (&gateway__tx_configuration__descriptor,
                                allocator, len, data);
}
void   gateway__tx_configuration__free_unpacked
                     (Gateway__TxConfiguration *message,
                      ProtobufCAllocator *allocator)
{
  if(!message)
    return;
  assert(message->base.descriptor == &gateway__tx_configuration__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
void   gateway__status__osmetrics__init
                     (Gateway__Status__OSMetrics         *message)
{
  static const Gateway__Status__OSMetrics init_value = GATEWAY__STATUS__OSMETRICS__INIT;
  *message = init_value;
}
void   gateway__status__init
                     (Gateway__Status         *message)
{
  static const Gateway__Status init_value = GATEWAY__STATUS__INIT;
  *message = init_value;
}
size_t gateway__status__get_packed_size
                     (const Gateway__Status *message)
{
  assert(message->base.descriptor == &gateway__status__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t gateway__status__pack
                     (const Gateway__Status *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &gateway__status__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t gateway__status__pack_to_buffer
                     (const Gateway__Status *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &gateway__status__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Gateway__Status *
       gateway__status__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Gateway__Status *)
     protobuf_c_message_unpack (&gateway__status__descriptor,
                                allocator, len, data);
}
void   gateway__status__free_unpacked
                     (Gateway__Status *message,
                      ProtobufCAllocator *allocator)
{
  if(!message)
    return;
  assert(message->base.descriptor == &gateway__status__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
static const ProtobufCEnumValue gateway__location_metadata__location_source__enum_values_by_number[5] =
{
  { "UNKNOWN", "GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__UNKNOWN", 0 },
  { "GPS", "GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__GPS", 1 },
  { "CONFIG", "GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__CONFIG", 2 },
  { "REGISTRY", "GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__REGISTRY", 3 },
  { "IP_GEOLOCATION", "GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__IP_GEOLOCATION", 4 },
};
static const ProtobufCIntRange gateway__location_metadata__location_source__value_ranges[] = {
{0, 0},{0, 5}
};
static const ProtobufCEnumValueIndex gateway__location_metadata__location_source__enum_values_by_name[5] =
{
  { "CONFIG", 2 },
  { "GPS", 1 },
  { "IP_GEOLOCATION", 4 },
  { "REGISTRY", 3 },
  { "UNKNOWN", 0 },
};
const ProtobufCEnumDescriptor gateway__location_metadata__location_source__descriptor =
{
  PROTOBUF_C__ENUM_DESCRIPTOR_MAGIC,
  "gateway.LocationMetadata.LocationSource",
  "LocationSource",
  "Gateway__LocationMetadata__LocationSource",
  "gateway",
  5,
  gateway__location_metadata__location_source__enum_values_by_number,
  5,
  gateway__location_metadata__location_source__enum_values_by_name,
  1,
  gateway__location_metadata__location_source__value_ranges,
  NULL,NULL,NULL,NULL   /* reserved[1234] */
};
static const ProtobufCFieldDescriptor gateway__location_metadata__field_descriptors[6] =
{
  {
    "time",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT64,
    0,   /* quantifier_offset */
    offsetof(Gateway__LocationMetadata, time),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "latitude",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__LocationMetadata, latitude),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "longitude",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__LocationMetadata, longitude),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "altitude",
    4,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__LocationMetadata, altitude),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "accuracy",
    5,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__LocationMetadata, accuracy),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "source",
    6,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_ENUM,
    0,   /* quantifier_offset */
    offsetof(Gateway__LocationMetadata, source),
    &gateway__location_metadata__location_source__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned gateway__location_metadata__field_indices_by_name[] = {
  4,   /* field[4] = accuracy */
  3,   /* field[3] = altitude */
  1,   /* field[1] = latitude */
  2,   /* field[2] = longitude */
  5,   /* field[5] = source */
  0,   /* field[0] = time */
};
static const ProtobufCIntRange gateway__location_metadata__number_ranges[1 + 1] =
{
  { 1, 0 },
  { 0, 6 }
};
const ProtobufCMessageDescriptor gateway__location_metadata__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "gateway.LocationMetadata",
  "LocationMetadata",
  "Gateway__LocationMetadata",
  "gateway",
  sizeof(Gateway__LocationMetadata),
  6,
  gateway__location_metadata__field_descriptors,
  gateway__location_metadata__field_indices_by_name,
  1,  gateway__location_metadata__number_ranges,
  (ProtobufCMessageInit) gateway__location_metadata__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor gateway__rx_metadata__antenna__field_descriptors[9] =
{
  {
    "antenna",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, antenna),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "channel",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, channel),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rssi",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, rssi),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "snr",
    4,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, snr),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "channel_rssi",
    5,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, channel_rssi),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rssi_standard_deviation",
    6,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, rssi_standard_deviation),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "frequency_offset",
    7,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT64,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, frequency_offset),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "encrypted_time",
    10,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_BYTES,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, encrypted_time),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "fine_time",
    11,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT64,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata__Antenna, fine_time),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned gateway__rx_metadata__antenna__field_indices_by_name[] = {
  0,   /* field[0] = antenna */
  1,   /* field[1] = channel */
  4,   /* field[4] = channel_rssi */
  7,   /* field[7] = encrypted_time */
  8,   /* field[8] = fine_time */
  6,   /* field[6] = frequency_offset */
  2,   /* field[2] = rssi */
  5,   /* field[5] = rssi_standard_deviation */
  3,   /* field[3] = snr */
};
static const ProtobufCIntRange gateway__rx_metadata__antenna__number_ranges[2 + 1] =
{
  { 1, 0 },
  { 10, 7 },
  { 0, 9 }
};
const ProtobufCMessageDescriptor gateway__rx_metadata__antenna__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "gateway.RxMetadata.Antenna",
  "Antenna",
  "Gateway__RxMetadata__Antenna",
  "gateway",
  sizeof(Gateway__RxMetadata__Antenna),
  9,
  gateway__rx_metadata__antenna__field_descriptors,
  gateway__rx_metadata__antenna__field_indices_by_name,
  2,  gateway__rx_metadata__antenna__number_ranges,
  (ProtobufCMessageInit) gateway__rx_metadata__antenna__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor gateway__rx_metadata__field_descriptors[12] =
{
  {
    "gateway_id",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_STRING,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, gateway_id),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "gateway_trusted",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_BOOL,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, gateway_trusted),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "timestamp",
    11,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, timestamp),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "time",
    12,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT64,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, time),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "encrypted_time",
    13,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_BYTES,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, encrypted_time),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rf_chain",
    21,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, rf_chain),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "channel",
    22,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, channel),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "antennas",
    30,
    PROTOBUF_C_LABEL_REPEATED,
    PROTOBUF_C_TYPE_MESSAGE,
    offsetof(Gateway__RxMetadata, n_antennas),
    offsetof(Gateway__RxMetadata, antennas),
    &gateway__rx_metadata__antenna__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "frequency",
    31,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, frequency),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rssi",
    32,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, rssi),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "snr",
    33,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, snr),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "location",
    41,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_MESSAGE,
    0,   /* quantifier_offset */
    offsetof(Gateway__RxMetadata, location),
    &gateway__location_metadata__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned gateway__rx_metadata__field_indices_by_name[] = {
  7,   /* field[7] = antennas */
  6,   /* field[6] = channel */
  4,   /* field[4] = encrypted_time */
  8,   /* field[8] = frequency */
  0,   /* field[0] = gateway_id */
  1,   /* field[1] = gateway_trusted */
  11,   /* field[11] = location */
  5,   /* field[5] = rf_chain */
  9,   /* field[9] = rssi */
  10,   /* field[10] = snr */
  3,   /* field[3] = time */
  2,   /* field[2] = timestamp */
};
static const ProtobufCIntRange gateway__rx_metadata__number_ranges[5 + 1] =
{
  { 1, 0 },
  { 11, 2 },
  { 21, 5 },
  { 30, 7 },
  { 41, 11 },
  { 0, 12 }
};
const ProtobufCMessageDescriptor gateway__rx_metadata__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "gateway.RxMetadata",
  "RxMetadata",
  "Gateway__RxMetadata",
  "gateway",
  sizeof(Gateway__RxMetadata),
  12,
  gateway__rx_metadata__field_descriptors,
  gateway__rx_metadata__field_indices_by_name,
  5,  gateway__rx_metadata__number_ranges,
  (ProtobufCMessageInit) gateway__rx_metadata__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor gateway__tx_configuration__field_descriptors[6] =
{
  {
    "timestamp",
    11,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__TxConfiguration, timestamp),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rf_chain",
    21,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__TxConfiguration, rf_chain),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "frequency",
    22,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT64,
    0,   /* quantifier_offset */
    offsetof(Gateway__TxConfiguration, frequency),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "power",
    23,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__TxConfiguration, power),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "polarization_inversion",
    31,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_BOOL,
    0,   /* quantifier_offset */
    offsetof(Gateway__TxConfiguration, polarization_inversion),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "frequency_deviation",
    32,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__TxConfiguration, frequency_deviation),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned gateway__tx_configuration__field_indices_by_name[] = {
  2,   /* field[2] = frequency */
  5,   /* field[5] = frequency_deviation */
  4,   /* field[4] = polarization_inversion */
  3,   /* field[3] = power */
  1,   /* field[1] = rf_chain */
  0,   /* field[0] = timestamp */
};
static const ProtobufCIntRange gateway__tx_configuration__number_ranges[3 + 1] =
{
  { 11, 0 },
  { 21, 1 },
  { 31, 4 },
  { 0, 6 }
};
const ProtobufCMessageDescriptor gateway__tx_configuration__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "gateway.TxConfiguration",
  "TxConfiguration",
  "Gateway__TxConfiguration",
  "gateway",
  sizeof(Gateway__TxConfiguration),
  6,
  gateway__tx_configuration__field_descriptors,
  gateway__tx_configuration__field_indices_by_name,
  3,  gateway__tx_configuration__number_ranges,
  (ProtobufCMessageInit) gateway__tx_configuration__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor gateway__status__osmetrics__field_descriptors[6] =
{
  {
    "load_1",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status__OSMetrics, load_1),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "load_5",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status__OSMetrics, load_5),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "load_15",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status__OSMetrics, load_15),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "cpu_percentage",
    11,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status__OSMetrics, cpu_percentage),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "memory_percentage",
    21,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status__OSMetrics, memory_percentage),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "temperature",
    31,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_FLOAT,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status__OSMetrics, temperature),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned gateway__status__osmetrics__field_indices_by_name[] = {
  3,   /* field[3] = cpu_percentage */
  0,   /* field[0] = load_1 */
  2,   /* field[2] = load_15 */
  1,   /* field[1] = load_5 */
  4,   /* field[4] = memory_percentage */
  5,   /* field[5] = temperature */
};
static const ProtobufCIntRange gateway__status__osmetrics__number_ranges[4 + 1] =
{
  { 1, 0 },
  { 11, 3 },
  { 21, 4 },
  { 31, 5 },
  { 0, 6 }
};
const ProtobufCMessageDescriptor gateway__status__osmetrics__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "gateway.Status.OSMetrics",
  "OSMetrics",
  "Gateway__Status__OSMetrics",
  "gateway",
  sizeof(Gateway__Status__OSMetrics),
  6,
  gateway__status__osmetrics__field_descriptors,
  gateway__status__osmetrics__field_indices_by_name,
  4,  gateway__status__osmetrics__number_ranges,
  (ProtobufCMessageInit) gateway__status__osmetrics__init,
  NULL,NULL,NULL    /* reserved[123] */
};
static const ProtobufCFieldDescriptor gateway__status__field_descriptors[26] =
{
  {
    "timestamp",
    1,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, timestamp),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "time",
    2,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT64,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, time),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "gateway_trusted",
    3,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_BOOL,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, gateway_trusted),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "boot_time",
    4,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_INT64,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, boot_time),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "ip",
    11,
    PROTOBUF_C_LABEL_REPEATED,
    PROTOBUF_C_TYPE_STRING,
    offsetof(Gateway__Status, n_ip),
    offsetof(Gateway__Status, ip),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "platform",
    12,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_STRING,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, platform),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "contact_email",
    13,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_STRING,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, contact_email),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "description",
    14,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_STRING,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, description),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "frequency_plan",
    15,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_STRING,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, frequency_plan),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "bridge",
    16,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_STRING,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, bridge),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "router",
    17,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_STRING,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, router),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "fpga",
    18,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, fpga),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "dsp",
    19,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, dsp),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "hal",
    20,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_STRING,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, hal),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "location",
    21,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_MESSAGE,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, location),
    &gateway__location_metadata__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rtt",
    31,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, rtt),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rx_in",
    41,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, rx_in),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "rx_ok",
    42,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, rx_ok),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "tx_in",
    43,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, tx_in),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "tx_ok",
    44,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, tx_ok),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "lm_ok",
    45,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, lm_ok),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "lm_st",
    46,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, lm_st),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "lm_nw",
    47,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, lm_nw),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "l_pps",
    48,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_UINT32,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, l_pps),
    NULL,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "os",
    51,
    PROTOBUF_C_LABEL_NONE,
    PROTOBUF_C_TYPE_MESSAGE,
    0,   /* quantifier_offset */
    offsetof(Gateway__Status, os),
    &gateway__status__osmetrics__descriptor,
    NULL,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
  {
    "messages",
    52,
    PROTOBUF_C_LABEL_REPEATED,
    PROTOBUF_C_TYPE_STRING,
    offsetof(Gateway__Status, n_messages),
    offsetof(Gateway__Status, messages),
    NULL,
    &protobuf_c_empty_string,
    0,             /* flags */
    0,NULL,NULL    /* reserved1,reserved2, etc */
  },
};
static const unsigned gateway__status__field_indices_by_name[] = {
  3,   /* field[3] = boot_time */
  9,   /* field[9] = bridge */
  6,   /* field[6] = contact_email */
  7,   /* field[7] = description */
  12,   /* field[12] = dsp */
  11,   /* field[11] = fpga */
  8,   /* field[8] = frequency_plan */
  2,   /* field[2] = gateway_trusted */
  13,   /* field[13] = hal */
  4,   /* field[4] = ip */
  23,   /* field[23] = l_pps */
  22,   /* field[22] = lm_nw */
  20,   /* field[20] = lm_ok */
  21,   /* field[21] = lm_st */
  14,   /* field[14] = location */
  25,   /* field[25] = messages */
  24,   /* field[24] = os */
  5,   /* field[5] = platform */
  10,   /* field[10] = router */
  15,   /* field[15] = rtt */
  16,   /* field[16] = rx_in */
  17,   /* field[17] = rx_ok */
  1,   /* field[1] = time */
  0,   /* field[0] = timestamp */
  18,   /* field[18] = tx_in */
  19,   /* field[19] = tx_ok */
};
static const ProtobufCIntRange gateway__status__number_ranges[5 + 1] =
{
  { 1, 0 },
  { 11, 4 },
  { 31, 15 },
  { 41, 16 },
  { 51, 24 },
  { 0, 26 }
};
const ProtobufCMessageDescriptor gateway__status__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "gateway.Status",
  "Status",
  "Gateway__Status",
  "gateway",
  sizeof(Gateway__Status),
  26,
  gateway__status__field_descriptors,
  gateway__status__field_indices_by_name,
  5,  gateway__status__number_ranges,
  (ProtobufCMessageInit) gateway__status__init,
  NULL,NULL,NULL    /* reserved[123] */
};