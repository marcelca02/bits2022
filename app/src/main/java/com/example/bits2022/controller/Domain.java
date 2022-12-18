package com.example.bits2022.controller;

import com.example.bits2022.classes.Question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Domain {

    private static Domain instance = null;

    private static ArrayList< ArrayList<Question> > questions;

    private static int score;

//---------------------------------------------------------------

    public static Domain getInstance() {
        if (instance == null) {
            instance = new Domain();
        }

        return instance;
    }

    public void addQuestion(int tema, Question question) {
        questions.get(tema-1).add(question);
    }

    public Question getQuestion(int tema, int index) {
        Question question = questions.get(tema - 1).get(index);
        return question;
    }

    public void addWin() {
        score += 10;
    }

    public float getWinRatio() {
        return score/questions.size();
    }





}
