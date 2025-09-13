package com.nithin.service;

import java.util.List;

import com.nithin.entity.Comment;

public interface CommentService {
	
	public Comment addComment(Comment comment);
	
    public List<Comment> getCommentsByPostId(Integer postId);

	public List<Comment> getAllComments();

}
