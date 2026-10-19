package com.ebiegberi.chat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
        
        if (auth.currentUser != null) {
            startActivity(Intent(this, ChatActivity::class.java))
            finish()
        } else {
            // For now go straight to chat, you can add login later
            startActivity(Intent(this, ChatActivity::class.java))
            finish()
        }
    }
}
