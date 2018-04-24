package com.example.aileenlaverty.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RPSActivity extends AppCompatActivity {

    private Button rockButton;
    private Button paperButton;
    private Button scissorButton;
    private TextView weapon;
    private TextView winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = findViewById(R.id.rockButtonID);
        paperButton = findViewById(R.id.paperButtonID);
        scissorButton = findViewById(R.id.scissorButtonID);
        weapon = findViewById(R.id.weaponTextViewID);
        winner = findViewById(R.id.winnerTextViewID);

    }

    public void onWeaponButtonClick(View v){
        Button b = (Button)v;
//        We have used casting () to be able to use the methods on Button
//        which do not exists on parent class View.
//      https://stackoverflow.com/questions/5620772/get-text-from-pressedhttps://stackoverflow.com/questions/5620772/get-text-from-pressed-button-button
        String buttonName = b.getText().toString();
        winner.setText("You have selected " + buttonName) ;

    }
}
