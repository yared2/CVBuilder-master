package com.example.cvbuilder

import android.app.Activity
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cvbuilder.newSkill
import kotlinx.android.synthetic.main.activity_new_skill.*

class newSkill : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_skill)
    }

    fun add(view: View) {
        var intt=intent
        var msg=newSkill.text.toString()
        intt.data= Uri.parse(msg)
        setResult(Activity.RESULT_OK,intt)
        finish()
    }
}
