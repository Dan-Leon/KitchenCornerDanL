package com.example.kitchencornerdanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainFrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_front_page);

        Button btnRecBookBttn =(Button) findViewById(R.id.idRecipeBookBttn);

        btnRecBookBttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainFrontPage.this, MainRecipeBookPage.class));


            }

        });

        Button btnLogOutBttn =(Button) findViewById(R.id.idLogOutBttn);

        btnLogOutBttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainFrontPage.this, MainActivity.class));

            }
        });

    }
}
