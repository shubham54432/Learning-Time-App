package com.example.learningtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.learningtime.databinding.ActivityDashboardAdminBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class dashboardAdmin extends AppCompatActivity {

    private ActivityDashboardAdminBinding binding;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDashboardAdminBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        firebaseAuth=FirebaseAuth.getInstance();
        checkUser();

        binding.logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                checkUser();
            }
        });

        binding.addCategoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dashboardAdmin.this, CategoryAdd.class));
            }
        });
    }

    private void checkUser() {
        FirebaseUser firebaseUser=firebaseAuth.getCurrentUser();
        if(firebaseUser==null){
            startActivity(new Intent(this,login.class));
            finish();
        }
        else{
            String email=firebaseUser.getEmail();

            binding.subTitleTv.setText(email);
        }
    }
}