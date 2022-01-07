package com.springboot.blog.service.impl;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.repository.CommentRepositry;
import com.springboot.blog.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {



    //Create Reposiroty Here
     private CommentRepositry CommentRepositry;

    public CommentServiceImpl(CommentRepositry commentRepositry) {
        this.CommentRepositry = commentRepositry;
    }

    @Override
    public CommentDto CreatComment(long postId, CommentDto CommentDto) {
        return null;
    }
//Map to Dto to Entity
    private CommentDto mapToDTO(Comment Comment){
CommentDto  CommentDto =new CommentDto();
        CommentDto.setId(Comment.getId());
        CommentDto.setName(Comment.getName());
        CommentDto.setEmail(Comment.getEmail());
         CommentDto.setBody(Comment.getBody());
          return  CommentDto;
    }
    //Map Entity to Dto

    private  Comment MapToEntity(CommentDto CommentDto ){
       Comment Comment =new Comment();
       Comment.setId(CommentDto.getId());

return Comment;
    }
}
