package com.greenfox.exam.spring.controllers;


import com.greenfox.exam.spring.models.Question;
import com.greenfox.exam.spring.models.QuestionList;
import com.greenfox.exam.spring.repository.QuestionListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  Question question;

  @Autowired
  QuestionList questionList;

  @Autowired
  QuestionListRepo questionListRepo;

  Question q1 = new Question("When did your course start?");
  Question q2 = new Question("What type of dog Barbi has?");

  @GetMapping("/questions")
  public Iterable getQuestion() {
    questionList.questions.add(q1);
    questionList.questions.add(q2);

    questionListRepo.save(questionList);

    return questionListRepo.findAll();
  }
}
