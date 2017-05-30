package retrofit.android.bynnean.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/* 
 * 定义注解 Test 
 * 为方便测试：注解目标为类 方法，属性及构造方法 
 * 注解中含有三个元素 id ,name和 gid; 
 * id 元素 有默认值 0
 */ 

@Documented 
@Target({ElementType.TYPE,ElementType.METHOD,
	ElementType.FIELD,ElementType.CONSTRUCTOR})
//表示运行时
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MethodInfo {
	String name() default "xujunTest";
	int id() default 0;
	Class<Long> gid();
	
}



