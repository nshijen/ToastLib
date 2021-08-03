package com.cjn.extlib

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {
        fun showToast(context: Context, msg:String) {
            Toast.makeText(context,msg, Toast.LENGTH_SHORT).show()
        }
    }
}