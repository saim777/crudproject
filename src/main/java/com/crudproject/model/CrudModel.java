package com.crudproject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "CrudModel")
public class CrudModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer randomNumber;
    private Integer courseId;
    private Date registrationDate;
}
