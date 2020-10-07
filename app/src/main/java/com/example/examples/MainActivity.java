package com.example.examples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
    int numberPress=0;




    FragmentOne f1=new FragmentOne();
    FragmentSecond f2=new FragmentSecond();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null) {
            String result1=savedInstanceState.getString("result1");
            String result2=savedInstanceState.getString("result2");
            if(result1!=null)
                f1.resultText=result1;
            if(result2!=null)
                f2.resultText=result2;
        }

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            getSupportFragmentManager().beginTransaction().replace(R.id.frag,f1,"new").commit();
        }else {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragOne,f1,"new").commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragSecond,f2,"new").commit();

        }


        setContentView(R.layout.activity_main);






    }


    public void change(View view){

        switch (numberPress % 2) {
            case 1: {

                getSupportFragmentManager().beginTransaction().replace(R.id.frag,f1,"new").commit();


                break;
            }
            case 0: {
                getSupportFragmentManager().beginTransaction().replace(R.id.frag,f2,"second").commit();

                break;
            }

        }
        numberPress++;



        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menuHistory:{
                break;
            }
        }
        return true;
    }
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("result2",f2.resultText);

        savedInstanceState.putString("result1",f1.resultText);

    }




    }




