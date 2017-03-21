package org.tmf.dsmapi.agreementmanagement.agreementspecification.model;

import org.tmf.dsmapi.agreementmanagement.agreement.model.TimePeriod;

import java.io.Serializable;

/**
 * Created by atinsingh on 3/21/17.
 */
public class AgreementSpecificationRelationship implements Serializable {

    protected String id;
    protected String href;
    protected String type;
    protected TimePeriod validFor;


    public AgreementSpecificationRelationship() {
    }

    public AgreementSpecificationRelationship(String id, String href, String type, TimePeriod validFor) {
        this.id = id;
        this.href = href;
        this.type = type;
        this.validFor = validFor;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    @Override
    public String toString() {
        return "AgreementSpecificationRelationship{" +
                "id='" + id + '\'' +
                ", href='" + href + '\'' +
                ", type='" + type + '\'' +
                ", validFor=" + validFor +
                '}';
    }
}
