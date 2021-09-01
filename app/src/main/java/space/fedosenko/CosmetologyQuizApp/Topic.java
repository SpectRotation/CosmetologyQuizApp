package space.fedosenko.CosmetologyQuizApp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Topic implements Serializable {
    private String name;
    private ArrayList<Question> originalQuestions;
    private ArrayList<Question> questionsLeft;
    private ArrayList<Integer> grades;

    public Topic(String name, ArrayList<Question> questions) {
        this.name = name;
        originalQuestions = questions;

        refresh();
    }

    public Topic(String name) {
        this.name = name;
        originalQuestions = new ArrayList<>();
        questionsLeft = new ArrayList<>();
        grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void refresh(){
        questionsLeft = originalQuestions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestions() {
        return originalQuestions;
    }
    public Question getQuestion(){
        Random random = new Random();
        int rand = random.nextInt(questionsLeft.size());
        Question temp = questionsLeft.get(rand);
        questionsLeft.remove(rand);
        return temp;
    }
    public int getSize(){
        return questionsLeft.size();
    }
    public boolean isEmpty(){
        if (questionsLeft==null||originalQuestions==null){
            questionsLeft = new ArrayList<>();
            originalQuestions = new ArrayList<>();
        }
        return questionsLeft.isEmpty();}

    public void setQuestions(ArrayList<Question> questions) {
        this.originalQuestions = questions;
    }
    public void addQuestion(Question question){
        originalQuestions.add(question);
        refresh();
    }
    public void restoreQuestionOnDestroy(Question question){
        if (questionsLeft.size()==0){
            refresh();

        } else {
            questionsLeft.add(question);
        }

    }
    public int getProgress(){
        return originalQuestions.size()-questionsLeft.size();
    }
    public int getMax(){
        return originalQuestions.size();
    }
    public void addGrade(int newGrade){
        if (grades == null){
            grades = new ArrayList<>();
        }
        if (grades.size()>5){
            grades.remove(0);
        }
        grades.add(newGrade);
        System.out.println("newGrade = "+ newGrade);
    }
    public int getGrades(){
        if (grades==null||grades.size()==0) {
            grades = new ArrayList<>();
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum+=grades.get(i);
        }
        return sum/grades.size();
    }

}
