package com.amiriskhakov.spring.fullstackapp.repository;

import com.amiriskhakov.spring.fullstackapp.entity.Post;
import com.amiriskhakov.spring.fullstackapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByUserOrderByCreateDateDesc(User user);

    List<Post> findAllByOrderByCreateDateDesc();

    Optional<Post> findPostByIdAndUser(Long id, User user);
}

