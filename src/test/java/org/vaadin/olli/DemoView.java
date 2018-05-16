package org.vaadin.olli;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Route("")
@Theme(value = Lumo.class)
@BodySize(height = "100vh", width = "100vh")
public class DemoView extends Div {

    public DemoView() {
        final NumberInput numberInput = new NumberInput();
        numberInput.setPlaceholder("Number");
        numberInput.setStep(0.1);
        numberInput.setValue(10.0);
        add(new Label("Enter a value:"), numberInput);
        add(new Button("Check value from server side", e -> {
            Notification.show("" + numberInput.getValue(), 5000, Notification.Position.MIDDLE);
        }));
        numberInput.addValueChangeListener(e -> {
           Notification.show("Value changed", 5000, Notification.Position.BOTTOM_CENTER);
        });

    }
}
