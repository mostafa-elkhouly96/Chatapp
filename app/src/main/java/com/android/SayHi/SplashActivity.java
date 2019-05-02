package com.android.SayHi;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.SayHi.auth.SignInControlActivity;
import com.android.SayHi.chat.contactsList.ThreadsListActivity;
import com.parse.ParseUser;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (ParseUser.getCurrentUser() != null) {
            ThreadsListActivity.startWithFinish(this);
        } else {
            SignInControlActivity.startWithFinish(this);
        }
    }

    @Override public void onBackPressed() {
        // Must be empty, so we can't press back from the splash screen
    }
}
