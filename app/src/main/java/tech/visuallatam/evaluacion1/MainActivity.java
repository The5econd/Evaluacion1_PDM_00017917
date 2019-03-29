package tech.visuallatam.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, send;
    EditText nombre, email;
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;
    int cont4 = 0;
    int cont5 = 0;
    int cont6 = 0;
    int cont7 = 0;
    int cont8 = 0;
    int cont9 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.boton_1);
        b2 = findViewById(R.id.boton_2);
        b3 = findViewById(R.id.boton_3);
        b4 = findViewById(R.id.boton_4);
        b5 = findViewById(R.id.boton_5);
        b6 = findViewById(R.id.boton_6);
        b7 = findViewById(R.id.boton_7);
        b8 = findViewById(R.id.boton_8);
        b9 = findViewById(R.id.boton_9);
        send = findViewById(R.id.boton_send);
        nombre = findViewById(R.id.username_main);
        email = findViewById(R.id.email_main);


        send.setOnClickListener(v ->{
            Intent int1 = new Intent(MainActivity.this,Main2Activity.class);
            int1.putExtra("NOMBRE", nombre.getText().toString());
            int1.putExtra("CORREO", email.getText().toString());

            int1.putExtra("producto1", b1.getText().toString());
            int1.putExtra("producto2", b2.getText().toString());
            int1.putExtra("producto3", b3.getText().toString());
            int1.putExtra("producto4", b4.getText().toString());
            int1.putExtra("producto5", b5.getText().toString());
            int1.putExtra("producto6", b6.getText().toString());
            int1.putExtra("producto7", b7.getText().toString());
            int1.putExtra("producto8", b8.getText().toString());
            int1.putExtra("producto9", b9.getText().toString());
            startActivity(int1);
        });

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int x = v.getId();
        switch (x){
            case R.id.boton_1:
                cont1++;
                b1.setText(cont1+"");
                break;
            case R.id.boton_2:
                cont2++;
                b2.setText(cont2+"");
                break;
            case R.id.boton_3:
                cont3++;
                b3.setText(cont3+"");
                break;
            case R.id.boton_4:
                cont4++;
                b4.setText(cont4+"");
                break;
            case R.id.boton_5:
                cont5++;
                b5.setText(cont5+"");
                break;
            case R.id.boton_6:
                cont6++;
                b6.setText(cont6+"");
                break;
            case R.id.boton_7:
                cont7++;
                b7.setText(cont7+"");
                break;
            case R.id.boton_8:
                cont8++;
                b8.setText(cont8+"");
                break;
            case R.id.boton_9:
                cont9++;
                b9.setText(cont9+"");
                break;
        }

    }
}
