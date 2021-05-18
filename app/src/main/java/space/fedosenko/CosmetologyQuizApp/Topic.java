package space.fedosenko.CosmetologyQuizApp;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Topic implements Serializable {
    private String name;
    private ArrayList<Question> questions;

    public Topic(String name, ArrayList<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    public Topic(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    public void addQuestion(Question question){
        questions.add(question);
    }

}
