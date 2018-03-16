package com.bottle.user.repository;

import com.bottle.user.model.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface UserRepository extends CrudRepository<UsersEntity,UUID>{
}
