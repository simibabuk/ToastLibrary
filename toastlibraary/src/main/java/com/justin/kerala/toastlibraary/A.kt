package com.justin.kerala.toastlibraary

import android.content.Context
import android.widget.Toast

class A{
    fun show(s:String,c:Context){
        Toast.makeText(c,"inside library $s",Toast.LENGTH_LONG).show()
    }

}