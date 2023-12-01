package com.jconf.workshop.model;

public record User(Long id, String code,
                   String name,
                   int score,
                   Settings settings){
}
