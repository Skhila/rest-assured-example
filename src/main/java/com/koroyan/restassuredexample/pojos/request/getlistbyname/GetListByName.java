package com.koroyan.restassuredexample.pojos.request.getlistbyname;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://tempuri.org")
@XmlRootElement(name = "GetListByName")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetListByName {
    private String name;
}
