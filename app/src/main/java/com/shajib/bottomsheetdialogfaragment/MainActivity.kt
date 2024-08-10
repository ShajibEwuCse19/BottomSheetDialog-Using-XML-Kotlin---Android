package com.shajib.bottomsheetdialogfaragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showBottomSheetButton = findViewById<Button>(R.id.btnBottomSheet)
        showBottomSheetButton.setOnClickListener {
            MyBottomSheetDialogFragment().show(supportFragmentManager, "my_bottom_sheet")
        }
    }
}