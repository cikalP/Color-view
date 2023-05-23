package com.example.codingchalange2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.codingchalange2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    private fun changeColor(view: View){
        when(view.id){
            R.id.box_blue -> setColor("BLUE",R.id.box_blue)
            R.id.box_red -> setColor("BLUE",R.id.box_red)
            R.id.box_green -> setColor("BLUE",R.id.box_green)
            R.id.box_violet -> setColor("BLUE",R.id.box_violet)
            R.id.box_mint -> setColor("BLUE",R.id.box_mint)
            R.id.box_orange -> setColor("BLUE",R.id.box_orange)
            R.id.box_cream -> setColor("BLUE",R.id.box_cream)
            R.id.box_cream2 -> setColor("BLUE",R.id.box_cream2)
            R.id.button -> setColor("BLUE",R.id.button)
        }
    }
    private fun setColor(warna:String,color:Int){
        binding.boxBlue.setBackgroundResource(color)
        binding.boxRed.setBackgroundResource(color)
        binding.boxGreen.setBackgroundResource(color)
        binding.boxViolet.setBackgroundResource(color)
        binding.boxMint.setBackgroundResource(color)
        binding.boxOrange.setBackgroundResource(color)
        binding.boxCream.setBackgroundResource(color)
        binding.boxCream2.setBackgroundResource(color)
        binding.button.setBackgroundResource(color)

    }

    private fun setDefaultColor(){
        binding.boxBlue.setBackgroundResource(R.color.blue)
        binding.boxRed.setBackgroundResource(R.color.red)
        binding.boxGreen.setBackgroundResource(R.color.green)
        binding.boxViolet.setBackgroundResource(R.color.violet)
        binding.boxMint.setBackgroundResource(R.color.mint)
        binding.boxOrange.setBackgroundResource(R.color.orange)
        binding.boxCream.setBackgroundResource(R.color.peach)
        binding.boxCream2.setBackgroundResource(R.color.cream2)
        binding.button.setBackgroundResource(R.color.blue)

//        val toast = Toast.makeText(this,"Berhasil mengembalikan warna default",
//    Toast.LENGTH_SHORT)
//    toast.setGravity(Gravity.TOP,0,0)
//    toast.show()
//        val snackB =
//            Snackbar.make(requireViewById(androidx.core.R.id.text_box))

    }
    private fun setListeners(){
        val clickableViews: List<View> =
            listOf(binding.boxBlue,binding.boxRed,binding.boxGreen,binding.boxViolet,binding.boxMint
            ,binding.boxOrange,binding.boxCream,binding.boxCream2,binding.button)

        for (item in clickableViews){
            item.setOnClickListener {
                changeColor(it)
            }
        }
    }

}