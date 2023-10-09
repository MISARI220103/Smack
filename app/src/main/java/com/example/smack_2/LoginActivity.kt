package com.example.smack_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginCreateUserBtnClicked(view:View)
    {
        val createUserIntent=Intent(this,CreateUserActivity::class.java)
        startActivity(createUserIntent)
    }
    fun loginLoginBtnClicked(view:View)
    {

    }
}