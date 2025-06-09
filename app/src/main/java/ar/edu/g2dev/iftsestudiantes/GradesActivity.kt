package ar.edu.g2dev.iftsestudiantes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class GradeMateria(val materia: String, val nota: String)

class GradesActivity : AppCompatActivity() {
    private val asignaturas = listOf(
        GradeMateria("Elementos de Análisis Matemático", "5"),
        GradeMateria("Técnicas de Programación", "10"),
        GradeMateria("Desarrollo de Aplicaciones para Dispositivos Móviles", "2"),
        GradeMateria(
            "Desarrollo de Sistemas de Información Orientados a la Gestión y Apoyo a las Decisiones",
            "6"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grades)

        val rvMaterias: RecyclerView = findViewById(R.id.rvCalificaciones)
        rvMaterias.layoutManager = LinearLayoutManager(this)
        rvMaterias.adapter = MateriasAdapter(asignaturas, this)


    }

}