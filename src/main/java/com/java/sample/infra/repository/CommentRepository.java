package com.java.sample.infra.repository;

import com.java.sample.infra.repository.entity.Comment;
import com.java.sample.infra.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {



}
