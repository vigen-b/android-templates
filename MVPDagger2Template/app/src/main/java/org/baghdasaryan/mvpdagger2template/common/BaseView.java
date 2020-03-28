package org.baghdasaryan.mvpdagger2template.common;

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
