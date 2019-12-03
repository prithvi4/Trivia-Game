package com.example.triviagame;
import java.util.*;
import android.app.Activity;

public class TriviaQuestion extends Activity {
    private static String question, c1, c2, c3, answer;
    static int counter = 0;
    public TriviaQuestion(String q, String choice1, String choice2, String choice3, String a) {
        question = q;
        c1 = choice1;
        c2 = choice2;
        c3 = choice3;
        answer = a;
    }
    public String getQ() {
        return question;
    }
    public static String getOne() {
        return c1;
    }
    public static String getTwo() {
        return c3;
    }
    public static String getThree() {
        return c3;
    }
    public static String getA() {
        return answer;
    }
    static ArrayList<TriviaQuestion> list = new ArrayList<>();

    public void createList() {
        list.add(new TriviaQuestion("2 + 2", "2", "3", "4", "4"));
        list.add(new TriviaQuestion("3 + 3", "3", "6", "4", "6"));
        list.add(new TriviaQuestion("4 + 4", "8", "3", "7", "8"));
        list.add(new TriviaQuestion("5 + 5", "1", "10", "9", "10"));
        list.add(new TriviaQuestion("6 + 6", "2", "12", "10", "3"));
    }

}
