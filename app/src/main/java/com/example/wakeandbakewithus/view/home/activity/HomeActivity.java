package com.example.wakeandbakewithus.view.home.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.example.wakeandbakewithus.R;
import com.example.wakeandbakewithus.databinding.ActivityHomeBinding;
import com.example.wakeandbakewithus.viewModel.home.HomeActivityViewModel;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Setup view
        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        //Getting a new or existing ViewModel from ViewModelProviders.
        HomeActivityViewModel viewModel = ViewModelProviders.of(this).get(HomeActivityViewModel.class);

        binding.setViewModel(viewModel);
    }
}
