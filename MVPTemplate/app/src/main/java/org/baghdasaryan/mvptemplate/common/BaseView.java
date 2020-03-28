package org.baghdasaryan.mvptemplate.common;

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
