package org.tmf.dsmapi.agreementmanagement.agreementspecification.model;

import java.io.Serializable;

/**
 * Created by atinsingh on 3/21/17.
 */
public class AgreementAttachment implements Serializable {

    protected String id;
    protected String href;
    protected String type;
    protected String url;

    public AgreementAttachment() {
    }

    public AgreementAttachment(String id, String href, String type, String url) {
        this.id = id;
        this.href = href;
        this.type = type;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "AgreementAttachment{" +
                "id='" + id + '\'' +
                ", href='" + href + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

