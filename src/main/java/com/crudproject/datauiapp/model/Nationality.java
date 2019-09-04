package com.crudproject.datauiapp.model;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Slf4j
@Getter
@Setter
@Entity
public class Nationality {

    @Id
    private Integer Id;
    private String name;
    private String capital;
    private String updatedBy;

    @DateTimeFormat(pattern="yyyy-MM-dd")

    private Date updatedOn;

    public Nationality(Integer Id, String name, String capital, String updatedBy, Date updatedOn) {
        this.Id = Id;
        this.name = name;
        this.capital = capital;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Nationality(){}
}
