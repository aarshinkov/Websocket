package com.aarshinkov.web.websocket.models;

import java.io.Serializable;

/**
 *
 * @author Atanas Yordanov Arshinkov
 */
public class HelloMessage implements Serializable {

  private String name;

  public HelloMessage() {
  }

  public HelloMessage(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
