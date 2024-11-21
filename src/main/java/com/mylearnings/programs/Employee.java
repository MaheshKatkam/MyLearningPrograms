package com.mylearnings.programs;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Employee {

    private Integer id;
    private String name;
    private String phoneNumber;
    private String email;
    private Integer salary;
    private String dept;


}
