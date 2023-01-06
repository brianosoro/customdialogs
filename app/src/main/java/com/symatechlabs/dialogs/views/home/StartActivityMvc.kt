package com.symatechlabs.dialogs.views.home

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.symatechlabs.dialogs.databinding.StartActivityBinding
import com.symatechlabs.dialogs.views.dialogs.confirm.ConfirmDialog


class StartActivityMvc(inflater: LayoutInflater, parent: ViewGroup?, application: AppCompatActivity)  : StartActivityInterface{

    var rootView: View;
    var startActivityBinding: StartActivityBinding;
    private var appCompatActivity: AppCompatActivity;

    init {
        startActivityBinding =  StartActivityBinding.inflate(inflater);
        rootView = startActivityBinding.root;
        appCompatActivity = application;
    }

    override fun setListerners() {
        startActivityBinding.openDialog.setOnClickListener{
            ConfirmDialog().show(appCompatActivity.supportFragmentManager, "");
        }
    }


    override fun getRootView_(): View {
            return rootView;
    }

    override fun getContext(): Context {
        return rootView.context;
    }



}