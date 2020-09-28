package au.co.mansaandmusa.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateBmi = findViewById(R.id.calculateBmi) as Button
        calculateBmi.setOnClickListener(){

            val userWeight : EditText = findViewById(R.id.userWeight)
            val userHeight:EditText = findViewById(R.id.userHeight)
            val resultView: TextView = findViewById(R.id.resultView)

            val height: Double = userHeight.text.toString().toDouble()
            val weight: Double = userWeight.text.toString().toDouble()
            var myBmi: Double = (weight/height/height)*10000
            myBmi = Math.round(myBmi * 10.0) / 10.0;
            resultView.setText("$myBmi")
        }

    }
}