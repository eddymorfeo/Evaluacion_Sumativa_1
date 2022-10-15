package cl.aiep.android.edward.tejeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Vamos a declar los edittext que vamos a modificar
        val etNombre = findViewById<EditText>(R.id.editTexNombre)
        val etApellido = findViewById<EditText>(R.id.editTextApellido)
        val etCiudad = findViewById<EditText>(R.id.editTextCiudad)

        findViewById<Button>(R.id.btn_ingresar).setOnClickListener {

            val nombre = etNombre.text.toString()
            val apellido = etApellido.text.toString()
            val ciudad = etCiudad.text.toString()

            if (nombre.isNullOrEmpty() || apellido.isNullOrEmpty() || ciudad.isNullOrEmpty()){
                Toast.makeText(this, "Debes ingresar un valor en el campo solicitado", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val intentIngresar = Intent(this,MainActivity2::class.java)

            intentIngresar.putExtra("NombreEnviado", nombre)
            intentIngresar.putExtra("ApellidoEnviado", apellido)
            intentIngresar.putExtra("CiudadEnviado", ciudad)

            startActivity(intentIngresar)
        }
    }
}