package com.shivam.gharseekers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.hbb20.CountryCodePicker
import com.shivam.gharseekers.Util.AndroidUtil
import com.shivam.gharseekers.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding
    private lateinit var btnSend : Button
    private lateinit var number : EditText
    private lateinit var code : CountryCodePicker
    private lateinit var verifyViaGoogle : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        number = binding.edtNumber
        btnSend = binding.btnSend
        code = binding.countryCode
        verifyViaGoogle = binding.imgGoogle

        verifyViaGoogle.setOnClickListener {

        }

        code.registerCarrierNumberEditText(number)

        btnSend.setOnClickListener {
            if (code.isValidFullNumber) {
                var intent = Intent(this, OTPVerificationActivity::class.java)
                intent.putExtra("number", code.fullNumberWithPlus)
                startActivity(intent)
            } else {
                number.setError("Enter a valid number!!")
                AndroidUtil.showToast(this, "Invalid number!!")
            }
        }
    }

    private fun signIn() {

    }


    private fun nevigateToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}