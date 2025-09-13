package com.nithin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nithin.entity.Comment;
import com.nithin.entity.Post;

public interface CommentRepository extends JpaRepository<Comment, Integer>{
	
	public List<Comment> findByPost(Post post);
	
	List<Comment> findCommentsByPostId(Integer postId);

}

