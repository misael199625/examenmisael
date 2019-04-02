package misael.itics.tesoem.edu.examenmisael;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OPERACIONESPANTALLA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacionespantall);
    }

    public void llamarp(View v){
        Intent intent = new Intent(this,SUMA.class);
        startActivity(intent);
    }
    public void llamarpo(View v){
        Intent intent = new Intent(this,RESTA.class);
        startActivity(intent);
    }
    public void llamarpa(View v){
        Intent intent = new Intent(this,POTENCIA.class);
        startActivity(intent);
    }
    public void llamarpe(View v){
        Intent intent = new Intent(this,PANTALLASALIDA.class);
        startActivity(intent);
    }
    public void llamarpi(View v){
        System.exit(0);
    }
    }

