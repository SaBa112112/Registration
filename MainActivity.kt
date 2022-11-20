package com.example.registrationpage

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nm : EditText
    private lateinit var sr : EditText
    private lateinit var em : EditText
    private lateinit var ps : EditText
    private lateinit var ch : CheckBox
    private lateinit var bt : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nm = findViewById(R.id.name)
        sr = findViewById(R.id.surname)
        em = findViewById(R.id.email)
        ps = findViewById(R.id.password)
        ch = findViewById(R.id.checkbox)
        bt = findViewById(R.id.button)

        bt.setOnClickListener {

            if(nm.text.toString().length < 3 || nm.text.toString().isEmpty() || sr.text.toString().length < 5 || sr.text.toString().isEmpty()){
                Toast.makeText(this,"არასწორი სახელი და გვარი",Toast.LENGTH_SHORT).show()
            }
            else if(!em.text.toString().isNullOrEmpty() && !Patterns.EMAIL_ADDRESS.matcher(em.text.toString()).matches()){
                Toast.makeText(this,"არასწორი ემაილი",Toast.LENGTH_SHORT).show()
            }
            else if(ps.text.toString().isEmpty() || ps.text.toString().length < 8){
                Toast.makeText(this,"არასწორი პაროლი",Toast.LENGTH_SHORT).show()
            }
            else if(!ch.isChecked){
                Toast.makeText(this,"თქვენ არ დათანხმებულხართ წესებსა და პირობებს",Toast.LENGTH_SHORT).show()
            }
            else{Toast.makeText(this,"თქვენ წარმატებით გაიარეთ რეგისტრაცია",Toast.LENGTH_SHORT).show()}
        }
    }
}
