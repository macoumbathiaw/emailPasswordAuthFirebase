package com.nimble.mthiaw.nebulauserregistrationandlogin;

import android.app.ProgressDialog;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;

public class ProgressBar extends AppCompatActivity {

    //creating an instance of a progress bar
    @VisibleForTesting
    public ProgressDialog mProgressDialog;

    //method to show progressbar
    public void showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setMessage(getString(R.string.loading));
            mProgressDialog.setIndeterminate(true);
        }

        //start the progress with .show
        mProgressDialog.show();
    }

    //method to hide the progress bar
    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    //stop the progress bar
    @Override
    public void onStop() {
        super.onStop();
        hideProgressDialog();
    }

}
