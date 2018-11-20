package com.idn.avocadocode.quizallaboutislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.idn.avocadocode.quizallaboutislam.Quiz1.Quiz1Sub1.MainQuizActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void start_quiz_onclick(View view) {
        Intent intent = new Intent(HomeActivity.this,MainQuizActivity.class);
        startActivity(intent);
    }

    public void btn_tomainlearnsession(View view) {
        Intent intent = new Intent(HomeActivity.this,NothingActivity.class);
        startActivity(intent);
    }
}
