package com.example.vishu.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {


    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.on);
        b2=(Button)findViewById(R.id.dis);
        b3=(Button)findViewById(R.id.off);

        final BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();
        if(ba==null)
        {
            out.append("mot supported");

        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ba.isEnabled()){
                Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(i,0);        //0=Request_enable_code
            }}
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ba.isDiscovering()){
                Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                startActivityForResult(i,0);    //0=request_discoverable_code
            }}
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        ba.disable();
            }
        });
    }
}
