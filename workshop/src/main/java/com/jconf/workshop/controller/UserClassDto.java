package com.jconf.workshop.controller;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserClassDto{
    @NotEmpty
    private String code;
    @Size(max = 25)
    private String name;
    @Positive
    private int score;
}
