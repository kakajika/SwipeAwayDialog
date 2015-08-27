package com.labo.kaji.swipeawaydialog.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.labo.kaji.swipeawaydialog.example.ExampleDialogFragment.Type;

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

    @OnClick(R.id.button_alert)
    void onShowAlertDialog() {
        ExampleDialogFragment.newInstance(Type.ALERT).show(getSupportFragmentManager(), "alert");
    }

    @OnClick(R.id.button_list)
    void onShowListDialog() {
        ExampleDialogFragment.newInstance(Type.LIST).show(getSupportFragmentManager(), "list");
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

    @OnClick(R.id.button_holo)
    void onShowHoloDialog() {
        ExampleDialogFragment.newInstance(Type.HOLO).show(getSupportFragmentManager(), "holo");
    }

}
