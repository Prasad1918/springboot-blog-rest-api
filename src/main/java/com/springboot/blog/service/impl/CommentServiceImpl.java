package com.springboot.blog.service.impl;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.repository.CommentRepositry;
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {



    //Create Reposiroty Here
     private CommentRepositry commentRepositry;
     private PostRepository postRepository;

    public CommentServiceImpl(CommentRepositry commentRepositry,PostRepository postRepository) {
        this.commentRepositry = commentRepositry;
        this.postRepository=postRepository;
    }

    @Override
    public CommentDto CreatComment(long postId, CommentDto CommentDto) {

        Comment Comment= MapToEntity(CommentDto);
        Post post=postRepository.findById(postId).orElseThrow(
                ()->new ResourceNotFoundException("Post","id",postId));

        Comment.setPost(post);
        //comment Entity to Db
       //Comment NewComment= CommentRepositry.save(Comment);
     Comment newComment=   commentRepositry.save(Comment);
        return mapToDTO(newComment);
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
       Comment.setName(CommentDto.getName());
       Comment.setEmail(CommentDto.getEmail());
       Comment.setBody(CommentDto.getBody());

return Comment;
    }
}
