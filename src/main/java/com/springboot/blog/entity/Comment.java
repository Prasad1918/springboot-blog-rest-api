package com.springboot.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.PrivateKey;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "commnets")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    private String email;
    private String body;

    @ManyToOne(fetch =FetchType.LAZY)
    //here many is comment one is post I.e one post has multiple comments like that
    @JoinColumn(name = "post_id",nullable = false)//post_id is foreign key
    private   Post post;
}
