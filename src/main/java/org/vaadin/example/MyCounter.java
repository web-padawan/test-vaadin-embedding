package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;

public class MyCounter extends Div {
    private int count = 0;

    public MyCounter() {
        Button button = new Button("+1");
        button.addClickListener(e -> {
            count++;
            Notification.show("Count: " + count);
        });
        add(button);
    }
}
