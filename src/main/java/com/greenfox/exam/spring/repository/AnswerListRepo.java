package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.models.AnswerList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnswerListRepo extends CrudRepository<AnswerList, Long> {

}
