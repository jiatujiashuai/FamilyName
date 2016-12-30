package com.lilin.familyname.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.lilin.familyname.R;
import com.lilin.familyname.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    @BindView(R.id.tv_father)
    TextView tvFather;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

}
