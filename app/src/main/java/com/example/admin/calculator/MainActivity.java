/*Robert Price*/

package com.example.admin.calculator;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    Button zero, one, two, three, four, five, six, seven, eight, nine, add, sub, mult, div, mod, percent, equal;
    TextView stage;
    String operation;
    double operand;
    boolean result_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stage = (TextView) findViewById(R.id.stage);

        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        //decimal = (Button) findViewById(R.id.decimal);

        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        mod = (Button) findViewById(R.id.mod);
        percent = (Button) findViewById(R.id.percent);
        equal = (Button) findViewById(R.id.equal);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+ "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+ "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+ "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+ "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+ "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+ "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+ "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result_flag){
                    stage.setText("");
                    result_flag = false;
                }
                stage.setText(stage.getText()+ "9");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double out = Double.parseDouble(stage.getText().toString());
                switch(operation){
                    case "ADDITION":
                        out += operand;
                        break;
                    case "SUBTRACTION":
                        out -= operand;
                        break;
                    case "MULT":
                        out = out * operand;
                        break;
                    case "DIVISION":
                        out = out/operand;
                        break;
                    case "MOD":
                        out %= operand;
                        break;
                    case "PERCENT":
                        out = out/operand*100;
                        break;
                }
                stage.setText(String.valueOf(out));
                result_flag = true;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand = Double.parseDouble(stage.getText().toString());
                operation = "ADDITION";
                stage.setText("");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand = Double.parseDouble(stage.getText().toString());
                operation = "SUBTRACTION";
                stage.setText("");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand = Double.parseDouble(stage.getText().toString());
                operation = "MULT";
                stage.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand = Double.parseDouble(stage.getText().toString());
                operation = "DIVISION";
                stage.setText("");
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand = Double.parseDouble(stage.getText().toString());
                operation = "MOD";
                stage.setText("");
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand = Double.parseDouble(stage.getText().toString());
                operation = "PERCENT";
                stage.setText("");
            }
        });
    }

}
