package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

const val KEY_RESULT_IMC = "KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResultado: TextView = findViewById(R.id.tv_resultado)
        val tvClassificacao: TextView = findViewById(R.id.tv_classificacao)

        val resultado = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val numeroFormat = String.format("%.2f", resultado)
        tvResultado.text = numeroFormat

        tvClassificacao.text = when {
            resultado <= 18.5f -> {
                tvClassificacao.setTextColor(ContextCompat.getColor(this, R.color.red))
                "MAGREZA"
            }
            resultado > 18.5f && resultado <= 24.9f -> {
                tvClassificacao.setTextColor(ContextCompat.getColor(this, R.color.green))
                "NORMAL"
            }
            resultado > 25f && resultado <= 29.9f -> {
                tvClassificacao.setTextColor(ContextCompat.getColor(this, R.color.orange))
                "SOBREPESO"
            }
            resultado > 30f && resultado <= 39.9f -> {
                tvClassificacao.setTextColor(ContextCompat.getColor(this, R.color.orangered))
                "OBESIDADE"
            }
            else -> {
                tvClassificacao.setTextColor(ContextCompat.getColor(this, R.color.red))
                "OBESIDADE GRAVE"
            }
        }

    }
}