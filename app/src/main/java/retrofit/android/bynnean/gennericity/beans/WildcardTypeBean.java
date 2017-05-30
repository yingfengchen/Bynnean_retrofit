package retrofit.android.bynnean.gennericity.beans;

import java.io.Closeable;
import java.util.List;

public class WildcardTypeBean {
	private List<? extends Number> a;  // a没有下界,
//	没有指定的话，上边界默认是 Object ,下边界是 	String						
	private List<? super String> b; 
	
	private List<String> c;
	
	private Class<?> aClass;

}
