package org.baghdasaryan.mvptemplate.view;

import org.baghdasaryan.mvptemplate.presenter.BasePresenter;

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
