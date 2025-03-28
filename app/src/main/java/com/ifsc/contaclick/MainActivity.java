package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("ciclodevida", "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MsgActivity.class);
                String mensagem = "Você veio de outra atividade";
                i.putExtra("msg", mensagem);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
        Log.d("ciclodevida", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
        Log.d("ciclodevida", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
        Log.d("ciclodevida", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
        Log.d("ciclodevida", "onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
        Log.d("ciclodevida", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
        Log.d("ciclodevida", "onDestroy");
        super.onDestroy();
    }
}
