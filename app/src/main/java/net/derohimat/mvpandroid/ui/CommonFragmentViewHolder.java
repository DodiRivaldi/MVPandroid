package net.derohimat.mvpandroid.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import net.derohimat.mvpandroid.R;
import net.derohimat.mvpandroid.data.model.TvModel;
import net.derohimat.mvpandroid.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CommonFragmentViewHolder {

    @BindView(R.id.poster)
    ImageView imageView;

    public CommonFragmentViewHolder(View view) {
        ButterKnife.bind(this, view);
    }

    public void setUp(Context context, TvModel model) {

        Picasso.with(context).load(Constants.ImgUrl + model.getImgLink()).into(imageView);

    }
}
