package com.example.cvbuilder


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

/**
 * A simple [Fragment] subclass.
 */
class WorkExprienceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_work_exprience, container, false)
        v.findViewById<EditText>(R.id.editAddress).setText("123 Street, Iowa Richmond USA")
        v.findViewById<EditText>(R.id.editAddress2).setText("Halow Street Sembel Asmara Eritrea")
        v.findViewById<EditText>(R.id.editDuties).setText("Made key contributions to back-end software development and implementation")
        v.findViewById<EditText>(R.id.editDuties2).setText("Conducted troubleshooting, debugging and upgrading of existing software")
        v.findViewById<EditText>(R.id.editOrg).setText("Bamk of Amarica")
        v.findViewById<EditText>(R.id.editOrg2).setText("Google")
        v.findViewById<EditText>(R.id.editRole).setText("Software developer")
        v.findViewById<EditText>(R.id.editRole2).setText("Network Administrator")
        v.findViewById<EditText>(R.id.editFrom).setText("09/09/1992")
        v.findViewById<EditText>(R.id.editFrom2).setText("09/09/1992")
        v.findViewById<EditText>(R.id.editTo).setText("09/09/1992")
        v.findViewById<EditText>(R.id.editTo2).setText("09/09/1992")
        return v
    }


}
