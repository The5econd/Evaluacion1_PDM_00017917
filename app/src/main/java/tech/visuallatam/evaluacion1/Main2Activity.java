package tech.visuallatam.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView name2, mail2;
    private Button shareB;
    private String nombre, correo, cadena;
    private Button bb1, bb2, bb3, bb4, bb5, bb6, bb7, bb8, bb9;
    private int sumaProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name2 = findViewById(R.id.name2);
        mail2 = findViewById(R.id.mail2);

        bb1 = findViewById(R.id.boton_11);
        bb2 = findViewById(R.id.boton_22);
        bb3 = findViewById(R.id.boton_33);
        bb4 = findViewById(R.id.boton_44);
        bb5 = findViewById(R.id.boton_55);
        bb6 = findViewById(R.id.boton_66);
        bb7 = findViewById(R.id.boton_77);
        bb8 = findViewById(R.id.boton_88);
        bb9 = findViewById(R.id.boton_99);
        Intent mIntent = getIntent();

        if(mIntent != null){
            String name = mIntent.getStringExtra("NOMBRE");
            name2.setText(name);
            nombre = name2.getText().toString();
            String mail = mIntent.getStringExtra("CORREO");
            mail2.setText(mail);
            correo = mail2.getText().toString();


            ////////////////////datos recibidos de todos los productos
            String producto1 = mIntent.getStringExtra("producto1");
            bb1.setText(producto1);
            String producto2 = mIntent.getStringExtra("producto2");
            bb2.setText(producto2);
            String producto3 = mIntent.getStringExtra("producto3");
            bb3.setText(producto3);
            String producto4 = mIntent.getStringExtra("producto4");
            bb4.setText(producto4);
            String producto5 = mIntent.getStringExtra("producto5");
            bb5.setText(producto5);
            String producto6 = mIntent.getStringExtra("producto6");
            bb6.setText(producto6);
            String producto7 = mIntent.getStringExtra("producto7");
            bb7.setText(producto7);
            String producto8 = mIntent.getStringExtra("producto8");
            bb8.setText(producto8);
            String producto9 = mIntent.getStringExtra("producto9");
            bb9.setText(producto9);

            sumaProductos = Integer.parseInt(producto1) + Integer.parseInt(producto2) + Integer.parseInt(producto3) + Integer.parseInt(producto4) +
                    Integer.parseInt(producto5) + Integer.parseInt(producto6) + Integer.parseInt(producto7) + Integer.parseInt(producto8) + Integer.parseInt(producto9);
        }
        cadena = "Nombre: " + nombre + "\n" + "Correo: " + correo + "\n" + "Total de productos: " + sumaProductos;



        shareB = findViewById(R.id.share_btn);
        shareB.setOnClickListener( v->{
            Intent i = new Intent();
            i.setAction(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, cadena);
            startActivity(i);
        });
    }
}
