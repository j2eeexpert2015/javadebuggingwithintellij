package org.debugtutorial.demo;

import java.util.List;
import java.util.Map;

import org.debugtutorial.domain.Person;
import org.debugtutorial.util.DataUtil;

public class DebugPerson {
	public static void main(String[] args) {
		int i = 0;
		int j = 100;
		i = i + 100;

        int[] numberArray = new int[10000];
        for (int temp = 0; temp < 10000; ++temp) {
            numberArray[temp]=temp;
        }

		System.out.println("i:"+i);
		List<Person> personList = DataUtil.getPersonData();
		System.out.println("personList:" + personList);
		Map<Integer, Person> personMap = DataUtil.getPersonMap();
		System.out.println("personMap:" + personMap);
 		Person firstPerson = personList.get(0);
		System.out.println("name:"+firstPerson.getName()+",age:"+firstPerson.getAge());
		System.out.println("name:"+personList.get(1).getName()+",age:"+firstPerson.getAge());
	}

}
