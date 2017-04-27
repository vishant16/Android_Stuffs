package com.example.vishu.viewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(ImageView)findViewById(R.id.txt);

        Animation aa= AnimationUtils.loadAnimation(this,R.anim.scale);
                                                            //translate
                                                            //alpha
                                                            //rotate
        txt.startAnimation(aa);
    }
}
