package com.abhiram.db.repository;

import com.abhiram.db.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {
}

