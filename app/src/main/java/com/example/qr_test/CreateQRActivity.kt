package com.example.qr_test

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.qr_test.databinding.ActivityQrCreateBinding
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder

class CreateQRActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQrCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQrCreateBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        try {
            val barcodeEncoder = BarcodeEncoder()
            val bitmap =
                barcodeEncoder.encodeBitmap("https://naver.com/", BarcodeFormat.QR_CODE, 400, 400)
            val imageViewQrcode: ImageView = binding.imageQR
            imageViewQrcode.setImageBitmap(bitmap)
        } catch (e: Exception) {

        }
    }
}