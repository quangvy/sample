package com.java.sample.controller;

import com.java.sample.infra.repository.CommentRepository;
import com.java.sample.infra.repository.PostRepository;
import com.java.sample.infra.repository.entity.Author;
import com.java.sample.infra.repository.entity.Comment;
import com.java.sample.infra.repository.entity.Post;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@Log4j2
@Validated
public class SampleController {

  @Autowired
  private PostRepository postRepo;

  @Autowired
  private CommentRepository commentRepo;

  @PostMapping("createPost")
  public void createPost() {
    Author author = Author.builder().name("Alex").build();
    Post firstPost = Post.builder().author(author).title("New Story").build();
    postRepo.save(firstPost);
  }

  @PostMapping("create2PostWithAuthor")
  public void createPostWithAuthor(@RequestParam String post1Title, String post2Title, String authorName )
  {
    Author author = Author.builder().name(authorName).build();
    Post post1 = Post.builder().author(author).title(post1Title).build();
    postRepo.save(post1);

    Comment comment = Comment.builder().content(post1.getTitle() + " comment").post(post1).build();
    commentRepo.save(comment);

    log.info(author.getFriendlyName());

    Post post2 = Post.builder().author(author).title(post2Title).build();
    postRepo.save(post2);

  }

}