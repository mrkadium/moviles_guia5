package com.uso.guia5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonConversation:Button = findViewById(R.id.buttonConversation)
        buttonConversation.setOnClickListener{
            var intent:Intent = Intent(this, ConversationActivity::class.java)
            startActivity(intent)
        }

        var buttonLogin:Button = findViewById(R.id.buttonLogin)
        buttonLogin.setOnClickListener{
            var intent:Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        var buttonCalculator:Button = findViewById(R.id.buttonCalculator)
        buttonCalculator.setOnClickListener{
            var intent:Intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}