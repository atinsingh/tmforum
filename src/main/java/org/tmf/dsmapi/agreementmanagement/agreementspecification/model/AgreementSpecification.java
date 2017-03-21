package org.tmf.dsmapi.agreementmanagement.agreementspecification.model;


import org.tmf.dsmapi.agreementmanagement.agreement.model.Characteristic;
import org.tmf.dsmapi.agreementmanagement.agreement.model.TimePeriod;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by atinsingh on 3/20/17.
 */
public class AgreementSpecification implements Serializable {

    private static final long serialVersionUID = 11L;

    protected String id;

    protected String href;

    protected String description;

    protected Boolean isBundle;

    protected Date lastUpdate;

    protected  String lifecycletStaus;

    protected String name;

    protected TimePeriod validFor;

    protected String version;

    protected CategoryRef serviceCategory;

    protected List<AgreementSpecCharacteristic> specCharacteristics;

    protected List<AgreementAttachment> attachment;

    protected List<AgreementSpecificationRelationship> specificationRelationship;


    public AgreementSpecification() {
    }



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getBundle() {
        return isBundle;
    }

    public void setBundle(Boolean bundle) {
        isBundle = bundle;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLifecycletStaus() {
        return lifecycletStaus;
    }

    public void setLifecycletStaus(String lifecycletStaus) {
        this.lifecycletStaus = lifecycletStaus;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CategoryRef getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(CategoryRef serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public List<AgreementSpecCharacteristic> getSpecCharacteristics() {
        return specCharacteristics;
    }

    public void setSpecCharacteristics(List<AgreementSpecCharacteristic> specCharacteristics) {
        this.specCharacteristics = specCharacteristics;
    }

    public List<AgreementAttachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<AgreementAttachment> attachment) {
        this.attachment = attachment;
    }

    public List<AgreementSpecificationRelationship> getSpecificationRelationship() {
        return specificationRelationship;
    }

    public void setSpecificationRelationship(List<AgreementSpecificationRelationship> specificationRelationship) {
        this.specificationRelationship = specificationRelationship;
    }

    @Override
    public String toString() {
        return "AgreementSpecification{" +
                "id='" + id + '\'' +
                ", href='" + href + '\'' +
                ", description='" + description + '\'' +
                ", isBundle=" + isBundle +
                ", lastUpdate=" + lastUpdate +
                ", lifecycletStaus='" + lifecycletStaus + '\'' +
                ", name='" + name + '\'' +
                ", validFor=" + validFor +
                ", version='" + version + '\'' +
                ", serviceCategory=" + serviceCategory +
                ", specCharacteristics=" + specCharacteristics +
                ", attachment=" + attachment +
                ", specificationRelationship=" + specificationRelationship +
                '}';
    }
}
