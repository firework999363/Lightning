import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

PImage clouds;
PImage background;
float startY = 0;
float startX;
float endY;
float endX;

public void setup()
{
  size(500,500);
  clouds = loadImage("Clouds.png");
  background = loadImage("background.png");
  image(background,0,0);
  noLoop();
  strokeWeight(2);
}
public void draw()
{
	startX = (float)((Math.random()*400)+50);
	startY = 0;
	while (endY< Math.random()*50 + 450)
	{
		endX = startX + (float)((Math.random()*20)-10);
		endY = startY + (float)((Math.random()*8)+2);
		line(startX, startY, endX, endY);
		System.out.println(endX);
		startX = endX;
		startY = endY;
	}
	//image(background,0,0);
	image(clouds,0,-30);
	clouds = null;
	startY = 0;
	startX = (float)((Math.random()*400)+50);
	endX=0;
	endY=0;
}
public void mousePressed()
{
	redraw();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
