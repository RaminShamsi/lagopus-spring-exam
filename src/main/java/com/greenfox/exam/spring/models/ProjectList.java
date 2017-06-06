package com.greenfox.exam.spring.models;

import java.util.ArrayList;
import java.util.List;


public class ProjectList {

  public List<Project> projects = new ArrayList<>();

  public ProjectList(){
    projects = new ArrayList<>();
  }

  public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }
}
