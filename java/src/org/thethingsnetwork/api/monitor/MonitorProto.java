// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/monitor/monitor.proto

package org.thethingsnetwork.api.monitor;

public final class MonitorProto {
  private MonitorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5github.com/TheThingsNetwork/api/monito" +
      "r/monitor.proto\022\007monitor\032\033google/protobu" +
      "f/empty.proto\0325github.com/TheThingsNetwo" +
      "rk/api/gateway/gateway.proto\0323github.com" +
      "/TheThingsNetwork/api/router/router.prot" +
      "o\0323github.com/TheThingsNetwork/api/broke" +
      "r/broker.proto\0325github.com/TheThingsNetw" +
      "ork/api/handler/handler.proto\032Agithub.co" +
      "m/TheThingsNetwork/api/networkserver/net" +
      "workserver.proto2\353\005\n\007Monitor\0228\n\014RouterSt",
      "atus\022\016.router.Status\032\026.google.protobuf.E" +
      "mpty(\001\022:\n\rGatewayStatus\022\017.gateway.Status" +
      "\032\026.google.protobuf.Empty(\001\022@\n\rGatewayUpl" +
      "ink\022\025.router.UplinkMessage\032\026.google.prot" +
      "obuf.Empty(\001\022D\n\017GatewayDownlink\022\027.router" +
      ".DownlinkMessage\032\026.google.protobuf.Empty" +
      "(\001\0228\n\014BrokerStatus\022\016.broker.Status\032\026.goo" +
      "gle.protobuf.Empty(\001\022K\n\014BrokerUplink\022!.b" +
      "roker.DeduplicatedUplinkMessage\032\026.google" +
      ".protobuf.Empty(\001\022C\n\016BrokerDownlink\022\027.br",
      "oker.DownlinkMessage\032\026.google.protobuf.E" +
      "mpty(\001\022:\n\rHandlerStatus\022\017.handler.Status" +
      "\032\026.google.protobuf.Empty(\001\022L\n\rHandlerUpl" +
      "ink\022!.broker.DeduplicatedUplinkMessage\032\026" +
      ".google.protobuf.Empty(\001\022D\n\017HandlerDownl" +
      "ink\022\027.broker.DownlinkMessage\032\026.google.pr" +
      "otobuf.Empty(\001\022F\n\023NetworkServerStatus\022\025." +
      "networkserver.Status\032\026.google.protobuf.E" +
      "mpty(\001Bz\n org.thethingsnetwork.api.monit" +
      "orB\014MonitorProtoP\001Z\'github.com/TheThings",
      "Network/api/monitor\252\002\034TheThingsNetwork.A" +
      "PI.Monitorb\006proto3"
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
          org.thethingsnetwork.api.gateway.GatewayProto.getDescriptor(),
          org.thethingsnetwork.api.router.RouterProto.getDescriptor(),
          org.thethingsnetwork.api.broker.BrokerProto.getDescriptor(),
          org.thethingsnetwork.api.handler.HandlerProto.getDescriptor(),
          org.thethingsnetwork.api.networkserver.MonitorProto.getDescriptor(),
        }, assigner);
    com.google.protobuf.EmptyProto.getDescriptor();
    org.thethingsnetwork.api.gateway.GatewayProto.getDescriptor();
    org.thethingsnetwork.api.router.RouterProto.getDescriptor();
    org.thethingsnetwork.api.broker.BrokerProto.getDescriptor();
    org.thethingsnetwork.api.handler.HandlerProto.getDescriptor();
    org.thethingsnetwork.api.networkserver.MonitorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
