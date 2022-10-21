package com.example.kotlin2_3

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
/*
to add this, append
id 'kotlin-android'
id 'kotlin-android-extensions'
in build.gradle(:app)
https://stackoverflow.com/questions/52271521/import-kotlinx-android-synthetic-main-activity-main-is-not-working
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.btnShowToast)
        val msgbtn:Button=findViewById(R.id.sendIntent)

        btn.setOnClickListener{
            Toast.makeText(this, "Clicked ! ", Toast.LENGTH_SHORT).show()
        }

        msgbtn.setOnClickListener {
            val message = findViewById<EditText>(R.id.usermessage).text.toString()
            //val mssg:String=message.text.toString()

            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            var showmsg = findViewById<TextView>(R.id.msgtxt)
            showmsg.text=message
            Log.i("Harsh",message)
            //showmsg=message

            var intent = Intent(this, secondActivity::class.java)
            Log.i("Harsh",message)
            intent.putExtra("user_message", message)
            startActivity(intent)

            /*val intent= Intent(applicationContext, secondActivity::class.java)
            startActivity(intent)
*/
            /*val intentEntrar = Intent(this@MainActivity, secondActivity::class.java)
            intentEntrar.putExtra("user_message", message)
            startActivity(intentEntrar)*/
        }
    }
}