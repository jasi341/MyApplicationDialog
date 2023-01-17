package com.jasmeet.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jasmeet.dialog.CarnotDialog
import com.jasmeet.myapplication.databinding.ActivityMainBinding
import com.jasmeet.myapplication.databinding.DemoNbaBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var carnotDialog: CarnotDialog
    private lateinit var containerLayout: DemoNbaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        containerLayout = DemoNbaBinding.inflate(layoutInflater)

        binding.customDialog.setOnClickListener {
            carnotDialog = CarnotDialog(this)
            carnotDialog.setContainer(containerLayout.root, R.layout.demo_nba)
            carnotDialog.setTitle("NBA")
            carnotDialog.setPositiveBtn("OK") {
                Toast.makeText(this, "This is Working +", Toast.LENGTH_SHORT).show()
            }
            carnotDialog.setNegativeBtn("Cancel") {
                Toast.makeText(this, "This is Working -", Toast.LENGTH_SHORT).show()
            }
            carnotDialog.showDialog()
        }
    }
}