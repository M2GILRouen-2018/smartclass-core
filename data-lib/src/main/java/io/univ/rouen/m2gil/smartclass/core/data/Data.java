package io.univ.rouen.m2gil.smartclass.core.data;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected Long dataProviderId;


    protected String value;

    protected Date DateTime;

    public Long getId() {
        return id;
    }

    public Long getDataProviderId() {
        return dataProviderId;
    }

    public String getValue() {
        return value;
    }

    public Date getDateTime() {
        return DateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataProviderId(Long dataProviderId) {
        this.dataProviderId = dataProviderId;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setDateTime(Date dateTime) {
        DateTime = dateTime;
    }
}
