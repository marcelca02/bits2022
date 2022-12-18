package com.example.bits2022.classes;

import android.util.Pair;

import java.util.ArrayList;

public class Question {

    private String question;
    private boolean theresCorrectAnswer;

    // Par de <Respuesta, TRUE/FALSE si esta bien.
    private ArrayList< Pair<String, Boolean> > answers;

//----------------------------------------------------------------------------

    public Question(String question) {
        this.question = question;
        theresCorrectAnswer = false;
    }

    /**
     * Añade una respuesta a la pregunta. Hay un máximo de 4 respuestas.
     * @param answer respuesta en cuestión.
     * @param isCorrect si es correcta.
     */
    public void addAnswer(String answer, Boolean isCorrect) {
        if (getNumberOfAnswers() >= 4) {
            System.out.println("max numero of respuestas en <" + question + ">");
            return;
        }

        if (isCorrect) {
            if (theresCorrectAnswer) {
                System.out.println("ya hay respuesta correcta!");
                return;
            }

            theresCorrectAnswer = true;
        }

        answers.add(new Pair<>(answer, isCorrect));
    }

    public String getQuestion() {
        return this.question;
    }

    /**
     * Pillar la respuesta @ index.
     * @param index index de la pregunta que se quiere.
     * @return La respuesta si index es válido, un Pair con string vacía i false si es inválido.
     */
    public Pair<String, Boolean> getAnswer(int index) {
        if (index >= getNumberOfAnswers()) {
            System.out.println("index out of bounds!");
            return new Pair<>("", false);
        }

        return answers.get(index);
    }

    public int getNumberOfAnswers() {
        return answers.size();
    }


    /**
     * Dice si la respuesta es la correcta.
     * @param answer la respuesta en cuestión
     * @return TRUE si la respuesta es correcta, FALSE si no lo es.
     */
    public boolean isCorrect(String answer) {
        for (Pair<String, Boolean> ans: answers) {
            if (ans.first.equals(answer)) {
                return ans.second;
            }
        }

        System.out.println("respuesta no está en la pregunta!");
        return false;
    }

}
