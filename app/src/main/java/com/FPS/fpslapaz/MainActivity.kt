package com.FPS.fpslapaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.text = "RESTAR"

      button1.setOnClickListener(){
          var annoDeNaciomiento:Int = annio.text.toString().toInt()
          val edad : Int = 2021 - annoDeNaciomiento

           textView5.text = "tu edad es   $edad   años"
         var respuesta: String = "Usted presento : "

          if (checkBox.isChecked ){
              respuesta = respuesta + " Examen 1 "
          }
          if (checkBox2.isChecked ) {
              respuesta = respuesta + " Examen 2 "
          }
          if (radioButton.isChecked ){
              respuesta = respuesta + " Proyecto 1 "
          }
          if (radioButton2.isChecked) {
              respuesta = respuesta + " Proyecto  2 "
          }
          
          textView.text = respuesta
      }

}

      fun sumar(){

          //sadasd
      }
}