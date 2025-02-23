package com.denzelcode.form.element;

import cn.nukkit.form.element.ElementSlider;
import com.denzelcode.form.window.IWindowForm;

public class Slider extends ElementSlider implements IElement {

    protected String name;

    protected transient IWindowForm form;

    protected float value;

    public Slider(IWindowForm form, String name, String text, float min, float max) {
        this(form, name, text, min, max, 1);
    }

    public Slider(IWindowForm form, String name, String text, float min, float max, int step) {
        this(form, name, text, min, max, step, 0);
    }

    public Slider(IWindowForm form, String name, String text, float min, float max, int step, float defaultValue) {
        super(text, min, max, step, defaultValue);

        if(min >= max) {
            throw new IllegalArgumentException("Maximum value can't be smaller or equal to the minimal value");
        }

        this.value = defaultValue;

        this.name = name;

        this.form = form;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public void setDefaultValue(float defaultValue) {
        if (defaultValue != getDefaultValue() && value == getDefaultValue()) setValue(defaultValue);

        super.setDefaultValue(defaultValue);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IWindowForm getForm() {
        return form;
    }
}
