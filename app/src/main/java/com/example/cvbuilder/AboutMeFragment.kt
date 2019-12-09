package com.example.cvbuilder


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class AboutMeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v=inflater.inflate(R.layout.fragment_about_me, container, false)
        var b:StringBuilder=java.lang.StringBuilder("")
        b.append("Operating Systems:Windows 19xx/20xx/XP/NT, UNIX/Linux \n" +
                "Technical Support: Installation, Configuration  and Troubleshooting of Hardware and Software \n"+
        "Languages:Visual Basic, C, C++, Visual C++, Java, HTML, XML, ASP.NET \n" +
        "Database Management:Relational Databases. SQL, PL/SQL, MS Access \n"+
        "Applications:MS Office (Word, Excel, PowerPoint, Outlook), MS Projec \n")

        v.findViewById<TextView>(R.id.textView11).append(b)
        return v
    }


}
