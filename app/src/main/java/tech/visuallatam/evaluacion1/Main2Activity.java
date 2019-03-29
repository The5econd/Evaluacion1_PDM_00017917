package tech.visuallatam.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView name2, mail2;
    private Button shareB;
    private String txt1, txt2, cadena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name2 = findViewById(R.id.name2);
        mail2 = findViewById(R.id.mail2);
        Intent mIntent = getIntent();

        if(mIntent != null){
            String name = mIntent.getStringExtra("NOMBRE");
            name2.setText(name);
            txt1 = name2.getText().toString();
            String mail = mIntent.getStringExtra("CORREO");
            mail2.setText(mail);
            txt2 = mail2.getText().toString();
        }
        cadena = txt1 + "\n" + txt2;


/*
        shareB = findViewById(R.id.share_btn);
        shareB.setOnClickListener( v->{
            Intent i = new Intent();
            i.setAction(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, cadena);
            startActivity(i);
        });*/
    }
}
