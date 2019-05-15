package com.ftninformatika.termin12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //Log.i("FirstActivity", "OnCreate");

        Toast toast =  Toast.makeText(getBaseContext(),"onCreate",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast =  Toast.makeText(getBaseContext(),"onStart",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast =  Toast.makeText(getBaseContext(),"onStop",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast =  Toast.makeText(getBaseContext(),"onDestroy",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast =  Toast.makeText(getBaseContext(),"onResume",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast =  Toast.makeText(getBaseContext(),"onPause",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast =  Toast.makeText(getBaseContext(),"onRestart",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("x",5);
        Toast toast =  Toast.makeText(getBaseContext(),"onSaveInstanceState",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int x = savedInstanceState.getInt("x",0);
        Toast toast =  Toast.makeText(getBaseContext(),"onRestoreInstanceState: " + x,Toast.LENGTH_LONG);
        toast.show();
    }
    public void onButtonClick(View view){
        Toast toast =  Toast.makeText(getBaseContext(),"onButtonClick",Toast.LENGTH_LONG);
        toast.show();
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
