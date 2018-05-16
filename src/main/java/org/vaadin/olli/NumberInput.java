package org.vaadin.olli;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.templatemodel.TemplateModel;

import javax.management.Notification;

@Tag("number-input")
@HtmlImport("bower_components/number-input/number-input.html")
public class NumberInput extends Component {

    public NumberInput() {
        this.getElement().synchronizeProperty("value", "value-changed");
    }

    public void setValue(Double value) {
        getElement().setProperty("value", value);
    }

    public Double getValue() {
        return getElement().getProperty("value", 0.0);
    }

    public String setPlaceholder(String placeholder) {
        return getElement().getProperty("placeholder", "");
    }

    public String getPlaceholder() {
        return getElement().getProperty("placeholder", "");
    }

    public Double getStep() {
        return getElement().getProperty("step", 0.0);
    }

    public void setStep(Double step) {
        getElement().setProperty("step", step);
    }


    @DomEvent("value-changed")
    public static class ValueChangeEvent extends ComponentEvent<NumberInput> {

        /**
         * Creates a new event using the given source and indicator whether the event originated from the client side or the server side.
         *
         * @param source
         *     the source component
         * @param fromClient
         *     <code>true</code> if the event originated from the client
         */
        public ValueChangeEvent(NumberInput source, boolean fromClient) {
            super(source, fromClient);
        }
    }

    public Registration addValueChangeListener(ComponentEventListener<ValueChangeEvent> listener) {
        return this.addListener(ValueChangeEvent.class, listener);
    }
}
