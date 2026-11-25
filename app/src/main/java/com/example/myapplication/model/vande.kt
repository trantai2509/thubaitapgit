package com.example.myapplication.model

data class vande (
    val masv: String,
    val hoten: String,
    val lop: String,
    val diemchuyencan: String,
    val mota: String,
    val giaiphap: String
)

object dulieuvande {
    val vande1 = vande(
        masv = "23115053122139",
        hoten = "Trần Thanh Tài",
        lop = "23T1",
        diemchuyencan = "9.0",
        mota = "đi học đầy đủ",
        giaiphap = "Nhắc nhở: cố gắng làm bài tập"
    )
}
