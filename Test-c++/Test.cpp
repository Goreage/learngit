///灰度图像直方图均衡化
#include "opencv2/opencv.hpp"
using namespace cv;
#include <iostream>
using namespace std;
int main()
{
	//1.灰度直方图均衡化
	Mat srcImg = imread("E:\\Wu-air.jpg", CV_LOAD_IMAGE_GRAYSCALE);//直方图均衡化需为8位单通道图像
	Mat dstImg;
	equalizeHist(srcImg, dstImg);
	imshow("srcImg", srcImg);
	imshow("dstImg", dstImg);
	//2.画出源图srcImg和目标图像dstImg的直方图
	//2.1计算直方图
	int nimages = 1;//图像的个数
	int channels = 0;//需要统计通道的索引
	Mat mask = Mat();
	Mat histImg_src;//存放srcImg输出的直方图
	Mat histImg_dst;//存放dstImg输出的直方图
	int dims = 1;//需要计算的直方图的维度
	int histSize = 256;//计算的直方图的分组数
	float range[] = { 0, 256 };//表示直方图每一维度的取值范围[0,256)
	const float* ranges[] = { range };//参数形式需要,表示每一维度数值的取值范围
	calcHist(&srcImg, nimages, &channels, mask, histImg_src, dims, &histSize, ranges);//计算srcImg直方图
	calcHist(&dstImg, nimages, &channels, mask, histImg_dst, dims, &histSize, ranges);//计算dstImg直方图
																					  //2.2绘制直方图
																					  //2.2.1绘制srcImg的直方图
	double minValue = 0;
	double maxValue = 0;
	minMaxLoc(histImg_src, &minValue, &maxValue);//得到计算出的直方图中的最小值和最大值
	int width = histSize;//定义绘制直方图的宽度，令其等于histSize
	int height = 400;//定义绘制直方图的高度
	Mat histShow_src = Mat::zeros(Size(width, height), CV_8UC3);//宽为histSize，高为height
	for (int i = 0; i < histSize; i++)//遍历histImg
	{
		float binValue = histImg_src.at<float>(i);//得到histImg中每一分组的值
		cout << "i: " << i << " ,binValue: " << binValue << endl;
		float realValue = (binValue / maxValue)*height;//归一化数据，缩放到图像的height之内
		cout << "i: " << i << " ,realValue: " << realValue << endl;
		//用直线方法绘制直方图，注意两端点坐标的计算
		line(histShow_src, Point(i, height - 1), Point(i, height - 1 - realValue), Scalar(255, 0, 0), 1);
	}
	namedWindow("srcHist", CV_WINDOW_NORMAL);
	imshow("srcHist", histShow_src);
	//2.2.2绘制dstImg的直方图
	double minValue_dst = 0;
	double maxValue_dst = 0;
	minMaxLoc(histImg_dst, &minValue_dst, &maxValue_dst);//得到计算出的直方图中的最小值和最大值
	Mat histShow_dst = Mat::zeros(Size(width, height), CV_8UC3);//宽为histSize，高为height
	for (int i = 0; i < histSize; i++)//遍历histImg
	{
		float binValue = histImg_dst.at<float>(i);//得到histImg中每一分组的值
		cout << "i: " << i << " ,binValue: " << binValue << endl;
		float realValue = (binValue / maxValue_dst)*height;//归一化数据，缩放到图像的height之内
		cout << "i: " << i << " ,realValue: " << realValue << endl;
		//用直线方法绘制直方图，注意两端点坐标的计算
		line(histShow_dst, Point(i, height - 1), Point(i, height - 1 - realValue), Scalar(255, 0, 0), 1);
	}
	namedWindow("dstHist", CV_WINDOW_NORMAL);
	imshow("dstHist", histShow_dst);
	waitKey(0);
	return 0;
}