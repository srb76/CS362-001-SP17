package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"deleteAppt"};// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n] ; // return the method name
	}
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 System.out.println("Start TimeTable testing...");

		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = 10;//System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);
			 int randInt = 0;
			 //LinkedList<Appt> appts = new LinkedList<Appt>();
			 TimeTable testTable = new TimeTable();

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

			 Appt appt3 = new Appt(1,1,1,1,1,"Appt not in list","For testing");

			 for (int i = 0; i < NUM_TESTS; i++) {
				 String methodName = TimeTableRandomTest.RandomSelectMethod(random);
				 if (methodName.equals("deleteAppt")) {
					 //deleteAppt needs to cover null appt, null appts, both valid and invalid appts, and an appt that does not exist

					 //Reassign values
					 LinkedList<Appt> appts = new LinkedList<Appt>();
					 Appt apptToDel = appt1;
					 if(!appts.contains(appt1))
					 	appts.add(appt1);

					 //choose between null and non null
					 randInt = ValuesGenerator.getRandomIntBetween(random,0,10);
					 if(randInt>2) {
					 	//Use non null appt and appts
						 //Generate random values for startHour on both appt1 and appt2
						 appt1.setStartHour( ValuesGenerator.getRandomIntBetween(random,-2,25) );
						 appt2.setStartHour( ValuesGenerator.getRandomIntBetween(random,-2,25) );
						 apptToDel = appt1;
					 }
					 else if(randInt==0) {
					 	//Use null appt
						 apptToDel = null;
					 }
					 else if(randInt==1) {
					 	//Use null appts
						 appts = null;
					 }
					 else if(randInt==2) {
					 	//Use both null appt and null appts
						 apptToDel = null;
						 appts = null;
					 }

					 //Attempt to delete appt that does not exist, then appt1 twice
					 testTable.deleteAppt(appts,appt3);
					 testTable.deleteAppt(appts,apptToDel);
					 testTable.deleteAppt(appts,apptToDel);
				 }

			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if ((iteration % 10000) == 0 && iteration != 0)
				 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

		 }
		 
	 }


	
}
