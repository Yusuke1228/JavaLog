package com.example.yusuk.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // インスタンスの生成
        Human human = new Human("たかし", 35, "プログラミング") ;

        // sayメソッドの呼び出し
        human.say();

        // thinkメソッドの呼び出し
        human.think();

    }
}
