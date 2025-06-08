package ar.edu.g2dev.iftsestudiantes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botón "Ver Calificaciones"
        findViewById<Button>(R.id.btnCalificaciones).setOnClickListener {
            val grades = Intent(this, GradesActivity::class.java)
            startActivity(grades)
            Toast.makeText(this, "Entramos a Calificaciones", Toast.LENGTH_SHORT).show()
        }

        // Botón "Vencimientos de TP"
        findViewById<Button>(R.id.btn_assignments).setOnClickListener {
            Toast.makeText(this, "Vencimiento", Toast.LENGTH_SHORT).show()
        }


        // Botón Asistencia
        findViewById<Button>(R.id.btnAsistencia).setOnClickListener {
            Toast.makeText(this, "Asistencia", Toast.LENGTH_SHORT).show()
        }

        // Botón About
        findViewById<Button>(R.id.btnAbout).setOnClickListener {
            Toast.makeText(this, "2025 - Software IFTS Estudiantes versión 0.1.0", Toast.LENGTH_LONG).show()
        }
    }
}