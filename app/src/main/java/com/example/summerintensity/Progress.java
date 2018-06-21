package com.example.summerintensity;


import android.graphics.Bitmap;
import android.graphics.Color;

import java.util.Random;

public class Progress {
    public static int colorT1=0;
    public static int colorT2=0;
    public static int colorF1=0;
    public static int colorF2=0;
    public static Bitmap bitmap=null;

    public static int getRandomColor(){
        Random rand = new Random();
        return Color.argb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
}
