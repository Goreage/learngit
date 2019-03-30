///�Ҷ�ͼ��ֱ��ͼ���⻯
#include "opencv2/opencv.hpp"
using namespace cv;
#include <iostream>
using namespace std;
int main()
{
	//1.�Ҷ�ֱ��ͼ���⻯
	Mat srcImg = imread("E:\\Wu-air.jpg", CV_LOAD_IMAGE_GRAYSCALE);//ֱ��ͼ���⻯��Ϊ8λ��ͨ��ͼ��
	Mat dstImg;
	equalizeHist(srcImg, dstImg);
	imshow("srcImg", srcImg);
	imshow("dstImg", dstImg);
	//2.����ԴͼsrcImg��Ŀ��ͼ��dstImg��ֱ��ͼ
	//2.1����ֱ��ͼ
	int nimages = 1;//ͼ��ĸ���
	int channels = 0;//��Ҫͳ��ͨ��������
	Mat mask = Mat();
	Mat histImg_src;//���srcImg�����ֱ��ͼ
	Mat histImg_dst;//���dstImg�����ֱ��ͼ
	int dims = 1;//��Ҫ�����ֱ��ͼ��ά��
	int histSize = 256;//�����ֱ��ͼ�ķ�����
	float range[] = { 0, 256 };//��ʾֱ��ͼÿһά�ȵ�ȡֵ��Χ[0,256)
	const float* ranges[] = { range };//������ʽ��Ҫ,��ʾÿһά����ֵ��ȡֵ��Χ
	calcHist(&srcImg, nimages, &channels, mask, histImg_src, dims, &histSize, ranges);//����srcImgֱ��ͼ
	calcHist(&dstImg, nimages, &channels, mask, histImg_dst, dims, &histSize, ranges);//����dstImgֱ��ͼ
																					  //2.2����ֱ��ͼ
																					  //2.2.1����srcImg��ֱ��ͼ
	double minValue = 0;
	double maxValue = 0;
	minMaxLoc(histImg_src, &minValue, &maxValue);//�õ��������ֱ��ͼ�е���Сֵ�����ֵ
	int width = histSize;//�������ֱ��ͼ�Ŀ�ȣ��������histSize
	int height = 400;//�������ֱ��ͼ�ĸ߶�
	Mat histShow_src = Mat::zeros(Size(width, height), CV_8UC3);//��ΪhistSize����Ϊheight
	for (int i = 0; i < histSize; i++)//����histImg
	{
		float binValue = histImg_src.at<float>(i);//�õ�histImg��ÿһ�����ֵ
		cout << "i: " << i << " ,binValue: " << binValue << endl;
		float realValue = (binValue / maxValue)*height;//��һ�����ݣ����ŵ�ͼ���height֮��
		cout << "i: " << i << " ,realValue: " << realValue << endl;
		//��ֱ�߷�������ֱ��ͼ��ע�����˵�����ļ���
		line(histShow_src, Point(i, height - 1), Point(i, height - 1 - realValue), Scalar(255, 0, 0), 1);
	}
	namedWindow("srcHist", CV_WINDOW_NORMAL);
	imshow("srcHist", histShow_src);
	//2.2.2����dstImg��ֱ��ͼ
	double minValue_dst = 0;
	double maxValue_dst = 0;
	minMaxLoc(histImg_dst, &minValue_dst, &maxValue_dst);//�õ��������ֱ��ͼ�е���Сֵ�����ֵ
	Mat histShow_dst = Mat::zeros(Size(width, height), CV_8UC3);//��ΪhistSize����Ϊheight
	for (int i = 0; i < histSize; i++)//����histImg
	{
		float binValue = histImg_dst.at<float>(i);//�õ�histImg��ÿһ�����ֵ
		cout << "i: " << i << " ,binValue: " << binValue << endl;
		float realValue = (binValue / maxValue_dst)*height;//��һ�����ݣ����ŵ�ͼ���height֮��
		cout << "i: " << i << " ,realValue: " << realValue << endl;
		//��ֱ�߷�������ֱ��ͼ��ע�����˵�����ļ���
		line(histShow_dst, Point(i, height - 1), Point(i, height - 1 - realValue), Scalar(255, 0, 0), 1);
	}
	namedWindow("dstHist", CV_WINDOW_NORMAL);
	imshow("dstHist", histShow_dst);
	waitKey(0);
	return 0;
}