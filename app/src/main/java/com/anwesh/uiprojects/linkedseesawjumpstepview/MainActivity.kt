package com.anwesh.uiprojects.linkedseesawjumpstepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.balancescalestepview.BalanceScaleStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BalanceScaleStepView.create(this)
    }
}
