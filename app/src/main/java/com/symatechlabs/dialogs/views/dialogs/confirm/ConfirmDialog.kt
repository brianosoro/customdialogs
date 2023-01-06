package com.symatechlabs.dialogs.views.dialogs.confirm


import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment



class ConfirmDialog: DialogFragment() {



    lateinit var confirmDialogMvc: ConfirmDialogMvc;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        confirmDialogMvc = ConfirmDialogMvc(LayoutInflater.from(activity), null, this);
        confirmDialogMvc.setListerners();
        return confirmDialogMvc.getRootView_();
    }



    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        this.dismiss();
    }


}