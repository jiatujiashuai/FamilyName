package com.lilin.familyname.ui;

import com.lilin.familyname.base.BasePresenter;
import com.lilin.familyname.base.BaseView;

/**
 * Created by lilin on 2016/12/29.
 */

public interface MainContract {

    interface Presenter extends BasePresenter {

    }

    interface View extends BaseView<Presenter> {

    }

}
