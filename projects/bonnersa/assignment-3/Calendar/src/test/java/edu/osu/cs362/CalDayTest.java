package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
		import java.util.Calendar;
		import java.util.GregorianCalendar;
		import java.util.Iterator;


		import org.junit.Test;

		import static org.junit.Assert.*;

public class CalDayTest {

	CalDay testDay;
	GregorianCalendar janFirst = new GregorianCalendar(2017,1,1);
	Appt earlyAppt = new Appt(1,1,1,1,1,"Early Appt","For testing");
	Appt lateAppt = new Appt(12,1,1,1,1,"Late Appt","For testing");

	@Test
	public void CalDayConstructorTest() throws Throwable {
		testDay = new CalDay(janFirst);
		assertEquals(2017,testDay.getYear());
		assertEquals(1,testDay.getMonth());
		assertEquals(1,testDay.getDay());

		CalDay badDay = new CalDay();
		assertEquals(0,badDay.getYear());
		assertEquals(0,badDay.getMonth());
		assertEquals(0,badDay.getDay());
	}

	@Test
	public void IteratorTest1() throws Throwable {
		testDay = new CalDay(janFirst);
		testDay.addAppt(lateAppt);
		testDay.addAppt(earlyAppt);

		Iterator<?> testIt = testDay.iterator();
		assertNotNull(testIt);
		assertTrue(testIt.hasNext());
		assertTrue(testIt.next() instanceof Appt);
		assertTrue(testIt.hasNext());
		assertTrue(testIt.next() instanceof Appt);
		assertFalse(testIt.hasNext());

		CalDay badDay = new CalDay();
		testIt = badDay.iterator();
		assertNull(testIt);
	}

	@Test
	public void returnValidTest()  throws Throwable  {
		testDay = new CalDay();

		//Test to see if uninitialized object is invalid
		boolean testValid = testDay.isValid();
		assertEquals(false,testValid);

		//Test to see if intialized object is valid
		testDay = new CalDay(janFirst);
		testValid = testDay.isValid();
		assertEquals(true,testValid);

		//Test to see if this date is Jan 1st, 2017
		boolean correctDate = false;
		String testDate = testDay.toString();
		if(testDate.contains("1/1/2017"))
			correctDate = true;

		assertTrue(correctDate);

		//Test toString() for invalid CalDay, should give an empty string
		CalDay badDay = new CalDay();
		testDate = badDay.toString();
		assertEquals("",testDate);
	}

	@Test
	public void addApptTest() throws Throwable {
		testDay = new CalDay(janFirst);
		//Add an appt with start hour 12 then add another with start hour 1
		testDay.addAppt(lateAppt);
		testDay.addAppt(earlyAppt);

		//Check that the CalDay has two appts
		assertEquals(2,testDay.getSizeAppts());

		//Check that CalDay has appts "Early Appt" and "Late Appt"
		boolean valid = false;
		String testDate = testDay.toString();
		if(testDate.contains("Early Appt") && testDate.contains("Late Appt"))
			valid = true;

		assertTrue(valid);

		//Check adding invalid appt, the appt should not be added
		Appt badAppt = new Appt(-1,-1,-1,-1,-1,"Bad Appt","Invalid stuff");
		testDay.addAppt(badAppt);

		assertEquals(2,testDay.getSizeAppts());
	}

	@Test
	public void iteratorTest2() throws Throwable {
		testDay = new CalDay(janFirst);
		testDay.addAppt(earlyAppt);
		testDay.addAppt(lateAppt);
		assertNotNull(testDay.iterator());

		//Check uninitialized CalDay
		CalDay badDay = new CalDay();
		assertNull(badDay.iterator());

	}

}
