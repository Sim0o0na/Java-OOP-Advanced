package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InstantiationException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Class bbiClass = BlackBoxInt.class;
		Constructor constr = BlackBoxInt.class.getDeclaredConstructor();
		constr.setAccessible(true);
		BlackBoxInt bbi = (BlackBoxInt)constr.newInstance();

		String command = reader.readLine();

		while (!command.equals("END")) {
			String[] cmdArray = command.split("_");
			Method method = bbiClass.getDeclaredMethod(cmdArray[0], int.class);
			method.setAccessible(true);
			method.invoke(bbi, Integer.parseInt(cmdArray[1]));
			Field innervalue = bbiClass.getDeclaredField("innerValue");
			innervalue.setAccessible(true);
			System.out.println(innervalue.get(bbi));
			command = reader.readLine();
		}
	}
}
