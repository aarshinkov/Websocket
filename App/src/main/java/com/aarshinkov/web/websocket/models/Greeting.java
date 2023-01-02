package com.aarshinkov.web.websocket.models;

import java.io.Serializable;

/**
 *
 * @author Atanas Yordanov Arshinkov
 */
public class Greeting implements Serializable {
  
  private String content;

  public Greeting() {
  }

  public Greeting(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
