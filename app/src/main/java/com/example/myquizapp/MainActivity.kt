package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: AppCompatEditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
