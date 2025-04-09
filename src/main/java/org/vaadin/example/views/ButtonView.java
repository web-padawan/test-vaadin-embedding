package org.vaadin.example.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import org.vaadin.example.ViewExporter;

@Route("button-view")
public class ButtonView extends Div {
    private int counter = 0;

    public ButtonView() {
        Button button = new Button("Button");
        button.addClickListener(e -> {
            Notification.show("Test");
        });

        add(button);
    }

    public static class Exporter extends ViewExporter<ButtonView> {
    }
}
