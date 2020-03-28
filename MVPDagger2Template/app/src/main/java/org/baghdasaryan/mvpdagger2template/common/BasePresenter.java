package org.baghdasaryan.mvpdagger2template.common;

public interface BasePresenter<T> {
    void takeView(T view);
    void dropView();
}
