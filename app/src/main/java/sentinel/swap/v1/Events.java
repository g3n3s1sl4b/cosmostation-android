// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/swap/v1/events.proto

package sentinel.swap.v1;

public final class Events {
  private Events() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EventSwapOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.swap.v1.EventSwap)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes tx_hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"tx_hash&#92;""];</code>
     * @return The txHash.
     */
    com.google.protobuf.ByteString getTxHash();

    /**
     * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
     * @return The receiver.
     */
    java.lang.String getReceiver();
    /**
     * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
     * @return The bytes for receiver.
     */
    com.google.protobuf.ByteString
        getReceiverBytes();
  }
  /**
   * Protobuf type {@code sentinel.swap.v1.EventSwap}
   */
  public static final class EventSwap extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.swap.v1.EventSwap)
      EventSwapOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EventSwap.newBuilder() to construct.
    private EventSwap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EventSwap() {
      txHash_ = com.google.protobuf.ByteString.EMPTY;
      receiver_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EventSwap();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EventSwap(
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

              txHash_ = input.readBytes();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              receiver_ = s;
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
      return sentinel.swap.v1.Events.internal_static_sentinel_swap_v1_EventSwap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sentinel.swap.v1.Events.internal_static_sentinel_swap_v1_EventSwap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sentinel.swap.v1.Events.EventSwap.class, sentinel.swap.v1.Events.EventSwap.Builder.class);
    }

    public static final int TX_HASH_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString txHash_;
    /**
     * <code>bytes tx_hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"tx_hash&#92;""];</code>
     * @return The txHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTxHash() {
      return txHash_;
    }

    public static final int RECEIVER_FIELD_NUMBER = 2;
    private volatile java.lang.Object receiver_;
    /**
     * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
     * @return The receiver.
     */
    @java.lang.Override
    public java.lang.String getReceiver() {
      java.lang.Object ref = receiver_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiver_ = s;
        return s;
      }
    }
    /**
     * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
     * @return The bytes for receiver.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReceiverBytes() {
      java.lang.Object ref = receiver_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiver_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!txHash_.isEmpty()) {
        output.writeBytes(1, txHash_);
      }
      if (!getReceiverBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, receiver_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!txHash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, txHash_);
      }
      if (!getReceiverBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, receiver_);
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
      if (!(obj instanceof sentinel.swap.v1.Events.EventSwap)) {
        return super.equals(obj);
      }
      sentinel.swap.v1.Events.EventSwap other = (sentinel.swap.v1.Events.EventSwap) obj;

      if (!getTxHash()
          .equals(other.getTxHash())) return false;
      if (!getReceiver()
          .equals(other.getReceiver())) return false;
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
      hash = (37 * hash) + TX_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getTxHash().hashCode();
      hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
      hash = (53 * hash) + getReceiver().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sentinel.swap.v1.Events.EventSwap parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.swap.v1.Events.EventSwap parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sentinel.swap.v1.Events.EventSwap parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.swap.v1.Events.EventSwap parseFrom(
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
    public static Builder newBuilder(sentinel.swap.v1.Events.EventSwap prototype) {
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
     * Protobuf type {@code sentinel.swap.v1.EventSwap}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.swap.v1.EventSwap)
        sentinel.swap.v1.Events.EventSwapOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sentinel.swap.v1.Events.internal_static_sentinel_swap_v1_EventSwap_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sentinel.swap.v1.Events.internal_static_sentinel_swap_v1_EventSwap_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sentinel.swap.v1.Events.EventSwap.class, sentinel.swap.v1.Events.EventSwap.Builder.class);
      }

      // Construct using sentinel.swap.v1.Events.EventSwap.newBuilder()
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
        txHash_ = com.google.protobuf.ByteString.EMPTY;

        receiver_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sentinel.swap.v1.Events.internal_static_sentinel_swap_v1_EventSwap_descriptor;
      }

      @java.lang.Override
      public sentinel.swap.v1.Events.EventSwap getDefaultInstanceForType() {
        return sentinel.swap.v1.Events.EventSwap.getDefaultInstance();
      }

      @java.lang.Override
      public sentinel.swap.v1.Events.EventSwap build() {
        sentinel.swap.v1.Events.EventSwap result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sentinel.swap.v1.Events.EventSwap buildPartial() {
        sentinel.swap.v1.Events.EventSwap result = new sentinel.swap.v1.Events.EventSwap(this);
        result.txHash_ = txHash_;
        result.receiver_ = receiver_;
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
        if (other instanceof sentinel.swap.v1.Events.EventSwap) {
          return mergeFrom((sentinel.swap.v1.Events.EventSwap)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sentinel.swap.v1.Events.EventSwap other) {
        if (other == sentinel.swap.v1.Events.EventSwap.getDefaultInstance()) return this;
        if (other.getTxHash() != com.google.protobuf.ByteString.EMPTY) {
          setTxHash(other.getTxHash());
        }
        if (!other.getReceiver().isEmpty()) {
          receiver_ = other.receiver_;
          onChanged();
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
        sentinel.swap.v1.Events.EventSwap parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sentinel.swap.v1.Events.EventSwap) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString txHash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes tx_hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"tx_hash&#92;""];</code>
       * @return The txHash.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getTxHash() {
        return txHash_;
      }
      /**
       * <code>bytes tx_hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"tx_hash&#92;""];</code>
       * @param value The txHash to set.
       * @return This builder for chaining.
       */
      public Builder setTxHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        txHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes tx_hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"tx_hash&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearTxHash() {
        
        txHash_ = getDefaultInstance().getTxHash();
        onChanged();
        return this;
      }

      private java.lang.Object receiver_ = "";
      /**
       * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
       * @return The receiver.
       */
      public java.lang.String getReceiver() {
        java.lang.Object ref = receiver_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          receiver_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
       * @return The bytes for receiver.
       */
      public com.google.protobuf.ByteString
          getReceiverBytes() {
        java.lang.Object ref = receiver_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          receiver_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
       * @param value The receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiver(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        receiver_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearReceiver() {
        
        receiver_ = getDefaultInstance().getReceiver();
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 2 [(.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
       * @param value The bytes for receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiverBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        receiver_ = value;
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


      // @@protoc_insertion_point(builder_scope:sentinel.swap.v1.EventSwap)
    }

    // @@protoc_insertion_point(class_scope:sentinel.swap.v1.EventSwap)
    private static final sentinel.swap.v1.Events.EventSwap DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sentinel.swap.v1.Events.EventSwap();
    }

    public static sentinel.swap.v1.Events.EventSwap getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EventSwap>
        PARSER = new com.google.protobuf.AbstractParser<EventSwap>() {
      @java.lang.Override
      public EventSwap parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EventSwap(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EventSwap> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EventSwap> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sentinel.swap.v1.Events.EventSwap getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_swap_v1_EventSwap_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_swap_v1_EventSwap_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035sentinel/swap/v1/events.proto\022\020sentine" +
      "l.swap.v1\032\024gogoproto/gogo.proto\"W\n\tEvent" +
      "Swap\022#\n\007tx_hash\030\001 \001(\014B\022\362\336\037\016yaml:\"tx_hash" +
      "\"\022%\n\010receiver\030\002 \001(\tB\023\362\336\037\017yaml:\"receiver\"" +
      "B7Z-github.com/sentinel-official/hub/x/s" +
      "wap/types\250\342\036\000\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_sentinel_swap_v1_EventSwap_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_swap_v1_EventSwap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_swap_v1_EventSwap_descriptor,
        new java.lang.String[] { "TxHash", "Receiver", });
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
