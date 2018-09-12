//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/router/router.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import Foundation
import Dispatch
import SwiftGRPC
import SwiftProtobuf

internal protocol Router_RouterGatewayStatusCall: ClientCallClientStreaming {
  /// Send a message to the stream. Nonblocking.
  func send(_ message: Gateway_Status, completion: @escaping (Error?) -> Void) throws
  /// Do not call this directly, call `send()` in the protocol extension below instead.
  func _send(_ message: Gateway_Status, timeout: DispatchTime) throws

  /// Call this to close the connection and wait for a response. Blocking.
  func closeAndReceive() throws -> SwiftProtobuf.Google_Protobuf_Empty
  /// Call this to close the connection and wait for a response. Nonblocking.
  func closeAndReceive(completion: @escaping (ResultOrRPCError<SwiftProtobuf.Google_Protobuf_Empty>) -> Void) throws
}

internal extension Router_RouterGatewayStatusCall {
  /// Send a message to the stream and wait for the send operation to finish. Blocking.
  func send(_ message: Gateway_Status, timeout: DispatchTime = .distantFuture) throws { try self._send(message, timeout: timeout) }
}

fileprivate final class Router_RouterGatewayStatusCallBase: ClientCallClientStreamingBase<Gateway_Status, SwiftProtobuf.Google_Protobuf_Empty>, Router_RouterGatewayStatusCall {
  override class var method: String { return "/router.Router/GatewayStatus" }
}

internal protocol Router_RouterUplinkCall: ClientCallClientStreaming {
  /// Send a message to the stream. Nonblocking.
  func send(_ message: Router_UplinkMessage, completion: @escaping (Error?) -> Void) throws
  /// Do not call this directly, call `send()` in the protocol extension below instead.
  func _send(_ message: Router_UplinkMessage, timeout: DispatchTime) throws

  /// Call this to close the connection and wait for a response. Blocking.
  func closeAndReceive() throws -> SwiftProtobuf.Google_Protobuf_Empty
  /// Call this to close the connection and wait for a response. Nonblocking.
  func closeAndReceive(completion: @escaping (ResultOrRPCError<SwiftProtobuf.Google_Protobuf_Empty>) -> Void) throws
}

internal extension Router_RouterUplinkCall {
  /// Send a message to the stream and wait for the send operation to finish. Blocking.
  func send(_ message: Router_UplinkMessage, timeout: DispatchTime = .distantFuture) throws { try self._send(message, timeout: timeout) }
}

fileprivate final class Router_RouterUplinkCallBase: ClientCallClientStreamingBase<Router_UplinkMessage, SwiftProtobuf.Google_Protobuf_Empty>, Router_RouterUplinkCall {
  override class var method: String { return "/router.Router/Uplink" }
}

internal protocol Router_RouterSubscribeCall: ClientCallServerStreaming {
  /// Do not call this directly, call `receive()` in the protocol extension below instead.
  func _receive(timeout: DispatchTime) throws -> Router_DownlinkMessage?
  /// Call this to wait for a result. Nonblocking.
  func receive(completion: @escaping (ResultOrRPCError<Router_DownlinkMessage?>) -> Void) throws
}

internal extension Router_RouterSubscribeCall {
  /// Call this to wait for a result. Blocking.
  func receive(timeout: DispatchTime = .distantFuture) throws -> Router_DownlinkMessage? { return try self._receive(timeout: timeout) }
}

fileprivate final class Router_RouterSubscribeCallBase: ClientCallServerStreamingBase<Router_SubscribeRequest, Router_DownlinkMessage>, Router_RouterSubscribeCall {
  override class var method: String { return "/router.Router/Subscribe" }
}

internal protocol Router_RouterActivateCall: ClientCallUnary {}

fileprivate final class Router_RouterActivateCallBase: ClientCallUnaryBase<Router_DeviceActivationRequest, Router_DeviceActivationResponse>, Router_RouterActivateCall {
  override class var method: String { return "/router.Router/Activate" }
}


/// Instantiate Router_RouterServiceClient, then call methods of this protocol to make API calls.
internal protocol Router_RouterService: ServiceClient {
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  func gatewayStatus(completion: ((CallResult) -> Void)?) throws -> Router_RouterGatewayStatusCall

  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  func uplink(completion: ((CallResult) -> Void)?) throws -> Router_RouterUplinkCall

  /// Asynchronous. Server-streaming.
  /// Send the initial message.
  /// Use methods on the returned object to get streamed responses.
  func subscribe(_ request: Router_SubscribeRequest, completion: ((CallResult) -> Void)?) throws -> Router_RouterSubscribeCall

  /// Synchronous. Unary.
  func activate(_ request: Router_DeviceActivationRequest) throws -> Router_DeviceActivationResponse
  /// Asynchronous. Unary.
  func activate(_ request: Router_DeviceActivationRequest, completion: @escaping (Router_DeviceActivationResponse?, CallResult) -> Void) throws -> Router_RouterActivateCall

}

internal final class Router_RouterServiceClient: ServiceClientBase, Router_RouterService {
  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func gatewayStatus(completion: ((CallResult) -> Void)?) throws -> Router_RouterGatewayStatusCall {
    return try Router_RouterGatewayStatusCallBase(channel)
      .start(metadata: metadata, completion: completion)
  }

  /// Asynchronous. Client-streaming.
  /// Use methods on the returned object to stream messages and
  /// to close the connection and wait for a final response.
  internal func uplink(completion: ((CallResult) -> Void)?) throws -> Router_RouterUplinkCall {
    return try Router_RouterUplinkCallBase(channel)
      .start(metadata: metadata, completion: completion)
  }

  /// Asynchronous. Server-streaming.
  /// Send the initial message.
  /// Use methods on the returned object to get streamed responses.
  internal func subscribe(_ request: Router_SubscribeRequest, completion: ((CallResult) -> Void)?) throws -> Router_RouterSubscribeCall {
    return try Router_RouterSubscribeCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

  /// Synchronous. Unary.
  internal func activate(_ request: Router_DeviceActivationRequest) throws -> Router_DeviceActivationResponse {
    return try Router_RouterActivateCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func activate(_ request: Router_DeviceActivationRequest, completion: @escaping (Router_DeviceActivationResponse?, CallResult) -> Void) throws -> Router_RouterActivateCall {
    return try Router_RouterActivateCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

}
internal protocol Router_RouterManagerGatewayStatusCall: ClientCallUnary {}

fileprivate final class Router_RouterManagerGatewayStatusCallBase: ClientCallUnaryBase<Router_GatewayStatusRequest, Router_GatewayStatusResponse>, Router_RouterManagerGatewayStatusCall {
  override class var method: String { return "/router.RouterManager/GatewayStatus" }
}

internal protocol Router_RouterManagerGetStatusCall: ClientCallUnary {}

fileprivate final class Router_RouterManagerGetStatusCallBase: ClientCallUnaryBase<Router_StatusRequest, Router_Status>, Router_RouterManagerGetStatusCall {
  override class var method: String { return "/router.RouterManager/GetStatus" }
}


/// Instantiate Router_RouterManagerServiceClient, then call methods of this protocol to make API calls.
internal protocol Router_RouterManagerService: ServiceClient {
  /// Synchronous. Unary.
  func gatewayStatus(_ request: Router_GatewayStatusRequest) throws -> Router_GatewayStatusResponse
  /// Asynchronous. Unary.
  func gatewayStatus(_ request: Router_GatewayStatusRequest, completion: @escaping (Router_GatewayStatusResponse?, CallResult) -> Void) throws -> Router_RouterManagerGatewayStatusCall

  /// Synchronous. Unary.
  func getStatus(_ request: Router_StatusRequest) throws -> Router_Status
  /// Asynchronous. Unary.
  func getStatus(_ request: Router_StatusRequest, completion: @escaping (Router_Status?, CallResult) -> Void) throws -> Router_RouterManagerGetStatusCall

}

internal final class Router_RouterManagerServiceClient: ServiceClientBase, Router_RouterManagerService {
  /// Synchronous. Unary.
  internal func gatewayStatus(_ request: Router_GatewayStatusRequest) throws -> Router_GatewayStatusResponse {
    return try Router_RouterManagerGatewayStatusCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func gatewayStatus(_ request: Router_GatewayStatusRequest, completion: @escaping (Router_GatewayStatusResponse?, CallResult) -> Void) throws -> Router_RouterManagerGatewayStatusCall {
    return try Router_RouterManagerGatewayStatusCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

  /// Synchronous. Unary.
  internal func getStatus(_ request: Router_StatusRequest) throws -> Router_Status {
    return try Router_RouterManagerGetStatusCallBase(channel)
      .run(request: request, metadata: metadata)
  }
  /// Asynchronous. Unary.
  internal func getStatus(_ request: Router_StatusRequest, completion: @escaping (Router_Status?, CallResult) -> Void) throws -> Router_RouterManagerGetStatusCall {
    return try Router_RouterManagerGetStatusCallBase(channel)
      .start(request: request, metadata: metadata, completion: completion)
  }

}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Router_RouterProvider {
  func gatewayStatus(session: Router_RouterGatewayStatusSession) throws
  func uplink(session: Router_RouterUplinkSession) throws
  func subscribe(request: Router_SubscribeRequest, session: Router_RouterSubscribeSession) throws
  func activate(request: Router_DeviceActivationRequest, session: Router_RouterActivateSession) throws -> Router_DeviceActivationResponse
}

internal protocol Router_RouterGatewayStatusSession: ServerSessionClientStreaming {
  /// Do not call this directly, call `receive()` in the protocol extension below instead.
  func _receive(timeout: DispatchTime) throws -> Gateway_Status?
  /// Call this to wait for a result. Nonblocking.
  func receive(completion: @escaping (ResultOrRPCError<Gateway_Status?>) -> Void) throws

  /// You MUST call one of these two methods once you are done processing the request.
  /// Close the connection and send a single result. Non-blocking.
  func sendAndClose(response: SwiftProtobuf.Google_Protobuf_Empty, status: ServerStatus, completion: (() -> Void)?) throws
  /// Close the connection and send an error. Non-blocking.
  /// Use this method if you encountered an error that makes it impossible to send a response.
  /// Accordingly, it does not make sense to call this method with a status of `.ok`.
  func sendErrorAndClose(status: ServerStatus, completion: (() -> Void)?) throws
}

internal extension Router_RouterGatewayStatusSession {
  /// Call this to wait for a result. Blocking.
  func receive(timeout: DispatchTime = .distantFuture) throws -> Gateway_Status? { return try self._receive(timeout: timeout) }
}

fileprivate final class Router_RouterGatewayStatusSessionBase: ServerSessionClientStreamingBase<Gateway_Status, SwiftProtobuf.Google_Protobuf_Empty>, Router_RouterGatewayStatusSession {}

internal protocol Router_RouterUplinkSession: ServerSessionClientStreaming {
  /// Do not call this directly, call `receive()` in the protocol extension below instead.
  func _receive(timeout: DispatchTime) throws -> Router_UplinkMessage?
  /// Call this to wait for a result. Nonblocking.
  func receive(completion: @escaping (ResultOrRPCError<Router_UplinkMessage?>) -> Void) throws

  /// You MUST call one of these two methods once you are done processing the request.
  /// Close the connection and send a single result. Non-blocking.
  func sendAndClose(response: SwiftProtobuf.Google_Protobuf_Empty, status: ServerStatus, completion: (() -> Void)?) throws
  /// Close the connection and send an error. Non-blocking.
  /// Use this method if you encountered an error that makes it impossible to send a response.
  /// Accordingly, it does not make sense to call this method with a status of `.ok`.
  func sendErrorAndClose(status: ServerStatus, completion: (() -> Void)?) throws
}

internal extension Router_RouterUplinkSession {
  /// Call this to wait for a result. Blocking.
  func receive(timeout: DispatchTime = .distantFuture) throws -> Router_UplinkMessage? { return try self._receive(timeout: timeout) }
}

fileprivate final class Router_RouterUplinkSessionBase: ServerSessionClientStreamingBase<Router_UplinkMessage, SwiftProtobuf.Google_Protobuf_Empty>, Router_RouterUplinkSession {}

internal protocol Router_RouterSubscribeSession: ServerSessionServerStreaming {
  /// Send a message to the stream. Nonblocking.
  func send(_ message: Router_DownlinkMessage, completion: @escaping (Error?) -> Void) throws
  /// Do not call this directly, call `send()` in the protocol extension below instead.
  func _send(_ message: Router_DownlinkMessage, timeout: DispatchTime) throws

  /// Close the connection and send the status. Non-blocking.
  /// You MUST call this method once you are done processing the request.
  func close(withStatus status: ServerStatus, completion: (() -> Void)?) throws
}

internal extension Router_RouterSubscribeSession {
  /// Send a message to the stream and wait for the send operation to finish. Blocking.
  func send(_ message: Router_DownlinkMessage, timeout: DispatchTime = .distantFuture) throws { try self._send(message, timeout: timeout) }
}

fileprivate final class Router_RouterSubscribeSessionBase: ServerSessionServerStreamingBase<Router_SubscribeRequest, Router_DownlinkMessage>, Router_RouterSubscribeSession {}

internal protocol Router_RouterActivateSession: ServerSessionUnary {}

fileprivate final class Router_RouterActivateSessionBase: ServerSessionUnaryBase<Router_DeviceActivationRequest, Router_DeviceActivationResponse>, Router_RouterActivateSession {}


/// Main server for generated service
internal final class Router_RouterServer: ServiceServer {
  private let provider: Router_RouterProvider

  internal init(address: String, provider: Router_RouterProvider) {
    self.provider = provider
    super.init(address: address)
  }

  internal init?(address: String, certificateURL: URL, keyURL: URL, provider: Router_RouterProvider) {
    self.provider = provider
    super.init(address: address, certificateURL: certificateURL, keyURL: keyURL)
  }

  internal init?(address: String, certificateString: String, keyString: String, provider: Router_RouterProvider) {
    self.provider = provider
    super.init(address: address, certificateString: certificateString, keyString: keyString)
  }

  /// Start the server.
  internal override func handleMethod(_ method: String, handler: Handler, queue: DispatchQueue) throws -> Bool {
    let provider = self.provider
    switch method {
    case "/router.Router/GatewayStatus":
      try Router_RouterGatewayStatusSessionBase(
        handler: handler,
        providerBlock: { try provider.gatewayStatus(session: $0 as! Router_RouterGatewayStatusSessionBase) })
          .run(queue: queue)
      return true
    case "/router.Router/Uplink":
      try Router_RouterUplinkSessionBase(
        handler: handler,
        providerBlock: { try provider.uplink(session: $0 as! Router_RouterUplinkSessionBase) })
          .run(queue: queue)
      return true
    case "/router.Router/Subscribe":
      try Router_RouterSubscribeSessionBase(
        handler: handler,
        providerBlock: { try provider.subscribe(request: $0, session: $1 as! Router_RouterSubscribeSessionBase) })
          .run(queue: queue)
      return true
    case "/router.Router/Activate":
      try Router_RouterActivateSessionBase(
        handler: handler,
        providerBlock: { try provider.activate(request: $0, session: $1 as! Router_RouterActivateSessionBase) })
          .run(queue: queue)
      return true
    default:
      return false
    }
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Router_RouterManagerProvider {
  func gatewayStatus(request: Router_GatewayStatusRequest, session: Router_RouterManagerGatewayStatusSession) throws -> Router_GatewayStatusResponse
  func getStatus(request: Router_StatusRequest, session: Router_RouterManagerGetStatusSession) throws -> Router_Status
}

internal protocol Router_RouterManagerGatewayStatusSession: ServerSessionUnary {}

fileprivate final class Router_RouterManagerGatewayStatusSessionBase: ServerSessionUnaryBase<Router_GatewayStatusRequest, Router_GatewayStatusResponse>, Router_RouterManagerGatewayStatusSession {}

internal protocol Router_RouterManagerGetStatusSession: ServerSessionUnary {}

fileprivate final class Router_RouterManagerGetStatusSessionBase: ServerSessionUnaryBase<Router_StatusRequest, Router_Status>, Router_RouterManagerGetStatusSession {}


/// Main server for generated service
internal final class Router_RouterManagerServer: ServiceServer {
  private let provider: Router_RouterManagerProvider

  internal init(address: String, provider: Router_RouterManagerProvider) {
    self.provider = provider
    super.init(address: address)
  }

  internal init?(address: String, certificateURL: URL, keyURL: URL, provider: Router_RouterManagerProvider) {
    self.provider = provider
    super.init(address: address, certificateURL: certificateURL, keyURL: keyURL)
  }

  internal init?(address: String, certificateString: String, keyString: String, provider: Router_RouterManagerProvider) {
    self.provider = provider
    super.init(address: address, certificateString: certificateString, keyString: keyString)
  }

  /// Start the server.
  internal override func handleMethod(_ method: String, handler: Handler, queue: DispatchQueue) throws -> Bool {
    let provider = self.provider
    switch method {
    case "/router.RouterManager/GatewayStatus":
      try Router_RouterManagerGatewayStatusSessionBase(
        handler: handler,
        providerBlock: { try provider.gatewayStatus(request: $0, session: $1 as! Router_RouterManagerGatewayStatusSessionBase) })
          .run(queue: queue)
      return true
    case "/router.RouterManager/GetStatus":
      try Router_RouterManagerGetStatusSessionBase(
        handler: handler,
        providerBlock: { try provider.getStatus(request: $0, session: $1 as! Router_RouterManagerGetStatusSessionBase) })
          .run(queue: queue)
      return true
    default:
      return false
    }
  }
}
