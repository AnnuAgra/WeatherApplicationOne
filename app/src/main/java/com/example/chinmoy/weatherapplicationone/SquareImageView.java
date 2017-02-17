package com.example.chinmoy.weatherapplicationone;

        import android.content.Context;
        import android.widget.ImageView;

/**
 * Created by Chinmoy on 17-02-2017.
 */

public class SquareImageView extends ImageView{
    public SquareImageView(Context context) {
        super(context);
    }
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec,heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(),getMeasuredWidth());
    }
}
