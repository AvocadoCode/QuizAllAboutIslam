package com.idn.avocadocode.quizallaboutislam.Quiz1.Quiz1Sub1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.idn.avocadocode.quizallaboutislam.HomeActivity;
import com.idn.avocadocode.quizallaboutislam.NothingActivity;
import com.idn.avocadocode.quizallaboutislam.R;

public class Quiz1MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1_main);
    }

    public void btn_tointroquiz1sub1(View view) {
        Intent intent = new Intent(Quiz1MainActivity.this,Quiz1Sub1Activity.class);
        startActivity(intent);
    }

    public void btn_tointroquiz1sub2(View view) {
        Intent intent = new Intent(Quiz1MainActivity.this,NothingActivity.class);
        startActivity(intent);
    }



}
