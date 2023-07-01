package com.alperbekar.data.repository;

import com.alperbekar.data.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserEntity,Long> {
}
