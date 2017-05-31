package edu.osu.cs362;


import org.junit.Test;
import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the CalDay class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n] ; // return the method name
	}
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void randomtest()  throws Throwable {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 System.out.println("Start CalDay testing...");

		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = 10;//System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);
			 int randInt = 0;
			 GregorianCalendar cal = new GregorianCalendar(1, 1, 1);

			 int startHour = 13;
			 int startMinute = 30;
			 int startDay = 10;
			 int startMonth = 4;
			 int startYear = 2017;
			 String title = "Birthday Party";
			 String description = "This is my birthday party.";

			 //Construct two new Appointment objects with the same initial data
			 Appt appt1 = new Appt(startHour,
					 startMinute,
					 startDay,
					 startMonth,
					 startYear,
					 title,
					 description);

			 Appt appt2 = new Appt(startHour,
					 startMinute,
					 startDay,
					 startMonth,
					 startYear,
					 title,
					 description);

			 for (int i = 0; i < NUM_TESTS; i++) {
				 String methodName = CalDayRandomTest.RandomSelectMethod(random);
				 if (methodName.equals("addAppt")) {
					 //addAppt needs one case of a failed isValid(), give small chance for this to happen, also needs random start hours for branch coverage
					 //10% chance to make appt1 invalid
					 randInt = ValuesGenerator.getRandomIntBetween(random,0, 10);
					 if (randInt > 0) {
						 //Generate random start hours for appt1 and appt2
						 appt1.setStartHour(ValuesGenerator.getRandomIntBetween(random,0, 23));
						 appt2.setStartHour(ValuesGenerator.getRandomIntBetween(random,0, 23));
					 } else {
						 //Set appt1 to be invalid
						 appt1.setStartHour(-200);
					 }

					 //Re-Initialize CalDay
					 CalDay day = new CalDay(cal);

					 //Add both appts twice
					 day.addAppt(appt1);
					 day.addAppt(appt2);
					 day.addAppt(appt1);
					 day.addAppt(appt2);
				 }

			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if ((iteration % 10000) == 0 && iteration != 0)
				 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

		 }
	 }

	
}
