package sdu.cs58.nawapatsaphon.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1.ประกาศตัวแปร
    EditText number1edittext,number2edittext;
    Button addbutton;
    TextView resultTextview;
    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2.ผูกตัวแปรบน JAVA ให้รู้จักกับ element
        number1edittext = findViewById(R.id.edtNumber1);
        number2edittext = findViewById(R.id.edtNumber2);
        addbutton = findViewById(R.id.btnAdd);
        resultTextview = findViewById(R.id.txvResult);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //3.แปลงค่าที่รับจาก Edittext เป็นตัวเลขเก็บในตัวแปรชนิด int
                 num1 = Integer.parseInt(number1edittext.getText().toString().trim());
                num2 = Integer.parseInt(number2edittext.getText().toString().trim());
                result = num1 + num2;

                resultTextview.setText(result + "");
            }
        });//end setOnClickListenner

    }//end method Oncreate
}//end class
