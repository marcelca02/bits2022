package com.example.bits2022.clases;

public class Item {

    package com.example.bitsxlamarato2022.classes;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

    public class Item {
        private String type;
        private int efect;
        public int idItemImage;
        private Bitmap image;


        public Item (String typeIt, Context context) {
            type = typeIt;
            efect = (int) (Math.random() * 100);
            image = BitmapFactory.decodeResource(context.getResources(), idItemImage);
        }

        public void print_item (int x, int y) {
            Canvas c = new Canvas(image);
            c.drawBitmap(image, x, y, null);
        }




    }
}
