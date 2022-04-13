package com.example.konversimatauang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.konversimatauang.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.konversi.setOnClickListener {onKonversiButtonClicked()}
    }

    private fun onKonversiButtonClicked() {
        val stringInTextField = binding.nameEditText.text.toString()
        val nilai = stringInTextField.toDoubleOrNull()

        if (nilai == null || nilai == 0.0) {
            binding.textView2.text = ""
            return
        }

        val konversiUang = when (binding.radioGroup.checkedRadioButtonId) {
            R.id.radioButton1 -> 16000.0
            R.id.radioButton2 -> 14000.0
            R.id.radioButton3 -> 114.0
            else -> 4000.0
        }

        var conversion = konversiUang * nilai
        val indonesianLocale = Locale("in", "ID")
        val formattedTip =
            NumberFormat.getCurrencyInstance(indonesianLocale).format(conversion)
        binding.textView2.text = getString(R.string.nilai_rupiah, formattedTip)
    }
}