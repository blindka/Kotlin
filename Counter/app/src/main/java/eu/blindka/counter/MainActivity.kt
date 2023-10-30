package eu.blindka.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() { /*MainActivity inherit from AppCompatActivity*/
    override fun onCreate(savedInstanceState: Bundle?) { /*fun - function*/
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) /*sets the layout of acitvity_main.xml*/

        /*val btnClickMe = findViewById<Button>(R.id.counter) /*allow us to use button class*/
        btnClickMe.setOnClickListener {
            btnClickMe.text = "Counter++" /*actions done by clicking on the button*/
        }*/
        val btnClickMe = findViewById<Button>(R.id.counter) /*allow us to use button class*/
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1
            tvMyTextView.text = timesClicked.toString()
        }
    }
}