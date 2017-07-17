// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

/**
 * Protobuf enum {@code lorawan.Modulation}
 */
public enum Modulation
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LORA = 0;</code>
   */
  LORA(0),
  /**
   * <code>FSK = 1;</code>
   */
  FSK(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LORA = 0;</code>
   */
  public static final int LORA_VALUE = 0;
  /**
   * <code>FSK = 1;</code>
   */
  public static final int FSK_VALUE = 1;


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
  public static Modulation valueOf(int value) {
    return forNumber(value);
  }

  public static Modulation forNumber(int value) {
    switch (value) {
      case 0: return LORA;
      case 1: return FSK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Modulation>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Modulation> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Modulation>() {
          public Modulation findValueByNumber(int number) {
            return Modulation.forNumber(number);
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
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Modulation[] VALUES = values();

  public static Modulation valueOf(
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

  private Modulation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:lorawan.Modulation)
}
