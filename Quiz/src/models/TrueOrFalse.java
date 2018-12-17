package models;

public class TrueOrFalse extends Question {
    private static final String INVALID_ANSWER = "You must enter a value between T or F";

    public TrueOrFalse(){
        super();
    }

    public TrueOrFalse(String questionText){
        super(questionText);
    }

    @Override
    public boolean validateAnswer(String answer){
        return answer.equalsIgnoreCase("T") || answer.equalsIgnoreCase("F");
    }

    @Override
    public String getInvalidMessage(){
        return INVALID_ANSWER;
    }
}
