/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day19;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
//ʹ�þ�̬���� [���Ե��뵽��̬���Ժͷ�����һ��]
import static java.lang.annotation.RetentionPolicy.*;

import static java.lang.annotation.ElementType.*;

/**
 * ���ǵ�һ��ע�������
 * @author yejf
 *
 */
@Retention(RUNTIME)
@Target({TYPE,METHOD})
public @interface Hello {

	String hello();
}
