package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView exit = findViewById(R.id.tv_exit);
        TextView welcome = findViewById(R.id.welcome);
        EditText email =  findViewById(R.id.et_email);
        EditText password = findViewById(R.id.et_password);
        Button button = findViewById(R.id.btn_first);
        TextView forgetPassword = findViewById(R.id.tv_forgetPassword);
        TextView clickMe = findViewById(R.id.tv_clickMe);
        TextView example = findViewById(R.id.tv_example);


        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (email.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.brown));

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (password.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.brown));

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                            email.setVisibility(view.GONE);
                            password.setVisibility(view.GONE);
                            example.setVisibility(view.GONE);
                            forgetPassword.setVisibility(view.GONE);
                            clickMe.setVisibility(view.GONE);
                            exit.setVisibility(view.GONE);
                            button.setVisibility(View.GONE);
                            Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, "Неправильный логин или пароль ", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }
}