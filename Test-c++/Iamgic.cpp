#include <iostream>			//杈撳叆杈撳嚭娴�
#include <cstdlib>			//鏍囧噯搴�
#include <unistd.h>			//寤舵椂鍑芥暟瑕�
#include <stdio.h>			//getchar()	
#include <ctime>			//鏃堕棿鍑芥暟
#include <termios.h>		//缁堢璁剧疆

using namespace std;

#define MAX_X 20
#define MAX_Y 30
bool flag = false;
bool slow = false;
bool autogame = true;
int maze[MAX_X][MAX_Y];		//杩峰

class stack_of_maze{
private:
    //code
	//璁板綍杩峰鍧愭爣
	struct node
	{
		int x;
		int y;
		char direction;  	//涓婁竴姝ヨ矾寰勶紙濡備綍鏉ョ殑锛�
		node* next;
	};
	node* head;
public:
    //code
	stack_of_maze(){
    //鍒濆鍖�
    head = NULL;
}

	~stack_of_maze(){
		node* p = head;
		//閫愪釜鍒犻櫎
		while(head!=NULL){
			head = head->next;
			delete p;
			p = head;
		}
	}
	
	void push(int xx,int yy,char ddirection){
		//瀹氫箟涓€涓柊鑺傜偣
		node* new_node = new node;
		//璧嬪€�
		if(new_node!=NULL){
			new_node->x = xx;
			new_node->y = yy;
			new_node->direction = ddirection;
			new_node->next = NULL;
			//鍒ゆ柇鏍堟槸鍚︿负绌猴紝濡傛灉涓虹┖鍒欑洿鎺ユ妸鏂拌妭鐐硅祴鍊肩粰鏍堬紝鍚﹀垯娣诲姞鍒版爤椤�
			if(head==NULL)
				head = new_node;
			else{
				new_node->next = head;
				head = new_node;
			}
		}
		else
			cout<<"鍐呭瓨鍒嗛厤澶辫触"<<endl;

	}
	
	node* pop(int& xx,int& yy){
		if(head!=NULL){
			node* p = head;
			head = head->next;
			xx = p->x;
			yy = p->y;
			delete p;
		}
		return head;
	}
	
	void print(){
		if(head!=NULL){
			node* p = head;
			while(p!=NULL){
				cout<<" "<<p->x<<" "<<p->y<<" "<<p->direction<<endl;
				p = p->next;
			}
		}
		else
			cout<<"鏍堜负绌猴紝鎵撳嵃澶辫触"<<endl;
	}
};

void createMaze(){
	int maxway = MAX_X * MAX_Y;		//鏈€澶ч€氳矾
	int x,y;

    //鍏堝～鍏呰糠瀹�
	for(x=0;x<MAX_X;x++)
		for(y=0;y<MAX_Y;y++)
			maze[x][y] = 1;		
    
	//闅忔満鍑芥暟绉嶅瓙锛屼互鏃堕棿涓哄弬鏁�
	srand((unsigned)time(NULL));
    //闅忔満鏋勫缓杩峰閫氳矾
	for(int i=0;i<maxway;i++)		
	{
		x = rand() % (MAX_X-2) + 1;
		y = rand() % (MAX_Y-2) + 1;
		maze[x][y] = 0;
	}	

	maze[1][1] = 0; 				//鍏ュ彛
	maze[MAX_X-2][MAX_Y-2] = 0;		//鍑哄彛

	maze[0][1] = 3;
 	maze[MAX_X-1][MAX_Y-2] = 0;
}

void printMaze(){
	int x,y;
    //娓呭睆锛屽鏋滄槸windows鐜浣跨敤system("cls")
	system("clear");	
    //鎵撳嵃鍦板浘
	for(x=0;x<MAX_X;x++)
	{
		for(y=0;y<MAX_Y;y++)
		{
			if(maze[x][y]==0){cout<<"  ";continue;}		//閫氳矾
			if(maze[x][y]==1){cout<<"鈻� ";continue;}		//澧�
			if(maze[x][y]==2){cout<<"脳 ";continue;}		//姝昏儭鍚�
			if(maze[x][y]==3){cout<<"鈫� ";continue;}		//鍚戜笅璧�
			if(maze[x][y]==4){cout<<"鈫� ";continue;}
			if(maze[x][y]==5){cout<<"鈫� ";continue;}
			if(maze[x][y]==6){cout<<"鈫� ";continue;}
			if(maze[x][y]==7){cout<<"鈥� ";continue;}		//褰撳墠绔欑珛浣嶇疆
		}
		cout<<endl;
	}
    //鏄惁鎱㈤€熸父鎴�
	if(slow){
		sleep(1);										//寤舵椂鍑芥暟
	}
}

void check(stack_of_maze &s){
    //澶囦唤鍦板浘
	int temp[MAX_X][MAX_Y];
	for(int x=0;x<MAX_X;x++)
		for(int y=0;y<MAX_Y;y++)
			temp[x][y] = maze[x][y];

	int x=1,y=1;					//鍑哄彂鐐�	
	while(1){
		temp[x][y] = 2;

		//鍚戜笅
		if(temp[x+1][y]==0){
			s.push(x,y,'D');
            //鍦ㄥ綋鍓嶄綅缃仛涓€涓悜涓嬬殑鏍囧織
			temp[x][y] = 3;			
			x = x + 1;
			temp[x][y] = 7;			//褰撳墠浣嶇疆
            //鍒ゆ柇鏄惁鍒拌揪鍑哄彛锛屽鏋滃埌杈惧嚭鍙ｅ垯flag鏍囪涓簍rue锛屼笅鍚�
			if((x==MAX_X-1)&&(y==MAX_Y-2)){
				flag = true;
				return;
			}
			else
				continue;
		}

		//鍚戝彸
		if(temp[x][y+1]==0){
			s.push(x,y,'R');
            //鍦ㄥ綋鍓嶄綅缃仛涓€涓悜鍙崇殑鏍囧織
			temp[x][y] = 4;			
			y = y + 1;
			temp[x][y] = 7;
			if((x==MAX_X-1)&&(y==MAX_Y-2)){
				flag = true;
				return;
			}
			else
				continue;
		}

		//鍚戜笂
		if(temp[x-1][y]==0){
			s.push(x,y,'U');
            //鍦ㄥ綋鍓嶄綅缃仛涓€涓悜涓婄殑鏍囧織
			temp[x][y] = 6;			
			x = x - 1;
			temp[x][y] = 7;
			if((x==MAX_X-1)&&(y==MAX_Y-2)){
				flag = true;
				return;
			}
			else
				continue;
		}

		//鍚戝乏
		if(temp[x][y-1]==0){
			s.push(x,y,'L');
            //鍦ㄥ綋鍓嶄綅缃仛涓€涓悜鍙崇殑鏍囧織
			temp[x][y] = 5;			
			y = y - 1;
			temp[x][y] = 7;
			if((x==MAX_X-1)&&(y==MAX_Y-2)){
				flag = true;
				return;
			}
			else
				continue;
		}

		//涓婁笅宸﹀彸涓嶉€氾紝鍒欏洖閫€鍒拌捣鐐�
		if(s.pop(x,y)==NULL && temp[x-1][y]!=0 && temp[x][y-1]!=0 && temp[x][y+1]!=0 && temp[x+1][y]!=0){
			temp[0][1] = 7;
			if(temp[1][1]!=1)
				temp[1][1] = 2;
			return;
		}
	}
}

char getch(){
	char ch;  
    //淇濆瓨鍘熸湁缁堢灞炴€у拰鏂拌缃殑缁堢灞炴€�
    static struct termios oldt, newt;
    
    //鑾峰緱缁堢鍘熸湁灞炴€у苟淇濆瓨鍦ㄧ粨鏋勪綋oldflag
    tcgetattr( STDIN_FILENO, &oldt);				

    //璁剧疆鏂扮殑缁堢灞炴€�
    newt = oldt;
    newt.c_lflag &= ~(ICANON);          
    tcsetattr( STDIN_FILENO, TCSANOW, &newt);

    //鍙栨秷鍥炴樉
    system("stty -echo");
    ch = getchar();
    system("stty echo");    

    //璁╃粓绔仮澶嶄负鍘熸湁鐨勫睘鎬�
    tcsetattr( STDIN_FILENO, TCSANOW, &oldt);		
	return ch;
}

void move(){
	int x=1,y=1;					//鍑哄彂鐐�	
    
    //涓€鐩存父鎴忥紝鐩村埌璧板嚭
	while(1){
        //鍒ゆ柇杈撳叆鐨勫懡浠�
		switch(getch()){
			case 's':
				if(maze[x+1][y]==0){
                    //娓呯┖褰撳墠浣嶇疆淇℃伅
					maze[x][y] = 0;
					x = x + 1;
                    //褰撳墠浣嶇疆
					maze[x][y] = 7;			
					printMaze();
					if((x==MAX_X-1)&&(y==MAX_Y-2)){
						cout<<"\n\n              鎴愬姛璧板嚭"<<endl;
						return;
					}
				}				
				break;
			case 'd':
				if(maze[x][y+1]==0){
					if(maze[x][y+1]==0){
						maze[x][y] = 0;
						y = y + 1;
						maze[x][y] = 7;
						printMaze();
						if((x==MAX_X-1)&&(y==MAX_Y-2)){
							cout<<"\n\n              鎴愬姛璧板嚭"<<endl;
							return;
						}
					}		
				}
				
				break;
			case 'w':
				if(maze[x-1][y]==0){
					maze[x][y] = 0;
					x = x - 1;
					maze[x][y] = 7;
					printMaze();
					if((x==MAX_X-1)&&(y==MAX_Y-2)){
						cout<<"\n\n              鎴愬姛璧板嚭"<<endl;
						return;
					}
				}	
				break;
			case 'a':
				if(maze[x][y-1]==0){
					maze[x][y] = 0;
					y = y - 1;
					maze[x][y] = 7;
					printMaze();
					if((x==MAX_X-1)&&(y==MAX_Y-2)){
						cout<<"\n\n              鎴愬姛璧板嚭"<<endl;
						return;
					}
				}		
				break;
		}
	}
}

void autoMove(stack_of_maze &s){
	int x=1,y=1;					//鍑哄彂鐐�	
	while(1){
		maze[x][y] = 2;

		//鍚戜笅
		if(maze[x+1][y]==0){
			s.push(x,y,'D');
			maze[x][y] = 3;			//鍦ㄥ綋鍓嶄綅缃仛涓€涓悜涓嬬殑鏍囧織
			x = x + 1;
			maze[x][y] = 7;			//褰撳墠浣嶇疆
			if(slow)
				printMaze();
			if((x==MAX_X-1)&&(y==MAX_Y-2)){
				s.push(x,y,'*');
				cout<<"\n\n              鎴愬姛璧板嚭"<<endl;
				return;
			}
			else
				continue;
		}

		//鍚戝彸
		if(maze[x][y+1]==0){
			s.push(x,y,'R');
			maze[x][y] = 4;			//鍦ㄥ綋鍓嶄綅缃仛涓€涓悜鍙崇殑鏍囧織
			y = y + 1;
			maze[x][y] = 7;
			if(slow)
				printMaze();
			if((x==MAX_X-1)&&(y==MAX_Y-2)){
				s.push(x,y,'*');
				cout<<"\n\n              鎴愬姛璧板嚭"<<endl;
				return;
			}
			else
				continue;
		}

		//鍚戜笂
		if(maze[x-1][y]==0){
			s.push(x,y,'U');
			maze[x][y] = 6;			//鍦ㄥ綋鍓嶄綅缃仛涓€涓悜涓婄殑鏍囧織
			x = x - 1;
			maze[x][y] = 7;
			if(slow)
				printMaze();
			if((x==MAX_X-1)&&(y==MAX_Y-2)){
				s.push(x,y,'*');
				cout<<"\n\n              鎴愬姛璧板嚭"<<endl;
				return;
			}
			else
				continue;
		}

		//鍚戝乏
		if(maze[x][y-1]==0){
			s.push(x,y,'L');
			maze[x][y] = 5;			//鍦ㄥ綋鍓嶄綅缃仛涓€涓悜鍙崇殑鏍囧織
			y = y - 1;
			maze[x][y] = 7;
			if(slow)
				printMaze();
			if((x==MAX_X-1)&&(y==MAX_Y-2)){
				s.push(x,y,'*');
				cout<<"\n\n              鎴愬姛璧板嚭"<<endl;
				return;
			}
			else
				continue;
		}

		//涓婁笅宸﹀彸涓嶉€氾紝鍒欏洖閫€
		if(s.pop(x,y)==NULL && maze[x-1][y]!=0 && maze[x][y-1]!=0 && maze[x][y+1]!=0 && maze[x+1][y]!=0){
			cout<<"\n\n              娌℃湁鎵惧埌鍚堥€傜殑璺緞"<<endl;
			maze[0][1] = 7;
			if(maze[1][1]!=1)
				maze[1][1] = 2;
			return;
		}
	}
}

void menu();

void gamestart(){
    //鍒濆鍖栧湴鍥�
	flag = false;
	while(!flag){
		stack_of_maze stack;
        //鍒涘缓鍦板浘
		createMaze();
        //妫€鏌ュ湴鍥炬槸鍚﹀垱寤烘垚鍔�
		check(stack);
        //妯′豢杩涘害鏉�
		system("clear");
		cout<<"\t*                loading.              *"<<endl;
		system("clear");
		cout<<"\t*                loading..             *"<<endl;
		system("clear");
		cout<<"\t*                loading...            *"<<endl;
	}
    //杈撳嚭褰撳墠杩峰鐨勫垵濮嬬姸鎬�
	printMaze();						
	cout<<"\n\n              杈撳叆enter閿户缁�"<<endl;
	getchar();
    //鑷娓告垙
	if(!autogame){
		move();
		cout<<"\n\n              杈撳叆enter閿户缁�"<<endl;
		getchar();
		menu();
	}
    //鑷姩娓告垙
	else{
		stack_of_maze stack1;				
		autoMove(stack1);					//琛岃蛋涓€︹€�
	}	
	printMaze();							//杈撳嚭杩峰鐨勬渶缁堢姸鎬�
	cout<<"\n\n              杈撳叆enter閿户缁�"<<endl;
	getchar();
	menu();
}

void menu(){
	system("clear");
	int num;
	cout<<"\t****************************************"<<endl;
	cout<<"\t*                                      *"<<endl;
	cout<<"\t*               1.鏌ョ湅璺緞             *"<<endl;
	cout<<"\t*                                      *"<<endl;
	cout<<"\t*               2.鑷姩杩涜             *"<<endl;
	cout<<"\t*                                      *"<<endl;
	cout<<"\t*               3.鑷娓告垙             *"<<endl;
	cout<<"\t*                                      *"<<endl;
	cout<<"\t*               4.閫€鍑烘父鎴�             *"<<endl;
	cout<<"\t*                                      *"<<endl;
	cout<<"\t****************************************"<<endl;
	slow = false;
    //閫夋嫨妯″紡
	switch(getch()){
		case '1':
			autogame = true;
			gamestart();
            break;
		case '2':
			autogame = true;
			slow = true;
			gamestart();
			break;
		case '3':
			autogame = false;
			gamestart();
			break;
		case '4':
			exit(1);break;
		default:
			cout<<"\n\n              閿欒鎿嶄綔锛岃緭鍏nter杩斿洖锛�"<<endl;
			getchar();
			menu();
	}
	getchar();
}

int main(int argc,char** argv){
	menu();
	return 0;
}