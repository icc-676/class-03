package com.abs.clase03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.abs.clase03.adapters.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: RecyclerViewAdapter
    var presentStudents = ArrayList<Student>()
    var students = arrayListOf(
        Student("AGUILA/KIBLISKY/CARLOS", "19309333-7")
        , Student("ANABALON/DIAZ/JOSE TOMAS", "19606579-2")
        , Student("APARA/REINEKING/NICOLAS CLAUS", "19078455-K")
        , Student("CARRIL/TORRENS/IGNACIO ANTONIO", "17959104-9")
        , Student("CASTRO/GONZALEZ/JULIO ANDRES", "20003285-3")
        , Student("DIAZ/PARADA/RAIMUNDO ENRIQUE", "19813719-7")
        , Student("DONOSO/APABLAZA/JOHNNY ANTONIO", "19528764-3")
        , Student("ESPINOLA/PARRA/NATALIA ANDREA", "19831720-9")
        , Student("FIGUEROA/MC INTYRE/SANTIAGO JOSE", "19606307-2")
        , Student("GANA/JARA/VICENTE", "20282886-8")
        , Student("GARCES/SANTANDER/IGNACIO FELIPE", "19932271-0")
        , Student("GONZALEZ/RODRIGUEZ-PEÑA/SEBASTIAN LUIS", "19567222-9")
        , Student("IBAÑEZ/GUZMAN/ANDRES", "19246732-2")
        , Student("JARA/CARRASCO/KATHERINE", "19877309-3")
        , Student("JIMENEZ/IGLESIAS/FRANCISCO JAVIER", "19134117-1")
        , Student("LE MAY/DE LA LASTRA/RICHARD ALEXANDER", "19893210-8")
        , Student("MARTINEZ/MIRANDA/RAIMUNDO ALBERTO", "19438746-6")
        , Student("MORENO/CERDA/MARTIN", "19838173-K")
        , Student("PONCE/BECERRA/MATIAS ARIEL", "20040933-7")
        , Student("TRAVERSO/PRADO/GIANFRANCO STEFANO", "19687033-4")
        , Student("VELEZ/SAAVEDRA/EMILIO IGNACIO", "19079893-3")
        , Student("VIAL/CORREA/ANDRES", "19638846-K")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        adapter = RecyclerViewAdapter(presentStudents)
        recyclerView.adapter = adapter

        button.setOnClickListener {
            presentStudents.add(students.last())
            adapter.notifyItemInserted(presentStudents.size - 1)
            students.removeAt(students.size - 1)
        }
    }
}
