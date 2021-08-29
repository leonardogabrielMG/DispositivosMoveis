package com.leonardo.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAcessar = (Button) findViewById(R.id.btAcessar);
        btAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtUsuario = (TextView) findViewById(R.id.txtUsuario);
                TextView txtSenha = (TextView) findViewById(R.id.txtSenha);

                String usuario = txtUsuario.getText().toString();
                String senha = txtSenha.getText().toString();

                if (usuario.equals("usuario") && senha.equals("senha")){
                    alert(  "Login realizado com sucesso!");
                }else{
                    alert(  "Usuario ou senha digitado errado.");
                }
            }
        });
    }

    private void alert (String s){
        Toast.makeText( this,s, Toast.LENGTH_LONG).show ();
    }
}