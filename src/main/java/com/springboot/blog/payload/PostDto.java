package com.springboot.blog.payload;

import lombok.Data;

import java.math.BigInteger;

@Data
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;
    private BigInteger phone;

}
