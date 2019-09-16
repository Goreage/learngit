var can1;
var can2;

var ctx1;
var ctx2;

var mx;
var my;

var canWidth;
var canHeight;

var lastTime;
var deltaTime;

var bgPic = new Image();

var ane;
var fruit;
var mom;
var baby;

document.body.onload = game;
function game() {
	init();
	lastTime = Date.now();
	deltaTime = 0;
	gameloop();
}

function init(){
	//获得canvas context
	can1 = document.getElementById("canvas1"); //finshes, dust, UI, circle
	ctx1 = can1.getContext('2d');
	can2 = document.getElementById("canvas2");//background, ane, fruits
	ctx2 = can2.getContext('2d');

	can1.addEventListener('mousemove', onMouseMove, false);

	bgPic.src = "./src/background.jpg";

	canWidth = can1.width;
	canHeight = can1.height;

	ane = new aneObj();
	ane.init();

	fruit = new fruitObj();
	fruit.init();

	mom = new momObj();
	mom.init();

	baby = new babyObj();
	baby.init();

	mx = canWidth * 0.5;
	my = canHeight *0.5;
}

function gameloop(){
	window.requestAnimFrame(gameloop);//setInterval, setTimeout() requestAnimFrame跟科学的根据设备性能分配时间，
	var now = Date.now();
	deltaTime = now - lastTime;
	lastTime = now;
	if(deltaTime > 40) deltaTime = 40; //切屏时deltaTime不会改变

	drawBackground();
	ane.draw();
	fruitMonitor()
	fruit.draw();

	ctx1.clearRect(0, 0, canWidth, canHeight);
	mom.draw();
	momFruitsCollisoin();
	baby.draw();
}

function onMouseMove(e)
{
	if(e.offSetX || e.layerX)
	{
		mx = e.offSetX == undefined ? e.layerX : e.offSetX;
		my = e.offSetY == undefined ? e.layerY : e.offSetY;
	}
}