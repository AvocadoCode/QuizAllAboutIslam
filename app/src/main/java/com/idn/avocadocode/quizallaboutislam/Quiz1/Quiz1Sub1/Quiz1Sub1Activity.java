package com.idn.avocadocode.quizallaboutislam.Quiz1.Quiz1Sub1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.idn.avocadocode.quizallaboutislam.R;

public class Quiz1Sub1Activity extends AppCompatActivity {

    private QuestionBankQuiz1Sub1 mQuestionLibrary = new QuestionBankQuiz1Sub1();
    private TextView mScoreView;   // Untuk menampilkan skor saat ini
    private TextView mQuestionView;  //menampilkan jawaban
    private Button mButtonChoice1; // jawaban 1
    private Button mButtonChoice2; // jawaban 2
    private Button mButtonChoice3; //jawaban 3
    private Button mButtonChoice4; //jawaban 4

    private String mAnswer;  // untuk cek jawaban benar atau tidaknya
    private int mScore = 0;  // current total score
    private int mQuestionNumber = 0; //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiz1sub1);
        //
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.text_pertanyaan);
        mButtonChoice1 = (Button)findViewById(R.id.txt_pertanyaanpertama);
        mButtonChoice2 = (Button)findViewById(R.id.txt_pertanyaankedua);
        mButtonChoice3 = (Button)findViewById(R.id.txt_pertanyaanketiga);
        mButtonChoice4 = (Button)findViewById(R.id.txt_pertanyaankeempat);
        updateQuestion();

        updateScore(mScore);
    }

    private void updateQuestion(){
        //
        if(mQuestionNumber<mQuestionLibrary.getLength() ){


            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber,4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else {
            Toast.makeText(Quiz1Sub1Activity.this, "Barakallah ini adalah hasil dari Quiz!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Quiz1Sub1Activity.this, Quiz1Sub1HasilActivity.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            startActivity(intent);
        }
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore+"/"+mQuestionLibrary.getLength());
    }

    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswer){
            mScore = mScore + 1;
            Toast.makeText(Quiz1Sub1Activity.this, "Masya Allah!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(Quiz1Sub1Activity.this, "Subhanallah", Toast.LENGTH_SHORT).show();

        updateScore(mScore);
        updateQuestion();
    }
}