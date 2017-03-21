package org.tmf.dsmapi.agreementmanagement.agreementspecification.model;

import org.tmf.dsmapi.agreementmanagement.agreement.model.TimePeriod;

import java.io.Serializable;

/**
 * Created by atinsingh on 3/21/17.
 */
public class RelatedPartyRef implements Serializable {
    protected String id;
    protected String href;
    protected String name;
    protected String role;
    protected TimePeriod validFor;
}
