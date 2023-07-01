package com.alperbekar.data.repository;

import com.alperbekar.data.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface IRoleRepository extends CrudRepository<RoleEntity,Long> {
}
