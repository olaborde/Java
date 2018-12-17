package quizzes;

import models.Question;

import java.util.HashMap;

public class Quiz {
    private HashMap<Integer, Question> questionsMap;
    private HashMap<Integer, String> answersMap;

    private int addQuestionCounter = 0;
    private int getQuestionCounter = 0;
    public Quiz(HashMap<Integer, Question> questionsMap, HashMap<Integer, String> answersMap) {
        this.questionsMap = questionsMap;
        this.answersMap = answersMap;
    }


    public Quiz(){
        this(new HashMap<Integer, Question>(), new HashMap<Integer, String>());
    }

    public void addQuestion(Question question, String answer){
        questionsMap.put(addQuestionCounter, question);
        answersMap.put(addQuestionCounter, answer);
        addQuestionCounter++;
    }

    public String getNextQuestion(){
        Question aquestion = questionsMap.get(addQuestionCounter);
        System.out.println("\n\nQuestion number: " + (getQuestionCounter+1)+ "of " + questionsMap.size());
        System.out.println("\n\n" + aquestion.getQuestionText());
        System.out.println("\n\n");
        for (String answerOption: aquestion.getAnswerOptions()){
            System.out.println(answerOption);
        }
    }


}
