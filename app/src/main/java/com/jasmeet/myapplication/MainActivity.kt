package com.jasmeet.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jasmeet.dialog.CarnotDialog
import com.jasmeet.myapplication.databinding.ActivityMainBinding
import com.jasmeet.myapplication.databinding.DemoNbaBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var bind :DemoNbaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bind = DemoNbaBinding.inflate(layoutInflater)

        binding.customDialog.setOnClickListener {

            var dialog = CarnotDialog(this, R.layout.demo_nba, "Demo Dialog", "Yes",
                { _, _ ->
                    Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
                }, "No", { dialog, _ ->
                    dialog.dismiss()
                })
        }

    }
}