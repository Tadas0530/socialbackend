package com.example.socialmedia.dao;

import com.example.socialmedia.entity.Post;
import com.example.socialmedia.entity.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "postCategory", path = "post-category")
public interface PostCategory extends JpaRepository<ProductCategory, Long> {


}
