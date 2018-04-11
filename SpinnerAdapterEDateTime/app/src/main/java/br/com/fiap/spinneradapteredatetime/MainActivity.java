package br.com.fiap.spinneradapteredatetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spnPaises;
    AutoCompleteTextView actEstadosBrasil;
    DatePicker dtpDataNasc;
    String[] paises = {
            "Australia",
            "Brasil",
            "China",
            "Dinamarca",
            "Espanha",
            "França",
            "Guiana"
    };

    String[] estadosBrasil = {
            "Acre",
            "Alagoas",
            "Bahia",
            "Ceará",
            "Distrito Federal",
            "Espírito Santo",
            "Goiás",
            "Maranhão"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnPaises = findViewById(R.id.spnPaises);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
          this, android.R.layout.simple_list_item_1, paises
        );

        spnPaises.setAdapter(adapter);

        actEstadosBrasil = findViewById(R.id.actEstadosBrasil);
        ArrayAdapter<String> adapterEstadosBrasil = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, estadosBrasil
        );

        actEstadosBrasil.setAdapter(adapterEstadosBrasil);
        dtpDataNasc = findViewById(R.id.dtpDataNasc);
    }

    public void salvar(View view) {
        String pais = spnPaises.getSelectedItem().toString();
        Toast.makeText(this, "Você selecionou " + pais, Toast.LENGTH_SHORT).show();
        int dia  = dtpDataNasc.getDayOfMonth();
        int mes  = dtpDataNasc.getMonth() + 1;
        int ano = dtpDataNasc.getYear();

        String anoFormatado = String.format("%d/%d/%d", dia, mes, ano);
        Toast.makeText(this, anoFormatado, Toast.LENGTH_SHORT).show();
    }
}
