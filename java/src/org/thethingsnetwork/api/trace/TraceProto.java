// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/trace/trace.proto

package org.thethingsnetwork.api.trace;

public final class TraceProto {
  private TraceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trace_Trace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trace_Trace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trace_Trace_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trace_Trace_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1github.com/TheThingsNetwork/api/trace/" +
      "trace.proto\022\005trace\"\330\001\n\005Trace\022\n\n\002id\030\001 \001(\t" +
      "\022\014\n\004time\030\002 \001(\003\022\022\n\nservice_id\030\003 \001(\t\022\024\n\014se" +
      "rvice_name\030\004 \001(\t\022\r\n\005event\030\005 \001(\t\022,\n\010metad" +
      "ata\030\006 \003(\0132\032.trace.Trace.MetadataEntry\022\035\n" +
      "\007parents\030\013 \003(\0132\014.trace.Trace\032/\n\rMetadata" +
      "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001Br\n" +
      "\036org.thethingsnetwork.api.traceB\nTracePr" +
      "otoP\001Z%github.com/TheThingsNetwork/api/t" +
      "race\252\002\032TheThingsNetwork.API.Traceb\006proto",
      "3"
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
        }, assigner);
    internal_static_trace_Trace_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_trace_Trace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trace_Trace_descriptor,
        new java.lang.String[] { "Id", "Time", "ServiceId", "ServiceName", "Event", "Metadata", "Parents", });
    internal_static_trace_Trace_MetadataEntry_descriptor =
      internal_static_trace_Trace_descriptor.getNestedTypes().get(0);
    internal_static_trace_Trace_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trace_Trace_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
