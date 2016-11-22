package ca.mguilmette.exercice4.activities;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ca.mguilmette.exercice4.R;
import ca.mguilmette.exercice4.fragments.ContactFragment;
import ca.mguilmette.exercice4.model.Contact;

public class MainActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleOpenContactButtonOnClick(View view){
        Intent intent = new Intent(this, ContactActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        switch (requestCode) {
            case REQUEST_CODE:

                if(resultCode == RESULT_OK) {

                    ContactFragment contactFragment = new ContactFragment();
                    contactFragment.setArguments(intent.getExtras());
                    contactFragment.show(getFragmentManager(), "dialog");

                }


                break;
        }
    }
}
