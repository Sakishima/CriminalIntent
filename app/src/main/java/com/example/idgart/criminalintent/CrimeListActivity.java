package com.example.idgart.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by idgar on 17.09.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
