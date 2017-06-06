package com.greenfox.exam.spring.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Question {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String question;

  public Question() {

  }

  public Question(String question) {
    this.question = question;
  }

  public Question(long id, String question) {
    this.id = id;
    this.question = question;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}
