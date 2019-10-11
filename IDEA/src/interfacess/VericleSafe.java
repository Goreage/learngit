package interfacess;

/**
 * @param initSpeed 刹车时的初始速度
 * @param 从initSpeed开始刹车到停止行驶的时间，单位是毫秒
 * @return 从initSpeed开始刹车到停止行驶的距离
 */
public interface VericleSafe {

    double brake(int initSpeed, int brakeTime);
}
