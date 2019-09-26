/**
 * 
 */
function changeVerifyCode(img){
	img.src = "../Kaptcha?" + Math.floor(Math.random()*100); 
}
/**
 * 
 * 根据Uil传过来的key去获取它的值， 正则表达式
 * @param name
 * @returns
 */
function getQueryString(name){
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if(r != null){
		return decodeURIComponent(r[2]);
	}
	return '';
}