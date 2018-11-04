package com.example.vartikasharma.youiet;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class slideshow_swipe extends PagerAdapter {

    private int[] img_resources={R.mipmap.me_udyami,R.mipmap.me_goonj,R.mipmap.me_mun,R.mipmap.me_hacksprint,
            R.mipmap.me_legacy,R.mipmap.me_izaad};
        private LayoutInflater layoutInflater;
        private Context context;
    View item_view;

        public slideshow_swipe(Context context)
        {
           // this.layouts = layouts;
            this.context = context;
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return img_resources.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {

            return (view==(LinearLayout)o);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            item_view=layoutInflater.inflate(R.layout.slideshow_swipe,container,false);
            //View view = layoutInflater.inflate(R.layout.slideshow_swipe,container, false);
            ImageView imgview=(ImageView) item_view.findViewById(R.id.image_slide);
            TextView textView=(TextView) item_view.findViewById(R.id.image_text);
            imgview.setImageResource(img_resources[position]);

            container.addView(item_view);
            return item_view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
           // item_view= (View) object;
          //  container.removeView(item_view);
            container.removeView((LinearLayout)object);
        }


}
