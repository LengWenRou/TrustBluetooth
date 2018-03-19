package com.trust.trustbluetooh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.trust.trustbluetooth.BlueActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        to_blue.setOnClickListener {
            startActivity(Intent(this,BlueActivity::class.java))
        }
    }
}
