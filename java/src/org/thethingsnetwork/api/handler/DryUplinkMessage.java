// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

/**
 * <pre>
 * DryUplinkMessage is a simulated message to test uplink processing
 * </pre>
 *
 * Protobuf type {@code handler.DryUplinkMessage}
 */
public  final class DryUplinkMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:handler.DryUplinkMessage)
    DryUplinkMessageOrBuilder {
  // Use DryUplinkMessage.newBuilder() to construct.
  private DryUplinkMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DryUplinkMessage() {
    payload_ = com.google.protobuf.ByteString.EMPTY;
    port_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DryUplinkMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            payload_ = input.readBytes();
            break;
          }
          case 18: {
            org.thethingsnetwork.api.handler.Application.Builder subBuilder = null;
            if (app_ != null) {
              subBuilder = app_.toBuilder();
            }
            app_ = input.readMessage(org.thethingsnetwork.api.handler.Application.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(app_);
              app_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            port_ = input.readUInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DryUplinkMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DryUplinkMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.handler.DryUplinkMessage.class, org.thethingsnetwork.api.handler.DryUplinkMessage.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString payload_;
  /**
   * <pre>
   * The binary payload to use
   * </pre>
   *
   * <code>bytes payload = 1;</code>
   */
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  public static final int APP_FIELD_NUMBER = 2;
  private org.thethingsnetwork.api.handler.Application app_;
  /**
   * <pre>
   * The Application containing the payload functions that should be executed
   * </pre>
   *
   * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
   */
  public boolean hasApp() {
    return app_ != null;
  }
  /**
   * <pre>
   * The Application containing the payload functions that should be executed
   * </pre>
   *
   * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
   */
  public org.thethingsnetwork.api.handler.Application getApp() {
    return app_ == null ? org.thethingsnetwork.api.handler.Application.getDefaultInstance() : app_;
  }
  /**
   * <pre>
   * The Application containing the payload functions that should be executed
   * </pre>
   *
   * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
   */
  public org.thethingsnetwork.api.handler.ApplicationOrBuilder getAppOrBuilder() {
    return getApp();
  }

  public static final int PORT_FIELD_NUMBER = 3;
  private int port_;
  /**
   * <pre>
   * The port number that should be passed to the payload function
   * </pre>
   *
   * <code>uint32 port = 3;</code>
   */
  public int getPort() {
    return port_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!payload_.isEmpty()) {
      output.writeBytes(1, payload_);
    }
    if (app_ != null) {
      output.writeMessage(2, getApp());
    }
    if (port_ != 0) {
      output.writeUInt32(3, port_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, payload_);
    }
    if (app_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getApp());
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, port_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.thethingsnetwork.api.handler.DryUplinkMessage)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.handler.DryUplinkMessage other = (org.thethingsnetwork.api.handler.DryUplinkMessage) obj;

    boolean result = true;
    result = result && getPayload()
        .equals(other.getPayload());
    result = result && (hasApp() == other.hasApp());
    if (hasApp()) {
      result = result && getApp()
          .equals(other.getApp());
    }
    result = result && (getPort()
        == other.getPort());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    if (hasApp()) {
      hash = (37 * hash) + APP_FIELD_NUMBER;
      hash = (53 * hash) + getApp().hashCode();
    }
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.DryUplinkMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.thethingsnetwork.api.handler.DryUplinkMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * DryUplinkMessage is a simulated message to test uplink processing
   * </pre>
   *
   * Protobuf type {@code handler.DryUplinkMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:handler.DryUplinkMessage)
      org.thethingsnetwork.api.handler.DryUplinkMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DryUplinkMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DryUplinkMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.handler.DryUplinkMessage.class, org.thethingsnetwork.api.handler.DryUplinkMessage.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.handler.DryUplinkMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      payload_ = com.google.protobuf.ByteString.EMPTY;

      if (appBuilder_ == null) {
        app_ = null;
      } else {
        app_ = null;
        appBuilder_ = null;
      }
      port_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_DryUplinkMessage_descriptor;
    }

    public org.thethingsnetwork.api.handler.DryUplinkMessage getDefaultInstanceForType() {
      return org.thethingsnetwork.api.handler.DryUplinkMessage.getDefaultInstance();
    }

    public org.thethingsnetwork.api.handler.DryUplinkMessage build() {
      org.thethingsnetwork.api.handler.DryUplinkMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.handler.DryUplinkMessage buildPartial() {
      org.thethingsnetwork.api.handler.DryUplinkMessage result = new org.thethingsnetwork.api.handler.DryUplinkMessage(this);
      result.payload_ = payload_;
      if (appBuilder_ == null) {
        result.app_ = app_;
      } else {
        result.app_ = appBuilder_.build();
      }
      result.port_ = port_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.handler.DryUplinkMessage) {
        return mergeFrom((org.thethingsnetwork.api.handler.DryUplinkMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.handler.DryUplinkMessage other) {
      if (other == org.thethingsnetwork.api.handler.DryUplinkMessage.getDefaultInstance()) return this;
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      if (other.hasApp()) {
        mergeApp(other.getApp());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.thethingsnetwork.api.handler.DryUplinkMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.handler.DryUplinkMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The binary payload to use
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <pre>
     * The binary payload to use
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The binary payload to use
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    private org.thethingsnetwork.api.handler.Application app_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.handler.Application, org.thethingsnetwork.api.handler.Application.Builder, org.thethingsnetwork.api.handler.ApplicationOrBuilder> appBuilder_;
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    public boolean hasApp() {
      return appBuilder_ != null || app_ != null;
    }
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    public org.thethingsnetwork.api.handler.Application getApp() {
      if (appBuilder_ == null) {
        return app_ == null ? org.thethingsnetwork.api.handler.Application.getDefaultInstance() : app_;
      } else {
        return appBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setApp(org.thethingsnetwork.api.handler.Application value) {
      if (appBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        app_ = value;
        onChanged();
      } else {
        appBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setApp(
        org.thethingsnetwork.api.handler.Application.Builder builderForValue) {
      if (appBuilder_ == null) {
        app_ = builderForValue.build();
        onChanged();
      } else {
        appBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeApp(org.thethingsnetwork.api.handler.Application value) {
      if (appBuilder_ == null) {
        if (app_ != null) {
          app_ =
            org.thethingsnetwork.api.handler.Application.newBuilder(app_).mergeFrom(value).buildPartial();
        } else {
          app_ = value;
        }
        onChanged();
      } else {
        appBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearApp() {
      if (appBuilder_ == null) {
        app_ = null;
        onChanged();
      } else {
        app_ = null;
        appBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    public org.thethingsnetwork.api.handler.Application.Builder getAppBuilder() {
      
      onChanged();
      return getAppFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    public org.thethingsnetwork.api.handler.ApplicationOrBuilder getAppOrBuilder() {
      if (appBuilder_ != null) {
        return appBuilder_.getMessageOrBuilder();
      } else {
        return app_ == null ?
            org.thethingsnetwork.api.handler.Application.getDefaultInstance() : app_;
      }
    }
    /**
     * <pre>
     * The Application containing the payload functions that should be executed
     * </pre>
     *
     * <code>.handler.Application app = 2 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.thethingsnetwork.api.handler.Application, org.thethingsnetwork.api.handler.Application.Builder, org.thethingsnetwork.api.handler.ApplicationOrBuilder> 
        getAppFieldBuilder() {
      if (appBuilder_ == null) {
        appBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.thethingsnetwork.api.handler.Application, org.thethingsnetwork.api.handler.Application.Builder, org.thethingsnetwork.api.handler.ApplicationOrBuilder>(
                getApp(),
                getParentForChildren(),
                isClean());
        app_ = null;
      }
      return appBuilder_;
    }

    private int port_ ;
    /**
     * <pre>
     * The port number that should be passed to the payload function
     * </pre>
     *
     * <code>uint32 port = 3;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <pre>
     * The port number that should be passed to the payload function
     * </pre>
     *
     * <code>uint32 port = 3;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The port number that should be passed to the payload function
     * </pre>
     *
     * <code>uint32 port = 3;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:handler.DryUplinkMessage)
  }

  // @@protoc_insertion_point(class_scope:handler.DryUplinkMessage)
  private static final org.thethingsnetwork.api.handler.DryUplinkMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.handler.DryUplinkMessage();
  }

  public static org.thethingsnetwork.api.handler.DryUplinkMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DryUplinkMessage>
      PARSER = new com.google.protobuf.AbstractParser<DryUplinkMessage>() {
    public DryUplinkMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DryUplinkMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DryUplinkMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DryUplinkMessage> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.handler.DryUplinkMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

