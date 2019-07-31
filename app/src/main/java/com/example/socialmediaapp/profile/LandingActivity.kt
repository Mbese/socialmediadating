package com.example.socialmediaapp.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialmediaapp.R
import kotlinx.android.synthetic.main.activity_main.*

class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }
}
