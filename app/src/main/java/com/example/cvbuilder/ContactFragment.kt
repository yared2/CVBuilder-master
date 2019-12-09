package com.example.cvbuilder


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_contact.*

/**
 * A simple [Fragment] subclass.
 */
class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v=inflater.inflate(R.layout.fragment_contact, container, false)
        v.findViewById<EditText>(R.id.editStreet).setText("123 Street")
        v.findViewById<EditText>(R.id.editCity).setText("Richmond")
        v.findViewById<EditText>(R.id.editCountry).setText("USA")
        v.findViewById<EditText>(R.id.editEmail).setText("habrom12@gmail.com")
        v.findViewById<EditText>(R.id.editPhone).setText("2013456544")
        v.findViewById<EditText>(R.id.editState).setText("Iowa")

        return v

    }


}
