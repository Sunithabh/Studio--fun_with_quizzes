package com.company;


public class Question {   //base class to represent a question

    String prompt;
    String correctAnswer;

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String answer) {
        this.correctAnswer = answer;
    }

    public Question(String prompt, String correctAnswer) {
        this.prompt = prompt;
        this.correctAnswer=correctAnswer;
    }

}
    //subclass for multiple choice questions
    class MultipleChoiceQuestion extends Question {
        public MultipleChoiceQuestion(String prompt,String correctAnswer) {
          super(prompt,correctAnswer);
        }
    }
    //subclass for Checkbox type questions
    class CheckBoxQuestion extends Question{
        public CheckBoxQuestion(String prompt, String answer){ //accept two parameters
          super(prompt,answer);
        }
    }

    //subclass for True/False type questions
    class TrueFalseQuestion extends Question{
        public  TrueFalseQuestion(String prompt, String answer){
           super(prompt,answer);
        }
    }

