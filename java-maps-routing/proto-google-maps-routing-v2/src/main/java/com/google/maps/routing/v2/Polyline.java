/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/polyline.proto

package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * Encapsulates an encoded polyline.
 * </pre>
 *
 * Protobuf type {@code google.maps.routing.v2.Polyline}
 */
public final class Polyline extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.routing.v2.Polyline)
    PolylineOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Polyline.newBuilder() to construct.
  private Polyline(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Polyline() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Polyline();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.routing.v2.PolylineProto
        .internal_static_google_maps_routing_v2_Polyline_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routing.v2.PolylineProto
        .internal_static_google_maps_routing_v2_Polyline_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routing.v2.Polyline.class,
            com.google.maps.routing.v2.Polyline.Builder.class);
  }

  private int polylineTypeCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object polylineType_;

  public enum PolylineTypeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ENCODED_POLYLINE(1),
    GEO_JSON_LINESTRING(2),
    POLYLINETYPE_NOT_SET(0);
    private final int value;

    private PolylineTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PolylineTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static PolylineTypeCase forNumber(int value) {
      switch (value) {
        case 1:
          return ENCODED_POLYLINE;
        case 2:
          return GEO_JSON_LINESTRING;
        case 0:
          return POLYLINETYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public PolylineTypeCase getPolylineTypeCase() {
    return PolylineTypeCase.forNumber(polylineTypeCase_);
  }

  public static final int ENCODED_POLYLINE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The string encoding of the polyline using the [polyline encoding
   * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
   * </pre>
   *
   * <code>string encoded_polyline = 1;</code>
   *
   * @return Whether the encodedPolyline field is set.
   */
  public boolean hasEncodedPolyline() {
    return polylineTypeCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The string encoding of the polyline using the [polyline encoding
   * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
   * </pre>
   *
   * <code>string encoded_polyline = 1;</code>
   *
   * @return The encodedPolyline.
   */
  public java.lang.String getEncodedPolyline() {
    java.lang.Object ref = "";
    if (polylineTypeCase_ == 1) {
      ref = polylineType_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (polylineTypeCase_ == 1) {
        polylineType_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The string encoding of the polyline using the [polyline encoding
   * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
   * </pre>
   *
   * <code>string encoded_polyline = 1;</code>
   *
   * @return The bytes for encodedPolyline.
   */
  public com.google.protobuf.ByteString getEncodedPolylineBytes() {
    java.lang.Object ref = "";
    if (polylineTypeCase_ == 1) {
      ref = polylineType_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (polylineTypeCase_ == 1) {
        polylineType_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GEO_JSON_LINESTRING_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Specifies a polyline using the [GeoJSON LineString
   * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
   * </pre>
   *
   * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
   *
   * @return Whether the geoJsonLinestring field is set.
   */
  @java.lang.Override
  public boolean hasGeoJsonLinestring() {
    return polylineTypeCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Specifies a polyline using the [GeoJSON LineString
   * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
   * </pre>
   *
   * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
   *
   * @return The geoJsonLinestring.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getGeoJsonLinestring() {
    if (polylineTypeCase_ == 2) {
      return (com.google.protobuf.Struct) polylineType_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Specifies a polyline using the [GeoJSON LineString
   * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
   * </pre>
   *
   * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getGeoJsonLinestringOrBuilder() {
    if (polylineTypeCase_ == 2) {
      return (com.google.protobuf.Struct) polylineType_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (polylineTypeCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, polylineType_);
    }
    if (polylineTypeCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Struct) polylineType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (polylineTypeCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, polylineType_);
    }
    if (polylineTypeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.protobuf.Struct) polylineType_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.maps.routing.v2.Polyline)) {
      return super.equals(obj);
    }
    com.google.maps.routing.v2.Polyline other = (com.google.maps.routing.v2.Polyline) obj;

    if (!getPolylineTypeCase().equals(other.getPolylineTypeCase())) return false;
    switch (polylineTypeCase_) {
      case 1:
        if (!getEncodedPolyline().equals(other.getEncodedPolyline())) return false;
        break;
      case 2:
        if (!getGeoJsonLinestring().equals(other.getGeoJsonLinestring())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (polylineTypeCase_) {
      case 1:
        hash = (37 * hash) + ENCODED_POLYLINE_FIELD_NUMBER;
        hash = (53 * hash) + getEncodedPolyline().hashCode();
        break;
      case 2:
        hash = (37 * hash) + GEO_JSON_LINESTRING_FIELD_NUMBER;
        hash = (53 * hash) + getGeoJsonLinestring().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.Polyline parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.Polyline parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.Polyline parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.maps.routing.v2.Polyline prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Encapsulates an encoded polyline.
   * </pre>
   *
   * Protobuf type {@code google.maps.routing.v2.Polyline}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.routing.v2.Polyline)
      com.google.maps.routing.v2.PolylineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.routing.v2.PolylineProto
          .internal_static_google_maps_routing_v2_Polyline_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routing.v2.PolylineProto
          .internal_static_google_maps_routing_v2_Polyline_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routing.v2.Polyline.class,
              com.google.maps.routing.v2.Polyline.Builder.class);
    }

    // Construct using com.google.maps.routing.v2.Polyline.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (geoJsonLinestringBuilder_ != null) {
        geoJsonLinestringBuilder_.clear();
      }
      polylineTypeCase_ = 0;
      polylineType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.routing.v2.PolylineProto
          .internal_static_google_maps_routing_v2_Polyline_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.Polyline getDefaultInstanceForType() {
      return com.google.maps.routing.v2.Polyline.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routing.v2.Polyline build() {
      com.google.maps.routing.v2.Polyline result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.Polyline buildPartial() {
      com.google.maps.routing.v2.Polyline result = new com.google.maps.routing.v2.Polyline(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.routing.v2.Polyline result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.maps.routing.v2.Polyline result) {
      result.polylineTypeCase_ = polylineTypeCase_;
      result.polylineType_ = this.polylineType_;
      if (polylineTypeCase_ == 2 && geoJsonLinestringBuilder_ != null) {
        result.polylineType_ = geoJsonLinestringBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.maps.routing.v2.Polyline) {
        return mergeFrom((com.google.maps.routing.v2.Polyline) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routing.v2.Polyline other) {
      if (other == com.google.maps.routing.v2.Polyline.getDefaultInstance()) return this;
      switch (other.getPolylineTypeCase()) {
        case ENCODED_POLYLINE:
          {
            polylineTypeCase_ = 1;
            polylineType_ = other.polylineType_;
            onChanged();
            break;
          }
        case GEO_JSON_LINESTRING:
          {
            mergeGeoJsonLinestring(other.getGeoJsonLinestring());
            break;
          }
        case POLYLINETYPE_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                polylineTypeCase_ = 1;
                polylineType_ = s;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getGeoJsonLinestringFieldBuilder().getBuilder(), extensionRegistry);
                polylineTypeCase_ = 2;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int polylineTypeCase_ = 0;
    private java.lang.Object polylineType_;

    public PolylineTypeCase getPolylineTypeCase() {
      return PolylineTypeCase.forNumber(polylineTypeCase_);
    }

    public Builder clearPolylineType() {
      polylineTypeCase_ = 0;
      polylineType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * The string encoding of the polyline using the [polyline encoding
     * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
     * </pre>
     *
     * <code>string encoded_polyline = 1;</code>
     *
     * @return Whether the encodedPolyline field is set.
     */
    @java.lang.Override
    public boolean hasEncodedPolyline() {
      return polylineTypeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The string encoding of the polyline using the [polyline encoding
     * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
     * </pre>
     *
     * <code>string encoded_polyline = 1;</code>
     *
     * @return The encodedPolyline.
     */
    @java.lang.Override
    public java.lang.String getEncodedPolyline() {
      java.lang.Object ref = "";
      if (polylineTypeCase_ == 1) {
        ref = polylineType_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (polylineTypeCase_ == 1) {
          polylineType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The string encoding of the polyline using the [polyline encoding
     * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
     * </pre>
     *
     * <code>string encoded_polyline = 1;</code>
     *
     * @return The bytes for encodedPolyline.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEncodedPolylineBytes() {
      java.lang.Object ref = "";
      if (polylineTypeCase_ == 1) {
        ref = polylineType_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (polylineTypeCase_ == 1) {
          polylineType_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The string encoding of the polyline using the [polyline encoding
     * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
     * </pre>
     *
     * <code>string encoded_polyline = 1;</code>
     *
     * @param value The encodedPolyline to set.
     * @return This builder for chaining.
     */
    public Builder setEncodedPolyline(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      polylineTypeCase_ = 1;
      polylineType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The string encoding of the polyline using the [polyline encoding
     * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
     * </pre>
     *
     * <code>string encoded_polyline = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEncodedPolyline() {
      if (polylineTypeCase_ == 1) {
        polylineTypeCase_ = 0;
        polylineType_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The string encoding of the polyline using the [polyline encoding
     * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
     * </pre>
     *
     * <code>string encoded_polyline = 1;</code>
     *
     * @param value The bytes for encodedPolyline to set.
     * @return This builder for chaining.
     */
    public Builder setEncodedPolylineBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      polylineTypeCase_ = 1;
      polylineType_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        geoJsonLinestringBuilder_;
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     *
     * @return Whether the geoJsonLinestring field is set.
     */
    @java.lang.Override
    public boolean hasGeoJsonLinestring() {
      return polylineTypeCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     *
     * @return The geoJsonLinestring.
     */
    @java.lang.Override
    public com.google.protobuf.Struct getGeoJsonLinestring() {
      if (geoJsonLinestringBuilder_ == null) {
        if (polylineTypeCase_ == 2) {
          return (com.google.protobuf.Struct) polylineType_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      } else {
        if (polylineTypeCase_ == 2) {
          return geoJsonLinestringBuilder_.getMessage();
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     */
    public Builder setGeoJsonLinestring(com.google.protobuf.Struct value) {
      if (geoJsonLinestringBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        polylineType_ = value;
        onChanged();
      } else {
        geoJsonLinestringBuilder_.setMessage(value);
      }
      polylineTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     */
    public Builder setGeoJsonLinestring(com.google.protobuf.Struct.Builder builderForValue) {
      if (geoJsonLinestringBuilder_ == null) {
        polylineType_ = builderForValue.build();
        onChanged();
      } else {
        geoJsonLinestringBuilder_.setMessage(builderForValue.build());
      }
      polylineTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     */
    public Builder mergeGeoJsonLinestring(com.google.protobuf.Struct value) {
      if (geoJsonLinestringBuilder_ == null) {
        if (polylineTypeCase_ == 2
            && polylineType_ != com.google.protobuf.Struct.getDefaultInstance()) {
          polylineType_ =
              com.google.protobuf.Struct.newBuilder((com.google.protobuf.Struct) polylineType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          polylineType_ = value;
        }
        onChanged();
      } else {
        if (polylineTypeCase_ == 2) {
          geoJsonLinestringBuilder_.mergeFrom(value);
        } else {
          geoJsonLinestringBuilder_.setMessage(value);
        }
      }
      polylineTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     */
    public Builder clearGeoJsonLinestring() {
      if (geoJsonLinestringBuilder_ == null) {
        if (polylineTypeCase_ == 2) {
          polylineTypeCase_ = 0;
          polylineType_ = null;
          onChanged();
        }
      } else {
        if (polylineTypeCase_ == 2) {
          polylineTypeCase_ = 0;
          polylineType_ = null;
        }
        geoJsonLinestringBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getGeoJsonLinestringBuilder() {
      return getGeoJsonLinestringFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.StructOrBuilder getGeoJsonLinestringOrBuilder() {
      if ((polylineTypeCase_ == 2) && (geoJsonLinestringBuilder_ != null)) {
        return geoJsonLinestringBuilder_.getMessageOrBuilder();
      } else {
        if (polylineTypeCase_ == 2) {
          return (com.google.protobuf.Struct) polylineType_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a polyline using the [GeoJSON LineString
     * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
     * </pre>
     *
     * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getGeoJsonLinestringFieldBuilder() {
      if (geoJsonLinestringBuilder_ == null) {
        if (!(polylineTypeCase_ == 2)) {
          polylineType_ = com.google.protobuf.Struct.getDefaultInstance();
        }
        geoJsonLinestringBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                (com.google.protobuf.Struct) polylineType_, getParentForChildren(), isClean());
        polylineType_ = null;
      }
      polylineTypeCase_ = 2;
      onChanged();
      return geoJsonLinestringBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.maps.routing.v2.Polyline)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routing.v2.Polyline)
  private static final com.google.maps.routing.v2.Polyline DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.routing.v2.Polyline();
  }

  public static com.google.maps.routing.v2.Polyline getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Polyline> PARSER =
      new com.google.protobuf.AbstractParser<Polyline>() {
        @java.lang.Override
        public Polyline parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<Polyline> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Polyline> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routing.v2.Polyline getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
