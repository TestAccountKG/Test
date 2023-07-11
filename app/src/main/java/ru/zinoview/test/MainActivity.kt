package ru.zinoview.test

import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("zinoviewk","a is $a")
        if(savedInstanceState == null) {
            a = 5
        }
        print(1)
        print(2)
        print(3)


        print(4)
        print(5)
        print(6)

        print(7)
        print(8)
        print(9)

        print(10)
        print(11)
        print(12)

        print(13)
    }

    private companion object {
        var a = Int.MIN_VALUE
    }
}