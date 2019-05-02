package com.android.SayHi.auth;

import android.os.Bundle;

import com.android.SayHi.base.BaseFragment;
import com.android.virgilsecurity.SayHi.R;

;

/**
 * Created by Danylo Oliinyk on 16.11.17 at Virgil Security.
 * -__o
 */

public class SignInFragment extends BaseFragment<SignInControlActivity> {

    public static SignInFragment newInstance() {

        Bundle args = new Bundle();

        SignInFragment fragment = new SignInFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_signin;
    }

    @Override
    protected void postButterInit() {

    }
}
