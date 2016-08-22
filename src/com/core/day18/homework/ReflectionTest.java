package com.core.day18.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java ReflectionTest  class_name");
			System.exit(-1);
		}
		String name = args[0];
		try {
			Class<?> cl = Class.forName(name);
			Class<?> supercl = cl.getSuperclass();
			System.out.print("class " + name);
			if (supercl != null && !supercl.equals(Object.class))
				System.out.print(" extends " + supercl.getName());
			System.out.print("\n{\n");
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.println("}");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found.");
		}
	}

	public static void printConstructors(Class<?> cl) {
		Constructor<?>[] constructors = cl.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor<?> c = constructors[i];
			Class<?>[] paramTypes = c.getParameterTypes();
			String name = c.getName();
			System.out.print(Modifier.toString(c.getModifiers()));
			System.out.print(" " + name + "(");
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}

	public static void printMethods(Class<?> cl) {
		Method[] methods = cl.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			Class<?> retType = m.getReturnType();
			Class<?>[] paramTypes = m.getParameterTypes();
			String name = m.getName();
			System.out.print(Modifier.toString(m.getModifiers()));
			System.out.print(" " + retType.getName() + " " + name + "(");
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}

	public static void printFields(Class<?> cl) {
		Field[] fields = cl.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			Class<?> type = f.getType();
			String name = f.getName();
			System.out.print(Modifier.toString(f.getModifiers()));
			System.out.println(" " + type.getName() + " " + name + ";");
		}
	}
}
