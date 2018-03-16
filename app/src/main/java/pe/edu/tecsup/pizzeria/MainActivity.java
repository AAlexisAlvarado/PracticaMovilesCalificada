package pe.edu.tecsup.pizzeria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controlador(); //este es el metodo que abre el layout 2


    }

    public void controlador() {

                Intent ListPizza = new Intent(getApplicationContext(), VideoViewActivity.class);
                startActivity(ListPizza);

    }
}
