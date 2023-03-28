package com.example.taller1corte2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ShopActivity extends AppCompatActivity {

    private EditText etProductName, etProductQuantity;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        etProductName = findViewById(R.id.etProductName);
        etProductQuantity = findViewById(R.id.etProductQuantity);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productName = etProductName.getText().toString();
                String productQuantity = etProductQuantity.getText().toString();

                if (productName.isEmpty() || productQuantity.isEmpty()) {
                    Toast.makeText(ShopActivity.this, "Por favor llenar todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    int quantity = Integer.parseInt(productQuantity);
                    int totalPrice = purchase(productName, quantity);
                    updateProductQuantity(productName, quantity);

                    String message = "El precio total es " + totalPrice;
                    Toast.makeText(ShopActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public int purchase(String productName, int quantity) {
        int price = 1000; // Precio por unidad
        return price * quantity;
    }

    public boolean updateProductQuantity(String productName, int quantity) {
        // Actualizar la cantidad de productos en la base de datos o en memoria
        return false;
    }
}

