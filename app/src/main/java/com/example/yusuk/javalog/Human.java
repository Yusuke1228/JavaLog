package com.example.yusuk.javalog;

import android.util.Log;

/**
 * Created by yusuk on 2017/12/13.
 */

public class Human extends Animal implements Thinkable {

    // メンバ変数
    String hobby;

    // Humanクラスのコンストラクタを生成
    public Human (String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える。");
    }
}
