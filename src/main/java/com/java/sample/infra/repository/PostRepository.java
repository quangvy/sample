package com.java.sample.infra.repository;

import com.java.sample.infra.repository.entity.Author;
import com.java.sample.infra.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {



}
