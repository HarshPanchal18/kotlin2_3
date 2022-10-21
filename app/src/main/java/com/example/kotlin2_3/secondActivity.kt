package com.example.kotlin2_3

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val msg = findViewById<TextView>(R.id.txvUserMessage)
        val usrmsg = findViewById<EditText>(R.id.usrmsg)
        val homebtn = findViewById<Button>(R.id.homescr)
        val sharebtn = findViewById<Button>(R.id.sendToOtherApp)

        msg.text = intent.getStringExtra("user_message").toString()

        homebtn.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }

        sharebtn.setOnClickListener {
            var intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, usrmsg.text.toString())
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select Your application:"))
        }
    }
}