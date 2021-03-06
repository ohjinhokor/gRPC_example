// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: simple.proto

package grpc.bepi.lib;

public interface GRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string path = 1;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  int getHeadersCount();
  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */

  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */

  java.lang.String getHeadersOrThrow(
      java.lang.String key);

  /**
   * <code>bytes body = 3;</code>
   * @return The body.
   */
  com.google.protobuf.ByteString getBody();
}
