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
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Drawable drawable_prod1, drawable_prod2, drawable_prod3, drawable_prod4;
    ImageView imageproducto1, imageproducto2, imageproducto3, imageproducto4;
    Button boton1, boton2, boton3, boton4;
    TextView texto_productos;
    TextView producto1, producto2, producto3, producto4;
    TextView descripcion1, descripcion2, descripcion3, descripcion4;
    TextView canasta1, canasta2, canasta3, canasta4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resources res = getResources();

        drawable_prod1 = res.getDrawable(R.drawable.imageproducto1, getTheme());

        imageproducto1 = (ImageView) findViewById(R.id.imageproducto1);
        imageproducto1.setImageDrawable(drawable_prod1);

        drawable_prod2 = res.getDrawable(R.drawable.imageproducto2, getTheme());

        imageproducto2 = (ImageView) findViewById(R.id.imageproducto2);
        imageproducto2.setImageDrawable(drawable_prod2);

        drawable_prod3 = res.getDrawable(R.drawable.imageproducto3, getTheme());

        imageproducto3 = (ImageView) findViewById(R.id.imageproducto3);
        imageproducto3.setImageDrawable(drawable_prod3);

        drawable_prod4 = res.getDrawable(R.drawable.imageproducto4, getTheme());

        imageproducto4 = (ImageView) findViewById(R.id.imageproducto4);
        imageproducto4.setImageDrawable(drawable_prod4);


        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canasta1.setText("Se agrego a la canasta");
                Toast.makeText(getApplicationContext(), "Gracias por su compra", Toast.LENGTH_LONG ).show();
            }
        });

        boton2 = (Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canasta2.setText("Se agrego a la canasta");
                Toast.makeText(getApplicationContext(), "Gracias por su compra", Toast.LENGTH_LONG ).show();
            }
        });

        boton3 = (Button) findViewById(R.id.boton3);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canasta3.setText("Se agrego a la canasta");
                Toast.makeText(getApplicationContext(), "Gracias por su compra", Toast.LENGTH_LONG ).show();
            }
        });

        boton4 = (Button) findViewById(R.id.boton4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canasta4.setText("Se agrego a la canasta");
                Toast.makeText(getApplicationContext(), "Gracias por su compra", Toast.LENGTH_LONG ).show();
            }
        });

        texto_productos = (TextView) findViewById(R.id.texto_productos);
        producto1 = (TextView) findViewById(R.id.producto1);
        producto2 = (TextView) findViewById(R.id.producto2);
        producto3 = (TextView) findViewById(R.id.producto3);
        producto4 = (TextView) findViewById(R.id.producto4);
        canasta1 = (TextView) findViewById(R.id.canasta1);
        canasta2 = (TextView) findViewById(R.id.canasta2);
        canasta3 = (TextView) findViewById(R.id.canasta3);
        canasta4 = (TextView) findViewById(R.id.canasta4);
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