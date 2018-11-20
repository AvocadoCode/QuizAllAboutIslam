package com.idn.avocadocode.quizallaboutislam.Quiz1.Quiz1Sub1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.idn.avocadocode.quizallaboutislam.HomeActivity;
import com.idn.avocadocode.quizallaboutislam.NothingActivity;
import com.idn.avocadocode.quizallaboutislam.R;

public class MainQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainquiz);
    }

    public void btn_tomainquiz1(View view) {
        Intent intent = new Intent(MainQuizActivity.this,Quiz1MainActivity.class);
        startActivity(intent);
    }

    public void btn_tomainquiz2(View view) {
        Intent intent = new Intent(MainQuizActivity.this,NothingActivity.class);
        startActivity(intent);
    }

}
