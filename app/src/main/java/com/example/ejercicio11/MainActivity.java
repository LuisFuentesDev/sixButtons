package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.ejercicio11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonPlane.setOnClickListener(view -> Toast.makeText(this, "Modo avión desactivado", Toast.LENGTH_SHORT).show());
        binding.buttonUpdating.setOnClickListener(view -> Toast.makeText(this, "Perfil actualizado", Toast.LENGTH_SHORT).show());
        binding.buttonPictured.setOnClickListener(view -> Toast.makeText(this, "Imágen guardada en la galería", Toast.LENGTH_SHORT).show());
        binding.buttonUnlocked.setOnClickListener(view -> Toast.makeText(this, "Nivel 5 desbloqueado", Toast.LENGTH_SHORT).show());
        binding.buttonLevel.setOnClickListener(view -> Toast.makeText(this, "Nivel 4 completado", Toast.LENGTH_SHORT).show());
        binding.buttonMusic.setOnClickListener(view -> Toast.makeText(this, "Musica pausada", Toast.LENGTH_SHORT).show());
    }

}