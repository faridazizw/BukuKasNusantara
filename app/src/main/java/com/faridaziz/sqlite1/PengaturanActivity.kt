package com.faridaziz.sqlite1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class PengaturanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan)

        var ed_password: EditText = findViewById(R.id.ed_password)
        var ed_passwordBaru: EditText = findViewById(R.id.ed_passwordBaru)
        var btn_simpanPassword: Button = findViewById(R.id.btn_simpanPassword)
        var btn_kembali: Button = findViewById(R.id.btn_kembali)

        btn_kembali.setOnClickListener(this)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val back = Intent(this@PengaturanActivity, MainActivity::class.java)
        overridePendingTransition(0, 0)
        startActivity(back)
        overridePendingTransition(0, 0)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){

            R.id.btn_kembali ->{
                onBackPressed()
            }

        }


    }
}