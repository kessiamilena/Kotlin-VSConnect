package com.senai.vsconnect_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.senai.vsconnect_kotlin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Atribui a variável binding um objeto que contém referencias(propriedades)
        // aos elementos definidos no layout
        binding = ActivityLoginBinding.inflate(layoutInflater)

        //acessa a informação do layout botão(id = btnEntrar)
        // ao clicar setOnClickListener { } ouvinte do clique
        //val não pode modificar o valor padrão
        //ponto de partida ------ onde quer ir
        //sair do login e ir para mainActivity
        binding.btnEntrar.setOnClickListener {
            //criar uma variável(mainIntent) com a intenção de sair e LoginActivity ir para mainActivity
            val mainIntent = Intent(this@LoginActivity,
                MainActivity::class.java)

            //inicia a intenção de or para ian activity
            startActivity(mainIntent)

            //finaliza login
            finish()
        }

        setContentView(binding.root)
    }
}