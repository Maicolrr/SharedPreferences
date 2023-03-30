package com.mnrr.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ResultadoUser: TextView=findViewById(R.id.User)
        val ResultadoPass: TextView= findViewById(R.id.Pass)

        val miBundle: Bundle?= this.intent.extras

        if (miBundle!= null){

            ResultadoUser.text="Hola "+miBundle.getString("user")
            ResultadoPass.text="su contraseña es: "+miBundle.getString("pass")
        }

        val btnAtras: Button = findViewById(R.id.btnAtras)
        btnAtras.setOnClickListener {salir()}



    }

    private fun salir(){
        finish()
    }
}