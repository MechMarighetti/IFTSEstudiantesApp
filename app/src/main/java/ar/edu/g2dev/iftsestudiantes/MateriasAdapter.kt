package ar.edu.g2dev.iftsestudiantes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class MateriasAdapter(
    private val asignaturas: List<GradeMateria>, // Lista de Materias.
        private val contexto: Context          // Contexto de la aplicación (necesario para inflar vistas y mostrar toasts).
    ) : RecyclerView.Adapter<MateriasAdapter.MateriasViewHolder>() {

         // ViewHolder contiene las referencias a los elementos de cada ítem.
        // Utiliza item_libro.xml como layout base.


        class MateriasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val tvMateria: TextView = itemView.findViewById(R.id.tvMateria)
            val tvNota: TextView = itemView.findViewById(R.id.tvNota)
        }

        // Infla el layout de cada ítem (item_vengador.xml) y crea un nuevo ViewHolder.
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriasViewHolder {
            val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_materia, parent, false)
            return MateriasViewHolder(vista)
        }

        // Asocia los datos del ítem en la posición indicada con el ViewHolder.
        // También configura el evento de clic para mostrar un mensaje.
        override fun onBindViewHolder(hold: MateriasViewHolder, pos: Int) {
            val materia = asignaturas[pos]
            hold.tvMateria.text = materia.materia
            hold.tvNota.text = materia.nota.toString()

            hold.itemView.setOnClickListener {
                Toast.makeText(contexto, "Seleccionaste: ${materia.materia} tu nota es: ${materia.nota}", Toast.LENGTH_LONG)
                    .show()
            }
        }

        // Devuelve la cantidad total de ítems a mostrar.
        override fun getItemCount(): Int = asignaturas.size
    }
