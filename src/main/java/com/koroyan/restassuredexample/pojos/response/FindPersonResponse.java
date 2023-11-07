package com.koroyan.restassuredexample.pojos.response;

import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "FindPersonResponse")
@XmlType(namespace = "http://tempuri.org")
@ToString
public class FindPersonResponse {
    private FindPersonResult findPersonResult;

    public FindPersonResponse(){}

    public FindPersonResponse(FindPersonResult findPersonResult) {
        this.findPersonResult = findPersonResult;
    }

    @XmlElement(name = "FindPersonResult")
    public FindPersonResult getFindPersonResult() {
        return findPersonResult;
    }

    public void setFindPersonResult(FindPersonResult findPersonResult) {
        this.findPersonResult = findPersonResult;
    }
}
