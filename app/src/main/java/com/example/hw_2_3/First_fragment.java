package com.example.hw_2_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class First_fragment extends Fragment {

    private TextView textView;
    private Button minus;
    private Button plus;
    private int count = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView.findViewById(R.id.tv_result);
        minus.findViewById(R.id.btn_minus);
        plus.findViewById(R.id.btn_plus);
        textView.setText(count);
        minus.setOnClickListener(v -> {
            count--;
            textView.setText(count);
        });
        plus.setOnClickListener(v -> {
            count++;
            textView.setText(count);
        });
    }
}