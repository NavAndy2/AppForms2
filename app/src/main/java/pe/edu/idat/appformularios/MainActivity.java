package pe.edu.idat.appformularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import pe.edu.idat.appformularios.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btncalcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Integer numero1 = Integer.parseInt(binding.txtnumero1.getText().toString());
        Integer numero2 = Integer.parseInt(binding.txtnumero2.getText().toString());
        Integer suma = sumar(numero1, numero2);
        binding.tvresultadosuma.setText("La suma es = " + suma);
    }

    private Integer sumar(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }
}