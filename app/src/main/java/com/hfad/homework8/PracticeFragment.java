package com.hfad.homework8;

import android.content.Context;
import android.opengl.Visibility;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class PracticeFragment extends Fragment {

    private ArrayList<QuizQuestions> quizList;

    public PracticeFragment(){
        quizList = dataBase.getData();
    }

    int position = 0;
    int questCorrect = 0;

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_practice, container,  false);
            String genre = PracticeFragmentArgs.fromBundle(requireArguments()).getGenre();
            dataBase.getData();

            ArrayList<QuizQuestions> genreQuizList = new ArrayList<QuizQuestions>();

            for (int i = 0; i < quizList.size(); i++) {

               if(genre.equals(quizList.get(i).getGenre())){

                    genreQuizList.add(new QuizQuestions(quizList.get(i).getQuestion(),
                           quizList.get(i).getOptions(), quizList.get(i).getAnswer(), quizList.get(i).getFact(), quizList.get(i).getGenre()));
                   System.out.println(quizList.get(i).getGenre());
                   System.out.println(genre);

               }
               else if(genre.equals("All")){
                    genreQuizList.add(new QuizQuestions(quizList.get(i).getQuestion(),
                            quizList.get(i).getOptions(), quizList.get(i).getAnswer(), quizList.get(i).getFact(), quizList.get(i).getGenre()));
                    System.out.println(quizList.get(i).getGenre());
                    System.out.println(genre);
                }
           }

            Collections.shuffle(genreQuizList);


            TextView txtQuestion = view.findViewById(R.id.questionTxt);
            TextView txtNum = view.findViewById(R.id.questionNum);
            Button btnSubmit = view.findViewById(R.id.btnsubmit);

            RadioButton option1 = view.findViewById(R.id.option1);
            RadioButton option2 = view.findViewById(R.id.option2);
            RadioButton option3 = view.findViewById(R.id.option3);
            RadioButton option4 = view.findViewById(R.id.option4);
            RadioButton option5 = view.findViewById(R.id.option5);
            RadioGroup btnChoices = view.findViewById(R.id.RGroup);

            option1.setVisibility(View.INVISIBLE);
            option2.setVisibility(View.INVISIBLE);
            option3.setVisibility(View.INVISIBLE);
            option4.setVisibility(View.INVISIBLE);
            option5.setVisibility(View.INVISIBLE);


            setButtonVisibility(genreQuizList.get(position).getChoiceAmount(), option1, option2, option3, option4, option5);
            setButtonText(genreQuizList, genreQuizList.get(position).getChoiceAmount(), position, option1, option2, option3, option4, option5);
            txtQuestion.setText(genreQuizList.get(position).getQuestion());
            String answer = genreQuizList.get(position).getAnswer();

            txtNum.setText("Question " + (position + 1) + " of " + genreQuizList.size());

            btnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isCorrect(genreQuizList.get(position).getAnswer(), option1, option2, option3, option4, option5)){
                        questCorrect = questCorrect + 1;
                        Toast.makeText(getActivity(),"Correct! Did you know? " + genreQuizList.get(position).getFact(), Toast.LENGTH_SHORT).show();

                        if(position < (genreQuizList.size() - 1)) {

                            position = getNextQuestion(position);
                            txtQuestion.setText(genreQuizList.get(position).getQuestion());
                            setButtonVisibility(genreQuizList.get(position).getChoiceAmount(), option1, option2, option3, option4, option5);
                            setButtonText(genreQuizList, genreQuizList.get(position).getChoiceAmount(), position, option1, option2, option3, option4, option5);
                            String answer = genreQuizList.get(position).getAnswer();
                            txtNum.setText("Question " + (position + 1) + " of " + genreQuizList.size());
                            btnChoices.clearCheck();

                            //System.out.println(genreQuizList.size());
                            //System.out.println(position);

                        }

                        else {
                            PracticeFragmentDirections.ActionPracticeFragmentToQuizCompleteFragment action =
                                    PracticeFragmentDirections.actionPracticeFragmentToQuizCompleteFragment(questCorrect, genreQuizList.size());

                            Navigation.findNavController(view).navigate(action);
                        }

                    }

                    else{
                        Toast.makeText(getActivity(),"False. Did you know? " + genreQuizList.get(position).getFact(), Toast.LENGTH_SHORT).show();
                        if(position < (genreQuizList.size() - 1)) {

                            position = getNextQuestion(position);
                            txtQuestion.setText(genreQuizList.get(position).getQuestion());
                            setButtonVisibility(genreQuizList.get(position).getChoiceAmount(), option1, option2, option3, option4, option5);
                            setButtonText(genreQuizList, genreQuizList.get(position).getChoiceAmount(), position, option1, option2, option3, option4, option5);
                            String answer = genreQuizList.get(position).getAnswer();
                            txtNum.setText("Question " + (position + 1) + " of " + genreQuizList.size());
                            btnChoices.clearCheck();

                            //System.out.println(genreQuizList.size());
                            //System.out.println(position);

                        }

                        else {
                            PracticeFragmentDirections.ActionPracticeFragmentToQuizCompleteFragment action =
                                    PracticeFragmentDirections.actionPracticeFragmentToQuizCompleteFragment(questCorrect, genreQuizList.size());

                            Navigation.findNavController(view).navigate(action);
                        }
                    }
                }
            });
            return view;
        }



        public int getNextQuestion(int pos){
            int newPos = pos + 1;
            return newPos;
        }



        public void setButtonVisibility(int length, RadioButton option1,RadioButton option2,RadioButton option3,
                                        RadioButton option4,RadioButton option5){
            if(length == 6){
                option1.setVisibility(View.VISIBLE);
                option2.setVisibility(View.VISIBLE);
                option3.setVisibility(View.VISIBLE);
                option4.setVisibility(View.VISIBLE);
                option5.setVisibility(View.VISIBLE);
            }
            if(length == 5){
                option1.setVisibility(View.VISIBLE);
                option2.setVisibility(View.VISIBLE);
                option3.setVisibility(View.VISIBLE);
                option4.setVisibility(View.VISIBLE);
                option5.setVisibility(View.VISIBLE);
            }
            if(length == 4){
                option1.setVisibility(View.VISIBLE);
                option2.setVisibility(View.VISIBLE);
                option3.setVisibility(View.VISIBLE);
                option4.setVisibility(View.VISIBLE);
                option5.setVisibility(View.INVISIBLE);
            }
            if(length == 3){
                option1.setVisibility(View.VISIBLE);
                option2.setVisibility(View.VISIBLE);
                option3.setVisibility(View.VISIBLE);
                option4.setVisibility(View.INVISIBLE);
                option5.setVisibility(View.INVISIBLE);
            }
            if(length == 2){
                option1.setVisibility(View.VISIBLE);
                option2.setVisibility(View.VISIBLE);
                option3.setVisibility(View.INVISIBLE);
                option4.setVisibility(View.INVISIBLE);
                option5.setVisibility(View.INVISIBLE);
            }
            if(length == 1){
                option1.setVisibility(View.VISIBLE);
                option2.setVisibility(View.INVISIBLE);
                option3.setVisibility(View.INVISIBLE);
                option4.setVisibility(View.INVISIBLE);
                option5.setVisibility(View.INVISIBLE);
            }

        }
        public void setButtonText(ArrayList<QuizQuestions> list, int length, int position, RadioButton option1,RadioButton option2
                ,RadioButton option3,RadioButton option4,RadioButton option5) {
            for(int i = 0; i < length; i++){
                if(i == 0){
                    option1.setText(list.get(position).getChoice(i));
                }
                else if(i == 1){
                    option2.setText(list.get(position).getChoice(i));
                }
                else if(i == 2){
                    option3.setText(list.get(position).getChoice(i));
                }
                else if(i == 3){
                    option4.setText(list.get(position).getChoice(i));
                }
                else if(i == 4){
                    option5.setText(list.get(position).getChoice(i));
                }
            }
        }
        public boolean isCorrect(String Answer, RadioButton option1,RadioButton option2,RadioButton option3
                ,RadioButton option4,RadioButton option5) {
            if (option1.isChecked()) {
                if (option1.getText() == Answer) {
                    return true;
                }
            }
            if (option2.isChecked()) {
                if (option2.getText() == Answer) {
                    return true;
                }
            }
            if (option3.isChecked()) {
                if (option3.getText() == Answer) {
                    return true;
                }
            }

            if (option4.isChecked()) {
                if (option4.getText() == Answer) {
                    return true;
                }
            }

            if (option5.isChecked()) {
                if (option5.getText() == Answer) {
                    return true;
                }
            }
            else{
                return false;
            }
            return false;
        }
}