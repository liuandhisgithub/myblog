package com.liu.myblog.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

@SolrDocument(collection = SolrAuthor.CODE)
public class SolrAuthor {
    public static final String CODE = "author";
    @Field("id")
    private int id;
    @Field("name")
    private String name;
    @Field("eMail")
    private String eMail;
    @Field("phone")
    private String phone;
    @Field("all")
    private List<String> all;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
