package space.fedosenko.CosmetologyQuizApp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Spinner spinner;

    private TextView textView;
    private TextView textCorrect;
    private TextView textIncorrect;
    private TextView textLeft;
    private LinearLayout answersLayout;
    private ArrayList<String> testNames;

    private int [] numbers = {1,2,3,4};
    int correctCount;
    int incorrectCount;
    boolean wrongAnswer=false;
    Question question;
    private int wrongAnswerColor;
    private int correctAnswerColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        button1 = findViewById(R.id.bt1);
        button2 = findViewById(R.id.bt2);
        button3 = findViewById(R.id.bt3);
        button4 = findViewById(R.id.bt4);

        spinner = findViewById(R.id.spinner);
        answersLayout = findViewById(R.id.answers);


        correctAnswerColor = Color.rgb(153, 204, 0);
        wrongAnswerColor = Color.rgb(235,108,3);


        textView = findViewById(R.id.textView);
        textCorrect = findViewById(R.id.correct_count);
        textIncorrect= findViewById(R.id.incorrect_count);
        textLeft = findViewById(R.id.tx_questions_left);
        Model.getInstance();

        Model.getInstance().shareContext(this);

        testNames = Model.getInstance().getTestNames();
        Model.getInstance().setTest(testNames.get(0));


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, testNames);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        mix();


    }


    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.bt1:
                if (numbers[0] == 1) {
                    button1.setBackgroundColor(correctAnswerColor);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctAnswerAction();
                        }
                    }, 300);

                } else {
                    button1.setBackgroundColor(wrongAnswerColor);
                    incorrectAnswerAction();
                }
                break;
            case R.id.bt2:
                if (numbers[1] == 1) {
                    button2.setBackgroundColor(correctAnswerColor);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctAnswerAction();
                        }
                    }, 300);
                } else {
                    button2.setBackgroundColor(wrongAnswerColor);
                    incorrectAnswerAction();
                }
                break;
            case R.id.bt3:
                if (numbers[2] == 1) {
                    button3.setBackgroundColor(correctAnswerColor);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctAnswerAction();
                        }
                    }, 300);
                } else {
                    button3.setBackgroundColor(wrongAnswerColor);
                    incorrectAnswerAction();
                }
                break;
            case R.id.bt4:
                if (numbers[3] == 1) {
                    button4.setBackgroundColor(correctAnswerColor);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctAnswerAction();
                        }
                    }, 300);
                } else {
                    button4.setBackgroundColor(wrongAnswerColor);
                    incorrectAnswerAction();
                }
                break;
        }

    }



    public void mix() {

        button1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        button2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        button3.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        button4.setBackgroundColor(getResources().getColor(R.color.colorPrimary));



        wrongAnswer=false;
        shuffle();

        if(Model.getInstance().hasMore()){
            question = Model.getInstance().getNextQuestion();
            textLeft.setText(""+Model.getInstance().questionsLeft());
            TextView percent = findViewById(R.id.t_percent);
            if(Model.getInstance().getMode()){

                percent.setText("Wrong questions left: "+Model.getInstance().wrongQuestionsLeft());
            } else {

                int intPer;
                if (incorrectCount!=0){

                    intPer = 100*correctCount/(incorrectCount+correctCount);
                    percent.setText(""+intPer+" %");
                }
            }
            textView.setText(question.getQuestion());

            button1.setText(question.getAnswer(numbers[0]));
            button2.setText(question.getAnswer(numbers[1]));
            button3.setText(question.getAnswer(numbers[2]));
            button4.setText(question.getAnswer(numbers[3]));
        } else {
            questionsEndedAction();
        }

    }


    public void questionsEndedAction(){
        answersLayout.setVisibility(View.INVISIBLE);
        textView.setText("Great Job! It looks like there's no questions left in this section. Please choose another test or repeat this one.");
        spinner.performClick();

    }
    public void correctAnswerAction(){
        if (!wrongAnswer) {

            correctCount++;
            textCorrect.setText(""+correctCount);



        }
        mix();



    }

    public void incorrectAnswerAction(){
        if(!wrongAnswer){
            Model.getInstance().addWrongAnswer(question);
            incorrectCount++;
            textIncorrect.setText(""+incorrectCount);
            wrongAnswer=true;
            if(numbers[0]==1){
                button1.setBackgroundColor(correctAnswerColor);
            } else if (numbers[1]==1){
                button2.setBackgroundColor(correctAnswerColor);
            }else if (numbers[2]==1){
                button3.setBackgroundColor(correctAnswerColor);
            }
            else if (numbers[3]==1){
                button4.setBackgroundColor(correctAnswerColor);
            }
        }



    }

    private void shuffle() { //mixes the buttons showed on the screen


        Random random = new Random();
        for (int i = 0; i < random.nextInt(20); i++) {
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = numbers[2];
            numbers[2] = numbers[3];
            numbers[3] = temp;

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        clearStat();

        answersLayout.setVisibility(View.VISIBLE);
        Model.getInstance().setTest(testNames.get(position));

        mix();


    }
    public void clearStat(){
        correctCount=0;
        incorrectCount=0;

        textCorrect.setText(""+correctCount);
        textIncorrect.setText(""+incorrectCount);
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}