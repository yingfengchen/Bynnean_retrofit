package retrofit.android.bynnean.gennericity;

import android.util.Log;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.Map;
import java.util.Set;

import retrofit.android.bynnean.gennericity.beans.GenericArrayTypeBean;
import retrofit.android.bynnean.gennericity.beans.ParameterizedTypeBean;
import retrofit.android.bynnean.gennericity.beans.TypeVariableBean;
import retrofit.android.bynnean.gennericity.beans.WildcardTypeBean;


public class TestHelper {

	public static void testParameterizedType() {
		Field f = null;
		try {
			Field[] fields = ParameterizedTypeBean.class.getDeclaredFields();
			// 打印出所有的 Field 的 TYpe 是否属于 ParameterizedType
			for (int i = 0; i < fields.length; i++) {
				f = fields[i];
				PrintUtils.print(f.getName()
						+ " getGenericType() instanceof ParameterizedType "
						+ (f.getGenericType() instanceof ParameterizedType));
			}
			getParameterizedTypeMes("map");
			getParameterizedTypeMes("entry");
			getParameterizedTypeMes("clz");

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void getParameterizedTypeMes(String fieldName)
			throws NoSuchFieldException {
		Field f;
		f = ParameterizedTypeBean.class.getDeclaredField(fieldName);
		f.setAccessible(true);
		PrintUtils.print(f.getGenericType());
		boolean b = f.getGenericType() instanceof ParameterizedType;
		PrintUtils.print(b);
		if (b) {
			ParameterizedType pType = (ParameterizedType) f.getGenericType();
			PrintUtils.print(pType.getRawType());
			for (Type type : pType.getActualTypeArguments()) {
				PrintUtils.print(type);
				if(type instanceof WildcardType)
				{
					Log.i("test",type+"是wildcardtype");
				}
			}
			PrintUtils.print(pType.getOwnerType()); // null
		}
	}

	public static void testOwnerType() {
		Method method;
		try {
			method = TestHelper.class.getMethod("ownerTypeHelper",
					Map.Entry.class);
			Type[] types = method.getGenericParameterTypes();
			ParameterizedType pType = (ParameterizedType) types[0];
			System.out.println(pType.getOwnerType());// 打印结果是interface
														// java.util.Map
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static <T, U> void ownerTypeHelper(Map.Entry<T, U> mapEntry) {

	}

	public static void testTypeVariable() {
		Field fk;
		try {
			Field[] fields = TypeVariableBean.class.getDeclaredFields();

			for (int i = 0; i < fields.length; i++) {
				fk = fields[i];
				PrintUtils.print(fk.getName()
						+ " getGenericType() instanceof TypeVariable "
						+ (fk.getGenericType() instanceof TypeVariable));
			}
			fk = TypeVariableBean.class.getDeclaredField("key");
			Field fv = TypeVariableBean.class.getDeclaredField("value");
			PrintUtils.print(fk.getGenericType() instanceof TypeVariable);
			PrintUtils.print(fv.getGenericType() instanceof TypeVariable);
			TypeVariable keyType = (TypeVariable) fk.getGenericType();
			TypeVariable valueType = (TypeVariable) fv.getGenericType();
			// getName 方法
			System.out.println(keyType.getName()); // K
			System.out.println(valueType.getName()); // V
			// getGenericDeclaration 方法
			System.out.println(keyType.getGenericDeclaration());
			System.out.println(valueType.getGenericDeclaration());
			// getBounds 方法
			System.out.println("K 的上界:"); // 有两个
			for (Type type : keyType.getBounds()) {
				// interface java.io.Serializable
				System.out.println(type);
			}
			System.out.println("V 的上界:"); // 没明确声明上界的, 默认上界是 Object
			for (Type type : valueType.getBounds()) { // class java.lang.Object
				System.out.println(type);
			}
			TypeVariableBean bean = new TypeVariableBean<FileInputStream, String>();
			fk = TypeVariableBean.class.getDeclaredField("key");
			keyType = (TypeVariable) fk.getGenericType();
			System.out.println(keyType.getName());
			System.out.println(keyType.getGenericDeclaration());
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testGenericArrayType() {
		Method method = GenericArrayTypeBean.class.getDeclaredMethods()[0];
		System.out.println(method);
		// public void test(List<String>[] pTypeArray, T[]
		// vTypeArray,List<String> list, String[] strings, Person[] ints)
		Type[] types = method.getGenericParameterTypes(); // 这是 Method 中的方法
		for (Type type : types) {
			System.out.println(type instanceof GenericArrayType);// 依次输出true，true，false，false，false
		}
	}

	public static void testWildCardType() {
		try {
			Field[] fields = WildcardTypeBean.class.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				Field field = fields[i];
				Type type = field.getGenericType();
				String nameString = field.getName();
				PrintUtils.print("下面开始打印" + nameString + "是否具有通配符");
				if (!(type instanceof ParameterizedType)) {
					PrintUtils.print("---------------------------");
					continue;
				}
				ParameterizedType parameterizedType = (ParameterizedType) type;
				type = parameterizedType.getActualTypeArguments()[0];
				if (!(type instanceof WildcardType)) {
					PrintUtils.print("---------------------------");
					continue;
				}
				WildcardType wildcardType = (WildcardType) type;
				Type[] lowerTypes = wildcardType.getLowerBounds();
				if (lowerTypes != null) {
					PrintUtils.print("下边界");
					PrintUtils.printTypeArr(lowerTypes);
				}
				Type[] upTypes = wildcardType.getUpperBounds();
				if (upTypes != null) {
					PrintUtils.print("上边界");
					PrintUtils.printTypeArr(upTypes);
				}
				PrintUtils.print("---------------------------");

			}
			Field fieldA = WildcardTypeBean.class.getDeclaredField("a");
			Field fieldB = WildcardTypeBean.class.getDeclaredField("b");
			// 先拿到范型类型
			PrintUtils.print(fieldA.getGenericType() instanceof ParameterizedType);
			PrintUtils.print(fieldB.getGenericType() instanceof ParameterizedType);
			ParameterizedType pTypeA = (ParameterizedType) fieldA.getGenericType();
			ParameterizedType pTypeB = (ParameterizedType) fieldB.getGenericType();
			// 再从范型里拿到通配符类型
			PrintUtils.print(pTypeA.getActualTypeArguments()[0] instanceof WildcardType);
			PrintUtils.print(pTypeB.getActualTypeArguments()[0] instanceof WildcardType);
			WildcardType wTypeA = (WildcardType) pTypeA.getActualTypeArguments()[0];
			WildcardType wTypeB = (WildcardType) pTypeB.getActualTypeArguments()[0];
			// 方法测试
			System.out.println(wTypeA.getUpperBounds()[0]); 
			System.out.println(wTypeB.getLowerBounds()[0]); 
			// 看看通配符类型到底是什么, 打印结果为: ? extends java.lang.Number
			System.out.println(wTypeA);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
