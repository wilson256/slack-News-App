package com.example.getinputs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name,email;
    EditText nameInput;
    EditText emailInput;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameInput=(EditText) findViewById(R.id.nameinput);
        emailInput=(EditText) findViewById(R.id.emailinput);
        submitButton=(Button) findViewById(R.id.sumitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();

                showToast(name);
                showToast(email);

            }

        });

    }
    private void showToast(String text){
        Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT).show();
    }
}