package com.symatechlabs.dialogs.views.home

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity

class StartActivity: AppCompatActivity(){

    lateinit var startActivityMvc: StartActivityMvc;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivityMvc = StartActivityMvc(LayoutInflater.from(this), null, this);
        setContentView(startActivityMvc.getRootView_());
        startActivityMvc.setListerners();
    }
}