package com.huaweiinten.sampleapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.huaweiinten.sampleapplication.R



class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)

        val sharedPreferences = getSharedPreferences(
            getString(R.string.shared_preferences),
            Context.MODE_PRIVATE
        )

        //If already logged in once, directly open Dashboard
        if (sharedPreferences.getBoolean("isLoggedIn", false)) {

            startActivity(intent)
            finish()
        } else {

        }
    }
}