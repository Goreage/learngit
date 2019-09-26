package com.imooc.b2b.exceptions;

public class ProductCategoryOperationException extends RuntimeException{
	/**
	 * 这个异常继承RuntimeException是为了中断回滚异常日志 事物的处理
	 */
	private static final long serialVersionUID = -4562413071610990353L;

	public ProductCategoryOperationException(String msg) {
		super(msg);
	}
}
