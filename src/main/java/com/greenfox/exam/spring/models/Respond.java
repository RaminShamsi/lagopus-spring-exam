package com.greenfox.exam.spring.models;

/**
 * Created by HP on 6/6/2017.
 */
public class Respond {

  private String status;

  public Respond() {

  }

  public Respond(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
