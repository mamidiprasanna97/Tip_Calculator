package com.example.myapplication1;

import android.os.Bundle;
import android.preference.PreferenceFragment;
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle saved)
    {
        super.onCreate(saved);
        addPreferencesFromResource(R.xml.preferences);
    }
}
