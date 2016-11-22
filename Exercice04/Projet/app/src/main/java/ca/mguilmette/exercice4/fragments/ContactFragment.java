package ca.mguilmette.exercice4.fragments;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ca.mguilmette.exercice4.R;
import ca.mguilmette.exercice4.model.Contact;

/**
 * Created by guilmarc on 2016-11-22.
 */


public class ContactFragment extends DialogFragment {

    //On crée une variable locale dans le cas où on voudrait utiliser cet objet plus tard
    private Contact contact;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Création de la vue à partir du layout associé
        View view = inflater.inflate(R.layout.fragment_contact, container);

        //Récupération du Bundle et extraction d'un contact sérialisé
        Bundle bundle = this.getArguments();
        contact = (Contact)bundle.getSerializable(Contact.CONTACT_KEY);

        //Affectation des valeurs du Contact dans les différents contrôles utilisateurs
        ((TextView)view.findViewById(R.id.contactNameTextView)).setText(contact.getName());
        ((TextView)view.findViewById(R.id.contactNumberTextView)).setText(contact.getPhoneNumber());

        return view;
    }
}
