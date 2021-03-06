// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cost.proto

package com.example.grpc.cost;

/**
 * Protobuf type {@code com.example.grpc.cost.PlanCost}
 */
public final class PlanCost extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.cost.PlanCost)
    PlanCostOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlanCost.newBuilder() to construct.
  private PlanCost(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlanCost() {
    planCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlanCost();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlanCost(
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
            java.lang.String s = input.readStringRequireUtf8();

            planCode_ = s;
            break;
          }
          case 21: {

            emplCovrgRate_ = input.readFloat();
            break;
          }
          case 29: {

            emplrCovrgRate_ = input.readFloat();
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
    return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCost_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCost_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.cost.PlanCost.class, com.example.grpc.cost.PlanCost.Builder.class);
  }

  public static final int PLANCODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object planCode_;
  /**
   * <code>string planCode = 1;</code>
   * @return The planCode.
   */
  @java.lang.Override
  public java.lang.String getPlanCode() {
    java.lang.Object ref = planCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      planCode_ = s;
      return s;
    }
  }
  /**
   * <code>string planCode = 1;</code>
   * @return The bytes for planCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlanCodeBytes() {
    java.lang.Object ref = planCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      planCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMPLCOVRGRATE_FIELD_NUMBER = 2;
  private float emplCovrgRate_;
  /**
   * <code>float emplCovrgRate = 2;</code>
   * @return The emplCovrgRate.
   */
  @java.lang.Override
  public float getEmplCovrgRate() {
    return emplCovrgRate_;
  }

  public static final int EMPLRCOVRGRATE_FIELD_NUMBER = 3;
  private float emplrCovrgRate_;
  /**
   * <code>float emplrCovrgRate = 3;</code>
   * @return The emplrCovrgRate.
   */
  @java.lang.Override
  public float getEmplrCovrgRate() {
    return emplrCovrgRate_;
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
    if (!getPlanCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, planCode_);
    }
    if (emplCovrgRate_ != 0F) {
      output.writeFloat(2, emplCovrgRate_);
    }
    if (emplrCovrgRate_ != 0F) {
      output.writeFloat(3, emplrCovrgRate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPlanCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, planCode_);
    }
    if (emplCovrgRate_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, emplCovrgRate_);
    }
    if (emplrCovrgRate_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, emplrCovrgRate_);
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
    if (!(obj instanceof com.example.grpc.cost.PlanCost)) {
      return super.equals(obj);
    }
    com.example.grpc.cost.PlanCost other = (com.example.grpc.cost.PlanCost) obj;

    if (!getPlanCode()
        .equals(other.getPlanCode())) return false;
    if (java.lang.Float.floatToIntBits(getEmplCovrgRate())
        != java.lang.Float.floatToIntBits(
            other.getEmplCovrgRate())) return false;
    if (java.lang.Float.floatToIntBits(getEmplrCovrgRate())
        != java.lang.Float.floatToIntBits(
            other.getEmplrCovrgRate())) return false;
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
    hash = (37 * hash) + PLANCODE_FIELD_NUMBER;
    hash = (53 * hash) + getPlanCode().hashCode();
    hash = (37 * hash) + EMPLCOVRGRATE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getEmplCovrgRate());
    hash = (37 * hash) + EMPLRCOVRGRATE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getEmplrCovrgRate());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.cost.PlanCost parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCost parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCost parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCost parseFrom(
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
  public static Builder newBuilder(com.example.grpc.cost.PlanCost prototype) {
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
   * Protobuf type {@code com.example.grpc.cost.PlanCost}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.cost.PlanCost)
      com.example.grpc.cost.PlanCostOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCost_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCost_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.cost.PlanCost.class, com.example.grpc.cost.PlanCost.Builder.class);
    }

    // Construct using com.example.grpc.cost.PlanCost.newBuilder()
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
      planCode_ = "";

      emplCovrgRate_ = 0F;

      emplrCovrgRate_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCost_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCost getDefaultInstanceForType() {
      return com.example.grpc.cost.PlanCost.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCost build() {
      com.example.grpc.cost.PlanCost result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCost buildPartial() {
      com.example.grpc.cost.PlanCost result = new com.example.grpc.cost.PlanCost(this);
      result.planCode_ = planCode_;
      result.emplCovrgRate_ = emplCovrgRate_;
      result.emplrCovrgRate_ = emplrCovrgRate_;
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
      if (other instanceof com.example.grpc.cost.PlanCost) {
        return mergeFrom((com.example.grpc.cost.PlanCost)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.cost.PlanCost other) {
      if (other == com.example.grpc.cost.PlanCost.getDefaultInstance()) return this;
      if (!other.getPlanCode().isEmpty()) {
        planCode_ = other.planCode_;
        onChanged();
      }
      if (other.getEmplCovrgRate() != 0F) {
        setEmplCovrgRate(other.getEmplCovrgRate());
      }
      if (other.getEmplrCovrgRate() != 0F) {
        setEmplrCovrgRate(other.getEmplrCovrgRate());
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
      com.example.grpc.cost.PlanCost parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.cost.PlanCost) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object planCode_ = "";
    /**
     * <code>string planCode = 1;</code>
     * @return The planCode.
     */
    public java.lang.String getPlanCode() {
      java.lang.Object ref = planCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        planCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string planCode = 1;</code>
     * @return The bytes for planCode.
     */
    public com.google.protobuf.ByteString
        getPlanCodeBytes() {
      java.lang.Object ref = planCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        planCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string planCode = 1;</code>
     * @param value The planCode to set.
     * @return This builder for chaining.
     */
    public Builder setPlanCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      planCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string planCode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlanCode() {
      
      planCode_ = getDefaultInstance().getPlanCode();
      onChanged();
      return this;
    }
    /**
     * <code>string planCode = 1;</code>
     * @param value The bytes for planCode to set.
     * @return This builder for chaining.
     */
    public Builder setPlanCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      planCode_ = value;
      onChanged();
      return this;
    }

    private float emplCovrgRate_ ;
    /**
     * <code>float emplCovrgRate = 2;</code>
     * @return The emplCovrgRate.
     */
    @java.lang.Override
    public float getEmplCovrgRate() {
      return emplCovrgRate_;
    }
    /**
     * <code>float emplCovrgRate = 2;</code>
     * @param value The emplCovrgRate to set.
     * @return This builder for chaining.
     */
    public Builder setEmplCovrgRate(float value) {
      
      emplCovrgRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float emplCovrgRate = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmplCovrgRate() {
      
      emplCovrgRate_ = 0F;
      onChanged();
      return this;
    }

    private float emplrCovrgRate_ ;
    /**
     * <code>float emplrCovrgRate = 3;</code>
     * @return The emplrCovrgRate.
     */
    @java.lang.Override
    public float getEmplrCovrgRate() {
      return emplrCovrgRate_;
    }
    /**
     * <code>float emplrCovrgRate = 3;</code>
     * @param value The emplrCovrgRate to set.
     * @return This builder for chaining.
     */
    public Builder setEmplrCovrgRate(float value) {
      
      emplrCovrgRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float emplrCovrgRate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmplrCovrgRate() {
      
      emplrCovrgRate_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:com.example.grpc.cost.PlanCost)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.cost.PlanCost)
  private static final com.example.grpc.cost.PlanCost DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.cost.PlanCost();
  }

  public static com.example.grpc.cost.PlanCost getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlanCost>
      PARSER = new com.google.protobuf.AbstractParser<PlanCost>() {
    @java.lang.Override
    public PlanCost parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlanCost(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlanCost> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlanCost> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.cost.PlanCost getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

