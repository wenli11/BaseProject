package pers.dg.baseproject

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pers.dg.baseproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val  binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = User("bin", "0", 0, "hello world")
        binding.tv;
        binding.bt;
    }
}
