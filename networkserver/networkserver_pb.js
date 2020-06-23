// source: github.com/TheThingsNetwork/api/networkserver/networkserver.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();



var ttn_api_pb = require('../api_pb.js');
goog.object.extend(proto, ttn_api_pb);
var ttn_protocol_lorawan_device_pb = require('../protocol/lorawan/device_pb.js');
goog.object.extend(proto, ttn_protocol_lorawan_device_pb);
var ttn_broker_broker_pb = require('../broker/broker_pb.js');
goog.object.extend(proto, ttn_broker_broker_pb);
var ttn_handler_handler_pb = require('../handler/handler_pb.js');
goog.object.extend(proto, ttn_handler_handler_pb);
goog.exportSymbol('proto.networkserver.DevicesRequest', null, global);
goog.exportSymbol('proto.networkserver.DevicesResponse', null, global);
goog.exportSymbol('proto.networkserver.Status', null, global);
goog.exportSymbol('proto.networkserver.StatusRequest', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.networkserver.DevicesRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.networkserver.DevicesRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.networkserver.DevicesRequest.displayName = 'proto.networkserver.DevicesRequest';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.networkserver.DevicesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.networkserver.DevicesResponse.repeatedFields_, null);
};
goog.inherits(proto.networkserver.DevicesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.networkserver.DevicesResponse.displayName = 'proto.networkserver.DevicesResponse';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.networkserver.StatusRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.networkserver.StatusRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.networkserver.StatusRequest.displayName = 'proto.networkserver.StatusRequest';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.networkserver.Status = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.networkserver.Status, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.networkserver.Status.displayName = 'proto.networkserver.Status';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.networkserver.DevicesRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.networkserver.DevicesRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.networkserver.DevicesRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.networkserver.DevicesRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    devAddr: msg.getDevAddr_asB64(),
    fCnt: jspb.Message.getFieldWithDefault(msg, 2, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.networkserver.DevicesRequest}
 */
proto.networkserver.DevicesRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.networkserver.DevicesRequest;
  return proto.networkserver.DevicesRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.networkserver.DevicesRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.networkserver.DevicesRequest}
 */
proto.networkserver.DevicesRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDevAddr(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setFCnt(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.networkserver.DevicesRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.networkserver.DevicesRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.networkserver.DevicesRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.networkserver.DevicesRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDevAddr_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getFCnt();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
};


/**
 * optional bytes dev_addr = 1;
 * @return {!(string|Uint8Array)}
 */
proto.networkserver.DevicesRequest.prototype.getDevAddr = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes dev_addr = 1;
 * This is a type-conversion wrapper around `getDevAddr()`
 * @return {string}
 */
proto.networkserver.DevicesRequest.prototype.getDevAddr_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDevAddr()));
};


/**
 * optional bytes dev_addr = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDevAddr()`
 * @return {!Uint8Array}
 */
proto.networkserver.DevicesRequest.prototype.getDevAddr_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDevAddr()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.networkserver.DevicesRequest} returns this
 */
proto.networkserver.DevicesRequest.prototype.setDevAddr = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional uint32 f_cnt = 2;
 * @return {number}
 */
proto.networkserver.DevicesRequest.prototype.getFCnt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.networkserver.DevicesRequest} returns this
 */
proto.networkserver.DevicesRequest.prototype.setFCnt = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.networkserver.DevicesResponse.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.networkserver.DevicesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.networkserver.DevicesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.networkserver.DevicesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.networkserver.DevicesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    resultsList: jspb.Message.toObjectList(msg.getResultsList(),
    ttn_protocol_lorawan_device_pb.Device.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.networkserver.DevicesResponse}
 */
proto.networkserver.DevicesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.networkserver.DevicesResponse;
  return proto.networkserver.DevicesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.networkserver.DevicesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.networkserver.DevicesResponse}
 */
proto.networkserver.DevicesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new ttn_protocol_lorawan_device_pb.Device;
      reader.readMessage(value,ttn_protocol_lorawan_device_pb.Device.deserializeBinaryFromReader);
      msg.addResults(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.networkserver.DevicesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.networkserver.DevicesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.networkserver.DevicesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.networkserver.DevicesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getResultsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      ttn_protocol_lorawan_device_pb.Device.serializeBinaryToWriter
    );
  }
};


/**
 * repeated lorawan.Device results = 1;
 * @return {!Array<!proto.lorawan.Device>}
 */
proto.networkserver.DevicesResponse.prototype.getResultsList = function() {
  return /** @type{!Array<!proto.lorawan.Device>} */ (
    jspb.Message.getRepeatedWrapperField(this, ttn_protocol_lorawan_device_pb.Device, 1));
};


/**
 * @param {!Array<!proto.lorawan.Device>} value
 * @return {!proto.networkserver.DevicesResponse} returns this
*/
proto.networkserver.DevicesResponse.prototype.setResultsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.lorawan.Device=} opt_value
 * @param {number=} opt_index
 * @return {!proto.lorawan.Device}
 */
proto.networkserver.DevicesResponse.prototype.addResults = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.lorawan.Device, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.networkserver.DevicesResponse} returns this
 */
proto.networkserver.DevicesResponse.prototype.clearResultsList = function() {
  return this.setResultsList([]);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.networkserver.StatusRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.networkserver.StatusRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.networkserver.StatusRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.networkserver.StatusRequest.toObject = function(includeInstance, msg) {
  var f, obj = {

  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.networkserver.StatusRequest}
 */
proto.networkserver.StatusRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.networkserver.StatusRequest;
  return proto.networkserver.StatusRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.networkserver.StatusRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.networkserver.StatusRequest}
 */
proto.networkserver.StatusRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.networkserver.StatusRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.networkserver.StatusRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.networkserver.StatusRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.networkserver.StatusRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.networkserver.Status.prototype.toObject = function(opt_includeInstance) {
  return proto.networkserver.Status.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.networkserver.Status} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.networkserver.Status.toObject = function(includeInstance, msg) {
  var f, obj = {
    system: (f = msg.getSystem()) && ttn_api_pb.SystemStats.toObject(includeInstance, f),
    component: (f = msg.getComponent()) && ttn_api_pb.ComponentStats.toObject(includeInstance, f),
    uplink: (f = msg.getUplink()) && ttn_api_pb.Rates.toObject(includeInstance, f),
    downlink: (f = msg.getDownlink()) && ttn_api_pb.Rates.toObject(includeInstance, f),
    activations: (f = msg.getActivations()) && ttn_api_pb.Rates.toObject(includeInstance, f),
    devicesPerAddress: (f = msg.getDevicesPerAddress()) && ttn_api_pb.Percentiles.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.networkserver.Status}
 */
proto.networkserver.Status.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.networkserver.Status;
  return proto.networkserver.Status.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.networkserver.Status} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.networkserver.Status}
 */
proto.networkserver.Status.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new ttn_api_pb.SystemStats;
      reader.readMessage(value,ttn_api_pb.SystemStats.deserializeBinaryFromReader);
      msg.setSystem(value);
      break;
    case 2:
      var value = new ttn_api_pb.ComponentStats;
      reader.readMessage(value,ttn_api_pb.ComponentStats.deserializeBinaryFromReader);
      msg.setComponent(value);
      break;
    case 11:
      var value = new ttn_api_pb.Rates;
      reader.readMessage(value,ttn_api_pb.Rates.deserializeBinaryFromReader);
      msg.setUplink(value);
      break;
    case 12:
      var value = new ttn_api_pb.Rates;
      reader.readMessage(value,ttn_api_pb.Rates.deserializeBinaryFromReader);
      msg.setDownlink(value);
      break;
    case 13:
      var value = new ttn_api_pb.Rates;
      reader.readMessage(value,ttn_api_pb.Rates.deserializeBinaryFromReader);
      msg.setActivations(value);
      break;
    case 21:
      var value = new ttn_api_pb.Percentiles;
      reader.readMessage(value,ttn_api_pb.Percentiles.deserializeBinaryFromReader);
      msg.setDevicesPerAddress(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.networkserver.Status.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.networkserver.Status.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.networkserver.Status} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.networkserver.Status.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSystem();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      ttn_api_pb.SystemStats.serializeBinaryToWriter
    );
  }
  f = message.getComponent();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      ttn_api_pb.ComponentStats.serializeBinaryToWriter
    );
  }
  f = message.getUplink();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      ttn_api_pb.Rates.serializeBinaryToWriter
    );
  }
  f = message.getDownlink();
  if (f != null) {
    writer.writeMessage(
      12,
      f,
      ttn_api_pb.Rates.serializeBinaryToWriter
    );
  }
  f = message.getActivations();
  if (f != null) {
    writer.writeMessage(
      13,
      f,
      ttn_api_pb.Rates.serializeBinaryToWriter
    );
  }
  f = message.getDevicesPerAddress();
  if (f != null) {
    writer.writeMessage(
      21,
      f,
      ttn_api_pb.Percentiles.serializeBinaryToWriter
    );
  }
};


/**
 * optional api.SystemStats system = 1;
 * @return {?proto.api.SystemStats}
 */
proto.networkserver.Status.prototype.getSystem = function() {
  return /** @type{?proto.api.SystemStats} */ (
    jspb.Message.getWrapperField(this, ttn_api_pb.SystemStats, 1));
};


/**
 * @param {?proto.api.SystemStats|undefined} value
 * @return {!proto.networkserver.Status} returns this
*/
proto.networkserver.Status.prototype.setSystem = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.networkserver.Status} returns this
 */
proto.networkserver.Status.prototype.clearSystem = function() {
  return this.setSystem(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.networkserver.Status.prototype.hasSystem = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional api.ComponentStats component = 2;
 * @return {?proto.api.ComponentStats}
 */
proto.networkserver.Status.prototype.getComponent = function() {
  return /** @type{?proto.api.ComponentStats} */ (
    jspb.Message.getWrapperField(this, ttn_api_pb.ComponentStats, 2));
};


/**
 * @param {?proto.api.ComponentStats|undefined} value
 * @return {!proto.networkserver.Status} returns this
*/
proto.networkserver.Status.prototype.setComponent = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.networkserver.Status} returns this
 */
proto.networkserver.Status.prototype.clearComponent = function() {
  return this.setComponent(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.networkserver.Status.prototype.hasComponent = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional api.Rates uplink = 11;
 * @return {?proto.api.Rates}
 */
proto.networkserver.Status.prototype.getUplink = function() {
  return /** @type{?proto.api.Rates} */ (
    jspb.Message.getWrapperField(this, ttn_api_pb.Rates, 11));
};


/**
 * @param {?proto.api.Rates|undefined} value
 * @return {!proto.networkserver.Status} returns this
*/
proto.networkserver.Status.prototype.setUplink = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.networkserver.Status} returns this
 */
proto.networkserver.Status.prototype.clearUplink = function() {
  return this.setUplink(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.networkserver.Status.prototype.hasUplink = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional api.Rates downlink = 12;
 * @return {?proto.api.Rates}
 */
proto.networkserver.Status.prototype.getDownlink = function() {
  return /** @type{?proto.api.Rates} */ (
    jspb.Message.getWrapperField(this, ttn_api_pb.Rates, 12));
};


/**
 * @param {?proto.api.Rates|undefined} value
 * @return {!proto.networkserver.Status} returns this
*/
proto.networkserver.Status.prototype.setDownlink = function(value) {
  return jspb.Message.setWrapperField(this, 12, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.networkserver.Status} returns this
 */
proto.networkserver.Status.prototype.clearDownlink = function() {
  return this.setDownlink(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.networkserver.Status.prototype.hasDownlink = function() {
  return jspb.Message.getField(this, 12) != null;
};


/**
 * optional api.Rates activations = 13;
 * @return {?proto.api.Rates}
 */
proto.networkserver.Status.prototype.getActivations = function() {
  return /** @type{?proto.api.Rates} */ (
    jspb.Message.getWrapperField(this, ttn_api_pb.Rates, 13));
};


/**
 * @param {?proto.api.Rates|undefined} value
 * @return {!proto.networkserver.Status} returns this
*/
proto.networkserver.Status.prototype.setActivations = function(value) {
  return jspb.Message.setWrapperField(this, 13, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.networkserver.Status} returns this
 */
proto.networkserver.Status.prototype.clearActivations = function() {
  return this.setActivations(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.networkserver.Status.prototype.hasActivations = function() {
  return jspb.Message.getField(this, 13) != null;
};


/**
 * optional api.Percentiles devices_per_address = 21;
 * @return {?proto.api.Percentiles}
 */
proto.networkserver.Status.prototype.getDevicesPerAddress = function() {
  return /** @type{?proto.api.Percentiles} */ (
    jspb.Message.getWrapperField(this, ttn_api_pb.Percentiles, 21));
};


/**
 * @param {?proto.api.Percentiles|undefined} value
 * @return {!proto.networkserver.Status} returns this
*/
proto.networkserver.Status.prototype.setDevicesPerAddress = function(value) {
  return jspb.Message.setWrapperField(this, 21, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.networkserver.Status} returns this
 */
proto.networkserver.Status.prototype.clearDevicesPerAddress = function() {
  return this.setDevicesPerAddress(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.networkserver.Status.prototype.hasDevicesPerAddress = function() {
  return jspb.Message.getField(this, 21) != null;
};


goog.object.extend(exports, proto.networkserver);