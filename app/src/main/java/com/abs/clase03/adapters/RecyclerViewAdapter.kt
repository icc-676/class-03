package com.abs.clase03.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abs.clase03.R
import com.abs.clase03.Student
import com.abs.clase03.inflate
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class RecyclerViewAdapter(private val students: ArrayList <Student>):
    RecyclerView.Adapter<RecyclerViewAdapter.StudentCard>() {

    override fun onBindViewHolder(holder: StudentCard, position: Int) {
        val student = students[position]
        holder.bindStudent(student)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentCard {
        val inflatedView = parent.inflate(R.layout.recyclerview_item_row, false)
        return  StudentCard(inflatedView)
    }

    override fun getItemCount(): Int = students.count()

    class StudentCard(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener{
        private var view: View = v
        private var student: Student? = null

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            print("Se aprieta boton")
        }

        fun bindStudent(student: Student) {
            this.student = student
            view.nameTextView.text = student.name
            view.rutTextView.text = student.rut
        }
    }

}
