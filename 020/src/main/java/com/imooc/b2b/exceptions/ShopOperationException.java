package com.imooc.b2b.exceptions;

public class ShopOperationException extends RuntimeException{
	
	/**
	 * 这个异常继承RuntimeException是为了中断回滚异常日志 事物的处理
	 */
	private static final long serialVersionUID = 6677148021919323383L;

	public ShopOperationException(String msg) {
		super(msg);
	}
}
