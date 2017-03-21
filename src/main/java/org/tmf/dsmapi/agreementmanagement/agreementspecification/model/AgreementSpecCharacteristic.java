package org.tmf.dsmapi.agreementmanagement.agreementspecification.model;

import org.tmf.dsmapi.agreementmanagement.agreement.model.TimePeriod;

import java.io.Serializable;
import java.util.List;

/**
 * Created by atinsingh on 3/20/17.
 */
public class AgreementSpecCharacteristic implements Serializable {

    protected Boolean configurable;

    protected String description;

    protected String name;

    protected TimePeriod validFor;

    protected String valueType;

    protected List<AgreementSpecCharacteristicValue> specCharacteristicValues;

    protected List<RelatedPartyRef> relatedParty;

    public AgreementSpecCharacteristic() {
    }

    public Boolean getConfigurable() {
        return configurable;
    }

    public void setConfigurable(Boolean configurable) {
        this.configurable = configurable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public List<AgreementSpecCharacteristicValue> getSpecCharacteristicValues() {
        return specCharacteristicValues;
    }

    public void setSpecCharacteristicValues(List<AgreementSpecCharacteristicValue> specCharacteristicValues) {
        this.specCharacteristicValues = specCharacteristicValues;
    }

    public List<RelatedPartyRef> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @Override
    public String toString() {
        return "AgreementSpecCharacteristic{" +
                "configurable=" + configurable +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", validFor=" + validFor +
                ", valueType='" + valueType + '\'' +
                ", specCharacteristicValues=" + specCharacteristicValues +
                ", relatedParty=" + relatedParty +
                '}';
    }
}
