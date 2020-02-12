package com.example.student_profile

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class StudentAdapter(val students:ArrayList<Student>): RecyclerView.Adapter<StudentAdapter.StudentHolder>() {
    class StudentHolder(v:View):RecyclerView.ViewHolder(v), View.OnClickListener{
        var name:String=""
        var emoji:String=""
        var numAbs:Int=0
        var view:View=v;
        fun onBind(name:String,emoji:String,numAbs:Int){
            this.name=name;
            this.emoji=emoji;
            this.numAbs=numAbs;
            view.numAbs_textViewID.text=name

        }
        init {
            view.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            var detailIntent= Intent(view.context,StudentsDetailsActivity::class.java)
            detailIntent.putExtra("emoji",emoji)
            detailIntent.putExtra("numAbs",numAbs)
            startActivity(view.context,detailIntent,null)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        return StudentHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,
            parent,false))
    }

    override fun getItemCount(): Int {
        return students.count();
    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        holder.onBind(students[position].name,students[position].emoji,
            students[position].numAbs)
    }


}