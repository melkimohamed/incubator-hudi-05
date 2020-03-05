/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hudi.avro.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HoodieRestoreMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6818250425352392673L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieRestoreMetadata\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"startRestoreTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timeTakenInMillis\",\"type\":\"long\"},{\"name\":\"instantsToRollback\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"hoodieRestoreMetadata\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":[\"null\",{\"type\":\"record\",\"name\":\"HoodieRollbackMetadata\",\"fields\":[{\"name\":\"startRollbackTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timeTakenInMillis\",\"type\":\"long\"},{\"name\":\"totalFilesDeleted\",\"type\":\"int\"},{\"name\":\"commitsRollback\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"partitionMetadata\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"HoodieRollbackPartitionMetadata\",\"fields\":[{\"name\":\"partitionPath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"successDeleteFiles\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"failedDeleteFiles\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]},\"avro.java.string\":\"String\"}},{\"name\":\"version\",\"type\":[\"int\",\"null\"],\"default\":1}]}],\"default\":null},\"avro.java.string\":\"String\"}},{\"name\":\"version\",\"type\":[\"int\",\"null\"],\"default\":1}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HoodieRestoreMetadata> ENCODER =
      new BinaryMessageEncoder<HoodieRestoreMetadata>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HoodieRestoreMetadata> DECODER =
      new BinaryMessageDecoder<HoodieRestoreMetadata>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<HoodieRestoreMetadata> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<HoodieRestoreMetadata> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HoodieRestoreMetadata>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this HoodieRestoreMetadata to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a HoodieRestoreMetadata from a ByteBuffer. */
  public static HoodieRestoreMetadata fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String startRestoreTime;
  @Deprecated public long timeTakenInMillis;
  @Deprecated public java.util.List<java.lang.String> instantsToRollback;
  @Deprecated public java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>> hoodieRestoreMetadata;
  @Deprecated public java.lang.Integer version;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HoodieRestoreMetadata() {}

  /**
   * All-args constructor.
   * @param startRestoreTime The new value for startRestoreTime
   * @param timeTakenInMillis The new value for timeTakenInMillis
   * @param instantsToRollback The new value for instantsToRollback
   * @param hoodieRestoreMetadata The new value for hoodieRestoreMetadata
   * @param version The new value for version
   */
  public HoodieRestoreMetadata(java.lang.String startRestoreTime, java.lang.Long timeTakenInMillis, java.util.List<java.lang.String> instantsToRollback, java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>> hoodieRestoreMetadata, java.lang.Integer version) {
    this.startRestoreTime = startRestoreTime;
    this.timeTakenInMillis = timeTakenInMillis;
    this.instantsToRollback = instantsToRollback;
    this.hoodieRestoreMetadata = hoodieRestoreMetadata;
    this.version = version;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return startRestoreTime;
    case 1: return timeTakenInMillis;
    case 2: return instantsToRollback;
    case 3: return hoodieRestoreMetadata;
    case 4: return version;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: startRestoreTime = (java.lang.String)value$; break;
    case 1: timeTakenInMillis = (java.lang.Long)value$; break;
    case 2: instantsToRollback = (java.util.List<java.lang.String>)value$; break;
    case 3: hoodieRestoreMetadata = (java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>>)value$; break;
    case 4: version = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'startRestoreTime' field.
   * @return The value of the 'startRestoreTime' field.
   */
  public java.lang.String getStartRestoreTime() {
    return startRestoreTime;
  }

  /**
   * Sets the value of the 'startRestoreTime' field.
   * @param value the value to set.
   */
  public void setStartRestoreTime(java.lang.String value) {
    this.startRestoreTime = value;
  }

  /**
   * Gets the value of the 'timeTakenInMillis' field.
   * @return The value of the 'timeTakenInMillis' field.
   */
  public java.lang.Long getTimeTakenInMillis() {
    return timeTakenInMillis;
  }

  /**
   * Sets the value of the 'timeTakenInMillis' field.
   * @param value the value to set.
   */
  public void setTimeTakenInMillis(java.lang.Long value) {
    this.timeTakenInMillis = value;
  }

  /**
   * Gets the value of the 'instantsToRollback' field.
   * @return The value of the 'instantsToRollback' field.
   */
  public java.util.List<java.lang.String> getInstantsToRollback() {
    return instantsToRollback;
  }

  /**
   * Sets the value of the 'instantsToRollback' field.
   * @param value the value to set.
   */
  public void setInstantsToRollback(java.util.List<java.lang.String> value) {
    this.instantsToRollback = value;
  }

  /**
   * Gets the value of the 'hoodieRestoreMetadata' field.
   * @return The value of the 'hoodieRestoreMetadata' field.
   */
  public java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>> getHoodieRestoreMetadata() {
    return hoodieRestoreMetadata;
  }

  /**
   * Sets the value of the 'hoodieRestoreMetadata' field.
   * @param value the value to set.
   */
  public void setHoodieRestoreMetadata(java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>> value) {
    this.hoodieRestoreMetadata = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
  }

  /**
   * Creates a new HoodieRestoreMetadata RecordBuilder.
   * @return A new HoodieRestoreMetadata RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder();
  }

  /**
   * Creates a new HoodieRestoreMetadata RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HoodieRestoreMetadata RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder newBuilder(org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder other) {
    return new org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder(other);
  }

  /**
   * Creates a new HoodieRestoreMetadata RecordBuilder by copying an existing HoodieRestoreMetadata instance.
   * @param other The existing instance to copy.
   * @return A new HoodieRestoreMetadata RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder newBuilder(org.apache.hudi.avro.model.HoodieRestoreMetadata other) {
    return new org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder(other);
  }

  /**
   * RecordBuilder for HoodieRestoreMetadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieRestoreMetadata>
    implements org.apache.avro.data.RecordBuilder<HoodieRestoreMetadata> {

    private java.lang.String startRestoreTime;
    private long timeTakenInMillis;
    private java.util.List<java.lang.String> instantsToRollback;
    private java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>> hoodieRestoreMetadata;
    private java.lang.Integer version;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.startRestoreTime)) {
        this.startRestoreTime = data().deepCopy(fields()[0].schema(), other.startRestoreTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeTakenInMillis)) {
        this.timeTakenInMillis = data().deepCopy(fields()[1].schema(), other.timeTakenInMillis);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.instantsToRollback)) {
        this.instantsToRollback = data().deepCopy(fields()[2].schema(), other.instantsToRollback);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.hoodieRestoreMetadata)) {
        this.hoodieRestoreMetadata = data().deepCopy(fields()[3].schema(), other.hoodieRestoreMetadata);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.version)) {
        this.version = data().deepCopy(fields()[4].schema(), other.version);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HoodieRestoreMetadata instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieRestoreMetadata other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.startRestoreTime)) {
        this.startRestoreTime = data().deepCopy(fields()[0].schema(), other.startRestoreTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeTakenInMillis)) {
        this.timeTakenInMillis = data().deepCopy(fields()[1].schema(), other.timeTakenInMillis);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.instantsToRollback)) {
        this.instantsToRollback = data().deepCopy(fields()[2].schema(), other.instantsToRollback);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.hoodieRestoreMetadata)) {
        this.hoodieRestoreMetadata = data().deepCopy(fields()[3].schema(), other.hoodieRestoreMetadata);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.version)) {
        this.version = data().deepCopy(fields()[4].schema(), other.version);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'startRestoreTime' field.
      * @return The value.
      */
    public java.lang.String getStartRestoreTime() {
      return startRestoreTime;
    }

    /**
      * Sets the value of the 'startRestoreTime' field.
      * @param value The value of 'startRestoreTime'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder setStartRestoreTime(java.lang.String value) {
      validate(fields()[0], value);
      this.startRestoreTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'startRestoreTime' field has been set.
      * @return True if the 'startRestoreTime' field has been set, false otherwise.
      */
    public boolean hasStartRestoreTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'startRestoreTime' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder clearStartRestoreTime() {
      startRestoreTime = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeTakenInMillis' field.
      * @return The value.
      */
    public java.lang.Long getTimeTakenInMillis() {
      return timeTakenInMillis;
    }

    /**
      * Sets the value of the 'timeTakenInMillis' field.
      * @param value The value of 'timeTakenInMillis'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder setTimeTakenInMillis(long value) {
      validate(fields()[1], value);
      this.timeTakenInMillis = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'timeTakenInMillis' field has been set.
      * @return True if the 'timeTakenInMillis' field has been set, false otherwise.
      */
    public boolean hasTimeTakenInMillis() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'timeTakenInMillis' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder clearTimeTakenInMillis() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'instantsToRollback' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getInstantsToRollback() {
      return instantsToRollback;
    }

    /**
      * Sets the value of the 'instantsToRollback' field.
      * @param value The value of 'instantsToRollback'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder setInstantsToRollback(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.instantsToRollback = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'instantsToRollback' field has been set.
      * @return True if the 'instantsToRollback' field has been set, false otherwise.
      */
    public boolean hasInstantsToRollback() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'instantsToRollback' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder clearInstantsToRollback() {
      instantsToRollback = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'hoodieRestoreMetadata' field.
      * @return The value.
      */
    public java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>> getHoodieRestoreMetadata() {
      return hoodieRestoreMetadata;
    }

    /**
      * Sets the value of the 'hoodieRestoreMetadata' field.
      * @param value The value of 'hoodieRestoreMetadata'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder setHoodieRestoreMetadata(java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>> value) {
      validate(fields()[3], value);
      this.hoodieRestoreMetadata = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'hoodieRestoreMetadata' field has been set.
      * @return True if the 'hoodieRestoreMetadata' field has been set, false otherwise.
      */
    public boolean hasHoodieRestoreMetadata() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'hoodieRestoreMetadata' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder clearHoodieRestoreMetadata() {
      hoodieRestoreMetadata = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.Integer getVersion() {
      return version;
    }

    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder setVersion(java.lang.Integer value) {
      validate(fields()[4], value);
      this.version = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRestoreMetadata.Builder clearVersion() {
      version = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HoodieRestoreMetadata build() {
      try {
        HoodieRestoreMetadata record = new HoodieRestoreMetadata();
        record.startRestoreTime = fieldSetFlags()[0] ? this.startRestoreTime : (java.lang.String) defaultValue(fields()[0]);
        record.timeTakenInMillis = fieldSetFlags()[1] ? this.timeTakenInMillis : (java.lang.Long) defaultValue(fields()[1]);
        record.instantsToRollback = fieldSetFlags()[2] ? this.instantsToRollback : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.hoodieRestoreMetadata = fieldSetFlags()[3] ? this.hoodieRestoreMetadata : (java.util.Map<java.lang.String,java.util.List<org.apache.hudi.avro.model.HoodieRollbackMetadata>>) defaultValue(fields()[3]);
        record.version = fieldSetFlags()[4] ? this.version : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HoodieRestoreMetadata>
    WRITER$ = (org.apache.avro.io.DatumWriter<HoodieRestoreMetadata>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HoodieRestoreMetadata>
    READER$ = (org.apache.avro.io.DatumReader<HoodieRestoreMetadata>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}