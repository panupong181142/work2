package com.example.work2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val o = Toast.makeText(applicationContext,"ห้าม username กับ passwordเหมือนกัน.",Toast.LENGTH_LONG)
        val g = Toast.makeText(applicationContext,"รหัสผ่านไม่ตรงกัน.",Toast.LENGTH_LONG)
        val v = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.",Toast.LENGTH_LONG)
        val l = Toast.makeText(applicationContext,"สมัครเสร็จสิ้น.",Toast.LENGTH_LONG)

        buOK.setOnClickListener(){
            if (this.user.text.toString() == "" || this.pass01.text.toString() == "" || this.pass02.text.toString() == ""){
                v.show()
            }
            else{
                if (this.user.text.toString() == this.pass01.text.toString() || this.user.text.toString() == this.pass01.text.toString()||
                    this.user.text.toString() == this.pass01.text.toString() && this.user.text.toString() == this.pass02.text.toString()){
                    o.show()
                }
                else
                    if (this.pass01.text.toString() == this.pass02.text.toString()){
                        l.show()
                    }
                    else{
                        g.show()
                    }
            }
        }

        buClear.setOnClickListener(){
            user.setText(null)
            pass01.setText(null)
            pass02.setText(null)
        }
    }
}