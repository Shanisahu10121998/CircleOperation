package com.example.circleoperation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNo1;
    Button  button1,button2;
    TextView textViewres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNo1=findViewById(R.id.editText);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        textViewres=findViewById(R.id.result);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String s1=String.valueOf(editTextNo1.getText());
             double r=Double.parseDouble(s1);
             double area=3.14285714*r*r;
               Toast.makeText(MainActivity.this, "Area is:: "+area, Toast.LENGTH_SHORT).show();
             textViewres.setText(String.valueOf(area));

            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=String.valueOf(editTextNo1.getText());
                double r=Double.parseDouble(
                        s1);
                double perimeeter=2*3.14285714*r;
              Toast.makeText(MainActivity.this, "Perimeeter is :: " +perimeeter, Toast.LENGTH_SHORT).show();
                textViewres.setText(String.valueOf(perimeeter));

            }

        });

    }
}
