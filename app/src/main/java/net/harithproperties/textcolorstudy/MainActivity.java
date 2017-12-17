package net.harithproperties.textcolorstudy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Timer timer;
    TextView txtHello,txtWorld;
    Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello=(TextView)findViewById(R.id.txtHello);
        txtWorld=(TextView)findViewById(R.id.txtWorld);
        btnChange=(Button)findViewById(R.id.btnChange);

        btnChange.setOnClickListener(this);
    }


    public void change() {

        timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {
                // avoid exception:
                // "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {
                    public void run() {

                        txtHello.setTextColor(Color.RED);







                    }
                });
            }



        }, 0, 1000);







    }


    public void change2() {

        timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {
                // avoid exception:
                // "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {
                    public void run() {

                        txtWorld.setTextColor(Color.RED);







                    }
                });
            }



        }, 1000, 1000);







    }

    @Override
    public void onClick(View view) {

        if(view==btnChange){
            change();
            change2();
        }

    }
}
