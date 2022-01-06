package com.springboot.blog.repository;

<<<<<<< HEAD
public interface CommentRepository {

}
=======
import com.springboot.blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long>{}
>>>>>>> 8d7a2ce (06-01-22 Update)
