package com.crudproject.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Builder
@Getter
@ToString
public class ResponseCrudModelDto {
    private String firstName;
    private String lastName;
    private String email;
    private Integer randomNumber;
    private Integer courseId;
    private Date registrationDate;

}
