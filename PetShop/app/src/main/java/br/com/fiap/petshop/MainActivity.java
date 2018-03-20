package br.com.fiap.petshop;

import android.app.admin.DeviceAdminInfo;
import android.app.admin.DeviceAdminReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    CheckBox chkFemea, chkAdestrado, chkVacina;
    RadioGroup rdgCachorro;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgCachorro = findViewById(R.id.rdgCachorro);
        chkFemea = findViewById(R.id.chkFemea);
        chkAdestrado = findViewById(R.id.chkAdestrado);
        chkVacina = findViewById(R.id.chkVacina);
        txtResultado = findViewById(R.id.txtResultado);
    }


    public void calcular(View view) {
        int cachorro = rdgCachorro.getCheckedRadioButtonId();
        boolean femea = chkFemea.isChecked();
        boolean adestrado = chkAdestrado.isChecked();
        boolean vacina = chkVacina.isChecked();
        double resultado = 00.00;
        switch (cachorro){
            case R.id.rdbBorder:
                resultado += 800.00;
                break;
            case R.id.rdbPitBull:
                resultado += 750.00;
                break;
            case R.id.rdbPastorAl:
                resultado += 700.00;
                break;
            case R.id.rdbPastorCan:
                resultado += 800.00;
                break;
        }

        if(femea) resultado += 180.00;
        if(adestrado) resultado += 400.00;
        if(vacina) resultado += 200.00;
        Locale locale = new Locale(getString(R.string.language), getString(R.string.pais)); //new Locale("pt", "BR");
        //Locale locale = getResources().getConfiguration().locale;

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String resultadoString = nf.format(resultado);
        txtResultado.setText(resultadoString);
    }
}
