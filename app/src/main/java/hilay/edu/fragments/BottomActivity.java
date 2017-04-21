package hilay.edu.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class BottomActivity extends AppCompatActivity {
void setTheColor(int color){}

    int colorid = Color.rgb(255, 0, 255);

    private BottomNavigationView.OnNavigationItemSelectedListener
            mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    ImageFragment imageFragment = ImageFragment.newInstance(colorid);
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, imageFragment).commit();
                    return true;

                case R.id.navigation_dashboard:
                    ColorFragment colorFragment = new ColorFragment();
                    colorid = colorFragment.getBgColor();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, colorFragment).commit();
                    return true;

                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
