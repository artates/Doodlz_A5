// MainActivity.java
// Sets MainActivity's layout
package com.deitel.doodlz;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

   GridLayout layout;

   ImageView imageView;
   // configures the screen orientation for this app
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

      layout = (GridLayout)findViewById(R.id.layout);

      imageView = (ImageView)findViewById(R.id.imgView);

      // determine screen size
      int screenSize =
         getResources().getConfiguration().screenLayout &
            Configuration.SCREENLAYOUT_SIZE_MASK;

      // use landscape for extra large tablets; otherwise, use portrait
      if (screenSize == Configuration.SCREENLAYOUT_SIZE_XLARGE)
         setRequestedOrientation(
            ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
      else
         setRequestedOrientation(
            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
   }
   public int getlayoutColor(int color) {
    layout.setBackgroundColor(color);
      return color;
   }



}

/**************************************************************************
 * (C) Copyright 1992-2016 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 **************************************************************************/

