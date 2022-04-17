package com.khushal.internalexampracticalwithsqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnInsert.setOnClickListener{
            var name=edtFrName.text.toString()
            var desc=edtFrDesc.text.toString()
            var price=edtFrPrice.text.toString().toInt()
            var fruit=Fruit(name,desc,price)

            /*the below line code means to create the database if not there and if there then
             update in it and make the table if not */
            var db=DBHelper(this)

            var flag=db.insert(fruit)
            if(flag)
            {
                Toast.makeText(this,"Record Inserted Successfully",Toast.LENGTH_LONG).
                        show()
            }
        }
        btnViewAll.setOnClickListener{
            var intent= Intent(this,ViewAllActivity::class.java)
            startActivity(intent)
        }
    }
}