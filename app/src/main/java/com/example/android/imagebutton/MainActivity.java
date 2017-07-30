package com.example.android.imagebutton;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton2);

        imageButton.setImageResource(R.drawable.house1);
        imageButton.setBackgroundColor(Color.YELLOW);

        imageButton1.setImageResource(R.drawable.toytube);
        imageButton1.setBackgroundColor(Color.YELLOW);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "home Button", Toast.LENGTH_SHORT).show();
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"youtube button",Toast.LENGTH_LONG).show();
            }
        });
    }
}
