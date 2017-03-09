package mx.edu.cetis108.cetis1084am_app003;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnDeterminar_Click(View v){
        TextView lblMayor=(TextView)findViewById(R.id.lblMayor);
        EditText txtNum1=(EditText)findViewById(R.id.txtNum1);
        EditText txtNum2=(EditText)findViewById(R.id.txtNum2);
        if(txtNum1.getText().length()>0&&txtNum2.getText().length()>0) {
            Float num1=Float.parseFloat(txtNum1.getText().toString()), num2=Float.parseFloat(txtNum2.getText().toString());
            lblMayor.setTextColor(getResources().getColor(R.color.colorPrimary));
            if (num1 > num2)
                lblMayor.setText("El mayor es: " + txtNum1.getText() + "\n" + txtNum1.getText() + "-" + txtNum2.getText() + "= " + (num1 - num2));
            else
                lblMayor.setText("El mayor es: " + txtNum2.getText() + "\n" + txtNum1.getText() + "+" + txtNum2.getText() + "= " + (num1 + num2));
        }
        InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(txtNum2.getWindowToken(), 0);

    }
}
