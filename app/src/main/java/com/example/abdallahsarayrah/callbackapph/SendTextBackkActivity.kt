package com.example.abdallahsarayrah.callbackapph

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_send_text_backk.*

class SendTextBackkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_text_backk)

        buttonSendTextBack.setOnClickListener {
            var intent = Intent()
            intent.putExtra("value", editText.text.toString())
            setResult(1, intent)
            finish()
        }
    }
}
