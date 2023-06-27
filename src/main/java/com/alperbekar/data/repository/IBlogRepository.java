package com.alperbekar.data.repository;

import com.alperbekar.data.entity.BlogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends CrudRepository<BlogEntity,Long> {
}
