package com.wordpress.mortuza99.tasbhi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button counterBtn = findViewById(R.id.counterBtn);

        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = counter + 1;
                counterBtn.setText(String.format("%s%s", getString(R.string.total), String.valueOf(counter)));
            }
        });


    }
}
