// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/asset.proto

package comdex.asset.v1beta1;

public final class AssetOuterClass {
  private AssetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AssetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:comdex.asset.v1beta1.Asset)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
     * @return The denom.
     */
    java.lang.String getDenom();
    /**
     * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
     * @return The bytes for denom.
     */
    com.google.protobuf.ByteString
        getDenomBytes();

    /**
     * <code>int64 decimals = 4 [(.gogoproto.moretags) = "yaml:&#92;"decimals&#92;""];</code>
     * @return The decimals.
     */
    long getDecimals();
  }
  /**
   * Protobuf type {@code comdex.asset.v1beta1.Asset}
   */
  public static final class Asset extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:comdex.asset.v1beta1.Asset)
      AssetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Asset.newBuilder() to construct.
    private Asset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Asset() {
      name_ = "";
      denom_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Asset();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Asset(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              id_ = input.readUInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              denom_ = s;
              break;
            }
            case 32: {

              decimals_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return comdex.asset.v1beta1.AssetOuterClass.internal_static_comdex_asset_v1beta1_Asset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return comdex.asset.v1beta1.AssetOuterClass.internal_static_comdex_asset_v1beta1_Asset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              comdex.asset.v1beta1.AssetOuterClass.Asset.class, comdex.asset.v1beta1.AssetOuterClass.Asset.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DENOM_FIELD_NUMBER = 3;
    private volatile java.lang.Object denom_;
    /**
     * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
     * @return The denom.
     */
    @java.lang.Override
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      }
    }
    /**
     * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
     * @return The bytes for denom.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DECIMALS_FIELD_NUMBER = 4;
    private long decimals_;
    /**
     * <code>int64 decimals = 4 [(.gogoproto.moretags) = "yaml:&#92;"decimals&#92;""];</code>
     * @return The decimals.
     */
    @java.lang.Override
    public long getDecimals() {
      return decimals_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0L) {
        output.writeUInt64(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (!getDenomBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, denom_);
      }
      if (decimals_ != 0L) {
        output.writeInt64(4, decimals_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (!getDenomBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, denom_);
      }
      if (decimals_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, decimals_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof comdex.asset.v1beta1.AssetOuterClass.Asset)) {
        return super.equals(obj);
      }
      comdex.asset.v1beta1.AssetOuterClass.Asset other = (comdex.asset.v1beta1.AssetOuterClass.Asset) obj;

      if (getId()
          != other.getId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (!getDenom()
          .equals(other.getDenom())) return false;
      if (getDecimals()
          != other.getDecimals()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + DENOM_FIELD_NUMBER;
      hash = (53 * hash) + getDenom().hashCode();
      hash = (37 * hash) + DECIMALS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDecimals());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static comdex.asset.v1beta1.AssetOuterClass.Asset parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(comdex.asset.v1beta1.AssetOuterClass.Asset prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code comdex.asset.v1beta1.Asset}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:comdex.asset.v1beta1.Asset)
        comdex.asset.v1beta1.AssetOuterClass.AssetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return comdex.asset.v1beta1.AssetOuterClass.internal_static_comdex_asset_v1beta1_Asset_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return comdex.asset.v1beta1.AssetOuterClass.internal_static_comdex_asset_v1beta1_Asset_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                comdex.asset.v1beta1.AssetOuterClass.Asset.class, comdex.asset.v1beta1.AssetOuterClass.Asset.Builder.class);
      }

      // Construct using comdex.asset.v1beta1.AssetOuterClass.Asset.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0L;

        name_ = "";

        denom_ = "";

        decimals_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return comdex.asset.v1beta1.AssetOuterClass.internal_static_comdex_asset_v1beta1_Asset_descriptor;
      }

      @java.lang.Override
      public comdex.asset.v1beta1.AssetOuterClass.Asset getDefaultInstanceForType() {
        return comdex.asset.v1beta1.AssetOuterClass.Asset.getDefaultInstance();
      }

      @java.lang.Override
      public comdex.asset.v1beta1.AssetOuterClass.Asset build() {
        comdex.asset.v1beta1.AssetOuterClass.Asset result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public comdex.asset.v1beta1.AssetOuterClass.Asset buildPartial() {
        comdex.asset.v1beta1.AssetOuterClass.Asset result = new comdex.asset.v1beta1.AssetOuterClass.Asset(this);
        result.id_ = id_;
        result.name_ = name_;
        result.denom_ = denom_;
        result.decimals_ = decimals_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof comdex.asset.v1beta1.AssetOuterClass.Asset) {
          return mergeFrom((comdex.asset.v1beta1.AssetOuterClass.Asset)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(comdex.asset.v1beta1.AssetOuterClass.Asset other) {
        if (other == comdex.asset.v1beta1.AssetOuterClass.Asset.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getDenom().isEmpty()) {
          denom_ = other.denom_;
          onChanged();
        }
        if (other.getDecimals() != 0L) {
          setDecimals(other.getDecimals());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        comdex.asset.v1beta1.AssetOuterClass.Asset parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (comdex.asset.v1beta1.AssetOuterClass.Asset) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>uint64 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public long getId() {
        return id_;
      }
      /**
       * <code>uint64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2 [(.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object denom_ = "";
      /**
       * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
       * @return The denom.
       */
      public java.lang.String getDenom() {
        java.lang.Object ref = denom_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          denom_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
       * @return The bytes for denom.
       */
      public com.google.protobuf.ByteString
          getDenomBytes() {
        java.lang.Object ref = denom_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          denom_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
       * @param value The denom to set.
       * @return This builder for chaining.
       */
      public Builder setDenom(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        denom_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearDenom() {
        
        denom_ = getDefaultInstance().getDenom();
        onChanged();
        return this;
      }
      /**
       * <code>string denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
       * @param value The bytes for denom to set.
       * @return This builder for chaining.
       */
      public Builder setDenomBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        denom_ = value;
        onChanged();
        return this;
      }

      private long decimals_ ;
      /**
       * <code>int64 decimals = 4 [(.gogoproto.moretags) = "yaml:&#92;"decimals&#92;""];</code>
       * @return The decimals.
       */
      @java.lang.Override
      public long getDecimals() {
        return decimals_;
      }
      /**
       * <code>int64 decimals = 4 [(.gogoproto.moretags) = "yaml:&#92;"decimals&#92;""];</code>
       * @param value The decimals to set.
       * @return This builder for chaining.
       */
      public Builder setDecimals(long value) {
        
        decimals_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 decimals = 4 [(.gogoproto.moretags) = "yaml:&#92;"decimals&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearDecimals() {
        
        decimals_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:comdex.asset.v1beta1.Asset)
    }

    // @@protoc_insertion_point(class_scope:comdex.asset.v1beta1.Asset)
    private static final comdex.asset.v1beta1.AssetOuterClass.Asset DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new comdex.asset.v1beta1.AssetOuterClass.Asset();
    }

    public static comdex.asset.v1beta1.AssetOuterClass.Asset getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Asset>
        PARSER = new com.google.protobuf.AbstractParser<Asset>() {
      @java.lang.Override
      public Asset parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Asset(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Asset> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Asset> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public comdex.asset.v1beta1.AssetOuterClass.Asset getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_comdex_asset_v1beta1_Asset_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_comdex_asset_v1beta1_Asset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n comdex/asset/v1beta1/asset.proto\022\024comd" +
      "ex.asset.v1beta1\032\024gogoproto/gogo.proto\"z" +
      "\n\005Asset\022\n\n\002id\030\001 \001(\004\022\035\n\004name\030\002 \001(\tB\017\362\336\037\013y" +
      "aml:\"name\"\022\037\n\005denom\030\003 \001(\tB\020\362\336\037\014yaml:\"den" +
      "om\"\022%\n\010decimals\030\004 \001(\003B\023\362\336\037\017yaml:\"decimal" +
      "s\"B9Z/github.com/comdex-official/comdex/" +
      "x/asset/types\250\342\036\000\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_comdex_asset_v1beta1_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_comdex_asset_v1beta1_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_comdex_asset_v1beta1_Asset_descriptor,
        new java.lang.String[] { "Id", "Name", "Denom", "Decimals", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equalAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
