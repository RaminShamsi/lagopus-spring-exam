package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.models.Question;
import com.greenfox.exam.spring.models.QuestionList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionListRepo extends CrudRepository<QuestionList, Long> {

}
