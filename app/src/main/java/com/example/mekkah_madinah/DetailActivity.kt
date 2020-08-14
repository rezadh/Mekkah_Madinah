package com.example.mekkah_madinah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_IMAGE = "extra_image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val nama: TextView = findViewById(R.id.tv_detail_nama)
        val actionbar = supportActionBar
        val namagetstring = intent.getStringExtra(EXTRA_NAME)
        nama.text = namagetstring
        tv_detail_lokasi.setText(intent.getStringExtra(EXTRA_LOCATION))
        tv_detail_deskripsi.setText(intent.getStringExtra(EXTRA_DESCRIPTION))
        Glide.with(this).load(intent.getStringExtra(EXTRA_IMAGE)?.toInt()).into(img_detail_photo)
        actionbar!!.title = namagetstring
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}