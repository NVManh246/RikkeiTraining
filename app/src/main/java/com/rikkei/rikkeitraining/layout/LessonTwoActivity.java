package com.rikkei.rikkeitraining.layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.rikkei.rikkeitraining.R;

public class LessonTwoActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);
        initView();
    }

    private void initView() {
        tvContent = findViewById(R.id.tv_content);
        findViewById(R.id.button_clear).setOnClickListener(this);
        findViewById(R.id.button_red).setOnClickListener(this);
        findViewById(R.id.button_white).setOnClickListener(this);
        findViewById(R.id.button_blue).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_red:
                tvContent.setBackgroundColor(getResources().getColor(R.color.color_red));
                break;
            case R.id.button_white:
                tvContent.setBackgroundColor(getResources().getColor(R.color.color_white));
                break;
            case R.id.button_blue:
                tvContent.setBackgroundColor(getResources().getColor(R.color.color_blue));
                break;
            case R.id.button_clear:
                tvContent.setBackgroundColor(getResources().getColor(R.color.color_black));
                break;
        }
    }
}
