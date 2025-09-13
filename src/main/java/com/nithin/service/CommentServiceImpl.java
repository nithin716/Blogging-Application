package com.nithin.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithin.entity.Comment;
import com.nithin.entity.Post;
import com.nithin.repository.CommentRepository;
import com.nithin.repository.PostRepository;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    // 1. Save new comment
    @Override
    public Comment addComment(Comment comment) {

       
        return commentRepository.save(comment); 
    }
    
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }


    // 2. Get comments by postId
    @Override
    public List<Comment> getCommentsByPostId(Integer postId) {

        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post Not Found"));

        return commentRepository.findByPost(post);
    }
}