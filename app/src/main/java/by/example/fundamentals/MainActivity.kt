package by.example.fundamentals

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import by.example.fundamentals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.helloAndroidAcademyBTN.setOnClickListener {
            binding.helloWorldTV.text = getString(R.string.message)
            Toast.makeText(this, getString(R.string.message), Toast.LENGTH_SHORT).show()
        }
    }
}