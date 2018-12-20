package models;

import java.util.ArrayList;
import java.util.List;

abstract public class Question {

    private String questionText, userAnswer;
    private ArrayList<String> answerOptions;

    protected Type questionTYpe;

    public Question(){

    }

    public Question( String questionText){
        this.questionText = questionText;

    }

    public String getQuestionText(){

        return questionText;

    }

    public void setQuestionText(){

         this.questionText = questionText;

    }
    public void setUserAnswer(String userAnswer){
        this.userAnswer = userAnswer;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions){
        this.answerOptions = answerOptions;
    }

    public ArrayList<String> getAnswerOptions(){
        return answerOptions;
    }




    public abstract boolean validateAnswer(String string);
    public abstract String getInvalidMessage();

    //enum
    protected enum Type{Mulitple_CHOICE, TRUE_ORFALSE, CHECKBOX};
}
