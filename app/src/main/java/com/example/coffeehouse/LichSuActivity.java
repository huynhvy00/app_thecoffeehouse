package com.example.coffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LichSuActivity extends AppCompatActivity {

Button btdatngay454;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lichsu);

        Button back = (Button) findViewById(R.id.btn_datngay_454);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GioHangActivity.class);
                startActivity(intent);
            }
        });

       // Bundle bundle = getIntent().getExtras();

    }
}
