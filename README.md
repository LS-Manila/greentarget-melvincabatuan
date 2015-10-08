# Greet Target ( Custom View Demo) 

greentarget-melvincabatuan created by Classroom for GitHub

This assignment illustrates the creation of a custom view and basic drawing in Android.


## Problem:

Design and implement a target (drawing) custom view.   


## Accept

To accept the assignment, click the following URL:

https://classroom.github.com/assignment-invitations/f319e417be0f2ad9c7337b2cb29b2779

## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/greentarget-melvincabatuan

## Keypoints:

Custom view GreenTarget.java:  
```Java
public class GreenTarget extends View {

    public GreenTarget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint green = new Paint();
        green.setARGB(255, 0, 255, 0);

        Paint white = new Paint();
        white.setARGB(255, 255, 255, 255);

        // Get center
        int w = canvas.getWidth();
        int h = canvas.getHeight();
        int x = (w < h)? w : h;

        for (int i = 0; i < 11; i++) {
            canvas.drawCircle(w/2, h/2, x*(10-i)/20, i % 2 == 0 ? green : white);
        }
    }

}
```

In the layout xml:
```xml
    <com.cabatuan.greentarget.GreenTarget
        android:id="@+id/targetview"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:layout_centerInParent="true"
        />
```


## Submission Procedure with Git: 

```shell
$ cd /path/to/your/android/app/
$ git init
$ git add –all
$ git commit -m "your message, e.x. Assignment 1 submission"
$ git remote add origin <Assignment link copied from assignment github, e.x. https://github.com/DeLaSalleUniversity-Manila/secondactivityassignment-melvincabatuan.git>
$ git push -u origin master
<then Enter Username and Password>
```


## Screenshot:

![alt tag](https://github.com/DeLaSalleUniversity-Manila/greentarget-melvincabatuan/blob/master/device-2015-10-08-223957.png)

"*There is only one way to avoid criticism: do nothing, say nothing, and be nothing.*" - Aristotle
