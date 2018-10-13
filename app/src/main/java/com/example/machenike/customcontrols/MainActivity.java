package com.example.machenike.customcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.machenike.customer.MyClickButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyClickButton myClickButton=(MyClickButton)findViewById(R.id.button_2);
        myClickButton.setOnMbClickListener(new MyClickButton.OnMClickListener() {
            @Override
            public void onClick(boolean isRight) {
                if (isRight){
                    Toast.makeText(MainActivity.this,"开",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"关",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
