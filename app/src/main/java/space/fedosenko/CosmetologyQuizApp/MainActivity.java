package space.fedosenko.CosmetologyQuizApp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button btWrongAnswers;
    private TextView textView;
    private TextView textCorrect;
    private TextView textIncorrect;


    private int [] numbers = {1,2,3,4};
    int correctCount;
    int incorrectCount;
    boolean wrongAnswer=false;
    Question question;

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
        btWrongAnswers = findViewById(R.id.bt_wrong_answers);
        btWrongAnswers.setBackgroundColor(btWrongAnswers.getHighlightColor());
        btWrongAnswers.setTextColor(Color.BLACK);
        textView = findViewById(R.id.textView);
        textCorrect = findViewById(R.id.correct_count);
        textIncorrect= findViewById(R.id.incorrect_count);

        Model.getInstance().setQuestions();

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        btWrongAnswers.setOnClickListener(this);




        mix();
        //mix(button1, button2, button3, button4, textView);

    }


    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.bt1:
                if (numbers[0] == 1) {
                    correctAnswerAction();
                } else {
                    button1.setBackgroundColor(Color.RED);
                    incorrectAnswerAction();
                }
                break;
            case R.id.bt2:
                if (numbers[1] == 1) {
                    correctAnswerAction();
                } else {
                    button2.setBackgroundColor(Color.RED);
                    incorrectAnswerAction();
                }
                break;
            case R.id.bt3:
                if (numbers[2] == 1) {
                    correctAnswerAction();
                } else {
                    button3.setBackgroundColor(Color.RED);
                    incorrectAnswerAction();
                }
                break;
            case R.id.bt4:
                if (numbers[3] == 1) {
                    correctAnswerAction();
                } else {
                    button4.setBackgroundColor(Color.RED);
                    incorrectAnswerAction();
                }
                break;
            case R.id.bt_wrong_answers:
                if(!Model.getInstance().getMode())
                {
                     Model.getInstance().setWrongAnswersMode();//TODO add hidding text with answers left

                } else {
                    Model.getInstance().setNormalAnswersMode();
                }
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();




        }

    }


    @SuppressLint("ResourceAsColor")
    public void mix() {

        button1.setBackgroundColor(btWrongAnswers.getHighlightColor());
        button2.setBackgroundColor(btWrongAnswers.getHighlightColor());
        button3.setBackgroundColor(btWrongAnswers.getHighlightColor());
        button4.setBackgroundColor(btWrongAnswers.getHighlightColor());
        button1.setTextColor(Color.BLACK);
        button2.setTextColor(Color.BLACK);
        button3.setTextColor(Color.BLACK);
        button4.setTextColor(Color.BLACK);


        wrongAnswer=false;


                    shuffle();

        if(Model.getInstance().hasMore()){
            question = Model.getInstance().getNextQuestion();
        } else {

        }


        //Question question = new Question("Question","correct A","inc 1",  "ince 2", "ince 3");
        TextView percent = findViewById(R.id.t_percent);
        if(Model.getInstance().getMode()){
            btWrongAnswers.setText("go to all questions");
            percent.setText("Wrong questions left: "+Model.getInstance().wrongQuestionsLeft());
        } else {
            btWrongAnswers.setText("Fix my wrong answers");
            int intPer;
            if (incorrectCount!=0){

                intPer = (int)(100*correctCount/(incorrectCount+correctCount));
                percent.setText(""+intPer+" %");
            }
        }




            textView.setText(question.getQuestion());

            button1.setText(question.getAnswer(numbers[0]));
            button2.setText(question.getAnswer(numbers[1]));
            button3.setText(question.getAnswer(numbers[2]));
            button4.setText(question.getAnswer(numbers[3]));



    }
    public void correctAnswerAction(){
        if (!wrongAnswer) {
            correctCount++;
            textCorrect.setText(""+correctCount);

        }
        if(numbers[0] == 1){
            button1.setBackgroundColor(Color.GREEN);

        } else if(numbers[1] == 1){
            button2.setBackgroundColor(Color.GREEN);
        } else if(numbers[2] == 1){
            button3.setBackgroundColor(Color.GREEN);
        } else if(numbers[3] == 1){
            button4.setBackgroundColor(Color.GREEN);
        }
        mix();



    }

    public void incorrectAnswerAction(){
        if(!wrongAnswer){
            Model.getInstance().addWrongAnswer(question);
            incorrectCount++;
            textIncorrect.setText(""+incorrectCount);
            if(numbers[0] == 1){
                button1.setBackgroundColor(Color.GREEN);
            } else if(numbers[1] == 1){
                button2.setBackgroundColor(Color.GREEN);
            } else if(numbers[2] == 1){
                button3.setBackgroundColor(Color.GREEN);
            } else if(numbers[3] == 1){
                button4.setBackgroundColor(Color.GREEN);
            }
            wrongAnswer=true;
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

}