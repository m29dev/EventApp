package com.example.eventapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener {

//    lateinit var btnAdd : Button
//    lateinit var btnSub : Button
//    lateinit var btnMul : Button
//    lateinit var btnDiv : Button
//    lateinit var etA : EditText
//    lateinit var etB : EditText
//    lateinit var resultTv : TextView

    lateinit var etLogin : EditText
    lateinit var etPassword : EditText
    lateinit var btnSignIn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        btnAdd = findViewById(R.id.btn_add)
//        btnSub = findViewById(R.id.btn_subtraction)
//        btnMul = findViewById(R.id.btn_multiplication)
//        btnDiv = findViewById(R.id.btn_division)
//        etA =  findViewById(R.id.et_a)
//        etB = findViewById(R.id.et_b)
//        resultTv = findViewById(R.id.result_tv)

        etLogin = findViewById(R.id.et_login)
        etPassword = findViewById(R.id.et_password)
        btnSignIn = findViewById(R.id.btn_signin)

//        btnAdd.setOnClickListener(this)
//        btnSub.setOnClickListener(this)
//        btnMul.setOnClickListener(this)
//        btnDiv.setOnClickListener(this)

        btnSignIn.setOnClickListener(this)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }

    override fun onClick(v: View?) {
        var login = etLogin.text.toString()
        var password = etPassword.text.toString()

        when(v?.id){
            R.id.btn_signin -> {
                Log.i("Credentials", "Login: $login, Password: $password")
            }
        }
    }

//    override fun onClick(v: View?) {
//        var a = etA.text.toString().toDouble()
//        var b = etB.text.toString().toDouble()
//        var result = 0.0
//
//        when(v?.id){
//            R.id.btn_add -> {
//                result = a+b
//            }
//            R.id.btn_subtraction -> {
//                result = a-b
//            }
//            R.id.btn_multiplication -> {
//                result = a*b
//            }
//            R.id.btn_division -> {
//                result = a/b
//            }
//        }
//
//        resultTv.text = "Result is $result"
//    }
}