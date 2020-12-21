package com.goldhelper;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import static android.content.Context.MODE_PRIVATE;

public class GoldHelper {



    public static boolean IsFirstLaunch(Context cx){

        SharedPreferences prefs = cx.getSharedPreferences(
                cx.getResources().getString(R.string.app_name),Context.MODE_PRIVATE);

        boolean isFirstLaunch = prefs.getBoolean("is_first",true);

        if(isFirstLaunch) {

            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("is_first", false);
            editor.apply();

            return true;


        }else {

            return false;
        }

    }


    public void SaveStringInSharedPreferences(Context cx , String key, String data) {

        SharedPreferences.Editor editor = cx.getSharedPreferences(cx.getResources().getString(R.string.app_name),MODE_PRIVATE).edit();
        editor.putString(key,data);
        editor.apply();

    }

    public String LoadStringFromSharedPreferences(Context cx, String key) {
        SharedPreferences prefs = cx.getSharedPreferences(cx.getResources().getString(R.string.app_name), Activity.MODE_PRIVATE);


        return prefs.getString(key,"");
    }


    public void SaveIntInSharedPreferences(Context cx , String key, int data) {

        SharedPreferences.Editor editor = cx.getSharedPreferences(cx.getResources().getString(R.string.app_name),MODE_PRIVATE).edit();
        editor.putInt(key,data);
        editor.apply();

    }

    public int LoadIntFromSharedPreferences(Context cx, String key) {

        SharedPreferences prefs = cx.getSharedPreferences(cx.getResources().getString(R.string.app_name), Activity.MODE_PRIVATE);
        return prefs.getInt(key,0);
    }


    public void SaveBooleanInSharedPrefs(Context cx ,String key , boolean value) {

        SharedPreferences sp = cx.getSharedPreferences(cx.getString(R.string.app_name),MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(key, value);
        editor.apply();

    }

    public boolean LoadBooleanFromSharedPrefs (Context cx ,String key) {

        SharedPreferences sp = cx.getSharedPreferences(cx.getString(R.string.app_name),MODE_PRIVATE);
        return sp.getBoolean(key,false);
    }
}
