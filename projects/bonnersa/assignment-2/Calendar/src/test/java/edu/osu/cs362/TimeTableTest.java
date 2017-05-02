package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {
	TimeTable test = new TimeTable();
	CalDay testDay;
	GregorianCalendar janFirst = new GregorianCalendar(2017,1,1);
	GregorianCalendar febSeventh = new GregorianCalendar(2017,2,7);
	Appt earlyAppt = new Appt(1,1,1,1,2017,"Early Appt","For testing");
	Appt lateAppt = new Appt(12,1,1,1,2017,"Late Appt","For testing");
	Appt farAppt = new Appt(1,1,20,11,2017,"Far Appt","Nov 20, 2017");
	LinkedList<Appt> appts = new LinkedList<Appt>();
	LinkedList<CalDay> days = new LinkedList<CalDay>();

	 @Test
	  public void getApptRangeTest()  throws Throwable  {
	 	boolean valid = false;
	 	String result = "";
		 //Give bad parameters (1st day is after 2nd day), an exception should be caught
		 try {
			 test.getApptRange(appts, febSeventh, janFirst);
		 } catch(IllegalArgumentException e) {
		 	valid = true;
		 }

		 assertTrue(valid);
		 valid = false; //reset test boolean

		 //Add all appt to appts list
		 appts.add(earlyAppt);
		 appts.add(lateAppt);
		 appts.add(farAppt);

		 //Pass valid parameters and create a String containing all appointments
		 days = test.getApptRange(appts, janFirst,febSeventh);
		 for (CalDay day : days)
		 	result += day.toString();

		 //Check created string contains Early Appt and Late Appt, but not Far Appt
		 if (result.contains("Early Appt") && result.contains("Late Appt") && !result.contains("Far Appt"))
		 	valid = true;

		 assertTrue(valid);
	 }

	 @Test
	public void deleteApptTest() throws Throwable {
	 	LinkedList<Appt> badList = new LinkedList<Appt>();
	 	Appt badAppt = null;
	 	//Test deleting a null appt, should return a null value
		 assertNull(test.deleteAppt(badList,badAppt));

		 //Test deleting an invalid appt
		 badAppt = new Appt(-1,-1,-1,-1,-1,"Bad appt","Invalid");
		 appts.add(badAppt);
		 assertNull(test.deleteAppt(appts,badAppt));

		 //Try deleting a non-existent Appt from a size zero list
		 appts.remove(badAppt);
		 assertNull(test.deleteAppt(appts,earlyAppt));

		 //Test valid list, list should have a size of one
		 appts.add(earlyAppt);
		 appts.add(lateAppt);

		 test.deleteAppt(appts, lateAppt);
		 assertEquals(1,appts.size());

	 }

}
