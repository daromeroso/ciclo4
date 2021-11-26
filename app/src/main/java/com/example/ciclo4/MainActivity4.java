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

public class MainActivity4 extends AppCompatActivity {

    Drawable drawable_suc1, drawable_suc2, drawable_suc3, drawable_suc4;
    ImageView img_sucursal1, img_sucursal2, img_sucursal3, img_sucursal4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Resources res = getResources();

        drawable_suc1 = res.getDrawable(R.drawable.img_sucursal1, getTheme());

        img_sucursal1 = (ImageView) findViewById(R.id.img_sucursal1);
        img_sucursal1.setImageDrawable(drawable_suc1);

        drawable_suc2 = res.getDrawable(R.drawable.img_sucursal2, getTheme());

        img_sucursal2 = (ImageView) findViewById(R.id.img_sucursal2);
        img_sucursal2.setImageDrawable(drawable_suc2);

        drawable_suc3 = res.getDrawable(R.drawable.img_sucursal3, getTheme());

        img_sucursal3 = (ImageView) findViewById(R.id.img_sucursal3);
        img_sucursal3.setImageDrawable(drawable_suc3);

        drawable_suc4 = res.getDrawable(R.drawable.img_sucursal4, getTheme());

        img_sucursal4 = (ImageView) findViewById(R.id.img_sucursal4);
        img_sucursal4.setImageDrawable(drawable_suc4);

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

        if (id == R.id.opcion_productos) {
            Toast.makeText(getApplicationContext(), "Opcion Productos", Toast.LENGTH_LONG).show();
            Intent productosPantalla = new Intent(this, MainActivity2.class);
            startActivity(productosPantalla);
        }

        if (id == R.id.opcion_servicios) {
            Toast.makeText(getApplicationContext(), "Opcion Servicios", Toast.LENGTH_LONG).show();
            Intent serviciosPantalla = new Intent(this, MainActivity3.class);
            startActivity(serviciosPantalla);
        }

        if (id == R.id.opcion_sucursales) {
            Toast.makeText(getApplicationContext(), "Opcion Sucursales", Toast.LENGTH_LONG).show();
            Intent sucursalesPantalla = new Intent(this, MainActivity4.class);
            startActivity(sucursalesPantalla);
        }

        return super.onOptionsItemSelected(item);

    }
}