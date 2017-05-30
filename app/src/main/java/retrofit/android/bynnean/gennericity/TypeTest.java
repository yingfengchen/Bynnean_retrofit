package retrofit.android.bynnean.gennericity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   HashMap<String, String> map=new HashMap<>();
	   HashMap<String, Object> oMap=new HashMap<>();
	   List<String> list=new ArrayList<>();
	   List<Object> oList=new ArrayList<>();
	   List<Integer> iList=new ArrayList<>();
	   
	   TestHelper.testParameterizedType();
	   PrintUtils.print("-------------------------------------------");
	   TestHelper.testOwnerType();
	   PrintUtils.print("-------------------------------------------");
	   TestHelper.testGenericArrayType();
	   PrintUtils.print("-------------------------------------------");
	   TestHelper.testTypeVariable();
	   PrintUtils.print("-------------------------------------------");
	   TestHelper.testWildCardType();
	}

}
