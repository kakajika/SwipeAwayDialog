package com.labo.kaji.swipeawaydialog.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.labo.kaji.swipeawaydialog.example.ExampleDialogFragment.Type;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author kakajika
 * @since 15/08/15.
 */
public class ExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_appcompat_alert)
    void onShowAppCompatAlertDialog() {
        ExampleDialogFragment.newInstance(Type.APPCOMPAT).show(getSupportFragmentManager(), "alert");
    }

    @OnClick(R.id.button_appcompat_list)
    void onShowAppCompatListDialog() {
        ExampleDialogFragment.newInstance(Type.APPCOMPAT_LIST).show(getSupportFragmentManager(), "list");
    }

    @OnClick(R.id.button_default_alert)
    void onShowDefaultAlertDialog() {
        ExampleDialogFragment.newInstance(Type.DEFAULT).show(getSupportFragmentManager(), "alert");
    }

    @OnClick(R.id.button_default_list)
    void onShowDefaultListDialog() {
        ExampleDialogFragment.newInstance(Type.DEFAULT_LIST).show(getSupportFragmentManager(), "list");
    }

    @OnClick(R.id.button_progress)
    void onShowProgressDialog() {
        ExampleDialogFragment.newInstance(Type.PROGRESS).show(getSupportFragmentManager(), "progress");
    }

    @OnClick(R.id.button_date)
    void onShowDateDialog() {
        ExampleDialogFragment.newInstance(Type.DATE).show(getSupportFragmentManager(), "date");
    }

    @OnClick(R.id.button_time)
    void onShowTimeDialog() {
        ExampleDialogFragment.newInstance(Type.TIME).show(getSupportFragmentManager(), "time");
    }

    @OnClick(R.id.button_custom)
    void onShowCustomDialog() {
        ExampleDialogFragment.newInstance(Type.CUSTOM).show(getSupportFragmentManager(), "custom");
    }

}
