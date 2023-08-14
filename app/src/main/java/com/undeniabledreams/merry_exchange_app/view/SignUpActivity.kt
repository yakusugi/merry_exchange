package com.undeniabledreams.merry_exchange_app.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.undeniabledreams.merry_exchange_app.R
import com.undeniabledreams.merry_exchange_app.dao.UserRegistrationDao
import com.undeniabledreams.merry_exchange_app.dto.UserDto
import java.io.IOException

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setContentView(R.layout.activity_sign_up)

        val signUpBtn: Button = findViewById(R.id.login_btn)

        signUpBtn.setOnClickListener{
            val userName : String = findViewById<EditText>(R.id.edit_text_sign_up_user_name).text.toString()
            val email : String = findViewById<EditText>(R.id.edit_text_sign_up_user_email).text.toString()
            val password : String = findViewById<EditText>(R.id.edit_text_sign_up_user_pw).text.toString()

            try {
                val userDto = UserDto(userName, password, email)
                val userRegistrationDao = UserRegistrationDao(this)
                userRegistrationDao.insertIntoUser(userDto)
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }

    }
}