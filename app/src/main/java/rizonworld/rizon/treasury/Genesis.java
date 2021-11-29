// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: treasury/genesis.proto

package rizonworld.rizon.treasury;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:rizonworld.rizon.treasury.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * params defines all the paramaters of treasury module
     * </pre>
     *
     * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <pre>
     * params defines all the paramaters of treasury module
     * </pre>
     *
     * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    rizonworld.rizon.treasury.ParamsOuterClass.Params getParams();
    /**
     * <pre>
     * params defines all the paramaters of treasury module
     * </pre>
     *
     * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    rizonworld.rizon.treasury.ParamsOuterClass.ParamsOrBuilder getParamsOrBuilder();

    /**
     * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
     * @return Whether the seq field is set.
     */
    boolean hasSeq();
    /**
     * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
     * @return The seq.
     */
    rizonworld.rizon.treasury.Treasury.Sequence getSeq();
    /**
     * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
     */
    rizonworld.rizon.treasury.Treasury.SequenceOrBuilder getSeqOrBuilder();
  }
  /**
   * <pre>
   * GenesisState defines the module's genesis state
   * </pre>
   *
   * Protobuf type {@code rizonworld.rizon.treasury.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:rizonworld.rizon.treasury.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GenesisState(
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
            case 10: {
              rizonworld.rizon.treasury.ParamsOuterClass.Params.Builder subBuilder = null;
              if (params_ != null) {
                subBuilder = params_.toBuilder();
              }
              params_ = input.readMessage(rizonworld.rizon.treasury.ParamsOuterClass.Params.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(params_);
                params_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              rizonworld.rizon.treasury.Treasury.Sequence.Builder subBuilder = null;
              if (seq_ != null) {
                subBuilder = seq_.toBuilder();
              }
              seq_ = input.readMessage(rizonworld.rizon.treasury.Treasury.Sequence.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(seq_);
                seq_ = subBuilder.buildPartial();
              }

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
      return rizonworld.rizon.treasury.Genesis.internal_static_rizonworld_rizon_treasury_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rizonworld.rizon.treasury.Genesis.internal_static_rizonworld_rizon_treasury_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rizonworld.rizon.treasury.Genesis.GenesisState.class, rizonworld.rizon.treasury.Genesis.GenesisState.Builder.class);
    }

    public static final int PARAMS_FIELD_NUMBER = 1;
    private rizonworld.rizon.treasury.ParamsOuterClass.Params params_;
    /**
     * <pre>
     * params defines all the paramaters of treasury module
     * </pre>
     *
     * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <pre>
     * params defines all the paramaters of treasury module
     * </pre>
     *
     * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public rizonworld.rizon.treasury.ParamsOuterClass.Params getParams() {
      return params_ == null ? rizonworld.rizon.treasury.ParamsOuterClass.Params.getDefaultInstance() : params_;
    }
    /**
     * <pre>
     * params defines all the paramaters of treasury module
     * </pre>
     *
     * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public rizonworld.rizon.treasury.ParamsOuterClass.ParamsOrBuilder getParamsOrBuilder() {
      return getParams();
    }

    public static final int SEQ_FIELD_NUMBER = 2;
    private rizonworld.rizon.treasury.Treasury.Sequence seq_;
    /**
     * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
     * @return Whether the seq field is set.
     */
    @java.lang.Override
    public boolean hasSeq() {
      return seq_ != null;
    }
    /**
     * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
     * @return The seq.
     */
    @java.lang.Override
    public rizonworld.rizon.treasury.Treasury.Sequence getSeq() {
      return seq_ == null ? rizonworld.rizon.treasury.Treasury.Sequence.getDefaultInstance() : seq_;
    }
    /**
     * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public rizonworld.rizon.treasury.Treasury.SequenceOrBuilder getSeqOrBuilder() {
      return getSeq();
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
      if (params_ != null) {
        output.writeMessage(1, getParams());
      }
      if (seq_ != null) {
        output.writeMessage(2, getSeq());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (params_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getParams());
      }
      if (seq_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getSeq());
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
      if (!(obj instanceof rizonworld.rizon.treasury.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      rizonworld.rizon.treasury.Genesis.GenesisState other = (rizonworld.rizon.treasury.Genesis.GenesisState) obj;

      if (hasParams() != other.hasParams()) return false;
      if (hasParams()) {
        if (!getParams()
            .equals(other.getParams())) return false;
      }
      if (hasSeq() != other.hasSeq()) return false;
      if (hasSeq()) {
        if (!getSeq()
            .equals(other.getSeq())) return false;
      }
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
      if (hasParams()) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParams().hashCode();
      }
      if (hasSeq()) {
        hash = (37 * hash) + SEQ_FIELD_NUMBER;
        hash = (53 * hash) + getSeq().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static rizonworld.rizon.treasury.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(rizonworld.rizon.treasury.Genesis.GenesisState prototype) {
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
     * <pre>
     * GenesisState defines the module's genesis state
     * </pre>
     *
     * Protobuf type {@code rizonworld.rizon.treasury.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:rizonworld.rizon.treasury.GenesisState)
        rizonworld.rizon.treasury.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return rizonworld.rizon.treasury.Genesis.internal_static_rizonworld_rizon_treasury_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return rizonworld.rizon.treasury.Genesis.internal_static_rizonworld_rizon_treasury_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                rizonworld.rizon.treasury.Genesis.GenesisState.class, rizonworld.rizon.treasury.Genesis.GenesisState.Builder.class);
      }

      // Construct using rizonworld.rizon.treasury.Genesis.GenesisState.newBuilder()
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
        if (paramsBuilder_ == null) {
          params_ = null;
        } else {
          params_ = null;
          paramsBuilder_ = null;
        }
        if (seqBuilder_ == null) {
          seq_ = null;
        } else {
          seq_ = null;
          seqBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return rizonworld.rizon.treasury.Genesis.internal_static_rizonworld_rizon_treasury_GenesisState_descriptor;
      }

      @java.lang.Override
      public rizonworld.rizon.treasury.Genesis.GenesisState getDefaultInstanceForType() {
        return rizonworld.rizon.treasury.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public rizonworld.rizon.treasury.Genesis.GenesisState build() {
        rizonworld.rizon.treasury.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public rizonworld.rizon.treasury.Genesis.GenesisState buildPartial() {
        rizonworld.rizon.treasury.Genesis.GenesisState result = new rizonworld.rizon.treasury.Genesis.GenesisState(this);
        if (paramsBuilder_ == null) {
          result.params_ = params_;
        } else {
          result.params_ = paramsBuilder_.build();
        }
        if (seqBuilder_ == null) {
          result.seq_ = seq_;
        } else {
          result.seq_ = seqBuilder_.build();
        }
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
        if (other instanceof rizonworld.rizon.treasury.Genesis.GenesisState) {
          return mergeFrom((rizonworld.rizon.treasury.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(rizonworld.rizon.treasury.Genesis.GenesisState other) {
        if (other == rizonworld.rizon.treasury.Genesis.GenesisState.getDefaultInstance()) return this;
        if (other.hasParams()) {
          mergeParams(other.getParams());
        }
        if (other.hasSeq()) {
          mergeSeq(other.getSeq());
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
        rizonworld.rizon.treasury.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (rizonworld.rizon.treasury.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private rizonworld.rizon.treasury.ParamsOuterClass.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          rizonworld.rizon.treasury.ParamsOuterClass.Params, rizonworld.rizon.treasury.ParamsOuterClass.Params.Builder, rizonworld.rizon.treasury.ParamsOuterClass.ParamsOrBuilder> paramsBuilder_;
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return paramsBuilder_ != null || params_ != null;
      }
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public rizonworld.rizon.treasury.ParamsOuterClass.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? rizonworld.rizon.treasury.ParamsOuterClass.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(rizonworld.rizon.treasury.ParamsOuterClass.Params value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          params_ = value;
          onChanged();
        } else {
          paramsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          rizonworld.rizon.treasury.ParamsOuterClass.Params.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          params_ = builderForValue.build();
          onChanged();
        } else {
          paramsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(rizonworld.rizon.treasury.ParamsOuterClass.Params value) {
        if (paramsBuilder_ == null) {
          if (params_ != null) {
            params_ =
              rizonworld.rizon.treasury.ParamsOuterClass.Params.newBuilder(params_).mergeFrom(value).buildPartial();
          } else {
            params_ = value;
          }
          onChanged();
        } else {
          paramsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearParams() {
        if (paramsBuilder_ == null) {
          params_ = null;
          onChanged();
        } else {
          params_ = null;
          paramsBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public rizonworld.rizon.treasury.ParamsOuterClass.Params.Builder getParamsBuilder() {
        
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public rizonworld.rizon.treasury.ParamsOuterClass.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              rizonworld.rizon.treasury.ParamsOuterClass.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <pre>
       * params defines all the paramaters of treasury module
       * </pre>
       *
       * <code>.rizonworld.rizon.treasury.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          rizonworld.rizon.treasury.ParamsOuterClass.Params, rizonworld.rizon.treasury.ParamsOuterClass.Params.Builder, rizonworld.rizon.treasury.ParamsOuterClass.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              rizonworld.rizon.treasury.ParamsOuterClass.Params, rizonworld.rizon.treasury.ParamsOuterClass.Params.Builder, rizonworld.rizon.treasury.ParamsOuterClass.ParamsOrBuilder>(
                  getParams(),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
      }

      private rizonworld.rizon.treasury.Treasury.Sequence seq_;
      private com.google.protobuf.SingleFieldBuilderV3<
          rizonworld.rizon.treasury.Treasury.Sequence, rizonworld.rizon.treasury.Treasury.Sequence.Builder, rizonworld.rizon.treasury.Treasury.SequenceOrBuilder> seqBuilder_;
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       * @return Whether the seq field is set.
       */
      public boolean hasSeq() {
        return seqBuilder_ != null || seq_ != null;
      }
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       * @return The seq.
       */
      public rizonworld.rizon.treasury.Treasury.Sequence getSeq() {
        if (seqBuilder_ == null) {
          return seq_ == null ? rizonworld.rizon.treasury.Treasury.Sequence.getDefaultInstance() : seq_;
        } else {
          return seqBuilder_.getMessage();
        }
      }
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setSeq(rizonworld.rizon.treasury.Treasury.Sequence value) {
        if (seqBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          seq_ = value;
          onChanged();
        } else {
          seqBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setSeq(
          rizonworld.rizon.treasury.Treasury.Sequence.Builder builderForValue) {
        if (seqBuilder_ == null) {
          seq_ = builderForValue.build();
          onChanged();
        } else {
          seqBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeSeq(rizonworld.rizon.treasury.Treasury.Sequence value) {
        if (seqBuilder_ == null) {
          if (seq_ != null) {
            seq_ =
              rizonworld.rizon.treasury.Treasury.Sequence.newBuilder(seq_).mergeFrom(value).buildPartial();
          } else {
            seq_ = value;
          }
          onChanged();
        } else {
          seqBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearSeq() {
        if (seqBuilder_ == null) {
          seq_ = null;
          onChanged();
        } else {
          seq_ = null;
          seqBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       */
      public rizonworld.rizon.treasury.Treasury.Sequence.Builder getSeqBuilder() {
        
        onChanged();
        return getSeqFieldBuilder().getBuilder();
      }
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       */
      public rizonworld.rizon.treasury.Treasury.SequenceOrBuilder getSeqOrBuilder() {
        if (seqBuilder_ != null) {
          return seqBuilder_.getMessageOrBuilder();
        } else {
          return seq_ == null ?
              rizonworld.rizon.treasury.Treasury.Sequence.getDefaultInstance() : seq_;
        }
      }
      /**
       * <code>.rizonworld.rizon.treasury.Sequence seq = 2 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          rizonworld.rizon.treasury.Treasury.Sequence, rizonworld.rizon.treasury.Treasury.Sequence.Builder, rizonworld.rizon.treasury.Treasury.SequenceOrBuilder> 
          getSeqFieldBuilder() {
        if (seqBuilder_ == null) {
          seqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              rizonworld.rizon.treasury.Treasury.Sequence, rizonworld.rizon.treasury.Treasury.Sequence.Builder, rizonworld.rizon.treasury.Treasury.SequenceOrBuilder>(
                  getSeq(),
                  getParentForChildren(),
                  isClean());
          seq_ = null;
        }
        return seqBuilder_;
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


      // @@protoc_insertion_point(builder_scope:rizonworld.rizon.treasury.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:rizonworld.rizon.treasury.GenesisState)
    private static final rizonworld.rizon.treasury.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new rizonworld.rizon.treasury.Genesis.GenesisState();
    }

    public static rizonworld.rizon.treasury.Genesis.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GenesisState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public rizonworld.rizon.treasury.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rizonworld_rizon_treasury_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rizonworld_rizon_treasury_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026treasury/genesis.proto\022\031rizonworld.riz" +
      "on.treasury\032\024gogoproto/gogo.proto\032\025treas" +
      "ury/params.proto\032\027treasury/treasury.prot" +
      "o\"\177\n\014GenesisState\0227\n\006params\030\001 \001(\0132!.rizo" +
      "nworld.rizon.treasury.ParamsB\004\310\336\037\000\0226\n\003se" +
      "q\030\002 \001(\0132#.rizonworld.rizon.treasury.Sequ" +
      "enceB\004\310\336\037\000B/Z-github.com/rizon-world/riz" +
      "on/x/treasury/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          rizonworld.rizon.treasury.ParamsOuterClass.getDescriptor(),
          rizonworld.rizon.treasury.Treasury.getDescriptor(),
        });
    internal_static_rizonworld_rizon_treasury_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rizonworld_rizon_treasury_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rizonworld_rizon_treasury_GenesisState_descriptor,
        new java.lang.String[] { "Params", "Seq", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    rizonworld.rizon.treasury.ParamsOuterClass.getDescriptor();
    rizonworld.rizon.treasury.Treasury.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
