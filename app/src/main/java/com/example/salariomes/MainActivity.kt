package com.example.salariomes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nomeFuncionario         = txtNomeFuncionario.text.toString()


            btnCalcular.setOnClickListener {

                //Variáveis
                 var valorHoraTrabalhada     = txtValorHoraTrabalhada.text.toString().toFloat()
                 var qtdDiasTrabalhados      = txtDiasTrabalhados.text.toString().toInt()
                 var qtdHorasDias            = txtQtdHorasDias.text.toString().toInt()

                //Variáveis Descontos
                var iss = 0.05
                var fgts = 0.08

                var salarioBruto             = qtdHorasDias * qtdDiasTrabalhados * valorHoraTrabalhada
                var descISS                  = salarioBruto * iss
                var descFGTS                 = salarioBruto * fgts
                var salarioLiquido           = salarioBruto - (descISS + descFGTS)

                lblSalarioBruto.text         = "Salário Bruto: ${salarioBruto}"
                lblDescISS.text              = "Desconto ISS: ${descISS}"
                lblDescFGTS.text             = "Desconto FGTS: ${descFGTS}"
                lblSalarioLiquido.text       = "Salário Líquido: ${salarioLiquido}"


        }


    }
}