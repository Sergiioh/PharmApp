package com.example.sergioh.pharmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class BuscarMedicamento extends AppCompatActivity {
    TextView nombre, descripcion,nombres, descripciones;
    EditText medicamento;
    Button VerContramedidas;
    private String contramedida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_medicamento);
        nombre = (TextView)findViewById(R.id.nombre);
        nombres = (TextView)findViewById(R.id.nombres);
        descripcion = (TextView)findViewById(R.id.Descripcion);
        descripciones = (TextView)findViewById(R.id.Descripciones);
        medicamento = (EditText)findViewById(R.id.IngresarMedicamento);
        VerContramedidas = (Button)findViewById(R.id.contramedida);
        VerContramedidas.setEnabled(false);




    }

    public void buscar (View view){
        String a=  medicamento.getText().toString();

        VerContramedidas.setEnabled(true);
        try {
            if(a.equalsIgnoreCase("paracetamol")){
                nombre.setText("Nombre: ");
                descripcion.setText("Descripción;");
                nombres.setText("acetaminofeno");
                descripciones.setText("PARACETAMOL es un analgésico y antipirético eficaz para el control del dolor leve o moderado causado por afecciones articulares, otalgias, cefaleas, dolor odontogénico, neuralgias, procedimientos quirúrgicos menores etc. También es eficaz para el tratamiento de la fiebre, como la originada por infecciones virales, la fiebre pos vacunación, etcétera.");
                contramedida = "Hipersensibilidad Debido a que se metaboliza en el hígado, se debe administrar con precaución en pacientes con daño hepático, al igual que en aquellos que están recibiendo medicamentos hepatotóxicos o que tienen nefropatía.PARACETAMOL tampoco se debe administrar por periodos prolongados ni en mujeres embara­zadas.La ingestión de 3 o más bebidas alcohólicas por periodos prolongados, puede aumentar el riesgo de daño hepático o sangrado del tubo digestivo asociado al uso de PARACETAMOL, por lo que se deben considerar estas condiciones al prescribir el medicamento.";


            }else {
                nombres.setText("");
                descripcion.setText("");
                nombre.setText("");
                descripciones.setText("");
                VerContramedidas.setEnabled(false);
            }
        }catch (Exception e){

        }

    }
    public void contradic(View view){
        nombre.setText("");
        descripcion.setText("");
        nombres.setText("");
        descripciones.setText("");
        Intent i = new Intent(this, Contramedida.class);
        i.putExtra("contramedida",contramedida);
        VerContramedidas.setEnabled(false);
        startActivity(i);
    }


}
