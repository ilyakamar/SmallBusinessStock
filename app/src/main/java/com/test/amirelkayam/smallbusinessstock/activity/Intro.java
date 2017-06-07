package com.test.amirelkayam.smallbusinessstock.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.test.amirelkayam.smallbusinessstock.R;
import com.test.amirelkayam.smallbusinessstock.activity.activity.MainActivity;

/**
 * Created by Amir Elkiam on 18/09/2016.
 */
public class Intro extends Activity {

    private ImageView icon;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        icon = (ImageView)findViewById(R.id.introIcon);
        animation = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);

        icon.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
        public void onAnimationStart(Animation animation) {

        }

            @Override
        public void onAnimationEnd(Animation animation)  {
                Intent intent = new Intent(getApplicationContext(), Login.class); //Intent >>>> Login.class
                startActivity(intent);
                finish();
            }

            @Override
        public  void  onAnimationRepeat(Animation animation) {
    }

///////////////////////////ILYAAAAAAAAAAAAAAAAAAAA

});

}
}



