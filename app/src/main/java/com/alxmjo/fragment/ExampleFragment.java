package com.alxmjo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ExampleFragment extends Fragment {

    private TextView helloFragmentTextView;
    private Button showTextButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Views and onClickListeners are created and returned from the onCreateView method
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_example, container, false);

        helloFragmentTextView = (TextView) view.findViewById(R.id.hello_fragment_text_view);
        showTextButton = (Button) view.findViewById(R.id.show_text_button);
        showTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloFragmentTextView.setText(R.string.hello_fragment);
            }
        });

        return view;
    }
}
