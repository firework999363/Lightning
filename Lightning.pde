PImage clouds;
PImage background;
int x;
double s;

void setup()
{
  size(500,500);
  clouds = loadImage("Clouds.png");
  background = loadImage("background.png");
  noLoop();
}
void draw()
{
	s=Math.random()*500
	image(background,0,0);
	image(clouds,0,0);
	x=0;
	while (x>30)
	{
		if (x=0)
		{
			line(s,0,a,b);
		}
		line(a,b,c,d);
		x++;
	}
	image(clouds,0,0);
}
void mousePressed()
{
	redraw();
}

