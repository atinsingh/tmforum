package org.tmf.dsmapi.agreementmanagement.agreementspecification.model;

import org.tmf.dsmapi.agreementmanagement.agreement.model.TimePeriod;

import java.io.Serializable;

/**
 * Created by atinsingh on 3/20/17.
 */
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

    public Boolean get_default() {
        return _default;
    }

    public void set_default(Boolean _default) {
        this._default = _default;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(String valueFrom) {
        this.valueFrom = valueFrom;
    }

    public String getValueTo() {
        return valueTo;
    }

    public void setValueTo(String valueTo) {
        this.valueTo = valueTo;
    }

    public String getValueType() {
        return valueType;
    }

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
