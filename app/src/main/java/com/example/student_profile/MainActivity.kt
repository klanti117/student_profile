package com.example.student_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var layoutManager:LinearLayoutManager
    lateinit var adapter:StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        LAYOUT
        layoutManager= LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

//        ADAPTER
        var s1:Student=Student("Hermione","🤓",1);
        var s2=Student("Harry","😴",2);
        var s3=Student("Draco","😎",3);
        adapter= StudentAdapter(arrayListOf(s1,s2,s3))
        recyclerView.adapter=adapter
    }
}
