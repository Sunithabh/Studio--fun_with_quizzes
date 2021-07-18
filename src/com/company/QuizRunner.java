package com.company;


//The program should create several questions, present them to the user, accept the user’s responses,
// and then tell them whether their answers were correct or incorrect.
public class QuizRunner {

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz!!");
        String qtn1 = "What is a correct syntax to output \"Hello World\" in Java?\n"+"(a)Console.WriteLine('Hello World')\n(b)System.out.println('Hello World')\n" +
                "(c)echo('Hello World')\n(d)print('Hello World')";

        String qtn2 = "true/false? \n" +"Java is short for \"JavaScript\".\n"+"(a)False\n(b)True";

        String qtn3 = "How do you insert COMMENTS in Java code?\n"+"(a)//This is a comment\n(b)#This is a comment\n(c)/*This is a comment\n" +
                "Choose From these options :\n" + "a&b\n"+ "a&c\n"+ "all of them\n"+"none of them";

        String qtn4 = "Check all statements that are TRUE about the differences between interfaces and abstract classes.\n"+"(a)You extend an abstract class, but implement an interface.\n" +
                "(b)You can implement many interfaces and many classes.\n" +
                "(c)Interfaces cannot contain non-constant fields, but abstract classes can.\n" +
                "(d)Methods that use instance properties can be in both interfaces and abstract classes.\n"+
                "Choose From these options :\n" + "a&b\n"+ "a&c\n"+"c&d\n"+ "all of them";

        Question[] questions = {
                new MultipleChoiceQuestion(qtn1,"b"),
                new TrueFalseQuestion(qtn2,"false"),
                new CheckBoxQuestion(qtn3,"a&c"),
                new CheckBoxQuestion(qtn4,"a&c")
        };

       Quiz.takeTest(questions);
    };

}




