package hilay.edu.fragments;

import android.app.Fragment;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout container;
    static int colorid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (FrameLayout) findViewById(R.id.container);

    }

    public void frag1(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, new ColorFragment()).commit();

    }

    public void frag2(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ImageFragment()).commit();
    }

    public void frag3(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ColorFragment()).commit();
    }
}
