package com.himalaya.springboot.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyDto {

    private String name;
    private Integer age;

}
