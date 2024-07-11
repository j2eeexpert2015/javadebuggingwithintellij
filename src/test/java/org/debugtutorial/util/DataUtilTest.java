package org.debugtutorial.util;

import static org.junit.jupiter.api.Assertions.*;

import org.debugtutorial.domain.Employee;
import org.debugtutorial.domain.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class DataUtilTest {
    @Test
    public void testGetPersonListWithOtherDatatypes() {
        List<Object> personList = DataUtil.getPersonListWithOtherDatatypes();
        assertEquals(5, personList.size());
        assertTrue(personList.get(0) instanceof Person);
        assertTrue(personList.get(1) instanceof Person);
        assertTrue(personList.get(2) instanceof Person);
        assertEquals("Dummy Data", personList.get(3));
        assertEquals(1, personList.get(4));
    }

    @Test
    public void testGetPersonData() {
        List<Person> personList = DataUtil.getPersonData();
        assertEquals(8, personList.size());
        assertNotNull(personList.get(0));
        assertEquals("Steve", personList.get(0).getName());
        assertNull(personList.get(1).getCountry());
        assertEquals("Germany", personList.get(2).getCountry());
    }

    @Test
    public void testGetPersonMap() {
        Map<Integer, Person> personMap = DataUtil.getPersonMap();
        assertEquals(2, personMap.size());
        assertEquals("Steve", personMap.get(1).getName());
        assertEquals("Martin", personMap.get(2).getName());
    }


}
