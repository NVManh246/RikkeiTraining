package com.rikkei.rikkeitraining.layout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.rikkei.rikkeitraining.R;


public class LessonOneActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup rgColor;
    private TextView tvContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);
        initView();
    }

    private void initView() {
        findViewById(R.id.button_set_color).setOnClickListener(this);
        findViewById(R.id.button_clear).setOnClickListener(this);
        rgColor = findViewById(R.id.rgColor);
        tvContent = findViewById(R.id.tv_content);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_set_color:
                setColor();
                break;
            case R.id.button_clear:
                clearColor();
                break;
        }
    }

    private void setColor() {
        switch (rgColor.getCheckedRadioButtonId()) {
            case R.id.rbRed:
                tvContent.setTextColor(getResources().getColor(R.color.color_red));
                break;
            case R.id.rbWhite:
                tvContent.setTextColor(getResources().getColor(R.color.color_white));
                break;
            case R.id.rbBlue:
                tvContent.setTextColor(getResources().getColor(R.color.color_blue));
                break;
        }
    }

    @SuppressLint("ResourceAsColor")
    private void clearColor() {
        tvContent.setTextColor(getResources().getColor(R.color.color_black));
    }
}
