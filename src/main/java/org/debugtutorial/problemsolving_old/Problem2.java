package org.debugtutorial.problemsolving_old;

import java.util.Iterator;
import java.util.List;

import org.debugtutorial.domain.Person;
import org.debugtutorial.util.DataUtil;

public class Problem2
{
	/**
	 * Utility method to print all characters of a string
	 * @param word
	 */
	public static void printCharacters(String word) {
		for (int i = 0; i <= word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

	public static void main(String[] args) {
		List<?> personList = DataUtil.getPersonListWithOtherDatatypes();
		Iterator<?> itr = personList.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println("Person Name :" + ((Person) obj).getName());
		}

	}
}
