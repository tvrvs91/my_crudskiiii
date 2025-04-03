package com.example.demo.DTO;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CatDTO {
    //имя котика
    String name;


    int weight;


    int age;
}
