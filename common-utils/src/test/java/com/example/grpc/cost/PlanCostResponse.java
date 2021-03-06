// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cost.proto

package com.example.grpc.cost;

/**
 * Protobuf type {@code com.example.grpc.cost.PlanCostResponse}
 */
public final class PlanCostResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.cost.PlanCostResponse)
    PlanCostResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlanCostResponse.newBuilder() to construct.
  private PlanCostResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlanCostResponse() {
    cost_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlanCostResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlanCostResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cost_ = new java.util.ArrayList<com.example.grpc.cost.PlanCost>();
              mutable_bitField0_ |= 0x00000001;
            }
            cost_.add(
                input.readMessage(com.example.grpc.cost.PlanCost.parser(), extensionRegistry));
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
        cost_ = java.util.Collections.unmodifiableList(cost_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.cost.PlanCostResponse.class, com.example.grpc.cost.PlanCostResponse.Builder.class);
  }

  public static final int COST_FIELD_NUMBER = 1;
  private java.util.List<com.example.grpc.cost.PlanCost> cost_;
  /**
   * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.grpc.cost.PlanCost> getCostList() {
    return cost_;
  }
  /**
   * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.grpc.cost.PlanCostOrBuilder> 
      getCostOrBuilderList() {
    return cost_;
  }
  /**
   * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
   */
  @java.lang.Override
  public int getCostCount() {
    return cost_.size();
  }
  /**
   * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
   */
  @java.lang.Override
  public com.example.grpc.cost.PlanCost getCost(int index) {
    return cost_.get(index);
  }
  /**
   * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
   */
  @java.lang.Override
  public com.example.grpc.cost.PlanCostOrBuilder getCostOrBuilder(
      int index) {
    return cost_.get(index);
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
    for (int i = 0; i < cost_.size(); i++) {
      output.writeMessage(1, cost_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cost_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cost_.get(i));
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
    if (!(obj instanceof com.example.grpc.cost.PlanCostResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.cost.PlanCostResponse other = (com.example.grpc.cost.PlanCostResponse) obj;

    if (!getCostList()
        .equals(other.getCostList())) return false;
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
    if (getCostCount() > 0) {
      hash = (37 * hash) + COST_FIELD_NUMBER;
      hash = (53 * hash) + getCostList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.cost.PlanCostResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCostResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.cost.PlanCostResponse parseFrom(
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
  public static Builder newBuilder(com.example.grpc.cost.PlanCostResponse prototype) {
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
   * Protobuf type {@code com.example.grpc.cost.PlanCostResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.cost.PlanCostResponse)
      com.example.grpc.cost.PlanCostResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.cost.PlanCostResponse.class, com.example.grpc.cost.PlanCostResponse.Builder.class);
    }

    // Construct using com.example.grpc.cost.PlanCostResponse.newBuilder()
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
        getCostFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (costBuilder_ == null) {
        cost_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        costBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.cost.Cost.internal_static_com_example_grpc_cost_PlanCostResponse_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCostResponse getDefaultInstanceForType() {
      return com.example.grpc.cost.PlanCostResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCostResponse build() {
      com.example.grpc.cost.PlanCostResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.cost.PlanCostResponse buildPartial() {
      com.example.grpc.cost.PlanCostResponse result = new com.example.grpc.cost.PlanCostResponse(this);
      int from_bitField0_ = bitField0_;
      if (costBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cost_ = java.util.Collections.unmodifiableList(cost_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cost_ = cost_;
      } else {
        result.cost_ = costBuilder_.build();
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
      if (other instanceof com.example.grpc.cost.PlanCostResponse) {
        return mergeFrom((com.example.grpc.cost.PlanCostResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.cost.PlanCostResponse other) {
      if (other == com.example.grpc.cost.PlanCostResponse.getDefaultInstance()) return this;
      if (costBuilder_ == null) {
        if (!other.cost_.isEmpty()) {
          if (cost_.isEmpty()) {
            cost_ = other.cost_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCostIsMutable();
            cost_.addAll(other.cost_);
          }
          onChanged();
        }
      } else {
        if (!other.cost_.isEmpty()) {
          if (costBuilder_.isEmpty()) {
            costBuilder_.dispose();
            costBuilder_ = null;
            cost_ = other.cost_;
            bitField0_ = (bitField0_ & ~0x00000001);
            costBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCostFieldBuilder() : null;
          } else {
            costBuilder_.addAllMessages(other.cost_);
          }
        }
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
      com.example.grpc.cost.PlanCostResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.cost.PlanCostResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.grpc.cost.PlanCost> cost_ =
      java.util.Collections.emptyList();
    private void ensureCostIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cost_ = new java.util.ArrayList<com.example.grpc.cost.PlanCost>(cost_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.cost.PlanCost, com.example.grpc.cost.PlanCost.Builder, com.example.grpc.cost.PlanCostOrBuilder> costBuilder_;

    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public java.util.List<com.example.grpc.cost.PlanCost> getCostList() {
      if (costBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cost_);
      } else {
        return costBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public int getCostCount() {
      if (costBuilder_ == null) {
        return cost_.size();
      } else {
        return costBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public com.example.grpc.cost.PlanCost getCost(int index) {
      if (costBuilder_ == null) {
        return cost_.get(index);
      } else {
        return costBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder setCost(
        int index, com.example.grpc.cost.PlanCost value) {
      if (costBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCostIsMutable();
        cost_.set(index, value);
        onChanged();
      } else {
        costBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder setCost(
        int index, com.example.grpc.cost.PlanCost.Builder builderForValue) {
      if (costBuilder_ == null) {
        ensureCostIsMutable();
        cost_.set(index, builderForValue.build());
        onChanged();
      } else {
        costBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder addCost(com.example.grpc.cost.PlanCost value) {
      if (costBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCostIsMutable();
        cost_.add(value);
        onChanged();
      } else {
        costBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder addCost(
        int index, com.example.grpc.cost.PlanCost value) {
      if (costBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCostIsMutable();
        cost_.add(index, value);
        onChanged();
      } else {
        costBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder addCost(
        com.example.grpc.cost.PlanCost.Builder builderForValue) {
      if (costBuilder_ == null) {
        ensureCostIsMutable();
        cost_.add(builderForValue.build());
        onChanged();
      } else {
        costBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder addCost(
        int index, com.example.grpc.cost.PlanCost.Builder builderForValue) {
      if (costBuilder_ == null) {
        ensureCostIsMutable();
        cost_.add(index, builderForValue.build());
        onChanged();
      } else {
        costBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder addAllCost(
        java.lang.Iterable<? extends com.example.grpc.cost.PlanCost> values) {
      if (costBuilder_ == null) {
        ensureCostIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cost_);
        onChanged();
      } else {
        costBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder clearCost() {
      if (costBuilder_ == null) {
        cost_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        costBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public Builder removeCost(int index) {
      if (costBuilder_ == null) {
        ensureCostIsMutable();
        cost_.remove(index);
        onChanged();
      } else {
        costBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public com.example.grpc.cost.PlanCost.Builder getCostBuilder(
        int index) {
      return getCostFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public com.example.grpc.cost.PlanCostOrBuilder getCostOrBuilder(
        int index) {
      if (costBuilder_ == null) {
        return cost_.get(index);  } else {
        return costBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public java.util.List<? extends com.example.grpc.cost.PlanCostOrBuilder> 
         getCostOrBuilderList() {
      if (costBuilder_ != null) {
        return costBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cost_);
      }
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public com.example.grpc.cost.PlanCost.Builder addCostBuilder() {
      return getCostFieldBuilder().addBuilder(
          com.example.grpc.cost.PlanCost.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public com.example.grpc.cost.PlanCost.Builder addCostBuilder(
        int index) {
      return getCostFieldBuilder().addBuilder(
          index, com.example.grpc.cost.PlanCost.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.cost.PlanCost cost = 1;</code>
     */
    public java.util.List<com.example.grpc.cost.PlanCost.Builder> 
         getCostBuilderList() {
      return getCostFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.cost.PlanCost, com.example.grpc.cost.PlanCost.Builder, com.example.grpc.cost.PlanCostOrBuilder> 
        getCostFieldBuilder() {
      if (costBuilder_ == null) {
        costBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.grpc.cost.PlanCost, com.example.grpc.cost.PlanCost.Builder, com.example.grpc.cost.PlanCostOrBuilder>(
                cost_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cost_ = null;
      }
      return costBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.example.grpc.cost.PlanCostResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.cost.PlanCostResponse)
  private static final com.example.grpc.cost.PlanCostResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.cost.PlanCostResponse();
  }

  public static com.example.grpc.cost.PlanCostResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlanCostResponse>
      PARSER = new com.google.protobuf.AbstractParser<PlanCostResponse>() {
    @java.lang.Override
    public PlanCostResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlanCostResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlanCostResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlanCostResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.cost.PlanCostResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

