$(function(){
	//获取shopId
	var shopId = getQueryString("shopId");
	
	//商铺管理的url
	var shopInfoUrl = '/b2b/shopadmin/getshopmanageInfo?shopId=' + shopId;
	
	$.getJSON(shopInfoUrl, function(data){
		//如果后台返回redirevt = true,则跳转后台到设置url
		if(data.redirect){
			widow.location.href = data.url;
		}else{
			//如果后台返回redirect=false，则设置shopId并给 按钮设置超链接属性（即编辑商铺）
			if(data.shopId != undefind && data.shopId != null){
				shopId = data.shopId;
			}
			$('#shopInfo').attr('href','/b2b/shopadmin/shopoperation?shopId=' + shopId);
			$('#productCategory').attr('href','/b2b/shopadmin/productcategorymanagement');
		}
	});
});