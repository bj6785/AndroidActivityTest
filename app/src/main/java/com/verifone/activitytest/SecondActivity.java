package com.verifone.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by 李凯 on 2016/11/20.
 */

public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout2);

        Intent intent_second = getIntent();
        String data = intent_second.getStringExtra("SecondActivityData");
        Toast.makeText(SecondActivity.this, data, Toast.LENGTH_SHORT).show();
        Log.d("SecondActivity", data);

        Intent intent_first = new Intent();
        intent_first.putExtra("ReturnDataToFirstActivity", "Hello Hell");
        setResult(RESULT_OK, intent_first);

        Button layout2_button = (Button) findViewById(R.id.layout2_button);
        layout2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
