package com.iiitu20329.gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        newArray = new int[]{

                R.id.boat_pose,R.id.bridge_pose,R.id.boa_pose,R.id.snake_pose,R.id.dead_pose,R.id.Rip_pose,
                R.id.ladder_pose,R.id.table_pose,R.id.tabla_pose,


        };
    }

    public void Imagebuttonclick(View view) {

        for (int i=0;i<newArray.length;i++)
        {
            if(view.getId() == newArray[i]){

                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}