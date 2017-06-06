package com.greenfox.exam.spring.models;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.stereotype.Component;

@Component
@Entity
public class QuestionList {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  @Column
 // @ElementCollection(targetClass = Question.class)
  @OneToMany (cascade = {CascadeType.ALL})
  public List<Question> questions = new ArrayList<>();

  public QuestionList() {
    questions = new ArrayList<>();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }
}
