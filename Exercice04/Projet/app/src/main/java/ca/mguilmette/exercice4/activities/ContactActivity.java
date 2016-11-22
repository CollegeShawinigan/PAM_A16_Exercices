package ca.mguilmette.exercice4.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import ca.mguilmette.exercice4.R;
import ca.mguilmette.exercice4.model.Contact;
import ca.mguilmette.exercice4.utils.DialogHelper;

/**
 * Created by guilmarc on 2016-11-22.
 */

public class ContactActivity extends AppCompatActivity {

    EditText contactFirstNameEditText;
    EditText contactLastNameEditText;
    EditText contactNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        contactFirstNameEditText = (EditText)this.findViewById(R.id.contactFirstNameEditText);
        contactLastNameEditText = (EditText)this.findViewById(R.id.contactLastNameEditText);
        contactNumberEditText = (EditText)this.findViewById(R.id.contactNumberEditText);
    }

    public void handleOKButtonOnClick(View view){

        if( contactFirstNameEditText.getText().toString().length() == 0 ) {
            showErrorMessage(contactFirstNameEditText);
            return;
        }

        if( contactLastNameEditText.getText().toString().length() == 0 ) {
            showErrorMessage(contactLastNameEditText);
            return;
        }

        if( contactNumberEditText.getText().toString().length() == 0 ) {
            showErrorMessage(contactNumberEditText);
            return;
        }

        //Une fois certain que tous les champs ont été entrés, on crée l'objet Contact
        Contact contact = new Contact(contactFirstNameEditText.getText().toString(), contactLastNameEditText.getText().toString(), contactNumberEditText.getText().toString());

        //On passe ensuite l'objet Contact à l'Intent de retour
        Intent intent = this.getIntent();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Contact.CONTACT_KEY, contact);
        intent.putExtras(bundle);
        this.setResult(RESULT_OK, intent);
        finish();

    }

    public void handleCancelButtonOnClick(View view){
        this.setResult(RESULT_CANCELED, null);
        finish();
    }

    private void showErrorMessage(View view){
        DialogHelper.showErrorMessage(this, "Formulaire incomplet", "Vous devez remplir le champ " + view.getTag() + ".");
    }

}
