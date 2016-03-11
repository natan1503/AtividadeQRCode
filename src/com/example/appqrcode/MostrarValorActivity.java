package com.example.appqrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarValorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mostrar_valor);
		
		 TextView conteudoLido = (TextView) findViewById(R.id.textViewValorLido);

	        Intent intent = getIntent();

	        conteudoLido.setText(("O conteúdo lido foi: "+ (String) intent.getSerializableExtra("conteudoLido")));
	}

}
