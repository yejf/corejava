/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day19;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yejf
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD,METHOD})
public @interface Name {

	String first();
	
	String last();
}

