package com.example.kuba.historicalquizandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;

    TextView score, question;

    private Questions mQuestions = new Questions();

    private String Answer;

    private int Score = 0;

    private int mQuestionsLenght = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button)findViewById(R.id.answer1);
        answer2 = (Button)findViewById(R.id.answer2);
        answer3 = (Button)findViewById(R.id.answer3);
        answer4 = (Button)findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Punkty: "+ Score);

        updateQuestion(r.nextInt(mQuestionsLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText()==Answer){
                    Score++;
                    score.setText("Punkty: "+ Score);
                    updateQuestion(r.nextInt(mQuestionsLenght));

                }else {
                    gameOver();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText()==Answer){
                    Score++;
                    score.setText("Punkty: "+ Score);
                    updateQuestion(r.nextInt(mQuestionsLenght));

                }else {
                    gameOver();
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText()==Answer){
                    Score++;
                    score.setText("Punkty: "+ Score);
                    updateQuestion(r.nextInt(mQuestionsLenght));

                }else {
                    gameOver();
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText()==Answer){
                    Score++;
                    score.setText("Punkty: "+ Score);
                    updateQuestion(r.nextInt(mQuestionsLenght));

                }else {
                    gameOver();
                }

            }
        });
    }

        private void updateQuestion(int number){
            question.setText(mQuestions.getQuestion(number));
            answer1.setText(mQuestions.getChoice1(number));
            answer2.setText(mQuestions.getChoice2(number));
            answer3.setText(mQuestions.getChoice3(number));
            answer4.setText(mQuestions.getChoice4(number));

            Answer = mQuestions.getCorrectAnswer(number);

    }
        private void gameOver(){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("Koniec gry, Twój wynik to: "+Score+" punktów.")
                                .setCancelable(false)
                                .setPositiveButton("Nowa Gra",
                                        new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                                finish();
                                    }
                                })
                                .setNegativeButton("Wyjdź",
                                    new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
    }

