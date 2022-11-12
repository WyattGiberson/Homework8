package com.hfad.homework8;

import java.util.ArrayList;

public class QuizQuestions {
    private String question;
    private ArrayList<String> options;
    private String answer;
    private String fact;
    private String genre;

    public QuizQuestions(String q, ArrayList<String> o, String a, String f, String g) {
            question = q;
            options = o;
            answer = a;
            fact = f;
            genre = g;
        }

        public String getQuestion(){
            return question;
        }
        public ArrayList<String> getOptions(){return options;}
        public String getAnswer(){return answer;}
        public String getFact(){return fact;}
        public String getGenre(){return genre;}
        public int getChoiceAmount(){return options.size();}
        public String getChoice(int position){return options.get(position);}
    }
