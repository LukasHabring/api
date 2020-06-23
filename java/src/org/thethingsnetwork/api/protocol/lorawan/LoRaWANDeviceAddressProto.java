// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/device_address.proto

package org.thethingsnetwork.api.protocol.lorawan;

public final class LoRaWANDeviceAddressProto {
  private LoRaWANDeviceAddressProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lorawan_PrefixesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lorawan_PrefixesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lorawan_PrefixesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lorawan_PrefixesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lorawan_PrefixesResponse_PrefixMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lorawan_PrefixesResponse_PrefixMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lorawan_DevAddrRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lorawan_DevAddrRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lorawan_DevAddrResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lorawan_DevAddrResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgithub.com/TheThingsNetwork/api/protoc" +
      "ol/lorawan/device_address.proto\022\007lorawan" +
      "\032-github.com/gogo/protobuf/gogoproto/gog" +
      "o.proto\"\021\n\017PrefixesRequest\"}\n\020PrefixesRe" +
      "sponse\0229\n\010prefixes\030\001 \003(\0132\'.lorawan.Prefi" +
      "xesResponse.PrefixMapping\032.\n\rPrefixMappi" +
      "ng\022\016\n\006prefix\030\001 \001(\t\022\r\n\005usage\030\002 \003(\t\"\037\n\016Dev" +
      "AddrRequest\022\r\n\005usage\030\001 \003(\t\"_\n\017DevAddrRes" +
      "ponse\022L\n\010dev_addr\030\001 \001(\014B:\310\336\037\000\332\336\0372github." +
      "com/TheThingsNetwork/ttn/core/types.DevA" +
      "ddr2\225\001\n\016DevAddrManager\022B\n\013GetPrefixes\022\030." +
      "lorawan.PrefixesRequest\032\031.lorawan.Prefix" +
      "esResponse\022?\n\nGetDevAddr\022\027.lorawan.DevAd" +
      "drRequest\032\030.lorawan.DevAddrResponseB\241\001\n)" +
      "org.thethingsnetwork.api.protocol.lorawa" +
      "nB\031LoRaWANDeviceAddressProtoP\001Z0github.c" +
      "om/TheThingsNetwork/api/protocol/lorawan" +
      "\252\002$TheThingsNetwork.API.LoRaWANProtocolb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_lorawan_PrefixesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lorawan_PrefixesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lorawan_PrefixesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_lorawan_PrefixesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lorawan_PrefixesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lorawan_PrefixesResponse_descriptor,
        new java.lang.String[] { "Prefixes", });
    internal_static_lorawan_PrefixesResponse_PrefixMapping_descriptor =
      internal_static_lorawan_PrefixesResponse_descriptor.getNestedTypes().get(0);
    internal_static_lorawan_PrefixesResponse_PrefixMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lorawan_PrefixesResponse_PrefixMapping_descriptor,
        new java.lang.String[] { "Prefix", "Usage", });
    internal_static_lorawan_DevAddrRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lorawan_DevAddrRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lorawan_DevAddrRequest_descriptor,
        new java.lang.String[] { "Usage", });
    internal_static_lorawan_DevAddrResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lorawan_DevAddrResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lorawan_DevAddrResponse_descriptor,
        new java.lang.String[] { "DevAddr", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customtype);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}