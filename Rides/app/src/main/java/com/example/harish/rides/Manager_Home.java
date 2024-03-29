package com.example.harish.rides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manager_Home extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_home);

        b1 = (Button)findViewById(R.id.viewprofile);
        b2 = (Button)findViewById(R.id.viewRental);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = getIntent().getStringExtra("EXTRA_username");
                Intent i = new Intent(Manager_Home.this, ManagerViewProfile.class);
                Bundle extras = new Bundle();
                extras.putString("EXTRA_username",username);
                i.putExtras(extras);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Manager_Home.this, ManagerViewRental.class);
                startActivity(i);
            }
        });

        Button lgbutton = (Button) findViewById(R.id.logout);
        lgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Manager_Home.this, MainActivity.class);
                startActivity(i);
            }
        });
    }


}
