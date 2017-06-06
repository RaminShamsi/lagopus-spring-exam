package com.greenfox.exam.spring.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Project {


  long id;
  String project;

  public Project() {

  }

  public Project(long id, String project) {
    this.id = id;
    this.project = project;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }
}
