/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day09;

/**
 * 弹出对话框的动作
 * @author yejf
 *
 */
public class PopupAction implements Action {

	/* (non-Javadoc)
	 * @see com.core.day09.Action#doIt(java.lang.String)
	 */
	@Override
	public void doIt(String source) {
		System.out.printf("\t由于点了[%s]\n",source);
		
		System.out.println("\t弹出对话框.");
		
		//.... what ever 
	}

}
