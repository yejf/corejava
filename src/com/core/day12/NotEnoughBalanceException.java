/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class NotEnoughBalanceException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2415271949549706340L;

	/**
	 * 
	 */
	public NotEnoughBalanceException() {
	}

	/**
	 * @param message
	 */
	public NotEnoughBalanceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public NotEnoughBalanceException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public NotEnoughBalanceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public NotEnoughBalanceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
