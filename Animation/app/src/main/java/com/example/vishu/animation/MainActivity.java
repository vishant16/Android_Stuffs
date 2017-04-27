package com.example.vishu.animation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view1 v = new view1(this);
        setContentView(v);
    }

    class view1 extends View {          //first
        public view1(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

        //first circle
            Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            canvas.drawCircle(200, 200, 50, paint);    //(x,y,radius, paint_object);
        //second circle
            Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
            p.setColor(Color.BLACK);
            int x = canvas.getWidth() / 2;
            int y = canvas.getHeight() / 2;
            canvas.drawCircle(x, y, 80, p);         //at middle of the screen
        //third Line
            p.setStrokeWidth(40); //Width of the outline
            canvas.drawLine(50,50,1000,100,p);      //(startX,endY,endX,endY,paint)

        //four
            float ptsArray []  = new float[8];
            ptsArray[0]=200;
            ptsArray[1]=100;
            ptsArray[2]=120;
            ptsArray[3]=100;
            ptsArray[4]=120;
            ptsArray[5]=100;
            ptsArray[6]=120;
            ptsArray[7]=200;
            Paint p5 = new Paint();
            p5.setColor(Color.RED);
            p5.setStyle(Paint.Style.FILL);
            p5.setStrokeWidth(60);
            canvas.drawLines(ptsArray,p5);

            //fifth
            p5.setColor(Color.RED);
            p5.setStyle(Paint.Style.STROKE);
            p5.setStrokeWidth(10);
            Path path = new Path();
            path.moveTo(220,200);
            path.lineTo(20,100);
            path.lineTo(120,200);
            canvas.drawPath(path,p5);


            //rectangle
            Rect rect = new Rect();
            rect.set(500,500,1000,1000);
            canvas.drawRect(rect,p5);


            //round rect
            p5.setColor(Color.GREEN);
            p5.setStyle(Paint.Style.FILL);
            RectF rectF = new RectF(100,100,300,300);
            canvas.drawRoundRect(rectF,20,20,p5);
          //oval
            RectF recF = new RectF(200,200,600,600);
            canvas.drawOval(recF,p5);

            //arc
            RectF rectF2 = new RectF(200,200,400,400);
            canvas.drawArc(rectF2,180,270,true,paint);

            //draw text
            canvas.rotate(45);
            p5.setTextSize(50);

            canvas.drawText("vishant16@Github",200,200,p5);



        }
    }
}