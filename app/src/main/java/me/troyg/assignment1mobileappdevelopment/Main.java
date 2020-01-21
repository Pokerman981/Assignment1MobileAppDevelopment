package me.troyg.assignment1mobileappdevelopment;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.root);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Rawr xD UwU");
        toolbar.setTitleTextColor(Color.WHITE);

        registerListeners();


    }

    private void registerListeners() {
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            ImageView imageView = findViewById(R.id.imageview);
            if (view.isActivated()) {
                view.setActivated(false);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                button.setText(R.string.buttonOff);
            } else {
                view.setActivated(true);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                button.setText(R.string.buttonOn);
            }
        });
    }

}
