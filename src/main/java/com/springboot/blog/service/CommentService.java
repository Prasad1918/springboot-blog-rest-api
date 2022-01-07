package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

public interface CommentService {

    CommentDto CreatComment(long postId,CommentDto  CommentDto);
}
