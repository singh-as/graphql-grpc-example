// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cost.proto

package com.example.grpc.cost;

/**
 * Protobuf type {@code com.example.grpc.cost.PlanCostRequest}
 */
public final class PlanCostRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.cost.PlanCostRequest)
    PlanCostRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlanCostRequest.newBuilder() to construct.
  private PlanCostRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlanCostRequest() {
    planCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlanCostRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlanCostRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              planCode_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            planCode_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        planCode_ = planCode_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.cost.PlanCostRequest.class, com.example.grpc.cost.PlanCostRequest.Builder.class);
  }

  public static final int PLANCODE_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList planCode_;
  /**
   * <code>repeated string planCode = 1;</code>
   * @return A list containing the planCode.
   */
  public com.google.protobuf.ProtocolStringList
      getPlanCodeList() {
    return planCode_;
  }
  /**
   * <code>repeated string planCode = 1;</code>
   * @return The count of planCode.
   */
  public int getPlanCodeCount() {
    return planCode_.size();
  }
  /**
   * <code>repeated string planCode = 1;</code>
   * @param index The index of the element to return.
   * @return The planCode at the given index.
   */
  public java.lang.String getPlanCode(int index) {
    return planCode_.get(index);
  }
  /**
   * <code>repeated string planCode = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the planCode at the given index.
   */
  public com.google.protobuf.ByteString
      getPlanCodeBytes(int index) {
    return planCode_.getByteString(index);
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
    for (int i = 0; i < planCode_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, planCode_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < planCode_.size(); i++) {
        dataSize += computeStringSizeNoTag(planCode_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPlanCodeList().size();
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
    if (!(obj instanceof com.example.grpc.cost.PlanCostRequest)) {
      return super.equals(obj);
    }
    com.example.grpc.cost.PlanCostRequest other = (com.example.grpc.cost.PlanCostRequest) obj;

    if (!getPlanCodeList()
        .equals(other.getPlanCodeList())) return false;
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
    if (getPlanCodeCount() > 0) {
      hash = (37 * hash) + PLANCODE_FIELD_NUMBER;
      hash = (53 * hash) + getPlanCodeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.cost.PlanCostRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCostRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCostRequest parseFrom(
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
  public static Builder newBuilder(com.example.grpc.cost.PlanCostRequest prototype) {
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
   * Protobuf type {@code com.example.grpc.cost.PlanCostRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.cost.PlanCostRequest)
      com.example.grpc.cost.PlanCostRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.cost.PlanCostRequest.class, com.example.grpc.cost.PlanCostRequest.Builder.class);
    }

    // Construct using com.example.grpc.cost.PlanCostRequest.newBuilder()
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
      planCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostRequest_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCostRequest getDefaultInstanceForType() {
      return com.example.grpc.cost.PlanCostRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCostRequest build() {
      com.example.grpc.cost.PlanCostRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCostRequest buildPartial() {
      com.example.grpc.cost.PlanCostRequest result = new com.example.grpc.cost.PlanCostRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        planCode_ = planCode_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.planCode_ = planCode_;
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
      if (other instanceof com.example.grpc.cost.PlanCostRequest) {
        return mergeFrom((com.example.grpc.cost.PlanCostRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.cost.PlanCostRequest other) {
      if (other == com.example.grpc.cost.PlanCostRequest.getDefaultInstance()) return this;
      if (!other.planCode_.isEmpty()) {
        if (planCode_.isEmpty()) {
          planCode_ = other.planCode_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePlanCodeIsMutable();
          planCode_.addAll(other.planCode_);
        }
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
      com.example.grpc.cost.PlanCostRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.cost.PlanCostRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList planCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePlanCodeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        planCode_ = new com.google.protobuf.LazyStringArrayList(planCode_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @return A list containing the planCode.
     */
    public com.google.protobuf.ProtocolStringList
        getPlanCodeList() {
      return planCode_.getUnmodifiableView();
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @return The count of planCode.
     */
    public int getPlanCodeCount() {
      return planCode_.size();
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @param index The index of the element to return.
     * @return The planCode at the given index.
     */
    public java.lang.String getPlanCode(int index) {
      return planCode_.get(index);
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the planCode at the given index.
     */
    public com.google.protobuf.ByteString
        getPlanCodeBytes(int index) {
      return planCode_.getByteString(index);
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @param index The index to set the value at.
     * @param value The planCode to set.
     * @return This builder for chaining.
     */
    public Builder setPlanCode(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePlanCodeIsMutable();
      planCode_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @param value The planCode to add.
     * @return This builder for chaining.
     */
    public Builder addPlanCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePlanCodeIsMutable();
      planCode_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @param values The planCode to add.
     * @return This builder for chaining.
     */
    public Builder addAllPlanCode(
        java.lang.Iterable<java.lang.String> values) {
      ensurePlanCodeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, planCode_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlanCode() {
      planCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string planCode = 1;</code>
     * @param value The bytes of the planCode to add.
     * @return This builder for chaining.
     */
    public Builder addPlanCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePlanCodeIsMutable();
      planCode_.add(value);
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


    // @@protoc_insertion_point(builder_scope:com.example.grpc.cost.PlanCostRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.cost.PlanCostRequest)
  private static final com.example.grpc.cost.PlanCostRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.cost.PlanCostRequest();
  }

  public static com.example.grpc.cost.PlanCostRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlanCostRequest>
      PARSER = new com.google.protobuf.AbstractParser<PlanCostRequest>() {
    @java.lang.Override
    public PlanCostRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlanCostRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlanCostRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlanCostRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.cost.PlanCostRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
