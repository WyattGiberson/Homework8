package com.hfad.homework8;

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

public class QuizCompleteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz_complete, container,  false);

        int questCorrect = QuizCompleteFragmentArgs.fromBundle(requireArguments()).getQuestionsRight();
        int questTotal = QuizCompleteFragmentArgs.fromBundle(requireArguments()).getQuestionTotal();


        TextView txtScore = view.findViewById(R.id.finalScoreTxtView);
        TextView txtMessage = view.findViewById(R.id.messageTxt);

        double percentage;
        percentage = 100 * (Double.valueOf(questCorrect) / Double.valueOf(questTotal));


        txtScore.setText(questCorrect + "/" + questTotal);
        if(percentage > 70){
            txtMessage.setText("Great Job! You Passed!");
        }
        else{
            txtMessage.setText("Better Luck Next Time! Keep Trying!");
        }

        return view;
    }
}