package hilay.edu.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFragment extends Fragment implements View.OnClickListener {

    private static final String BACKGROUND_COLOR = "backgroundColor";
    ImageView iv;
    Button btnBack, btnNext;
    int[] arr = new int[4];
    int i = 1;
    ConstraintLayout layoutImage;

    public ImageFragment() {
        // Required empty public constructor
    }

    public static ImageFragment newInstance(int color) {

        Bundle args = new Bundle();
        args.putInt(BACKGROUND_COLOR, color);
        ImageFragment fragment = new ImageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_image, container, false);




        Bundle args = getArguments();
        int color = args.getInt(BACKGROUND_COLOR);
        layoutImage = (ConstraintLayout) v.findViewById(R.id.layoutImgae);
        layoutImage.setBackgroundColor(color);




        iv = (ImageView) v.findViewById(R.id.iv);
        btnBack = (Button) v.findViewById(R.id.btnBack);
        btnNext = (Button) v.findViewById(R.id.btnNext);

        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);

        arr[0] = R.mipmap.pic1;
        arr[1] = R.mipmap.pic2;
        arr[2] = R.mipmap.pic3;
        arr[3] = R.mipmap.pic4;

        return v;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnNext) {
            i++;
            if (i > 3)
                i = 0;
            iv.setImageResource(arr[i]);

        }
        if (v.getId() == R.id.btnBack){
            i--;
            if (i < 0)
                i = 3;
            iv.setImageResource(arr[i]);
    }
}
}
