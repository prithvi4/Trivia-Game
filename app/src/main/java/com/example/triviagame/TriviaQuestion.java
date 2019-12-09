package com.example.triviagame;

public class TriviaQuestion {
    private String mQuestions [] = {
            "Which one of these CS courses can also satisfy the advanced comp requirement",
            "Who is the CS 125 professor",
            "Is UIUC the oldest public school in Illinois?",
            "What was the first high level programming language?",
            "What syntax do you use when implementing a parent class?",
            "Which sorting algorithm is the fastest?",
            "Which of the following statements is true?",
            "Which way can algorithms be implements?",
            "What is the characteristic of a good function?",
            "In Java a non-void function always has a ",
            "What is a Java variable that refers to an object called?",
            "Which of the following are Java primitive types",
            "Which two things do objects combine?"
    };

private String mChoices [][] = {
        {"CS 427", "CS 100", "CS 225"},
        {"Challen", "Adve", "Bailey"},
        {"Yes", "No", "It is a private school"},
        {"Short Code", "C++", "Autocode"},
        {"Implements", "Connects", "Extends"},
        {"Insertion Sort", "Quick Sort", "Bubble Sort"},
        {"The size cannot be changed once the array is initialized",
                "Arrays have a .length() property that is used to get their size",
                "Values cannot be assigned to an array when it is initialized"},
        {"Making computers do things over and over again fast",
                "Making computers perform complex calculations",
                "None of the above"},
        {"Cannot be reused", "Can be easily tested", "Does things well sometimes"},
        {"A list of arguments", "A return type", "All of the above"},
        {"Reference variable", "Object variable", "Referring variable" },
        {"Integer", "Character", "None of the above"},
        {"State and behavior", "State and attitude", "None of the above"}
        };
private String mCorrectAnswers[] = {"CS 427", "Challen", "No", "Short Code", "Extends", "Quick Sort"
        , "Arrays have a .length() property that is used to get their size",
        "Making computers do things over and over again fast", "A return type", "Reference variable"
        , "Character", "State and behavior"};

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