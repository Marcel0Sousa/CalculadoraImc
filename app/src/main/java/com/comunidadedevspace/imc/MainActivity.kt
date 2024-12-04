package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso: TextInputEditText = findViewById(R.id.edt_peso)
        val edtAltura: TextInputEditText = findViewById(R.id.edt_altura)
        val btnCalcular: Button = findViewById(R.id.btn_calcular)


        btnCalcular.setOnClickListener {


            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr.isEmpty() || alturaStr.isEmpty()
            ) {
                Snackbar.make(edtPeso, "Preencha todos os campos", Snackbar.LENGTH_LONG).show()
            } else {

                val peso: Float = pesoStr.toFloat()
                val altura: Float = alturaStr.toFloat()

                val altura2 =  altura * altura
                val resultado = peso / altura2


                AlertDialog.Builder(this)
                    .setTitle("Resultado: " + resultado)
                    .setPositiveButton("Ok") { _, _ ->

                    }
                    .show()
            }

        }
    }
}