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


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment implements View.OnClickListener {

    Button button1;
    FrameLayout layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_hello, container, false);

        button1 = (Button) v.findViewById(R.id.button1);
        layout = (FrameLayout) v.findViewById(R.id.layout);

        button1.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        layout.setBackgroundColor(Color.BLUE);
        Toast.makeText(getContext(), "Color has been changed", Toast.LENGTH_SHORT).show();
    }
}
