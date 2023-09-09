package com.blogapi.repository;

import com.blogapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PostRepository  extends JpaRepository<Post, Long> {


    <T> Optional<T> findById(long postId);

}
