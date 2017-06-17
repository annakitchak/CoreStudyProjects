package ua.study;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
//		Person person = new Person("antonio", 32, "banderas", 70);
//		Class ref = person.getClass();
//		System.out.println(ref.getSuperclass().getSimpleName());
//		System.out.println("-----------");
//		Field [] fields = ref.getDeclaredFields(); //отримуємо поля, які є в класі, getFields()отримуємо тільки public поля 
//		for (Field field : fields) {
//			System.out.println(field);
//		}
//		System.out.println("-----------");
//		Method [] methods = ref.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method.getName());
//		}
//		System.out.println("-----------");
//		Constructor [] constructors = ref.getDeclaredConstructors();
//		for (Constructor constructor : constructors) {
//			System.out.println(constructor);
//		}
//		System.out.println("-----------");
//		
//		Class [] classes = ref.getInterfaces();
//		for (Class class1 : classes) {
//			System.out.println(class1.getSimpleName());
//		}
//		System.out.println("-----------");
//		
//		Person newPerson = (Person) ref.newInstance();
//		System.out.println(newPerson);
//		System.out.println(person);
//		System.out.println("-----------");
//		
//		Field field = ref.getDeclaredField("name");
//		field.setAccessible(true);
//		field.set(person, "petro");
//		System.out.println(person);
//		System.out.println("-----------");
		
		
		
		
		Factory factory = new Factory("gmc", Arrays.asList(
				new Auto("mazda", new Engine(100)), 
				new Auto("suzuki", new Engine(130)),
				new Auto("bmw", new Engine(300))));

		Auto maxPowerAuto = factory.getAutos().get(0);
		Auto minPowerAuto = factory.getAutos().get(1);
		
		
		
		for (Auto currentAuto : factory.getAutos()) {
			if(maxPowerAuto.getEngine().getPower()<currentAuto.getEngine().getPower()){
				maxPowerAuto = currentAuto;
			}
			if(minPowerAuto.getEngine().getPower()>currentAuto.getEngine().getPower()){
				minPowerAuto = currentAuto;
			}
		}
		int newPower = maxPowerAuto.getEngine().getPower();
		System.out.println(maxPowerAuto);
		System.out.println(minPowerAuto);
		System.out.println("---------------");
		maxPowerAuto.getEngine().setPower(minPowerAuto.getEngine().getPower());
		minPowerAuto.getEngine().setPower(newPower);
		

		System.out.println(maxPowerAuto);
		System.out.println(minPowerAuto);

		
//завдання: замінити максимальну потужність на мінімальну, а мінімальну на максимальну,
//тобто мазда повинна мати 300, а бмв 100
	}
}
