package com.example.nyoba

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editBase = findViewById<EditText>(R.id.editBase)
        val editHeight = findViewById<EditText>(R.id.editHeight)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnCalculate.setOnClickListener {
            val base = editBase.text.toString().toDoubleOrNull()
            val height = editHeight.text.toString().toDoubleOrNull()

            if (base != null && height != null) {
                val area = 0.5 * base * height
                txtResult.text = "Luas: %.2f cm²".format(area)
            } else {
                txtResult.text = "Masukkan angka yang valid!"
            }
        }
    }
}
