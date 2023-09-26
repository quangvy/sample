package com.java.sample.infra.repository;

import com.java.sample.infra.repository.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {



}
