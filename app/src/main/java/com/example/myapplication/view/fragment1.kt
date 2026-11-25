package com.example.myapplication.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class fragment1 : Fragment(R.layout.activity_fragment1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnchuyenman = view.findViewById<Button>(R.id.btnchuyenman)
        btnchuyenman.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmenthost, fragment2())
                .addToBackStack(null)
                .commit()
        }
    }
}
