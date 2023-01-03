package com.denzelcode.form.element;

import cn.nukkit.form.element.ElementButtonImageData;

public enum ImageType {
    PATH(ElementButtonImageData.IMAGE_DATA_TYPE_PATH),
    URL(ElementButtonImageData.IMAGE_DATA_TYPE_URL);

    private final String type;

    private ImageType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
