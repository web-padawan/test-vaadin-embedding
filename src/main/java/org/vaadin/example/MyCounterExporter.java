package org.vaadin.example;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;
import com.vaadin.flow.theme.Theme;

@Theme("my-theme")
public class MyCounterExporter extends WebComponentExporter<MyCounter> {
  public MyCounterExporter() {
    super("my-counter");
  }

  protected void configureInstance(WebComponent<MyCounter> webComponent, MyCounter component) {

  };
}

