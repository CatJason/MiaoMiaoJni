package com.miao.javajni

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        // 加载动态库
        init {
            System.loadLibrary("native-lib")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 调用 JNI 函数
        val messageFromJNI = stringFromJNI()

        // 将 JNI 返回的字符串显示在 TextView 中
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = messageFromJNI
    }

    // JNI 函数声明
    private external fun stringFromJNI(): String
}

