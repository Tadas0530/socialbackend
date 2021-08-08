package com.example.socialmedia.dao;

import com.example.socialmedia.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "post", path = "posts")
public interface PostRepository extends JpaRepository<Post, Long> {

    Page<Post> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

}
