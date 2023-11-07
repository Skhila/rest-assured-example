package com.koroyan.restassuredexample.pojos.response;

import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

import static com.koroyan.restassuredexample.data.CommonData.JSON_STYLE;

@XmlType(namespace = "http://tempuri.org")
@XmlRootElement(name = "GetListByNameResult")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GetListByNameResult {

    private List<PersonIdentification> personIdentification;

    @XmlElement(name = "PersonIdentification")
    public List<PersonIdentification> getPersonIdentification() {
        return personIdentification;
    }

}
