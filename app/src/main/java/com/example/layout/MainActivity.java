package com.example.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
public class MainActivity extends AppCompatActivity {

    private Button button, button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.liner);
        button1 = findViewById(R.id.relative);
        button2 = findViewById(R.id.table);
//      //  button点击跳转
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,LinearLayout.class);
//                MainActivity.this.startActivity(intent);
//            }
//        });
//        button1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,RelativeLayout.class);
//                MainActivity.this.startActivity(intent);
//            }
//        });
//        button2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,TableLayout.class);
//                MainActivity.this.startActivity(intent);
//            }
//        });匿名类

        myListener listener = new myListener();
        button.setTag(1);         //给button设置标记
        button.setOnClickListener(listener);
        button1.setTag(2);
        button1.setOnClickListener(listener);
        button2.setTag(3);
        button2.setOnClickListener(listener);


    }

//    class myListener implements CompoundButton.OnClickListener {
//
//        @Override
//        public void onClick(View view) {
//            Intent intent = new Intent();
// intent.setClass(MainActivity.this, LinearLayout.class);
//MainActivity.this.startActivity(intent);
//
//        }
//    }
public class myListener implements View.OnClickListener{

    @Override
    public void onClick(View v){
        int tag = (Integer)v.getTag(); //找到每个button的标记
        Intent intent = new Intent();
        switch(tag){
            case 1:
                intent.setClass(MainActivity.this, LinearLayout.class);
                break;
            case 2:
                intent.setClass(MainActivity.this, RelativeLayout.class);
                break;
            case 3:
                intent.setClass(MainActivity.this, TableLayout.class);
                break;

        }
        MainActivity.this.startActivity(intent);
    }
}
}


