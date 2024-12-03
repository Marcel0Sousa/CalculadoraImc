package com.comunidadedevspace.imc

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso: TextInputEditText = findViewById(R.id.edt_peso)
        val edtAltura: TextInputEditText = findViewById(R.id.edt_altura)
        val btnCalcular: Button = findViewById(R.id.btn_calcular)


        btnCalcular.setOnClickListener {


            val peso = edtPeso.text.toString().toFloat()
            val altura = edtAltura.text.toString().toFloat()

            val altura2 = altura * altura
            val resultado = peso / altura2

            AlertDialog.Builder(this)
                .setTitle("Resultado: " + resultado)
                .setPositiveButton("Ok") { _, _ ->

                }
                .show()
        }
    }
}