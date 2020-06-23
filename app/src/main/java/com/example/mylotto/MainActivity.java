package com.example.mylotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    TextView number1, number2,number3,number4,number5,number6;
    TextView result;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (TextView)findViewById(R.id.number1);
        number2 = (TextView)findViewById(R.id.number2);
        number3 = (TextView)findViewById(R.id.number3);
        number4 = (TextView)findViewById(R.id.number4);
        number5 = (TextView)findViewById(R.id.number5);
        number6 = (TextView)findViewById(R.id.number6);

        result = (TextView)findViewById(R.id.result);

        button = (Button)findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Set<Integer> set = new HashSet<>();
                while (set.size() < 6) { Double d = Math.random() * 45 + 1; set.add(d.intValue()); }
                List<Integer> list = new ArrayList<>(set);
                Collections.sort(list);


                Log.e("특검결과", String.valueOf(list));

                result.setText(" 행운번호는 " + String.valueOf(list));
                number1.setText(String.valueOf(list.get(0)));
                number2.setText(String.valueOf(list.get(1)));
                number3.setText(String.valueOf(list.get(2)));
                number4.setText(String.valueOf(list.get(3)));
                number5.setText(String.valueOf(list.get(4)));
                number6.setText(String.valueOf(list.get(5)));

            }
        });



    }
}
