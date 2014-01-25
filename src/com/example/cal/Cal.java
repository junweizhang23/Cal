package com.example.cal;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class Cal extends Activity {

	int previous = 0;
	int current = 0;
	int calsign = 0;// 0 + 1 - 2 X 3 /
	boolean pcsign = true;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
	Button add, sub, mul, div, cal;
	EditText editstring;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cal);

		b0 = (Button) findViewById(R.id.b0);
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);

		add = (Button) findViewById(R.id.badd);
		sub = (Button) findViewById(R.id.bsub);
		mul = (Button) findViewById(R.id.bmul);
		div = (Button) findViewById(R.id.bdiv);
		cal = (Button) findViewById(R.id.beq);

		editstring = (EditText) findViewById(R.id.result);

		b0.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "0");
				editstring.setSelection(s.length() + 1);

			}
		});

		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "1");
				editstring.setSelection(s.length() + 1);

			}
		});

		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "2");
				editstring.setSelection(s.length() + 1);

			}
		});

		b3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "3");
				editstring.setSelection(s.length() + 1);

			}
		});

		b4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "4");
				editstring.setSelection(s.length() + 1);

			}
		});

		b5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "5");
				editstring.setSelection(s.length() + 1);

			}
		});

		b6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "6");
				editstring.setSelection(s.length() + 1);

			}
		});

		b7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "7");
				editstring.setSelection(s.length() + 1);

			}
		});

		b8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "8");
				editstring.setSelection(s.length() + 1);

			}
		});

		b9.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// counter = counter + 1;

				String s = editstring.getText().toString();

				editstring.setText(s + "9");
				editstring.setSelection(s.length() + 1);

			}
		});

		add.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s = editstring.getText().toString();

				if (pcsign == true) {
					previous = Integer.parseInt(s);

					editstring.setText("");
					editstring.setSelection(0);

					calsign = 0;

					pcsign = false;
				}

			}
		});

		sub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s = editstring.getText().toString();

				if (pcsign == true) {
					previous = Integer.parseInt(s);

					editstring.setText("");
					editstring.setSelection(0);

					calsign = 1;

					pcsign = false;
				}

			}
		});

		mul.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s = editstring.getText().toString();

				if (pcsign == true) {
					previous = Integer.parseInt(s);

					editstring.setText("");
					editstring.setSelection(0);

					calsign = 2;

					pcsign = false;
				}
			}
		});

		div.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s = editstring.getText().toString();

				if (pcsign == true) {
					previous = Integer.parseInt(s);

					editstring.setText("");
					editstring.setSelection(0);

					calsign = 3;

					pcsign = false;
				}
			}
		});

		cal.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String s = editstring.getText().toString();

				if (pcsign == false) {

					current = Integer.parseInt(s);
					editstring.setText("");
					editstring.setSelection(0);

					final String Ptag = "Previous : ";
					Log.v(Ptag, "previous =" + previous);
					final String Ctag = "Current : ";
					Log.v(Ctag, "current =" + previous);
					
					
					switch (calsign) {
					case 0:
						previous = previous + current;
						editstring.setText(String.valueOf(previous));
						editstring.setSelection(0);
						break;
					case 1:
						previous = previous - current;
						editstring.setText(String.valueOf(previous));
						editstring.setSelection(0);
						break;
					case 2:

						previous = previous * current;
						editstring.setText(String.valueOf(previous));
						editstring.setSelection(0);
						break;
					case 3:
						previous = previous / current;
						
						editstring.setText(String.valueOf(previous));
						editstring.setSelection(0);
						break;

					default:
						break;

					};
					

					pcsign = true;
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cal, menu);
		return true;
	}

}
