// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

public interface CFListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lorawan.CFList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 freq = 1;</code>
   * @return A list containing the freq.
   */
  java.util.List<java.lang.Integer> getFreqList();
  /**
   * <code>repeated uint32 freq = 1;</code>
   * @return The count of freq.
   */
  int getFreqCount();
  /**
   * <code>repeated uint32 freq = 1;</code>
   * @param index The index of the element to return.
   * @return The freq at the given index.
   */
  int getFreq(int index);
}