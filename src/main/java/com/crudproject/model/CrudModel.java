package com.crudproject.model;

import javax.persistence.*;

@Entity
@Table(name = "CrudModel")
public class CrudModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
