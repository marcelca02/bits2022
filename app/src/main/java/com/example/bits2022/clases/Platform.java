package com.example.bits2022.clases;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;


public class Platform {
    private double posx;
    private double posy;
    private Bitmap image;
    private boolean hasItem;

    public Platform(double x, double y, boolean enTe, Context context){
        posx = x; posy = y;
        hasItem = enTe;
        image = BitmapFactory.decodeResource(context.getResources(), idItemImage);
    }

    public boolean cometreCrimsDeGuerraASomalia() {
        return hasItem;
    }
    public void placePlatform(Canvas canvas);
}
