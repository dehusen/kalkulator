package com.pab.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText edtAngkaPertama = findViewById(R.id.edt1);
        final EditText edtAngkaKedua = findViewById(R.id.edt2);
        final TextView txtHasil = findViewById(R.id.hasilhitung);


        Button btnTambah = findViewById(R.id.btnTambah);
        Button btnBagi = findViewById(R.id.btnBagi);
        Button btnKali = findViewById(R.id.btnKali);


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(edtAngkaPertama.getText().toString());
                int angka2 = Integer.parseInt(edtAngkaKedua.getText().toString());
                int hasil = angka1 + angka2;
                txtHasil.setText("Hasil penjumlahan :" + hasil);
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil nilai dari EditText angka pertama dan kedua
                double angka1 = Double.parseDouble(edtAngkaPertama.getText().toString());
                double angka2 = Double.parseDouble(edtAngkaKedua.getText().toString());

                // Hitung pembagian
                double hasil = angka1 / angka2;

                // Tampilkan hasil di TextView
                txtHasil.setText("Hasil Pembagian: " + hasil);


            }
        });


    }


}