package com.symatechlabs.dialogs.views.dialogs.confirm


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import androidx.fragment.app.DialogFragment
import com.symatechlabs.dialogs.databinding.ConfirmRequestDialogBinding


class ConfirmDialogMvc(inflater: LayoutInflater, parent: ViewGroup?, dialog: DialogFragment)  : ConfirmDialogInterface{

     var rootView: View;
     var confirmRequestDialogBinding: ConfirmRequestDialogBinding;
     var dialog: DialogFragment;

    init {
        this.dialog = dialog;
        confirmRequestDialogBinding = ConfirmRequestDialogBinding.inflate(inflater);
        rootView = confirmRequestDialogBinding.root;
    }


    override fun setListerners() {
        confirmRequestDialogBinding.cancel.setOnClickListener{ v->
                dialog.dismiss();
        }

        confirmRequestDialogBinding.submit.setOnClickListener{  v->
            Toast.makeText(getContext(), "Do stuff here", Toast.LENGTH_SHORT).show();
        }
    }


    override fun getRootView_(): View {
            return rootView;
    }

    override fun getContext(): Context {
        return rootView.context;
    }


}