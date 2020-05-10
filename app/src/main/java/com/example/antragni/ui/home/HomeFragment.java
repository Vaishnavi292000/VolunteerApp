package com.example.antragni.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.antragni.R;
import com.example.antragni.ui.home.ui.main.Participated;
import com.example.antragni.ui.home.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {
    FloatingActionButton floatingActionButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        System.out.println("befor r5");
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getContext(),getChildFragmentManager());
        ViewPager viewPager = root.findViewById(R.id.view_pager1);
        System.out.println("befor r8");
        viewPager.setAdapter(sectionsPagerAdapter);
        System.out.println("befor r6");
        TabLayout tabs = root.findViewById(R.id.tabs);
        System.out.println("befor r7");
        tabs.setupWithViewPager(viewPager);
        System.out.println("befor r9");
        return root;
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //Save the fragment's instance
//        getSupportFragmentManager().putFragment(outState, "myFragmentName", mMyFragment);
    }
}