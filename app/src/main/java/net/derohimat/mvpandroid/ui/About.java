package net.derohimat.mvpandroid.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import net.derohimat.mvpandroid.R;
import net.derohimat.mvpandroid.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class About extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.about_icon)
    ImageView about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
        setUpActivity();

    }

    @Override
    public void setUpActivity() {

        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("About");
        }

        about.setVisibility(View.GONE);
    }

    @Override
    public void showLoading(boolean bottomProgress) {

    }

    @Override
    public void hideLoading(boolean bottomProgress) {

    }
}
