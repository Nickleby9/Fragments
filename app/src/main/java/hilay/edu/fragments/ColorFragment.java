package hilay.edu.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    private static final String BACKGROUND_COLOR = "backgroundColor";
    Button btnClick;
    FrameLayout layout;
    int color;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_color, container, false);

        layout = (FrameLayout) v.findViewById(R.id.layout);

        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        color = Color.rgb(r,g,b);
        layout.setBackgroundColor(color);

        BottomActivity activity = (BottomActivity) getActivity();
        activity.setTheColor(color);
        return v;
    }

    int getBgColor(){
        return color;
    }


}
