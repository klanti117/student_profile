package com.example.student_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_students_details.*

class StudentsDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_details)
    }

    override fun onStart() {
        var emoji:String=intent.extras.getString("emoji")
        var numAbs:Int=intent.extras.getInt("numAbs")
        textView_from_students_details.text=emoji
        numAbs_textViewID.text=numAbs.toString()

        super.onStart()
    }
}
