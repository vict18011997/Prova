package com.example.nss_admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaTela2(View view) {
        final EditText tabuada = (EditText) findViewById(R.id.editText2);
        final EditText quantidade = (EditText) findViewById(R.id.editText6);
        String numeroTabuada = tabuada.getText().toString();
        String numeroQtd = quantidade.getText().toString();
        Intent intent1 = new Intent(getApplicationContext(),Main2Activity.class);
        intent1.putExtra("numeroTabuada", numeroTabuada);
        intent1.putExtra("numeroQtd", numeroQtd);
        startActivity(intent1);
    }

}

