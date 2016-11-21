package ca.mguilmette.exercice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import ca.mguilmette.exercice1.model.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Début du code ICI !!!
        Car car1 = new Car(CarBrandEnum.Nissan, 210, "090FG56H7");
        RacingCar formula1 = new RacingCar(CarBrandEnum.Ferrari, 350, "Ferrari", "Shell");
        Boat boat1 = new Boat("The Love Boat", 40);

        car1.Run();
        formula1.Run();
        boat1.Run();

        try
        {
            formula1.setSpeed(380);
        }
        catch (RunTooFastException e)
        {
            System.out.println(e.getMessage());
        }

        //Fin du code ICI
    }
}
