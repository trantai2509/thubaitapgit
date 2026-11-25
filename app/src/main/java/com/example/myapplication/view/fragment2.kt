package com.example.myapplication.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.model.dulieuvande

class fragment2 : Fragment(R.layout.activity_fragment2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnthongtin = view.findViewById<Button>(R.id.btnthongtin)
        val btnquaylai = view.findViewById<Button>(R.id.btnquaylai)

        // 1. Click để hiện bảng thông tin vấn đề đã lưu
        btnthongtin.setOnClickListener {
            val vd = dulieuvande.vande1
            val noidung = "Mã SV: ${vd.masv}\nHọ tên: ${vd.hoten}\nLớp: ${vd.lop}\nĐiểm chuyên cần: ${vd.diemchuyencan}\n\nMô tả: ${vd.mota}\n\nGiải pháp: ${vd.giaiphap}"

            AlertDialog.Builder(requireContext())
                .setTitle("Thông tin sinh viên")
                .setMessage(noidung)
                .setPositiveButton("Đóng", null)
                .show()
        }

        // 2. Nút quay lại màn 1
        btnquaylai.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}
