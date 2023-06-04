package com.example.intransit;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Hist_viagem extends AppCompatActivity {

    private ListView historico1;
    private ListView historico2;
    private ListView historico3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hist_viagem);

        // Obtenha as referências das ListViews do layout
        historico1 = findViewById(R.id.historico1);
        historico2 = findViewById(R.id.historico2);
        historico3 = findViewById(R.id.historico3);

        // Crie um ArrayList com os dados para preencher as ListViews
        ArrayList<String> data1 = new ArrayList<>();
        data1.add("15/08/23");
        data1.add("08:35");

        ArrayList<String> data2 = new ArrayList<>();
        data2.add("15/08/23");
        data2.add("12:15");


        ArrayList<String> data3 = new ArrayList<>();
        data3.add("16/08/23");
        data3.add("13:05");


        // Crie um ArrayAdapter para preencher cada ListView com os dados
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data3);

        // Defina o adapter para cada ListView
        historico1.setAdapter(adapter1);
        historico2.setAdapter(adapter2);
        historico3.setAdapter(adapter3);

        ImageButton imageButton;

        Object onCreate;(Bundle) {
                super.onCreate(savedInstanceState),
                setContentView(R.layout.hist_viagem);

         // Obtenha a referência do ImageButton do layout
         imageButton = findViewById(R.id.imageButton2);

         // Defina um OnClickListener para o ImageButton
         imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente o comportamento desejado quando o ImageButton for clicado
                Toast.makeText(Hist_viagem.this, "ImageButton clicado", Toast.LENGTH_SHORT).show();
            }
         });
        }
    }
}
