package org.debugtutorial.demo;

import java.util.List;

import org.debugtutorial.domain.Person;
import org.debugtutorial.util.DataUtil;

public class DebugPersonDetailsIteration {
	public static void main(String[] args) {
		List<Person> personList = DataUtil.getPersonData();
		//List<Person> personList = DataUtil.getPersonListWithOtherDatatypes();
		for (int i=0; i < personList.size(); i ++)
		{
			Person person = personList.get(i);
		    System.out.println(person);
		}
		
	}

}
