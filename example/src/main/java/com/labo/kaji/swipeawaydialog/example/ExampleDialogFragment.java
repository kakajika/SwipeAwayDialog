package com.labo.kaji.swipeawaydialog.example;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDialog;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.labo.kaji.swipeawaydialog.support.v4.SwipeAwayDialogFragment;

import java.util.Calendar;
import java.util.Random;

/**
 * @author kakajika
 * @since 15/08/15.
 */
public class ExampleDialogFragment extends SwipeAwayDialogFragment {

    private static final Random sRandom = new Random();

    private interface DialogBuilder {
        @NonNull Dialog create(Context context, ExampleDialogFragment fragment);
    }

    public enum Type implements DialogBuilder {
        APPCOMPAT() {
            @Override
            public @NonNull Dialog create(Context context, ExampleDialogFragment fragment) {
                return new android.support.v7.app.AlertDialog.Builder(context)
                        .setTitle("Title")
                        .setMessage("Message")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", null)
                        .create();
            }
        },
        APPCOMPAT_LIST() {
            @Override
            public @NonNull Dialog create(Context context, ExampleDialogFragment fragment) {
                return new android.support.v7.app.AlertDialog.Builder(context)
                        .setTitle("Title")
                        .setIcon(R.mipmap.ic_launcher)
                        .setItems(new String[]{
                                "Item 1",
                                "Item 2",
                                "Item 3",
                                "Item 4",
                                "Item 5",
                                "Item 6",
                                "Item 7",
                                "Item 8",
                                "Item 9",
                                "Item 10",
                        }, null)
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", null)
                        .create();
            }
        },
        DEFAULT() {
            @Override
            public @NonNull Dialog create(Context context, ExampleDialogFragment fragment) {
                return new AlertDialog.Builder(context)
                        .setTitle("Title")
                        .setMessage("Message")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", null)
                        .create();
            }
        },
        DEFAULT_LIST() {
            @Override
            public @NonNull Dialog create(Context context, ExampleDialogFragment fragment) {
                return new AlertDialog.Builder(context)
                        .setTitle("Title")
                        .setIcon(R.mipmap.ic_launcher)
                        .setItems(new String[]{
                                "Item 1",
                                "Item 2",
                                "Item 3",
                                "Item 4",
                                "Item 5",
                                "Item 6",
                                "Item 7",
                                "Item 8",
                                "Item 9",
                                "Item 10",
                        }, null)
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", null)
                        .create();
            }
        },
        PROGRESS() {
            @Override
            public @NonNull Dialog create(Context context, ExampleDialogFragment fragment) {
                ProgressDialog dialog = new ProgressDialog(context);
                dialog.setTitle("Title");
                dialog.setMessage("Message");
                return dialog;
            }
        },
        DATE() {
            @Override
            public @NonNull Dialog create(Context context, ExampleDialogFragment fragment) {
                final Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
                return new DatePickerDialog(context, null, year, month, day);
            }
        },
        TIME() {
            @Override
            public @NonNull Dialog create(Context context, ExampleDialogFragment fragment) {
                final Calendar c = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);
                return new TimePickerDialog(context, null, hour, minute, true);
            }
        },
        CUSTOM() {
            @Override
            public @NonNull Dialog create(Context context, ExampleDialogFragment fragment) {
                String[] urls = context.getResources().getStringArray(R.array.octocat_urls);
                AppCompatDialog dialog = new AppCompatDialog(context);
                dialog.setContentView(R.layout.dialog_custom);
                Glide.with(fragment)
                        .load(urls[sRandom.nextInt(urls.length)])
                        .into((ImageView) dialog.findViewById(R.id.customdialog_image));
                return dialog;
            }
        },
    }

    public static ExampleDialogFragment newInstance(Type type) {
        ExampleDialogFragment f = new ExampleDialogFragment();
        Bundle args = new Bundle();
        args.putSerializable("type", type);
        f.setArguments(args);
        return f;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Type type = (Type)getArguments().getSerializable("type");
        return type.create(getActivity(), this);
    }

}
