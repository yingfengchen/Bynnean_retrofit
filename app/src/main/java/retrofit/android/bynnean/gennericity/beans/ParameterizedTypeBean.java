package retrofit.android.bynnean.gennericity.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import retrofit.android.bynnean.gennericity.Person;


public class ParameterizedTypeBean {
	Map<String, Person> map;
	Set<String> set1;
	Class<?> clz;
	Holder<String> holder;
	List<String> list;
	String str;
	Integer i;

	Set set;
	List aList;
	Map.Entry<String, String> entry;

	
	static class Holder<V>{
		
	}
}
