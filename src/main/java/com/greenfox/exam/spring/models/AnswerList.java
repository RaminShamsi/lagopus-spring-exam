package com.greenfox.exam.spring.models;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.stereotype.Component;

@Component
@Entity
public class AnswerList {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  @Column
  // @ElementCollection(targetClass = Question.class)
  @OneToMany(cascade = {CascadeType.ALL})
  public List<Answer> answers = new ArrayList<>();

  public AnswerList() {
    answers = new ArrayList<>();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }
}
