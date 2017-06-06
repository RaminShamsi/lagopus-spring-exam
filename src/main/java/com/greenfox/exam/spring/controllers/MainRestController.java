package com.greenfox.exam.spring.controllers;


import com.greenfox.exam.spring.models.Answer;
import com.greenfox.exam.spring.models.AnswerList;
import com.greenfox.exam.spring.models.ProjectList;
import com.greenfox.exam.spring.models.Question;
import com.greenfox.exam.spring.models.QuestionList;
import com.greenfox.exam.spring.models.Respond;
import com.greenfox.exam.spring.repository.AnswerListRepo;
import com.greenfox.exam.spring.repository.QuestionListRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainRestController {

  int[] index = new int[3];

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
  public QuestionList getQuestions() {
    questionList.questions.add(q1);
    questionList.questions.add(q2);
    questionList.questions.add(q3);
    questionList.questions.add(q4);
    questionList.questions.add(q5);
    questionList.questions.add(q6);
    questionList.questions.add(q7);
    questionList.questions.add(q8);
    questionListRepo.save(questionList);
    for (int i = 0; i < 3; i++) {
      int id = (int) (Math.random() * 7) + 1;
      questionList.questions.remove(questionList.questions.get(id));
      index[i] = id;
    }
    return questionList;
  }

  @Autowired
  Answer answer;

  @Autowired
  AnswerList answerList;

  @Autowired
  ProjectList projectList;

  @Autowired
  AnswerListRepo answerListRepo;

  RestTemplate restTemplate = new RestTemplate();

  Answer a1 = new Answer("2017.03.13");
  Answer a2 = new Answer("Whippet");
  Answer a3 = new Answer("Green");
  Answer a4 = new Answer("4");
  Answer a5 = new Answer("16");
  Answer a6 = new Answer("Vulpes");
  Answer a7 = new Answer("~3300");
  Answer a8 = new Answer("(Libra");


  @PostMapping("/answers")
  public ProjectList getAnswers() {
    answerList.answers.add(a1);
    answerList.answers.add(a2);
    answerList.answers.add(a3);
    answerList.answers.add(a4);
    answerList.answers.add(a5);
    answerList.answers.add(a6);
    answerList.answers.add(a7);
    answerList.answers.add(a8);

    answerListRepo.save(answerList);

    for (int i = 0; i < 3; i++) {
      answerList.answers.remove(index[i]);
    }

    restTemplate.postForObject("https://springexamserver.herokuapp.com/projects/eagles", answerList, Respond.class);

    return projectList;
  }
}
