// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sorteio.proto

package java_grpc;

public final class Sorteio {
  private Sorteio() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IntervaloRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IntervaloRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 min = 1;</code>
     */
    int getMin();

    /**
     * <code>int32 max = 2;</code>
     */
    int getMax();
  }
  /**
   * Protobuf type {@code IntervaloRequest}
   */
  public  static final class IntervaloRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IntervaloRequest)
      IntervaloRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IntervaloRequest.newBuilder() to construct.
    private IntervaloRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IntervaloRequest() {
      min_ = 0;
      max_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IntervaloRequest(
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
            case 8: {

              min_ = input.readInt32();
              break;
            }
            case 16: {

              max_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return java_grpc.Sorteio.internal_static_IntervaloRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return java_grpc.Sorteio.internal_static_IntervaloRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              java_grpc.Sorteio.IntervaloRequest.class, java_grpc.Sorteio.IntervaloRequest.Builder.class);
    }

    public static final int MIN_FIELD_NUMBER = 1;
    private int min_;
    /**
     * <code>int32 min = 1;</code>
     */
    public int getMin() {
      return min_;
    }

    public static final int MAX_FIELD_NUMBER = 2;
    private int max_;
    /**
     * <code>int32 max = 2;</code>
     */
    public int getMax() {
      return max_;
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
      if (min_ != 0) {
        output.writeInt32(1, min_);
      }
      if (max_ != 0) {
        output.writeInt32(2, max_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (min_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, min_);
      }
      if (max_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, max_);
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
      if (!(obj instanceof java_grpc.Sorteio.IntervaloRequest)) {
        return super.equals(obj);
      }
      java_grpc.Sorteio.IntervaloRequest other = (java_grpc.Sorteio.IntervaloRequest) obj;

      boolean result = true;
      result = result && (getMin()
          == other.getMin());
      result = result && (getMax()
          == other.getMax());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MIN_FIELD_NUMBER;
      hash = (53 * hash) + getMin();
      hash = (37 * hash) + MAX_FIELD_NUMBER;
      hash = (53 * hash) + getMax();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static java_grpc.Sorteio.IntervaloRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static java_grpc.Sorteio.IntervaloRequest parseFrom(
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
    public static Builder newBuilder(java_grpc.Sorteio.IntervaloRequest prototype) {
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
     * Protobuf type {@code IntervaloRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IntervaloRequest)
        java_grpc.Sorteio.IntervaloRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return java_grpc.Sorteio.internal_static_IntervaloRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return java_grpc.Sorteio.internal_static_IntervaloRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                java_grpc.Sorteio.IntervaloRequest.class, java_grpc.Sorteio.IntervaloRequest.Builder.class);
      }

      // Construct using java_grpc.Sorteio.IntervaloRequest.newBuilder()
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
        min_ = 0;

        max_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return java_grpc.Sorteio.internal_static_IntervaloRequest_descriptor;
      }

      @java.lang.Override
      public java_grpc.Sorteio.IntervaloRequest getDefaultInstanceForType() {
        return java_grpc.Sorteio.IntervaloRequest.getDefaultInstance();
      }

      @java.lang.Override
      public java_grpc.Sorteio.IntervaloRequest build() {
        java_grpc.Sorteio.IntervaloRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public java_grpc.Sorteio.IntervaloRequest buildPartial() {
        java_grpc.Sorteio.IntervaloRequest result = new java_grpc.Sorteio.IntervaloRequest(this);
        result.min_ = min_;
        result.max_ = max_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof java_grpc.Sorteio.IntervaloRequest) {
          return mergeFrom((java_grpc.Sorteio.IntervaloRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(java_grpc.Sorteio.IntervaloRequest other) {
        if (other == java_grpc.Sorteio.IntervaloRequest.getDefaultInstance()) return this;
        if (other.getMin() != 0) {
          setMin(other.getMin());
        }
        if (other.getMax() != 0) {
          setMax(other.getMax());
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
        java_grpc.Sorteio.IntervaloRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (java_grpc.Sorteio.IntervaloRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int min_ ;
      /**
       * <code>int32 min = 1;</code>
       */
      public int getMin() {
        return min_;
      }
      /**
       * <code>int32 min = 1;</code>
       */
      public Builder setMin(int value) {
        
        min_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 min = 1;</code>
       */
      public Builder clearMin() {
        
        min_ = 0;
        onChanged();
        return this;
      }

      private int max_ ;
      /**
       * <code>int32 max = 2;</code>
       */
      public int getMax() {
        return max_;
      }
      /**
       * <code>int32 max = 2;</code>
       */
      public Builder setMax(int value) {
        
        max_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 max = 2;</code>
       */
      public Builder clearMax() {
        
        max_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:IntervaloRequest)
    }

    // @@protoc_insertion_point(class_scope:IntervaloRequest)
    private static final java_grpc.Sorteio.IntervaloRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new java_grpc.Sorteio.IntervaloRequest();
    }

    public static java_grpc.Sorteio.IntervaloRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IntervaloRequest>
        PARSER = new com.google.protobuf.AbstractParser<IntervaloRequest>() {
      @java.lang.Override
      public IntervaloRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IntervaloRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IntervaloRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IntervaloRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public java_grpc.Sorteio.IntervaloRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SorteadoResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SorteadoResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 numero = 1;</code>
     */
    int getNumero();
  }
  /**
   * Protobuf type {@code SorteadoResponse}
   */
  public  static final class SorteadoResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SorteadoResponse)
      SorteadoResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SorteadoResponse.newBuilder() to construct.
    private SorteadoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SorteadoResponse() {
      numero_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SorteadoResponse(
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
            case 8: {

              numero_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return java_grpc.Sorteio.internal_static_SorteadoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return java_grpc.Sorteio.internal_static_SorteadoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              java_grpc.Sorteio.SorteadoResponse.class, java_grpc.Sorteio.SorteadoResponse.Builder.class);
    }

    public static final int NUMERO_FIELD_NUMBER = 1;
    private int numero_;
    /**
     * <code>int32 numero = 1;</code>
     */
    public int getNumero() {
      return numero_;
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
      if (numero_ != 0) {
        output.writeInt32(1, numero_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (numero_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, numero_);
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
      if (!(obj instanceof java_grpc.Sorteio.SorteadoResponse)) {
        return super.equals(obj);
      }
      java_grpc.Sorteio.SorteadoResponse other = (java_grpc.Sorteio.SorteadoResponse) obj;

      boolean result = true;
      result = result && (getNumero()
          == other.getNumero());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NUMERO_FIELD_NUMBER;
      hash = (53 * hash) + getNumero();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static java_grpc.Sorteio.SorteadoResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static java_grpc.Sorteio.SorteadoResponse parseFrom(
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
    public static Builder newBuilder(java_grpc.Sorteio.SorteadoResponse prototype) {
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
     * Protobuf type {@code SorteadoResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SorteadoResponse)
        java_grpc.Sorteio.SorteadoResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return java_grpc.Sorteio.internal_static_SorteadoResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return java_grpc.Sorteio.internal_static_SorteadoResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                java_grpc.Sorteio.SorteadoResponse.class, java_grpc.Sorteio.SorteadoResponse.Builder.class);
      }

      // Construct using java_grpc.Sorteio.SorteadoResponse.newBuilder()
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
        numero_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return java_grpc.Sorteio.internal_static_SorteadoResponse_descriptor;
      }

      @java.lang.Override
      public java_grpc.Sorteio.SorteadoResponse getDefaultInstanceForType() {
        return java_grpc.Sorteio.SorteadoResponse.getDefaultInstance();
      }

      @java.lang.Override
      public java_grpc.Sorteio.SorteadoResponse build() {
        java_grpc.Sorteio.SorteadoResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public java_grpc.Sorteio.SorteadoResponse buildPartial() {
        java_grpc.Sorteio.SorteadoResponse result = new java_grpc.Sorteio.SorteadoResponse(this);
        result.numero_ = numero_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof java_grpc.Sorteio.SorteadoResponse) {
          return mergeFrom((java_grpc.Sorteio.SorteadoResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(java_grpc.Sorteio.SorteadoResponse other) {
        if (other == java_grpc.Sorteio.SorteadoResponse.getDefaultInstance()) return this;
        if (other.getNumero() != 0) {
          setNumero(other.getNumero());
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
        java_grpc.Sorteio.SorteadoResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (java_grpc.Sorteio.SorteadoResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int numero_ ;
      /**
       * <code>int32 numero = 1;</code>
       */
      public int getNumero() {
        return numero_;
      }
      /**
       * <code>int32 numero = 1;</code>
       */
      public Builder setNumero(int value) {
        
        numero_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 numero = 1;</code>
       */
      public Builder clearNumero() {
        
        numero_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SorteadoResponse)
    }

    // @@protoc_insertion_point(class_scope:SorteadoResponse)
    private static final java_grpc.Sorteio.SorteadoResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new java_grpc.Sorteio.SorteadoResponse();
    }

    public static java_grpc.Sorteio.SorteadoResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SorteadoResponse>
        PARSER = new com.google.protobuf.AbstractParser<SorteadoResponse>() {
      @java.lang.Override
      public SorteadoResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SorteadoResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SorteadoResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SorteadoResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public java_grpc.Sorteio.SorteadoResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IntervaloRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IntervaloRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SorteadoResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SorteadoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rsorteio.proto\",\n\020IntervaloRequest\022\013\n\003m" +
      "in\030\001 \001(\005\022\013\n\003max\030\002 \001(\005\"\"\n\020SorteadoRespons" +
      "e\022\016\n\006numero\030\001 \001(\0052I\n\016SorteioService\0227\n\rS" +
      "ortearNumero\022\021.IntervaloRequest\032\021.Sortea" +
      "doResponse\"\000B\013\n\tjava_grpcb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_IntervaloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IntervaloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IntervaloRequest_descriptor,
        new java.lang.String[] { "Min", "Max", });
    internal_static_SorteadoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SorteadoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SorteadoResponse_descriptor,
        new java.lang.String[] { "Numero", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
