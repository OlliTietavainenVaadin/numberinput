package org.vaadin.olli;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.templatemodel.TemplateModel;

import javax.management.Notification;

@Tag("number-input")
@HtmlImport("bower_components/number-input/number-input.html")
public class NumberInput extends Component {

    public NumberInput() {
        this.getElement().synchronizeProperty("value", "input")
            .addSynchronizedPropertyEvent("keydown")
            .addSynchronizedPropertyEvent("blur")
            .addSynchronizedPropertyEvent("change");
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


}
