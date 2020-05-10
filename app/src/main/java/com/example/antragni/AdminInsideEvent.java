package com.example.antragni;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdminInsideEvent extends AppCompatActivity {
    ProgressDialog progressDialog;
    TextView ename, cname, cnumber, edate, eplace, edesc;
    Button button;
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_inside_event);
        button = (Button) findViewById(R.id.assign);

//        Toast.makeText(this, getIntent().getStringExtra("evid"), Toast.LENGTH_SHORT).show();
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please Wait...");
        ename = findViewById(R.id.eventName);
        cname = findViewById(R.id.eventOrganiserName);
        cnumber = findViewById(R.id.eventOrganiserNumber);
        eplace = findViewById(R.id.eventVenue);
        edate = findViewById(R.id.eventDate);
        edesc = findViewById(R.id.eventDescription);

        ename.setText(getIntent().getStringExtra("ename"));
        cname.setText(getIntent().getStringExtra("oname"));
        cnumber.setText(getIntent().getStringExtra("emobile"));
        eplace.setText(getIntent().getStringExtra("eaddress"));
        edate.setText(getIntent().getStringExtra("edate"));
        edesc.setText(getIntent().getStringExtra("eabout"));
        id=getIntent().getStringExtra("eid");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminInsideEvent.this,EventMembers.class).putExtra("eid",id));
            }
        });
    }

}