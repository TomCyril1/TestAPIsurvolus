package com.example.cfapag.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent intent = getIntent();
        String resultat ="";
        if(intent !=null){

            resultat = intent.getStringExtra("resultat");
        }
        TextView textView = (TextView) findViewById(R.id.NomShow);
        textView.setText("votre id est "+ resultat);
    }
    public void Deconnexion(View arg0) {
        Intent intent = new Intent(DashboardActivity.this,LoginActivity.class);


        startActivity(intent);
        DashboardActivity.this.finish();

    }
}