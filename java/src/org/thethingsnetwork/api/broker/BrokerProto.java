// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/broker/broker.proto

package org.thethingsnetwork.api.broker;

public final class BrokerProto {
  private BrokerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_DownlinkOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_DownlinkOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_UplinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_UplinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_DownlinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_DownlinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_DeviceActivationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_DeviceActivationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_DeduplicatedUplinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_DeduplicatedUplinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_DeviceActivationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_DeviceActivationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_DeduplicatedDeviceActivationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_DeduplicatedDeviceActivationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_ActivationChallengeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_ActivationChallengeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_ActivationChallengeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_ActivationChallengeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_SubscribeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_SubscribeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_StatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_StatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_ApplicationHandlerRegistration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_ApplicationHandlerRegistration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3github.com/TheThingsNetwork/api/broker" +
      "/broker.proto\022\006broker\032\033google/protobuf/e" +
      "mpty.proto\032-github.com/gogo/protobuf/gog" +
      "oproto/gogo.proto\032)github.com/TheThingsN" +
      "etwork/api/api.proto\0327github.com/TheThin" +
      "gsNetwork/api/protocol/protocol.proto\0325g" +
      "ithub.com/TheThingsNetwork/api/gateway/g" +
      "ateway.proto\0321github.com/TheThingsNetwor" +
      "k/api/trace/trace.proto\"\277\001\n\016DownlinkOpti" +
      "on\022\022\n\nidentifier\030\001 \001(\t\022\022\n\ngateway_id\030\002 \001",
      "(\t\022\r\n\005score\030\003 \001(\r\022\020\n\010deadline\030\004 \001(\003\0222\n\017p" +
      "rotocol_config\030\005 \001(\0132\031.protocol.TxConfig" +
      "uration\0220\n\016gateway_config\030\006 \001(\0132\030.gatewa" +
      "y.TxConfiguration\"\243\003\n\rUplinkMessage\022\017\n\007p" +
      "ayload\030\001 \001(\014\022\"\n\007message\030\002 \001(\0132\021.protocol" +
      ".Message\022F\n\007dev_eui\030\013 \001(\014B5\332\336\0371github.co" +
      "m/TheThingsNetwork/ttn/core/types.DevEUI" +
      "\022F\n\007app_eui\030\014 \001(\014B5\332\336\0371github.com/TheThi" +
      "ngsNetwork/ttn/core/types.AppEUI\022\016\n\006app_" +
      "id\030\r \001(\t\022\016\n\006dev_id\030\016 \001(\t\022/\n\021protocol_met",
      "adata\030\025 \001(\0132\024.protocol.RxMetadata\022-\n\020gat" +
      "eway_metadata\030\026 \001(\0132\023.gateway.RxMetadata" +
      "\0220\n\020downlink_options\030\037 \003(\0132\026.broker.Down" +
      "linkOption\022\033\n\005trace\030) \001(\0132\014.trace.Trace\"" +
      "\304\002\n\017DownlinkMessage\022\017\n\007payload\030\001 \001(\014\022\"\n\007" +
      "message\030\002 \001(\0132\021.protocol.Message\022F\n\007dev_" +
      "eui\030\013 \001(\014B5\332\336\0371github.com/TheThingsNetwo" +
      "rk/ttn/core/types.DevEUI\022F\n\007app_eui\030\014 \001(" +
      "\014B5\332\336\0371github.com/TheThingsNetwork/ttn/c" +
      "ore/types.AppEUI\022\016\n\006app_id\030\r \001(\t\022\016\n\006dev_",
      "id\030\016 \001(\t\022/\n\017downlink_option\030\025 \001(\0132\026.brok" +
      "er.DownlinkOption\022\033\n\005trace\030\037 \001(\0132\014.trace" +
      ".Trace\"\235\001\n\030DeviceActivationResponse\022\017\n\007p" +
      "ayload\030\001 \001(\014\022\"\n\007message\030\002 \001(\0132\021.protocol" +
      ".Message\022/\n\017downlink_option\030\013 \001(\0132\026.brok" +
      "er.DownlinkOption\022\033\n\005trace\030\025 \001(\0132\014.trace" +
      ".Trace\"\306\003\n\031DeduplicatedUplinkMessage\022\017\n\007" +
      "payload\030\001 \001(\014\022\"\n\007message\030\002 \001(\0132\021.protoco" +
      "l.Message\022F\n\007dev_eui\030\013 \001(\014B5\332\336\0371github.c" +
      "om/TheThingsNetwork/ttn/core/types.DevEU",
      "I\022F\n\007app_eui\030\014 \001(\014B5\332\336\0371github.com/TheTh" +
      "ingsNetwork/ttn/core/types.AppEUI\022\016\n\006app" +
      "_id\030\r \001(\t\022\016\n\006dev_id\030\016 \001(\t\022/\n\021protocol_me" +
      "tadata\030\025 \001(\0132\024.protocol.RxMetadata\022-\n\020ga" +
      "teway_metadata\030\026 \003(\0132\023.gateway.RxMetadat" +
      "a\022\023\n\013server_time\030\027 \001(\003\0222\n\021response_templ" +
      "ate\030\037 \001(\0132\027.broker.DownlinkMessage\022\033\n\005tr" +
      "ace\030) \001(\0132\014.trace.Trace\"\310\003\n\027DeviceActiva" +
      "tionRequest\022\017\n\007payload\030\001 \001(\014\022\"\n\007message\030" +
      "\002 \001(\0132\021.protocol.Message\022F\n\007dev_eui\030\013 \001(",
      "\014B5\332\336\0371github.com/TheThingsNetwork/ttn/c" +
      "ore/types.DevEUI\022F\n\007app_eui\030\014 \001(\014B5\332\336\0371g" +
      "ithub.com/TheThingsNetwork/ttn/core/type" +
      "s.AppEUI\022/\n\021protocol_metadata\030\025 \001(\0132\024.pr" +
      "otocol.RxMetadata\022-\n\020gateway_metadata\030\026 " +
      "\001(\0132\023.gateway.RxMetadata\0229\n\023activation_m" +
      "etadata\030\027 \001(\0132\034.protocol.ActivationMetad" +
      "ata\0220\n\020downlink_options\030\037 \003(\0132\026.broker.D" +
      "ownlinkOption\022\033\n\005trace\030) \001(\0132\014.trace.Tra" +
      "ce\"\224\004\n#DeduplicatedDeviceActivationReque",
      "st\022\017\n\007payload\030\001 \001(\014\022\"\n\007message\030\002 \001(\0132\021.p" +
      "rotocol.Message\022F\n\007dev_eui\030\013 \001(\014B5\332\336\0371gi" +
      "thub.com/TheThingsNetwork/ttn/core/types" +
      ".DevEUI\022F\n\007app_eui\030\014 \001(\014B5\332\336\0371github.com" +
      "/TheThingsNetwork/ttn/core/types.AppEUI\022" +
      "\016\n\006app_id\030\r \001(\t\022\016\n\006dev_id\030\016 \001(\t\022/\n\021proto" +
      "col_metadata\030\025 \001(\0132\024.protocol.RxMetadata" +
      "\022-\n\020gateway_metadata\030\026 \003(\0132\023.gateway.RxM" +
      "etadata\0229\n\023activation_metadata\030\027 \001(\0132\034.p" +
      "rotocol.ActivationMetadata\022\023\n\013server_tim",
      "e\030\030 \001(\003\022;\n\021response_template\030\037 \001(\0132 .bro" +
      "ker.DeviceActivationResponse\022\033\n\005trace\030) " +
      "\001(\0132\014.trace.Trace\"\201\002\n\032ActivationChalleng" +
      "eRequest\022\017\n\007payload\030\001 \001(\014\022\"\n\007message\030\002 \001" +
      "(\0132\021.protocol.Message\022F\n\007dev_eui\030\013 \001(\014B5" +
      "\332\336\0371github.com/TheThingsNetwork/ttn/core" +
      "/types.DevEUI\022F\n\007app_eui\030\014 \001(\014B5\332\336\0371gith" +
      "ub.com/TheThingsNetwork/ttn/core/types.A" +
      "ppEUI\022\016\n\006app_id\030\r \001(\t\022\016\n\006dev_id\030\016 \001(\t\"R\n" +
      "\033ActivationChallengeResponse\022\017\n\007payload\030",
      "\001 \001(\014\022\"\n\007message\030\002 \001(\0132\021.protocol.Messag" +
      "e\"\022\n\020SubscribeRequest\"\017\n\rStatusRequest\"\330" +
      "\002\n\006Status\022 \n\006system\030\001 \001(\0132\020.api.SystemSt" +
      "ats\022&\n\tcomponent\030\002 \001(\0132\023.api.ComponentSt" +
      "ats\022\032\n\006uplink\030\013 \001(\0132\n.api.Rates\022!\n\ruplin" +
      "k_unique\030\014 \001(\0132\n.api.Rates\022\034\n\010downlink\030\r" +
      " \001(\0132\n.api.Rates\022\037\n\013activations\030\016 \001(\0132\n." +
      "api.Rates\022&\n\022activations_unique\030\017 \001(\0132\n." +
      "api.Rates\022\'\n\rdeduplication\030\020 \001(\0132\020.api.P" +
      "ercentiles\022\031\n\021connected_routers\030\025 \001(\r\022\032\n",
      "\022connected_handlers\030\026 \001(\r\"D\n\036Application" +
      "HandlerRegistration\022\016\n\006app_id\030\001 \001(\t\022\022\n\nh" +
      "andler_id\030\002 \001(\t2\242\002\n\006Broker\022?\n\tAssociate\022" +
      "\025.broker.UplinkMessage\032\027.broker.Downlink" +
      "Message(\0010\001\022J\n\tSubscribe\022\030.broker.Subscr" +
      "ibeRequest\032!.broker.DeduplicatedUplinkMe" +
      "ssage0\001\022<\n\007Publish\022\027.broker.DownlinkMess" +
      "age\032\026.google.protobuf.Empty(\001\022M\n\010Activat" +
      "e\022\037.broker.DeviceActivationRequest\032 .bro" +
      "ker.DeviceActivationResponse2\241\001\n\rBrokerM",
      "anager\022\\\n\032RegisterApplicationHandler\022&.b" +
      "roker.ApplicationHandlerRegistration\032\026.g" +
      "oogle.protobuf.Empty\0222\n\tGetStatus\022\025.brok" +
      "er.StatusRequest\032\016.broker.StatusBv\n\037org." +
      "thethingsnetwork.api.brokerB\013BrokerProto" +
      "P\001Z&github.com/TheThingsNetwork/api/brok" +
      "er\252\002\033TheThingsNetwork.API.Brokerb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
          org.thethingsnetwork.api.APIProto.getDescriptor(),
          org.thethingsnetwork.api.protocol.ProtocolProto.getDescriptor(),
          org.thethingsnetwork.api.gateway.GatewayProto.getDescriptor(),
          org.thethingsnetwork.api.trace.TraceProto.getDescriptor(),
        }, assigner);
    internal_static_broker_DownlinkOption_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_broker_DownlinkOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_DownlinkOption_descriptor,
        new java.lang.String[] { "Identifier", "GatewayId", "Score", "Deadline", "ProtocolConfig", "GatewayConfig", });
    internal_static_broker_UplinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_broker_UplinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_UplinkMessage_descriptor,
        new java.lang.String[] { "Payload", "Message", "DevEui", "AppEui", "AppId", "DevId", "ProtocolMetadata", "GatewayMetadata", "DownlinkOptions", "Trace", });
    internal_static_broker_DownlinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_broker_DownlinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_DownlinkMessage_descriptor,
        new java.lang.String[] { "Payload", "Message", "DevEui", "AppEui", "AppId", "DevId", "DownlinkOption", "Trace", });
    internal_static_broker_DeviceActivationResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_broker_DeviceActivationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_DeviceActivationResponse_descriptor,
        new java.lang.String[] { "Payload", "Message", "DownlinkOption", "Trace", });
    internal_static_broker_DeduplicatedUplinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_broker_DeduplicatedUplinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_DeduplicatedUplinkMessage_descriptor,
        new java.lang.String[] { "Payload", "Message", "DevEui", "AppEui", "AppId", "DevId", "ProtocolMetadata", "GatewayMetadata", "ServerTime", "ResponseTemplate", "Trace", });
    internal_static_broker_DeviceActivationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_broker_DeviceActivationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_DeviceActivationRequest_descriptor,
        new java.lang.String[] { "Payload", "Message", "DevEui", "AppEui", "ProtocolMetadata", "GatewayMetadata", "ActivationMetadata", "DownlinkOptions", "Trace", });
    internal_static_broker_DeduplicatedDeviceActivationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_broker_DeduplicatedDeviceActivationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_DeduplicatedDeviceActivationRequest_descriptor,
        new java.lang.String[] { "Payload", "Message", "DevEui", "AppEui", "AppId", "DevId", "ProtocolMetadata", "GatewayMetadata", "ActivationMetadata", "ServerTime", "ResponseTemplate", "Trace", });
    internal_static_broker_ActivationChallengeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_broker_ActivationChallengeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_ActivationChallengeRequest_descriptor,
        new java.lang.String[] { "Payload", "Message", "DevEui", "AppEui", "AppId", "DevId", });
    internal_static_broker_ActivationChallengeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_broker_ActivationChallengeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_ActivationChallengeResponse_descriptor,
        new java.lang.String[] { "Payload", "Message", });
    internal_static_broker_SubscribeRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_broker_SubscribeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_SubscribeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_broker_StatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_broker_StatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_StatusRequest_descriptor,
        new java.lang.String[] { });
    internal_static_broker_Status_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_broker_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_Status_descriptor,
        new java.lang.String[] { "System", "Component", "Uplink", "UplinkUnique", "Downlink", "Activations", "ActivationsUnique", "Deduplication", "ConnectedRouters", "ConnectedHandlers", });
    internal_static_broker_ApplicationHandlerRegistration_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_broker_ApplicationHandlerRegistration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_ApplicationHandlerRegistration_descriptor,
        new java.lang.String[] { "AppId", "HandlerId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customtype);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
    org.thethingsnetwork.api.APIProto.getDescriptor();
    org.thethingsnetwork.api.protocol.ProtocolProto.getDescriptor();
    org.thethingsnetwork.api.gateway.GatewayProto.getDescriptor();
    org.thethingsnetwork.api.trace.TraceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
