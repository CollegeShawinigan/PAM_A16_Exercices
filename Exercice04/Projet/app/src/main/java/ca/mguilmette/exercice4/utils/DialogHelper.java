package ca.mguilmette.exercice4.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;

/**
 * Created by guilmarc on 2016-11-22.
 */

public final class DialogHelper {

    public static void showErrorMessage(Context context, String title, String message){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //Si on voulais faire quelque chose sur l'appuie de OK
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
