package com.hfad.homework8;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;


public class homeFragment extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container,  false);
        Button btnPractice = view.findViewById(R.id.btnPractice);

        Spinner spinner = (Spinner) view.findViewById(R.id.genreSpin);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.genre_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        btnPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = spinner.getSelectedItem().toString();

                homeFragmentDirections.ActionHomeFragmentToPracticeFragment action =
                        homeFragmentDirections.actionHomeFragmentToPracticeFragment(genre);

                Navigation.findNavController(view).navigate(action);
            }
        });
        return view;
    }
}

