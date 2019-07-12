package pers.dg.baseproject

import android.util.Log
import android.view.View
import android.widget.TextView

data class User(val name : String,
                val id : String,
                val type : Int,
val default_name : String){
    fun onClickForUser(view : View, name : String){
        val  tv :TextView
        tv = view as TextView
        Log.e(tv.text.toString(), "被点击了")
    }
}