package org.tmf.dsmapi.agreementmanagement.agreementspecification.model;

import java.io.Serializable;

/**
 * Created by atinsingh on 3/20/17.
 */
public class CategoryRef implements Serializable {

    protected  String id;

    protected String href;

    protected String name;

    protected String version;


    public CategoryRef() {
    }

    public CategoryRef(String id, String href, String name, String version) {
        this.id = id;
        this.href = href;
        this.name = name;
        this.version = version;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "CategoryRef{" +
                "id='" + id + '\'' +
                ", href='" + href + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
