PImage clouds;
PImage background;
float startY = 0;
float startX;
float endY;
float endX;
int fade;

void setup()
{
  size(500,500);
  clouds = loadImage("Clouds.png");
  background = loadImage("background.png");
  image(background,0,0);
  noLoop();
  strokeWeight(2);
}
void draw()
{
	startX = (float)((Math.random()*400)+50);
	startY = 0;
	while (endY< Math.random()*50 + 450)
	{
		stroke(255,fade);
		endX = startX + (float)((Math.random()*20)-10);
		endY = startY + (float)((Math.random()*8)+2);
		line(startX, startY, endX, endY);
		System.out.println(endX);
		startX = endX;
		startY = endY;
	}
	//image(background,0,0);
	image(clouds,0,-30);
	startY = 0;
	startX = (float)((Math.random()*400)+50);
	endX=0;
	endY=0;
}
void mousePressed()
{
	redraw();
}

