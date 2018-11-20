package com.idn.avocadocode.quizallaboutislam.Quiz1.Quiz1Sub1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.idn.avocadocode.quizallaboutislam.R;

public class Quiz1Sub1HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1sub1hasil);

        TextView txtScore = (TextView) findViewById(R.id.txt_angka_hasil);
        TextView txtHighScore = (TextView) findViewById(R.id.txt_angka_hasil_highscore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("" + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText(""+highscore);
        else
        {
            txtHighScore.setText(""+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(Quiz1Sub1HasilActivity.this, Quiz1Sub1Activity.class);
        startActivity(intent);
    }
}

