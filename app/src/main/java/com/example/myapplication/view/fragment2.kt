package com.example.myapplication.view

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.model.dulieuvande
import com.example.myapplication.model.vande

class fragment2 : Fragment(R.layout.activity_fragment2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val btnxemvande = view?.findViewById<Button>(R.id.btnthongtin)
        val btnquaylai = view?.findViewById<Button>(R.id.btnquaylai)
        // 1. Click để hiện bảng thông tin vấn đề đã lưu
        btnxemvande?.setOnClickListener {
            val vd = dulieuvande.vande1
            val noidung = "Mã: ${vd.masv}\n\nMô tả: ${vd.mota}\n\nGiải pháp: ${vd.giaiphap}"

            AlertDialog.Builder(requireContext())
                .setTitle(vd.hoten)
                .setMessage(noidung)
                .setPositiveButton("Hiển thị", null)
                .show()
        }
        // 2. Nút quay lại màn 1
        btnquaylai?.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

    }
}