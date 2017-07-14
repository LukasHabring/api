// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/gateway/gateway.proto

package org.thethingsnetwork.api.gateway;

/**
 * Protobuf type {@code gateway.LocationMetadata}
 */
public  final class LocationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gateway.LocationMetadata)
    LocationMetadataOrBuilder {
  // Use LocationMetadata.newBuilder() to construct.
  private LocationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocationMetadata() {
    time_ = 0L;
    latitude_ = 0F;
    longitude_ = 0F;
    altitude_ = 0;
    accuracy_ = 0;
    source_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LocationMetadata(
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
          case 8: {

            time_ = input.readInt64();
            break;
          }
          case 21: {

            latitude_ = input.readFloat();
            break;
          }
          case 29: {

            longitude_ = input.readFloat();
            break;
          }
          case 32: {

            altitude_ = input.readInt32();
            break;
          }
          case 40: {

            accuracy_ = input.readInt32();
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            source_ = rawValue;
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
    return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_LocationMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_LocationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.gateway.LocationMetadata.class, org.thethingsnetwork.api.gateway.LocationMetadata.Builder.class);
  }

  /**
   * Protobuf enum {@code gateway.LocationMetadata.LocationSource}
   */
  public enum LocationSource
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The source of the location is not known or not set
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <pre>
     * The location is determined by GPS
     * </pre>
     *
     * <code>GPS = 1;</code>
     */
    GPS(1),
    /**
     * <pre>
     * The location is fixed by configuration
     * </pre>
     *
     * <code>CONFIG = 2;</code>
     */
    CONFIG(2),
    /**
     * <pre>
     * The location is set in and updated from a registry
     * </pre>
     *
     * <code>REGISTRY = 3;</code>
     */
    REGISTRY(3),
    /**
     * <pre>
     * The location is estimated with IP Geolocation
     * </pre>
     *
     * <code>IP_GEOLOCATION = 4;</code>
     */
    IP_GEOLOCATION(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The source of the location is not known or not set
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <pre>
     * The location is determined by GPS
     * </pre>
     *
     * <code>GPS = 1;</code>
     */
    public static final int GPS_VALUE = 1;
    /**
     * <pre>
     * The location is fixed by configuration
     * </pre>
     *
     * <code>CONFIG = 2;</code>
     */
    public static final int CONFIG_VALUE = 2;
    /**
     * <pre>
     * The location is set in and updated from a registry
     * </pre>
     *
     * <code>REGISTRY = 3;</code>
     */
    public static final int REGISTRY_VALUE = 3;
    /**
     * <pre>
     * The location is estimated with IP Geolocation
     * </pre>
     *
     * <code>IP_GEOLOCATION = 4;</code>
     */
    public static final int IP_GEOLOCATION_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LocationSource valueOf(int value) {
      return forNumber(value);
    }

    public static LocationSource forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return GPS;
        case 2: return CONFIG;
        case 3: return REGISTRY;
        case 4: return IP_GEOLOCATION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LocationSource>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LocationSource> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LocationSource>() {
            public LocationSource findValueByNumber(int number) {
              return LocationSource.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.thethingsnetwork.api.gateway.LocationMetadata.getDescriptor().getEnumTypes().get(0);
    }

    private static final LocationSource[] VALUES = values();

    public static LocationSource valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LocationSource(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:gateway.LocationMetadata.LocationSource)
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private long time_;
  /**
   * <pre>
   * Time (unix nanoseconds)
   * </pre>
   *
   * <code>int64 time = 1;</code>
   */
  public long getTime() {
    return time_;
  }

  public static final int LATITUDE_FIELD_NUMBER = 2;
  private float latitude_;
  /**
   * <pre>
   * the north–south position (degrees; -90 to +90), where 0 is the equator, north pole is positive, south pole is negative
   * </pre>
   *
   * <code>float latitude = 2;</code>
   */
  public float getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 3;
  private float longitude_;
  /**
   * <pre>
   * the east-west position (degrees; -180 to +180), where 0 is the Prime Meridian (Greenwich), east is positive , west is negative
   * </pre>
   *
   * <code>float longitude = 3;</code>
   */
  public float getLongitude() {
    return longitude_;
  }

  public static final int ALTITUDE_FIELD_NUMBER = 4;
  private int altitude_;
  /**
   * <pre>
   * the altitude (meters), where 0 is the mean sea level
   * </pre>
   *
   * <code>int32 altitude = 4;</code>
   */
  public int getAltitude() {
    return altitude_;
  }

  public static final int ACCURACY_FIELD_NUMBER = 5;
  private int accuracy_;
  /**
   * <pre>
   * the accuracy of the location (meters)
   * </pre>
   *
   * <code>int32 accuracy = 5;</code>
   */
  public int getAccuracy() {
    return accuracy_;
  }

  public static final int SOURCE_FIELD_NUMBER = 6;
  private int source_;
  /**
   * <code>.gateway.LocationMetadata.LocationSource source = 6;</code>
   */
  public int getSourceValue() {
    return source_;
  }
  /**
   * <code>.gateway.LocationMetadata.LocationSource source = 6;</code>
   */
  public org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource getSource() {
    org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource result = org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource.valueOf(source_);
    return result == null ? org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource.UNRECOGNIZED : result;
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
    if (time_ != 0L) {
      output.writeInt64(1, time_);
    }
    if (latitude_ != 0F) {
      output.writeFloat(2, latitude_);
    }
    if (longitude_ != 0F) {
      output.writeFloat(3, longitude_);
    }
    if (altitude_ != 0) {
      output.writeInt32(4, altitude_);
    }
    if (accuracy_ != 0) {
      output.writeInt32(5, accuracy_);
    }
    if (source_ != org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource.UNKNOWN.getNumber()) {
      output.writeEnum(6, source_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, time_);
    }
    if (latitude_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, latitude_);
    }
    if (longitude_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, longitude_);
    }
    if (altitude_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, altitude_);
    }
    if (accuracy_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, accuracy_);
    }
    if (source_ != org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, source_);
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
    if (!(obj instanceof org.thethingsnetwork.api.gateway.LocationMetadata)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.gateway.LocationMetadata other = (org.thethingsnetwork.api.gateway.LocationMetadata) obj;

    boolean result = true;
    result = result && (getTime()
        == other.getTime());
    result = result && (
        java.lang.Float.floatToIntBits(getLatitude())
        == java.lang.Float.floatToIntBits(
            other.getLatitude()));
    result = result && (
        java.lang.Float.floatToIntBits(getLongitude())
        == java.lang.Float.floatToIntBits(
            other.getLongitude()));
    result = result && (getAltitude()
        == other.getAltitude());
    result = result && (getAccuracy()
        == other.getAccuracy());
    result = result && source_ == other.source_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLatitude());
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLongitude());
    hash = (37 * hash) + ALTITUDE_FIELD_NUMBER;
    hash = (53 * hash) + getAltitude();
    hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
    hash = (53 * hash) + getAccuracy();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + source_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.gateway.LocationMetadata parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.gateway.LocationMetadata prototype) {
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
   * Protobuf type {@code gateway.LocationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gateway.LocationMetadata)
      org.thethingsnetwork.api.gateway.LocationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_LocationMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_LocationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.gateway.LocationMetadata.class, org.thethingsnetwork.api.gateway.LocationMetadata.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.gateway.LocationMetadata.newBuilder()
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
      time_ = 0L;

      latitude_ = 0F;

      longitude_ = 0F;

      altitude_ = 0;

      accuracy_ = 0;

      source_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.gateway.GatewayProto.internal_static_gateway_LocationMetadata_descriptor;
    }

    public org.thethingsnetwork.api.gateway.LocationMetadata getDefaultInstanceForType() {
      return org.thethingsnetwork.api.gateway.LocationMetadata.getDefaultInstance();
    }

    public org.thethingsnetwork.api.gateway.LocationMetadata build() {
      org.thethingsnetwork.api.gateway.LocationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.gateway.LocationMetadata buildPartial() {
      org.thethingsnetwork.api.gateway.LocationMetadata result = new org.thethingsnetwork.api.gateway.LocationMetadata(this);
      result.time_ = time_;
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      result.altitude_ = altitude_;
      result.accuracy_ = accuracy_;
      result.source_ = source_;
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
      if (other instanceof org.thethingsnetwork.api.gateway.LocationMetadata) {
        return mergeFrom((org.thethingsnetwork.api.gateway.LocationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.gateway.LocationMetadata other) {
      if (other == org.thethingsnetwork.api.gateway.LocationMetadata.getDefaultInstance()) return this;
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (other.getLatitude() != 0F) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0F) {
        setLongitude(other.getLongitude());
      }
      if (other.getAltitude() != 0) {
        setAltitude(other.getAltitude());
      }
      if (other.getAccuracy() != 0) {
        setAccuracy(other.getAccuracy());
      }
      if (other.source_ != 0) {
        setSourceValue(other.getSourceValue());
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
      org.thethingsnetwork.api.gateway.LocationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.gateway.LocationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long time_ ;
    /**
     * <pre>
     * Time (unix nanoseconds)
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public long getTime() {
      return time_;
    }
    /**
     * <pre>
     * Time (unix nanoseconds)
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time (unix nanoseconds)
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public Builder clearTime() {
      
      time_ = 0L;
      onChanged();
      return this;
    }

    private float latitude_ ;
    /**
     * <pre>
     * the north–south position (degrees; -90 to +90), where 0 is the equator, north pole is positive, south pole is negative
     * </pre>
     *
     * <code>float latitude = 2;</code>
     */
    public float getLatitude() {
      return latitude_;
    }
    /**
     * <pre>
     * the north–south position (degrees; -90 to +90), where 0 is the equator, north pole is positive, south pole is negative
     * </pre>
     *
     * <code>float latitude = 2;</code>
     */
    public Builder setLatitude(float value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the north–south position (degrees; -90 to +90), where 0 is the equator, north pole is positive, south pole is negative
     * </pre>
     *
     * <code>float latitude = 2;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0F;
      onChanged();
      return this;
    }

    private float longitude_ ;
    /**
     * <pre>
     * the east-west position (degrees; -180 to +180), where 0 is the Prime Meridian (Greenwich), east is positive , west is negative
     * </pre>
     *
     * <code>float longitude = 3;</code>
     */
    public float getLongitude() {
      return longitude_;
    }
    /**
     * <pre>
     * the east-west position (degrees; -180 to +180), where 0 is the Prime Meridian (Greenwich), east is positive , west is negative
     * </pre>
     *
     * <code>float longitude = 3;</code>
     */
    public Builder setLongitude(float value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the east-west position (degrees; -180 to +180), where 0 is the Prime Meridian (Greenwich), east is positive , west is negative
     * </pre>
     *
     * <code>float longitude = 3;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0F;
      onChanged();
      return this;
    }

    private int altitude_ ;
    /**
     * <pre>
     * the altitude (meters), where 0 is the mean sea level
     * </pre>
     *
     * <code>int32 altitude = 4;</code>
     */
    public int getAltitude() {
      return altitude_;
    }
    /**
     * <pre>
     * the altitude (meters), where 0 is the mean sea level
     * </pre>
     *
     * <code>int32 altitude = 4;</code>
     */
    public Builder setAltitude(int value) {
      
      altitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the altitude (meters), where 0 is the mean sea level
     * </pre>
     *
     * <code>int32 altitude = 4;</code>
     */
    public Builder clearAltitude() {
      
      altitude_ = 0;
      onChanged();
      return this;
    }

    private int accuracy_ ;
    /**
     * <pre>
     * the accuracy of the location (meters)
     * </pre>
     *
     * <code>int32 accuracy = 5;</code>
     */
    public int getAccuracy() {
      return accuracy_;
    }
    /**
     * <pre>
     * the accuracy of the location (meters)
     * </pre>
     *
     * <code>int32 accuracy = 5;</code>
     */
    public Builder setAccuracy(int value) {
      
      accuracy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the accuracy of the location (meters)
     * </pre>
     *
     * <code>int32 accuracy = 5;</code>
     */
    public Builder clearAccuracy() {
      
      accuracy_ = 0;
      onChanged();
      return this;
    }

    private int source_ = 0;
    /**
     * <code>.gateway.LocationMetadata.LocationSource source = 6;</code>
     */
    public int getSourceValue() {
      return source_;
    }
    /**
     * <code>.gateway.LocationMetadata.LocationSource source = 6;</code>
     */
    public Builder setSourceValue(int value) {
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.gateway.LocationMetadata.LocationSource source = 6;</code>
     */
    public org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource getSource() {
      org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource result = org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource.valueOf(source_);
      return result == null ? org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource.UNRECOGNIZED : result;
    }
    /**
     * <code>.gateway.LocationMetadata.LocationSource source = 6;</code>
     */
    public Builder setSource(org.thethingsnetwork.api.gateway.LocationMetadata.LocationSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      source_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gateway.LocationMetadata.LocationSource source = 6;</code>
     */
    public Builder clearSource() {
      
      source_ = 0;
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


    // @@protoc_insertion_point(builder_scope:gateway.LocationMetadata)
  }

  // @@protoc_insertion_point(class_scope:gateway.LocationMetadata)
  private static final org.thethingsnetwork.api.gateway.LocationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.gateway.LocationMetadata();
  }

  public static org.thethingsnetwork.api.gateway.LocationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<LocationMetadata>() {
    public LocationMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LocationMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationMetadata> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.gateway.LocationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

