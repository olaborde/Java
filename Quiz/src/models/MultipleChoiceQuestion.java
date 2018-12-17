package models;

public class MultipleChoiceQuestion extends Question {

    private static final String INVALID_ANSWER = "You must enter a value between [1 - 4]";

    public  MultipleChoiceQuestion(){
        super();
    }

    public MultipleChoiceQuestion(String questionText){
        super(questionText);
    }


    @Override
    public boolean validateAnswer(String answer){
//         int answerNum = Integer.valueOf(answer)
        return answer.matches("[1 - 4 ]+");
    }

    @Override
    public String getInvalidMessage(){

        return INVALID_ANSWER;

    }
}
