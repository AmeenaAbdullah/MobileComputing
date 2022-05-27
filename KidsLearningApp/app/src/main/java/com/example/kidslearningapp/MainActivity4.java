package com.example.kidslearningapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    static int count=0;
    static  int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ImageView imageView=findViewById(R.id.imageView6);
        Button b1=findViewById(R.id.btn1);
        Button  b2=findViewById(R.id.btn2);
        Button  b3=findViewById(R.id.btn3);
        Button  b4=findViewById(R.id.btn4);
        Button back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(send);
                finish();
            }
        });
        if(getIntent().getStringExtra("count").equals("0")){
            count=0;
        }
        if(count==0 ){//banana
            imageView.setImageResource(R.drawable.bb);
            b1.setText("B");
            b2.setText("L");
            b3.setText("O");
            b4.setText("U");
        }
        else if(count==1){//Penguin
            imageView.setImageResource(R.drawable.penguin);
            b1.setText("A");
            b2.setText("P");
            b3.setText("Q");
            b4.setText("L");
        }
        else if(count==2){ //zebra
            imageView.setImageResource(R.drawable.img_2);
            b1.setText("Z");
            b2.setText("L");
            b3.setText("M");
            b4.setText("O");

        }
        else if(count==3){  //bee
            imageView.setImageResource(R.drawable.img_4);
            b1.setText("Y");
            b2.setText("K");
            b3.setText("B");
            b4.setText("A");
        }
        else if(count==4){
            imageView.setImageResource(R.drawable.congrats);
            b1.setVisibility (View.INVISIBLE);
            b2.setVisibility (View.INVISIBLE);
            b3.setVisibility (View.INVISIBLE);
            b4.setVisibility (View.INVISIBLE);
            back.setVisibility (View.VISIBLE);
        }


    }

    public void clickoption(View view) {
        if(count==0 || count==2){    //banana zebra
            switch(view.getId()){
                case R.id.btn3:{
                    Incorrect();
                    break;
                }
                case R.id.btn1:{
                    count++;
                    Correct();
                    break;
                }
                case R.id.btn2:{
                    Incorrect();
                    break;
                }
                case R.id.btn4:{
                    Incorrect();
                    break;
                }



            }

        }       //penguin
        else if(count==1){
            switch(view.getId()){
                case R.id.btn3:{
                    Incorrect();
                    break;
                }
                case R.id.btn2:{
                    count++;
                    Correct();
                    break;
                }
                case R.id.btn1:{
                    Incorrect();
                    break;
                }
                case R.id.btn4:{
                    Incorrect();
                    break;
                }

            }
        }

        else if(count==3) //bee
        {
            switch(view.getId()){
                case R.id.btn3:{
                    count++;
                    Correct();
                    break;
                }
                case R.id.btn1:{
                    Incorrect();
                    break;
                }
                case R.id.btn2:{
                    Incorrect();
                    break;
                }
                case R.id.btn4:{
                    Incorrect();
                    break;
                }



            }
        }


    }
    public void Incorrect(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity4.this);
        builder.setMessage("Wrong!!! Answer is B\n Enter Correct one");

        builder.setTitle("Incorrect Choice");
        builder.setCancelable(false);

        builder.setNegativeButton(
                "ok",
                new DialogInterface
                        .OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
    public void Correct(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity4.this);
        builder.setMessage(" You got one point ");

        builder.setTitle("Congrats");
        builder.setCancelable(false);

        builder.setNegativeButton(
                "Next",
                new DialogInterface
                        .OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {


                            Intent send = new Intent(MainActivity4.this, MainActivity4.class);
                           send.putExtra("count","1");
                            startActivity(send);

                    }
                });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}