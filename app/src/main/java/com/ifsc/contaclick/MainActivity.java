package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    long contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        // Ouvinte de clique para o textView
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                textView.setText(Long.toString(contador));
            }
        });

        // Ouvinte de clique para o button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador = Math.round(Math.random() * 10); // Gera um número aleatório entre 0 e 10
                textView.setText(Long.toString(contador));
            }
        });
    }

    // O método onClick foi removido, pois não é necessário
}
