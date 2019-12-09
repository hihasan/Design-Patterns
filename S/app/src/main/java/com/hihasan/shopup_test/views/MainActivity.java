package com.hihasan.shopup_test.views;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hihasan.shopup_test.R;
import com.hihasan.shopup_test.utils.BottomNavigationBehavior;
import com.hihasan.shopup_test.views.Income.IncomeFragment;
import com.hihasan.shopup_test.views.Offer.OfferFragment;
import com.hihasan.shopup_test.views.Shop.ShopFragment;
import com.hihasan.shopup_test.views.product.ProductFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // attaching bottom sheet behaviour - hide / show on scroll
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) navigation.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationBehavior());

        loadFragment(new ProductFragment());
    }

//    public void onBackPressed() {
//        if (getFragmentManager().getBackStackEntryCount() == 1) {
//            finish();
//        } else {
//            super.onBackPressed();
//            finish();
//        }
//    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.action_product:
                    fragment = new ProductFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.action_offer:
                    fragment = new OfferFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.action_income:
                    fragment = new IncomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.action_shop:
                    fragment = new ShopFragment();
                    loadFragment(fragment);
                    return true;

            }

            return false;
        }
    };

    /**
     * loading fragment into FrameLayout
     *
     * @param fragment
     */
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}
