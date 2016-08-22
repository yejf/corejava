/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day19;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
//使用静态导入 [可以导入到静态属性和方法那一级]
import static java.lang.annotation.RetentionPolicy.*;

import static java.lang.annotation.ElementType.*;

/**
 * 这是第一个注解的例子
 * @author yejf
 *
 */
@Retention(RUNTIME)
@Target({TYPE,METHOD})
public @interface Hello {

	String hello();
}
