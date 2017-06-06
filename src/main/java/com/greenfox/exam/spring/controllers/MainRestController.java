package com.greenfox.exam.spring.controllers;


import com.greenfox.exam.spring.models.Question;
import com.greenfox.exam.spring.models.QuestionList;
import com.greenfox.exam.spring.repository.QuestionListRepo;
import java.util.ArrayList;
import java.util.List;
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
  Question q3 = new Question("What is HerrNorbert's favourite color?");
  Question q4 = new Question("How many classes are learning at Green Fox Academy at this moment?");
  Question q5 = new Question("How many mentors teach at Green Fox at this moment?");
  Question q6 = new Question("What was the name of the first Green Fox class?");
  Question q7 = new Question("How many likes do we have on facebook?");
  Question q8 = new Question("What is Tojas's horoscope?");


  @GetMapping("/questions")
  public ArrayList getQuestions() {
    questionList.questions.add(q1);
    questionList.questions.add(q2);
    questionList.questions.add(q3);
    questionList.questions.add(q4);
    questionList.questions.add(q5);
    questionList.questions.add(q6);
    questionList.questions.add(q7);
    questionList.questions.add(q8);
    questionListRepo.save(questionList);
    ArrayList random = new ArrayList();
    for (int i = 0; i < 5; i++) {
      int id = (int) (Math.random() * 7) + 1;
      random.add(questionListRepo.findOne(1L).getQuestions().get(id));
    }
    return random;
  }
}
