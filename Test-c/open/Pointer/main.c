#include "acllib.h"
#include<stdio.h>

void mouseListener(int x, int y, int button,int event)
{
	static int ox= 0;
	static int oy= 0;
	printf("x=%d,y=%d,button=%d,event=%d\n",x,y,button,event);
	//¸úËæÊó±êÒÆ¶¯»­Ïß lineTo 
	beginPaint();
	//lineTo(x,y);
	line(ox,oy,x,y);
	endPaint();
	ox = x; oy = y;
}
void keyListener(int key, int event)
{
	printf("key=%d, event=%d\n",key,event);
}
void timerListener(int id)
{
	printf("id=%d\n",id);
}
int Setup()
{
	initWindow("test",DEFAULT,DEFAULT,800,600);
	
	initConsole();
	
	printf("Hello\n"); 
	int x;  
	
	registerMouseEvent(mouseListener);
	registerKeyboardEvent(keyListener);
	registerTimerEvent(timerListener);
	startTimer(0,500);
	startTimer(1,1000);
	
	
	beginPaint();
	line(10,10,100,100);	
	//scanf("%x",&x);
	//line(100,100,x,0);
	
	endPaint(); 
	
	return 0;
 } 
