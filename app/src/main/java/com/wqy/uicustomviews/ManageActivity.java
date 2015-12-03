package com.wqy.uicustomviews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by wqy on 2015/12/2.
 */
public class ManageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_layout);
        Button card = (Button)findViewById(R.id.button_car);
        Button message = (Button)findViewById(R.id.button_message);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this,ListViewActivity.class);
                startActivity(intent);
            }
        });
        
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this,MessageActivity.class);
                startActivity(intent);
            }
        });
        
    }
}
