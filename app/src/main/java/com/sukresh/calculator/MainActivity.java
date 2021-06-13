package com.sukresh.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    private TextView tempResult;
    private TextView result;
    private boolean isLastOperation;
    private String lastOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialButton equal = findViewById(R.id.equal);
        equal.setBackgroundTintList(ContextCompat.getColorStateList(this,R.color.orange));

        tempResult = findViewById(R.id.tempresult);
        result = findViewById(R.id.result);
        isLastOperation = false;
        lastOperation = "";
    }

    public void clear(View view) {
        try {
            tempResult.setText("");
            result.setText("");
            lastOperation = "";
            isLastOperation = false;
        }catch (Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void backspace(View view) {
        try {
            String a = tempResult.getText().toString();
            tempResult.setText(a.substring(0, a.length() - 1));
            char c = a.charAt(a.length() - 2);
            if(c == '-' || c == '+' || c == '*' || c == '/' || c == '^' || c == '.'){
                isLastOperation = true;
            }else{
                isLastOperation = false;
            }
            String tmp = tempResult.getText().toString();
            for(int i=tmp.length()-1; i<=0 ; i--){
                char w = tmp.charAt(i);
                if(w == '+' || w == '-' || w == '*' || w == '/' || w == '.'){
                    lastOperation = Character.toString(w);
                    break;
                }
            }
        }catch(Exception e){
            int k = 0;
        }
    }

    public void power(View view) {
        try {
            String a = tempResult.getText().toString();
            if(!isLastOperation){
                a+="^";
                tempResult.setText(a);
                isLastOperation = true;
                lastOperation = "^";
            }else{
                a = a.substring(0,a.length()-1)+"^";
                tempResult.setText(a);
            }
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void division(View view) {
        try {
            String a = tempResult.getText().toString();
            if(!isLastOperation){
                a+="/";
                tempResult.setText(a);
                isLastOperation = true;
                lastOperation = "/";
            }else{
                a = a.substring(0,a.length()-1)+"/";
                tempResult.setText(a);
            }
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void seven(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="7";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void eight(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="8";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void nine(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="9";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void multiply(View view) {
        try {
            String a = tempResult.getText().toString();
            if(!isLastOperation){
                a+="*";
                tempResult.setText(a);
                isLastOperation = true;
                lastOperation = "*";
            }else{
                a = a.substring(0,a.length()-1)+"*";
                tempResult.setText(a);
            }
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void four(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="4";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void subtract(View view) {
        try {
            String a = tempResult.getText().toString();
            if(!isLastOperation){
                a += "-";
                tempResult.setText(a);
                isLastOperation = true;
                lastOperation = "-";
            }else{
                a = a.substring(0,a.length()-1)+"-";
                tempResult.setText(a);
            }
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void six(View view) {
        try {
            String a = tempResult.getText().toString();
            a += "6";
            tempResult.setText(a);
            isLastOperation = false;
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void five(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="5";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void one(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="1";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void two(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="2";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void three(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="3";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void addition(View view) {
        try {
            String a = tempResult.getText().toString();
            if(!isLastOperation){
                a += "+";
                tempResult.setText(a);
                isLastOperation = true;
                lastOperation = "+";
            }else{
                a = a.substring(0,a.length()-1)+"+";
                tempResult.setText(a);
            }
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void dot(View view) {
        try {
            String a = tempResult.getText().toString();
            if(!isLastOperation){
                if(!lastOperation.equals(".")){
                    a+=".";
                    tempResult.setText(a);
                    isLastOperation = true;
                    lastOperation = ".";
                }
            }else{
               a = a.substring(0,a.length()-1)+".";
               tempResult.setText(a);
            }
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void zero(View view) {
        try {
            String a = tempResult.getText().toString();
            a+="0";
            tempResult.setText(a);
            isLastOperation = false;
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }

    public void equal(View view) {
        try {
            String a = tempResult.getText().toString();
            tempResult.setText(a);
            String re = eval(a);
            if(!re.equals("")){
                tempResult.setText(re);
                result.setText(re);
            }
        }catch(Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }
    public String eval(String a){
        BigDecimal bd = new BigDecimal("0");
        try {
            StringTokenizer st = new StringTokenizer(a, "^+-/*", true);
            MathContext mc = new MathContext(5);
            bd = bd.add(new BigDecimal(st.nextToken(),mc));
            while (st.hasMoreTokens()) {
                String operation = st.nextToken();
                String operand = st.nextToken();
                BigDecimal second = new BigDecimal(operand, mc);
                switch (operation){
                    case "+":
                        bd = bd.add(second);
                        break;
                    case "-":
                        bd = bd.subtract(second);
                        break;
                    case "*":
                        bd = bd.multiply(second);
                        break;
                    case "/":
                        bd = bd.divide(second);
                        break;
                    case "^":
                        bd = bd.pow(Integer.parseInt(operand));
                        break;
                    default:
                        Toast.makeText(this,"SOmething went wrong",Toast.LENGTH_SHORT).show();
                }
            }
            return bd.toString();
        }catch(Exception e){
            return "";
        }
    }
}