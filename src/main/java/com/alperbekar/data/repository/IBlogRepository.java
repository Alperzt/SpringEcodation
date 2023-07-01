package com.alperbekar.data.repository;

import com.alperbekar.data.entity.BlogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// http://localhost:2222/h2-console
@Repository
public interface IBlogRepository extends CrudRepository<BlogEntity,Long> {
    // Delivered Query
    BlogEntity findBlogEntityByHeader(String header);
    // @Query
}