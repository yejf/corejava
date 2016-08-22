/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class InvalidMoneyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3323640509587703603L;

	/**
	 * 
	 */
	public InvalidMoneyException() {
	}

	/**
	 * @param message
	 */
	public InvalidMoneyException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidMoneyException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidMoneyException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public InvalidMoneyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
