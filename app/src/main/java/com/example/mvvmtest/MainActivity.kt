package com.example.mvvmtest


import android.view.KeyEvent
import android.view.View
import androidx.fragment.app.Fragment
import com.orange.jzchi.jzframework.JzActivity

class MainActivity : JzActivity() {
    override fun changePageListener(tag: String, frag: Fragment) {

    }

    override fun keyEventListener(event: KeyEvent): Boolean {
       return true
    }

    override fun viewInit(rootview: View) {
getControlInstance().setHome(TestFragment(),"TestFragment")
    }


}
