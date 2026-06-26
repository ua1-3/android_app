

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.windget.Button

class MainActivity : AppCompatActivity(){

    lateinit var btnAdd : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}