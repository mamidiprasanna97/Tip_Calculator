package com.example.myapplication1;
import android.os.Bundle;
import android.app.Activity;
public class SettingsActivity extends Activity {
    @Override
    public void onCreate(Bundle sIS)
    {
        super.onCreate(sIS);
        getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
