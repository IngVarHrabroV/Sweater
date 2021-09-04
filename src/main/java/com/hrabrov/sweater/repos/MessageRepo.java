package com.hrabrov.sweater.repos;

import com.hrabrov.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {

}
