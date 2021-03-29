package space.fedosenko.CosmetologyQuizApp;

public class Question {
    private String question;
    private String [] answers = new String[4];

    public Question (String question,
                     String correctAnswer,
                     String answer2,
                     String answer3,
                     String answer4)
    {
        this.question = question;
        answers[0] = correctAnswer;
        answers[1] = answer2;
        answers[2] = answer3;
        answers[3] = answer4;
    }

    public String getQuestion(){
        return question;
    }
    public String getAnswer(int answerCount){
        return answers[answerCount-1];
    }
}
