package org.vaadin.example.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.ViewExporter;

@Route("button-view")
public class ButtonView extends Div {
    private int counter = 0;

    public ButtonView() {
        Button button = new Button("Button");
        Paragraph info = new Paragraph(infoText());
        button.addClickListener(clickEvent -> {
            counter += 1;
            info.setText(infoText());
        });

        HorizontalLayout horizontalLayout = new HorizontalLayout(button, info);
        horizontalLayout.setAlignItems(FlexComponent.Alignment.BASELINE);
        add(horizontalLayout);
    }

    private String infoText() {
        return String.format("Clicked %d times", counter);
    }

    public static class Exporter extends ViewExporter<ButtonView> {
    }
}
