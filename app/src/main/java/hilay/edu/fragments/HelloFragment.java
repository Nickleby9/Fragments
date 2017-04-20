package hilay.edu.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment implements View.OnClickListener {

    Button btnClick;
    FrameLayout layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_hello, container, false);

        btnClick = (Button) v.findViewById(R.id.btnClick);
        layout = (FrameLayout) v.findViewById(R.id.layout);

        btnClick.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);

        layout.setBackgroundColor(Color.rgb(r,g,b));
    }
}
