package cl.aiep.android.edward.tejeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvNombreApellido = findViewById<TextView>(R.id.textView3)
        //val tvApellido2 = findViewById<EditText>(R.id.editTextApellido)
        val tvCiudad2 = findViewById<TextView>(R.id.textView4)

        val nombre = intent.getStringExtra("NombreEnviado").toString()
        val apellido = intent.getStringExtra("ApellidoEnviado").toString()
        val ciudad = intent.getStringExtra("CiudadEnviado").toString()

        tvNombreApellido.text = nombre + " - " + apellido
        tvCiudad2.text = ciudad

        findViewById<Button>(R.id.btnVolver).setOnClickListener {
            val intentVolver = Intent(this,MainActivity::class.java)
            startActivity(intentVolver)
        }
    }
}