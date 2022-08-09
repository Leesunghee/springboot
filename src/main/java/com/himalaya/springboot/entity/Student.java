package com.himalaya.springboot.entity;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.regex.Pattern;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Student {

    private String name;
    private Integer age;
    private Grade grade;

    private static final Pattern PATTERN = Pattern.compile("::::");

    public void print() {
        String name = "name::::test";
        String[] split = PATTERN.split(name);
    }

    public enum Grade {
        A, B, C
    }
}
