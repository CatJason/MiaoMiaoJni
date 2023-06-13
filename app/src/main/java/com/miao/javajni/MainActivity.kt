package com.miao.javajni

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    companion object {
        // 加载本地库
        init {
            System.loadLibrary("native-lib")
        }
    }

    // 声明本地方法
    private val nativeString: String
        external get

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 调用本地方法
        val nativeString = nativeString

        // 将本地方法返回的字符串显示在TextView上
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = nativeString
    }
}
