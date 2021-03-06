package org.tmf.dsmapi.agreementmanagement.agreementspecification.model;

import org.tmf.dsmapi.agreementmanagement.agreement.model.TimePeriod;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;

/**
 * Created by atinsingh on 3/20/17.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name = "AgreementCharacteristicValue")
@Table(name = "AGREEMENT_SPEC_CHARACTERISTIC_VALUE")
@Inheritance(strategy = InheritanceType.JOINED)
public class AgreementSpecCharacteristicValue implements Serializable{

    protected  Boolean _default;
    protected String unitOfMeasure;
    protected TimePeriod validFor;
    protected String value;
    protected String valueFrom;
    protected String valueTo;
    protected String valueType;

    public AgreementSpecCharacteristicValue() {
    }

    public AgreementSpecCharacteristicValue(Boolean _default, String unitOfMeasure, TimePeriod validFor, String value, String valueFrom, String valueTo, String valueType) {
        this._default = _default;
        this.unitOfMeasure = unitOfMeasure;
        this.validFor = validFor;
        this.value = value;
        this.valueFrom = valueFrom;
        this.valueTo = valueTo;
        this.valueType = valueType;
    }

    /**
     * Return flag to determine if its a default value
     * @return
     *
     * allowed object is
     * {@link Boolean}
     */
    @Column(name = "DEFAULT_VALUE")
    public Boolean get_default() {
        return _default;
    }

    /**
     * Set flag default as true/false
     * @param _default
     *
     * allowed object is
     * {@link Boolean}
     */
    public void set_default(Boolean _default) {
        this._default = _default;
    }

    /**
     * Return the unit of measure for the object
     * @return
     *
     * allowed object is
     *
     * {@link String}
     */

    @Basic
    @Column(name = "MEASURE_UNIT", length = 255)
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of unit for measure
     * @param unitOfMeasure
     *
     * allowed object is
     *
     * {@link String}
     */
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * Set an timeperiod for the object
     * @return
     *
     * allowed object is
     * {@link TimePeriod}
     */
    @Embedded
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     *
     * Set the time period
     *
     * @param validFor
     *
     * allowed object is
     * {@link TimePeriod}
     */
    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    /**
     * Returns the value of the AgreementSpecificationCharacteristic
     * @return
     *
     * allowed object is
     * {@link String}
     */
    @Basic
    @Column(name = "VALUE", length = 255)
    public String getValue() {
        return value;
    }

    /**
     * Sets the value
     * @param value
     *
     * allowed object is
     * {@link String}
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns the SourceFrom  of the AgreementSpecificationCharacteristic
     * @return
     *
     * allowed object is
     * {@link String}
     */
    @Basic
    @Column(name = "VALUE_FROM", length = 255)
    public String getValueFrom() {
        return valueFrom;
    }

    /**
     * Set the value of from source
     * @param valueFrom
     *
     * allowed object is
     * {@link String}
     */
    public void setValueFrom(String valueFrom) {
        this.valueFrom = valueFrom;
    }

    /**
     * Returns the valueTo of the AgreementSpecificationCharacteristic
     * @return
     *
     * allowed object is
     * {@link String}
     */
    @Basic
    @Column(name = "VALUE_TO", length = 255)
    public String getValueTo() {
        return valueTo;
    }


    /**
     * Set the value of To source
     * @param valueTo
     *
     * allowed object is
     * {@link String}
     */
    public void setValueTo(String valueTo) {
        this.valueTo = valueTo;
    }


    /**
     * Returns the valueType of the AgreementSpecificationCharacteristic
     * @return
     *
     * allowed object is
     * {@link String}
     */
    @Basic
    @Column(name = "VALUE_TYPE", length = 255)
    public String getValueType() {
        return valueType;
    }


    /**
     * Set the valueType of the object
     * @param valueType
     *
     * allowed object is
     * {@link String}
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Override
    public String toString() {
        return "AgreementSpecCharacteristicValue{" +
                "_default=" + _default +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", validFor=" + validFor +
                ", value='" + value + '\'' +
                ", valueFrom='" + valueFrom + '\'' +
                ", valueTo='" + valueTo + '\'' +
                ", valueType='" + valueType + '\'' +
                '}';
    }
}
