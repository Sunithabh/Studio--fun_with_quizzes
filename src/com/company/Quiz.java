package com.company;

import java.util.Scanner;

public class Quiz {
    Question[] questions;
    //method to allow user to take test
    public static void takeTest(Question[] questions) {
        //create a variable
        int score = 0; //user starts with 0 points
        //To ask the user the question, import and setup the scanner
        Scanner keyboardInput = new Scanner(System.in);

        //loop through each of questions and ask the user
        //inside the loop,ask the user the question,get their answer, check the answer and add the score accordingly.
        for (int i = 0; i < questions.length; i++) {
            //prompt to the question
            System.out.println(questions[i].prompt);
            //create variable to store the answer
            String answer = keyboardInput.nextLine();
            //check to see if the answer is correct by comparing the answer to the answer to the question
            if (answer.equals(questions[i].correctAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
    }
}

