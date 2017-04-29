package br.com.exercicioone.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNome;
    private RadioButton btMasc;
    private RadioButton btFemi;
    private EditText edtAltura;
    private Button btnCalcular;
    private Button btnLimpar;
    private String conv;
    private double txtNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        btMasc = (RadioButton) findViewById(R.id.btMasc);
        btFemi = (RadioButton) findViewById(R.id.btFemi);
        edtAltura = (EditText) findViewById(R.id.edtAltura);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);

        btnCalcular.setOnClickListener(this);
        btnLimpar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnCalcular){
            if(btMasc.isChecked()){
                conv = edtAltura.getText().toString();
                txtNumber = Double.parseDouble(conv);
                double soma = 72.7 * txtNumber - 58;
                Toast.makeText(this, "Seu nome é "+ edtNome.getText().toString() + ", sexo " +btMasc.getText().toString() + " e seu peso ideal é "+soma, Toast.LENGTH_LONG).show();
            } else {
                conv = edtAltura.getText().toString();
                txtNumber = Double.parseDouble(conv);
                double soma = 62.1 * txtNumber - 44.7;
                Toast.makeText(this, "Seu nome é "+ edtNome.getText().toString() + ", sexo " +btFemi.getText().toString() + " e seu peso ideal é "+soma, Toast.LENGTH_LONG).show();
            }
        } else {
            edtNome.setText("");
            btMasc.setChecked(false);
            btFemi.setChecked(false);
            edtAltura.setText("");
        }
    }
}
