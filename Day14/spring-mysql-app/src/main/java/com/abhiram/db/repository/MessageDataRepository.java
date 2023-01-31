package com.abhiram.db.repository;

import com.abhiram.db.model.Message;
import com.abhiram.db.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}

