package com.example.nss_admin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        String numeroTabuada = bundle.getString("numeroTabuada");
        final TextView pNumeroTabuada = (TextView) findViewById(R.id.textView2);
        pNumeroTabuada.setText((numeroTabuada));

        String numeroQtd = bundle.getString("numeroQtd");
        final TextView pNumeroQtd = (TextView) findViewById(R.id.textView5);
        pNumeroQtd.setText((numeroQtd));
    }

    public void calculo(View view) {
        Bundle bundle = getIntent().getExtras();
    }


}
