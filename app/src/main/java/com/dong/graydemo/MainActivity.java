package com.dong.graydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paint paint = new Paint();
        //创建颜色矩阵
        ColorMatrix cm = new ColorMatrix();
        //设置亮度
        cm.setSaturation(0);
        //设置颜色过滤
        paint.setColorFilter(new ColorMatrixColorFilter(cm));
        //选择硬件绘制还是软件绘制
        getWindow().getDecorView().setLayerType(View.LAYER_TYPE_HARDWARE, paint);

    }
}
