package com.example.nss_admin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends Activity {
    private ListView lista;
    private String[] listaArray;

    private int num1;
    private int num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();


        if ( bundle != null) {

            num1 = Integer.parseInt(bundle.getString("numeroQtd"));
            num2 = Integer.parseInt(bundle.getString("numeroTabuada"));


        }

        listaArray = new String[num1];
        for(int i = 1; i <=num1; i++){
            listaArray[i-1] = ""+ num2+"" + " x " + i + " = " + num1*i;
        }
        lista = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaArray
        );

        lista.setAdapter( adaptador );

    }



}
