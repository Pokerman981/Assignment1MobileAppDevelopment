package me.troyg.assignment1mobileappdevelopment;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.root);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setNavigationIcon(R.mipmap.icon);


    }

}
