package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto CreatComment(long postId,CommentDto  CommentDto);
    List<CommentDto> getAllCommentsById(long postId);
}
