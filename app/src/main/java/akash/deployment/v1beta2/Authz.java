// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta2/authz.proto

package akash.deployment.v1beta2;

public final class Authz {
  private Authz() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DepositDeploymentAuthorizationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:akash.deployment.v1beta2.DepositDeploymentAuthorization)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     * @return Whether the spendLimit field is set.
     */
    boolean hasSpendLimit();
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     * @return The spendLimit.
     */
    cosmos.base.v1beta1.CoinOuterClass.Coin getSpendLimit();
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getSpendLimitOrBuilder();
  }
  /**
   * <pre>
   * DepositDeploymentAuthorization allows the grantee to deposit up to spend_limit coins from
   * the granter's account for a deployment.
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta2.DepositDeploymentAuthorization}
   */
  public static final class DepositDeploymentAuthorization extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:akash.deployment.v1beta2.DepositDeploymentAuthorization)
      DepositDeploymentAuthorizationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DepositDeploymentAuthorization.newBuilder() to construct.
    private DepositDeploymentAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DepositDeploymentAuthorization() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DepositDeploymentAuthorization();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DepositDeploymentAuthorization(
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
              cosmos.base.v1beta1.CoinOuterClass.Coin.Builder subBuilder = null;
              if (spendLimit_ != null) {
                subBuilder = spendLimit_.toBuilder();
              }
              spendLimit_ = input.readMessage(cosmos.base.v1beta1.CoinOuterClass.Coin.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spendLimit_);
                spendLimit_ = subBuilder.buildPartial();
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
      return akash.deployment.v1beta2.Authz.internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return akash.deployment.v1beta2.Authz.internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization.class, akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization.Builder.class);
    }

    public static final int SPEND_LIMIT_FIELD_NUMBER = 1;
    private cosmos.base.v1beta1.CoinOuterClass.Coin spendLimit_;
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     * @return Whether the spendLimit field is set.
     */
    @java.lang.Override
    public boolean hasSpendLimit() {
      return spendLimit_ != null;
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     * @return The spendLimit.
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.Coin getSpendLimit() {
      return spendLimit_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : spendLimit_;
    }
    /**
     * <pre>
     * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
     * the purpose of deployment.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getSpendLimitOrBuilder() {
      return getSpendLimit();
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
      if (spendLimit_ != null) {
        output.writeMessage(1, getSpendLimit());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (spendLimit_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSpendLimit());
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
      if (!(obj instanceof akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization)) {
        return super.equals(obj);
      }
      akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization other = (akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization) obj;

      if (hasSpendLimit() != other.hasSpendLimit()) return false;
      if (hasSpendLimit()) {
        if (!getSpendLimit()
            .equals(other.getSpendLimit())) return false;
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
      if (hasSpendLimit()) {
        hash = (37 * hash) + SPEND_LIMIT_FIELD_NUMBER;
        hash = (53 * hash) + getSpendLimit().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parseFrom(
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
    public static Builder newBuilder(akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization prototype) {
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
     * DepositDeploymentAuthorization allows the grantee to deposit up to spend_limit coins from
     * the granter's account for a deployment.
     * </pre>
     *
     * Protobuf type {@code akash.deployment.v1beta2.DepositDeploymentAuthorization}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta2.DepositDeploymentAuthorization)
        akash.deployment.v1beta2.Authz.DepositDeploymentAuthorizationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return akash.deployment.v1beta2.Authz.internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return akash.deployment.v1beta2.Authz.internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization.class, akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization.Builder.class);
      }

      // Construct using akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization.newBuilder()
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
        if (spendLimitBuilder_ == null) {
          spendLimit_ = null;
        } else {
          spendLimit_ = null;
          spendLimitBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return akash.deployment.v1beta2.Authz.internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_descriptor;
      }

      @java.lang.Override
      public akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization getDefaultInstanceForType() {
        return akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization.getDefaultInstance();
      }

      @java.lang.Override
      public akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization build() {
        akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization buildPartial() {
        akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization result = new akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization(this);
        if (spendLimitBuilder_ == null) {
          result.spendLimit_ = spendLimit_;
        } else {
          result.spendLimit_ = spendLimitBuilder_.build();
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
        if (other instanceof akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization) {
          return mergeFrom((akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization other) {
        if (other == akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization.getDefaultInstance()) return this;
        if (other.hasSpendLimit()) {
          mergeSpendLimit(other.getSpendLimit());
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
        akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private cosmos.base.v1beta1.CoinOuterClass.Coin spendLimit_;
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> spendLimitBuilder_;
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       * @return Whether the spendLimit field is set.
       */
      public boolean hasSpendLimit() {
        return spendLimitBuilder_ != null || spendLimit_ != null;
      }
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       * @return The spendLimit.
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin getSpendLimit() {
        if (spendLimitBuilder_ == null) {
          return spendLimit_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : spendLimit_;
        } else {
          return spendLimitBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       */
      public Builder setSpendLimit(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (spendLimitBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spendLimit_ = value;
          onChanged();
        } else {
          spendLimitBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       */
      public Builder setSpendLimit(
          cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
        if (spendLimitBuilder_ == null) {
          spendLimit_ = builderForValue.build();
          onChanged();
        } else {
          spendLimitBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       */
      public Builder mergeSpendLimit(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (spendLimitBuilder_ == null) {
          if (spendLimit_ != null) {
            spendLimit_ =
              cosmos.base.v1beta1.CoinOuterClass.Coin.newBuilder(spendLimit_).mergeFrom(value).buildPartial();
          } else {
            spendLimit_ = value;
          }
          onChanged();
        } else {
          spendLimitBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       */
      public Builder clearSpendLimit() {
        if (spendLimitBuilder_ == null) {
          spendLimit_ = null;
          onChanged();
        } else {
          spendLimit_ = null;
          spendLimitBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder getSpendLimitBuilder() {
        
        onChanged();
        return getSpendLimitFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getSpendLimitOrBuilder() {
        if (spendLimitBuilder_ != null) {
          return spendLimitBuilder_.getMessageOrBuilder();
        } else {
          return spendLimit_ == null ?
              cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : spendLimit_;
        }
      }
      /**
       * <pre>
       * SpendLimit is the amount the grantee is authorized to spend from the granter's account for
       * the purpose of deployment.
       * </pre>
       *
       * <code>.cosmos.base.v1beta1.Coin spend_limit = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spend_limit"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
          getSpendLimitFieldBuilder() {
        if (spendLimitBuilder_ == null) {
          spendLimitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder>(
                  getSpendLimit(),
                  getParentForChildren(),
                  isClean());
          spendLimit_ = null;
        }
        return spendLimitBuilder_;
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


      // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta2.DepositDeploymentAuthorization)
    }

    // @@protoc_insertion_point(class_scope:akash.deployment.v1beta2.DepositDeploymentAuthorization)
    private static final akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization();
    }

    public static akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DepositDeploymentAuthorization>
        PARSER = new com.google.protobuf.AbstractParser<DepositDeploymentAuthorization>() {
      @java.lang.Override
      public DepositDeploymentAuthorization parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DepositDeploymentAuthorization(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DepositDeploymentAuthorization> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DepositDeploymentAuthorization> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public akash.deployment.v1beta2.Authz.DepositDeploymentAuthorization getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$akash/deployment/v1beta2/authz.proto\022\030" +
      "akash.deployment.v1beta2\032\024gogoproto/gogo" +
      ".proto\032\031cosmos_proto/cosmos.proto\032\036cosmo" +
      "s/base/v1beta1/coin.proto\"x\n\036DepositDepl" +
      "oymentAuthorization\022C\n\013spend_limit\030\001 \001(\013" +
      "2\031.cosmos.base.v1beta1.CoinB\023\310\336\037\000\352\336\037\013spe" +
      "nd_limit:\021\312\264-\rAuthorizationB4Z2github.co" +
      "m/ovrclk/akash/x/deployment/types/v1beta" +
      "2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          cosmos_proto.Cosmos.getDescriptor(),
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
        });
    internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_deployment_v1beta2_DepositDeploymentAuthorization_descriptor,
        new java.lang.String[] { "SpendLimit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos_proto.Cosmos.implementsInterface);
    registry.add(com.google.protobuf.GoGoProtos.jsontag);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos_proto.Cosmos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
