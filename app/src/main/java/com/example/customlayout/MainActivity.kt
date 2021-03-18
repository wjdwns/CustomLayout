package com.example.customlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.part1.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        part1.imageView.setImageResource(R.mipmap.ic_launcher)
        part1.textView3.setText("홍길동")
        part1.textView4.setText("010-0000-0000")

        button.setOnClickListener{
            part1.imageView.setImageResource(R.drawable.computer)
        }
        button2.setOnClickListener{
            part1.imageView.setImageResource(R.drawable.computer2)
        }
    }
}