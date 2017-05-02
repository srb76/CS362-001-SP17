package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
	Appt appt;
	int startHour=13;
	int startMinute=30;
	int startDay=10;
	int startMonth=4;
	int startYear=2017;
	String title="Birthday Party";
	String description="This is my birthday party.";

    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void getterTest()  throws Throwable  {
		 //Construct a new Appointment object with the initial data	 
		 appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
	public void setterTest() throws Throwable {
		//Create appt
	 	appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

	 	//Modify appt
		appt.setStartHour(3);
		appt.setStartMinute(4);
		appt.setStartDay(5);
		appt.setStartMonth(6);
		appt.setStartYear(7);
		appt.setTitle("Pizza time");
		appt.setDescription("This was a long time ago");

		//Check if values have been updated
		assertTrue(appt.getValid());
		assertEquals(3, appt.getStartHour());
		assertEquals(4, appt.getStartMinute());
		assertEquals(5, appt.getStartDay());
		assertEquals(6, appt.getStartMonth());
		assertEquals(7, appt.getStartYear());
		assertEquals("Pizza time", appt.getTitle());
		assertEquals("This was a long time ago", appt.getDescription());

		//Test for case of null title and description
		appt.setTitle(null);
		appt.setDescription(null);
		assertEquals("",appt.getTitle());
		assertEquals("",appt.getDescription());
	}

	@Test
	public void isValidTest() throws Throwable {
		//Create a valid appt
	 	appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

	 	//Test if valid
		assertTrue(appt.getValid());

		//Modify values to have illegal numbers and test. Values will be reset after each set of tests
		//Start hour
		appt.setStartHour(-1);
		assertFalse(appt.getValid());

		appt.setStartHour(24);
		assertFalse(appt.getValid());
		appt.setStartHour(startHour);

		//Start min
		appt.setStartMinute(-1);
		assertFalse(appt.getValid());

		appt.setStartMinute(60);
		assertFalse(appt.getValid());
		appt.setStartMinute(startMinute);

		//Start Day
		appt.setStartDay(0);
		assertFalse(appt.getValid());

		appt.setStartDay(32);
		assertFalse(appt.getValid());
		appt.setStartDay(startDay);

		//Start Month
		appt.setStartMonth(0);
		assertFalse(appt.getValid());

		appt.setStartMonth(13);
		assertFalse(appt.getValid());
		appt.setStartMonth(startMonth);

		//Check again for validity
		assertTrue(appt.getValid());
	}

	@Test
	public void toStringTest() throws Throwable {
		String result;
		boolean valid = false;
		Appt badAppt = new Appt(-1,-1,-1,-1,-1,"","");

	 	//Test invalid appt
		assertNull(badAppt.toString());

	 	//Create a valid appt
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		//Create a string from appt and check for accuracy
		result = appt.toString();
		if(result.contains("4/10/2017") && result.contains("1:30pm"))
			valid = true;

		assertTrue(valid);
	}

	
}
