package com.crudproject.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class CrudModelDto {
   private String firstName;
   private String lastName;
   private String email;
   private Integer courseId;
}
