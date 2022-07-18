package com.himalaya.springboot.entity;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Student {

    private String name;
    private Integer age;
    private Grade grade;

    public enum Grade {
        A, B, C
    }
}
