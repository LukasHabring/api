// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

public interface ApplicationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:handler.Application)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string app_id = 1;</code>
   */
  java.lang.String getAppId();
  /**
   * <code>string app_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The payload format indicates how payload is formatted.
   * </pre>
   *
   * <code>string payload_format = 6;</code>
   */
  java.lang.String getPayloadFormat();
  /**
   * <pre>
   * The payload format indicates how payload is formatted.
   * </pre>
   *
   * <code>string payload_format = 6;</code>
   */
  com.google.protobuf.ByteString
      getPayloadFormatBytes();

  /**
   * <pre>
   * The decoder is a JavaScript function that decodes a byte array to an object.
   * This function is used when the payload format is set to custom.
   * </pre>
   *
   * <code>string decoder = 2;</code>
   */
  java.lang.String getDecoder();
  /**
   * <pre>
   * The decoder is a JavaScript function that decodes a byte array to an object.
   * This function is used when the payload format is set to custom.
   * </pre>
   *
   * <code>string decoder = 2;</code>
   */
  com.google.protobuf.ByteString
      getDecoderBytes();

  /**
   * <pre>
   * The converter is a JavaScript function that can be used to convert values
   * in the object returned from the decoder. This can for example be useful to
   * convert a voltage to a temperature. This function is used when the payload format is set to custom.
   * </pre>
   *
   * <code>string converter = 3;</code>
   */
  java.lang.String getConverter();
  /**
   * <pre>
   * The converter is a JavaScript function that can be used to convert values
   * in the object returned from the decoder. This can for example be useful to
   * convert a voltage to a temperature. This function is used when the payload format is set to custom.
   * </pre>
   *
   * <code>string converter = 3;</code>
   */
  com.google.protobuf.ByteString
      getConverterBytes();

  /**
   * <pre>
   * The validator is a JavaScript function that checks the validity of the
   * object returned by the decoder or converter. If validation fails, the
   * message is dropped. This function is used when the payload format is set to custom.
   * </pre>
   *
   * <code>string validator = 4;</code>
   */
  java.lang.String getValidator();
  /**
   * <pre>
   * The validator is a JavaScript function that checks the validity of the
   * object returned by the decoder or converter. If validation fails, the
   * message is dropped. This function is used when the payload format is set to custom.
   * </pre>
   *
   * <code>string validator = 4;</code>
   */
  com.google.protobuf.ByteString
      getValidatorBytes();

  /**
   * <pre>
   * The encoder is a JavaScript function that encodes an object to a byte array.
   * This function is used when the payload format is set to custom.
   * </pre>
   *
   * <code>string encoder = 5;</code>
   */
  java.lang.String getEncoder();
  /**
   * <pre>
   * The encoder is a JavaScript function that encodes an object to a byte array.
   * This function is used when the payload format is set to custom.
   * </pre>
   *
   * <code>string encoder = 5;</code>
   */
  com.google.protobuf.ByteString
      getEncoderBytes();

  /**
   * <pre>
   * The "register on join" access key should only be set if devices need to be registered on join
   * </pre>
   *
   * <code>string register_on_join_access_key = 7;</code>
   */
  java.lang.String getRegisterOnJoinAccessKey();
  /**
   * <pre>
   * The "register on join" access key should only be set if devices need to be registered on join
   * </pre>
   *
   * <code>string register_on_join_access_key = 7;</code>
   */
  com.google.protobuf.ByteString
      getRegisterOnJoinAccessKeyBytes();
}
