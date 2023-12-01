package com.jconf.workshop.controller;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record UserRecordDto(@NotEmpty String code,
                            @Size(max = 25) String name,
                            @Positive int score){
}
