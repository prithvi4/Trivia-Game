package com.example.triviagame;

public class TriviaQuestion {
    private String mQuestions [] = {
            "Which one of these CS courses can also satisfy the advanced comp requirement",
            "Who is the CS 125 professor",
            "Is UIUC the oldest public school in Illinois?",
            "What was the first high level programming language?",
            "What syntax do you use when implementing a parent class?",
            "Which sorting algorithm is the fastest?"
    };

private String mChoices [][] = {
        {"CS 427", "CS 100", "CS 225"},
        {"Challen", "Adve", "Bailey"},
        {"Yes", "No", "It is a private school"},
        {"Short Code", "C++", "Autocode"},
        {"Implements", "Connects", "Extends"},
        {"Insertion Sort", "Quick Sort", "Bubble Sort"}
        };
private String mCorrectAnswers[] = {"CS 427", "Challen", "No", "Short Code", "Extends", "Quick Sort"};
public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
        }

public String getChoice1(int a) {
        String choice1 = mChoices[a][0];
        return choice1;
        }
public String getChoice2(int a) {
        String choice2 = mChoices[a][1];
        return choice2;
        }
public String getChoice3(int a) {
        String choice3 = mChoices[a][2];
        return choice3;
        }
public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
        }
        }