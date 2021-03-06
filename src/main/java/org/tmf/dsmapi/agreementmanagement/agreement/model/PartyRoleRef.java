package org.tmf.dsmapi.agreementmanagement.agreement.model;

/**
 * Created by atinsingh on 3/20/17.
 */
public class PartyRoleRef {

    protected String id;
    protected String href;
    protected String name;

    protected String partyID;  // Should be replaced with PartyRole object.

    protected String partyName;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartyID() {
        return partyID;
    }

    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    @Override
    public String toString() {
        return "PartyRoleRef{" +
                "id='" + id + '\'' +
                ", href='" + href + '\'' +
                ", name='" + name + '\'' +
                ", partyID='" + partyID + '\'' +
                ", partyName='" + partyName + '\'' +
                '}';
    }
}
