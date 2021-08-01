package com.amiriskhakov.spring.fullstackapp.repository;

import com.amiriskhakov.spring.fullstackapp.entity.Comment;
import com.amiriskhakov.spring.fullstackapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPost(Post post);

    Comment findByIdAndUserId(Long postId, Long userId);


}
