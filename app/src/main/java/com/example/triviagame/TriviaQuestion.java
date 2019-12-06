package com.example.triviagame;

public class TriviaQuestion {
    private String mQuestions [] = {
            "Which one of these CS courses can also satisfy the advanced comp requirement&quot",
            "Who is the CS 125 professor&quot",
            "Is UIUC the oldest public school in Illinois?&quot",
            "What was the first high level programming language?" };

private String mChoices [][] = {
        {"CS 427&quot", "CS 100", "CS 225"},
        {"Challen", "Adve", "Bailey"},
        {"Yes", "No", "It is a private school"},
        {"Short Code", "C++", "Autocode"}
        };
private String mCorrectAnswers[] = {"CS 427", "Challen", "No", "Short code"};
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