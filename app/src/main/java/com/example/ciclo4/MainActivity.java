package com.example.ciclo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Drawable drawable_home1;
    ImageView imagehome1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        drawable_home1 = res.getDrawable(R.drawable.imagehome1, getTheme());

        imagehome1 = (ImageView) findViewById(R.id.imagehome1);
        imagehome1.setImageDrawable(drawable_home1);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opciones, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opcion_inicio){
            Toast.makeText(getApplicationContext(), "Opcion Inicio", Toast.LENGTH_LONG ).show();
            Intent inicioPantalla = new Intent(this, MainActivity.class);
            startActivity(inicioPantalla);
        }

        if (id == R.id.opcion_productos){
            Toast.makeText(getApplicationContext(), "Opcion Productos", Toast.LENGTH_LONG ).show();
            Intent productosPantalla = new Intent(this, MainActivity2.class);
            startActivity(productosPantalla);
        }

        if (id == R.id.opcion_servicios){
            Toast.makeText(getApplicationContext(), "Opcion Servicios", Toast.LENGTH_LONG ).show();
            Intent serviciosPantalla = new Intent(this, MainActivity3.class);
            startActivity(serviciosPantalla);
        }

        if (id == R.id.opcion_sucursales){
            Toast.makeText(getApplicationContext(), "Opcion Sucursales", Toast.LENGTH_LONG ).show();
            Intent sucursalesPantalla = new Intent(this, MainActivity4.class);
            startActivity(sucursalesPantalla);
        }


        return super.onOptionsItemSelected(item);


    }
}