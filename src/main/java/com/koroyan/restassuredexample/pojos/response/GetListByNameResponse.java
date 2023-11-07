package com.koroyan.restassuredexample.pojos.response;

import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(namespace = "http://tempuri.org")
@XmlRootElement(name = "GetListByNameResponse")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GetListByNameResponse {
    @XmlElement(name = "GetListByNameResult")
    private GetListByNameResult getListByNameResult;
//
//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
//    }
}
