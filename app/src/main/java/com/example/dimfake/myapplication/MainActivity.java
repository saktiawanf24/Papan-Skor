package com.example.dimfake.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPlayer1, editTextPlayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPlayer1 = (EditText) findViewById(R.id.editText1);
        editTextPlayer2 = (EditText) findViewById(R.id.editText2);
    }
    public void onNextButtonClicked(View view){
        Bundle bundle = new Bundle();
        bundle.putString("data1", editTextPlayer1.getText().toString());
        bundle.putString("data2", editTextPlayer2.getText().toString());
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
