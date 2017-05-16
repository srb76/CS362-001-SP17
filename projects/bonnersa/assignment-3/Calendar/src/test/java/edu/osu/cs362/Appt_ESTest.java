/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 01:26:52 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true/*, separateClassLoader = true*/)
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(0, 18, 2, 2, 18, (String) null, (String) null);
      String string0 = appt0.toString();
      assertEquals("\t2/2/18 at 12:18am ,, \n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, " ,", "Dc[HXIN!>oxTP0A");
      boolean boolean0 = appt0.getValid();
      assertEquals(" ,", appt0.getTitle());
      assertEquals(1, appt0.getStartYear());
      assertEquals(1, appt0.getStartHour());
      assertEquals(1, appt0.getStartDay());
      assertEquals(1, appt0.getStartMinute());
      assertEquals("Dc[HXIN!>oxTP0A", appt0.getDescription());
      assertTrue(boolean0);
      assertEquals(1, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 12, "%Y%z", "%Y%z");
      String string0 = appt0.getTitle();
      assertEquals("%Y%z", appt0.getDescription());
      assertEquals(12, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertEquals("%Y%z", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 2492, 3169, 23, ":", ":");
      int int0 = appt0.getStartYear();
      assertEquals(":", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(23, int0);
      assertEquals(3169, appt0.getStartMonth());
      assertEquals(0, appt0.getStartHour());
      assertEquals(":", appt0.getTitle());
      assertEquals(2492, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt((-409), 213, 213, 213, (-409), "_?", "_?");
      int int0 = appt0.getStartYear();
      assertFalse(appt0.getValid());
      assertEquals((-409), int0);
      assertEquals(-409, appt0.getStartHour());
      assertEquals(213, appt0.getStartMinute());
      assertEquals(213, appt0.getStartDay());
      assertEquals(213, appt0.getStartMonth());
      assertEquals("_?", appt0.getTitle());
      assertEquals("_?", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(1097, 1752, 122, 0, (-2622), "NegativeField", "NegativeField");
      int int0 = appt0.getStartMonth();
      assertEquals(1097, appt0.getStartHour());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals(-2622, appt0.getStartYear());
      assertEquals(1752, appt0.getStartMinute());
      assertEquals(122, appt0.getStartDay());
      assertEquals("NegativeField", appt0.getDescription());
      assertEquals("NegativeField", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt((-2790), 0, 0, (-2790), 0, "", "");
      int int0 = appt0.getStartMonth();
      assertEquals(-2790, appt0.getStartHour());
      assertEquals(0, appt0.getStartDay());
      assertEquals((-2790), int0);
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(1175, 0, 1282, 1175, 0, "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(1175, appt0.getStartHour());
      assertEquals(0, int0);
      assertEquals(1175, appt0.getStartMonth());
      assertEquals(1282, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt((-409), 213, 213, 213, (-409), "_?", "_?");
      int int0 = appt0.getStartMinute();
      assertEquals(-409, appt0.getStartYear());
      assertEquals("_?", appt0.getTitle());
      assertEquals(213, appt0.getStartMonth());
      assertEquals(-409, appt0.getStartHour());
      assertEquals(213, appt0.getStartDay());
      assertEquals(213, int0);
      assertEquals("_?", appt0.getDescription());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt((-409), 213, 213, 213, (-409), "_?", "_?");
      appt0.setStartHour(0);
      int int0 = appt0.getStartHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(303, 0, 0, 303, 12, "y>k_wX;(2J%v[^", "");
      int int0 = appt0.getStartDay();
      assertEquals(0, int0);
      assertEquals(303, appt0.getStartHour());
      assertEquals(12, appt0.getStartYear());
      assertEquals("", appt0.getDescription());
      assertEquals(303, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals("y>k_wX;(2J%v[^", appt0.getTitle());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(1097, 1752, 122, 0, (-2622), "NegativeField", "NegativeField");
      appt0.setStartDay((-840));
      int int0 = appt0.getStartDay();
      assertEquals((-840), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 2492, 3169, 23, ":", ":");
      String string0 = appt0.getDescription();
      assertEquals(":", appt0.getTitle());
      assertEquals(":", string0);
      assertEquals(2492, appt0.getStartDay());
      assertEquals(3169, appt0.getStartMonth());
      assertEquals(23, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt((-1336), (-1336), (-1336), 1970, 1970, "73n$X#+T2j8B4$Kb", "73n$X#+T2j8B4$Kb");
      assertEquals("73n$X#+T2j8B4$Kb", appt0.getDescription());
      
      appt0.setDescription("");
      assertEquals(1970, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(7, 7, 7, 7, 1290, "", "");
      appt0.setDescription((String) null);
      assertEquals(1290, appt0.getStartYear());
      assertTrue(appt0.getValid());
      assertEquals(7, appt0.getStartMonth());
      assertEquals(7, appt0.getStartHour());
      assertEquals(7, appt0.getStartDay());
      assertEquals(7, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt((-1993), (-1993), (-1993), (-765), 0, "0Xf(xhC@?,y[`N#J", "0Xf(xhC@?,y[`N#J");
      appt0.setTitle("~:VXUZY^\"9(t25m~u");
      assertEquals("~:VXUZY^\"9(t25m~u", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt((-3209), 1220, 0, 1220, 1220, (String) null, (String) null);
      appt0.setTitle((String) null);
      assertFalse(appt0.getValid());
      assertEquals(-3209, appt0.getStartHour());
      assertEquals(1220, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals(1220, appt0.getStartMonth());
      assertEquals(1220, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-1918), (-1918), (-1918), (-1918), (-1918), (String) null, "^<rg/Ln|$");
      String string0 = appt0.getTitle();
      assertEquals("", string0);
      assertEquals(-1918, appt0.getStartMonth());
      assertNotNull(string0);
      assertEquals(-1918, appt0.getStartYear());
      assertEquals(-1918, appt0.getStartHour());
      assertEquals(-1918, appt0.getStartDay());
      assertEquals("^<rg/Ln|$", appt0.getDescription());
      assertEquals(-1918, appt0.getStartMinute());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(1097, 1752, 122, 0, (-2622), "NegativeField", "NegativeField");
      int int0 = appt0.getStartDay();
      assertEquals(122, int0);
      assertEquals(1752, appt0.getStartMinute());
      assertEquals("NegativeField", appt0.getDescription());
      assertEquals(1097, appt0.getStartHour());
      assertEquals(-2622, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals("NegativeField", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-1336), (-1336), (-1336), 1970, 1970, "73n$X#+T2j8B4$Kb", "73n$X#+T2j8B4$Kb");
      boolean boolean0 = appt0.getValid();
      assertEquals(-1336, appt0.getStartDay());
      assertEquals("73n$X#+T2j8B4$Kb", appt0.getDescription());
      assertEquals(-1336, appt0.getStartMinute());
      assertEquals(-1336, appt0.getStartHour());
      assertFalse(boolean0);
      assertEquals(1970, appt0.getStartMonth());
      assertEquals(1970, appt0.getStartYear());
      assertEquals("73n$X#+T2j8B4$Kb", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt((-1993), (-1993), (-1993), (-765), 0, "0Xf(xhC@?,y[`N#J", "0Xf(xhC@?,y[`N#J");
      int int0 = appt0.getStartHour();
      assertEquals(-1993, appt0.getStartDay());
      assertEquals(-1993, appt0.getStartMinute());
      assertEquals("0Xf(xhC@?,y[`N#J", appt0.getDescription());
      assertEquals(-765, appt0.getStartMonth());
      assertEquals((-1993), int0);
      assertEquals("0Xf(xhC@?,y[`N#J", appt0.getTitle());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt((-1993), (-1993), (-1993), (-765), 0, "0Xf(xhC@?,y[`N#J", "0Xf(xhC@?,y[`N#J");
      int int0 = appt0.getStartYear();
      assertEquals("0Xf(xhC@?,y[`N#J", appt0.getDescription());
      assertEquals(0, int0);
      assertEquals(-1993, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(-765, appt0.getStartMonth());
      assertEquals(-1993, appt0.getStartHour());
      assertEquals(-1993, appt0.getStartMinute());
      assertEquals("0Xf(xhC@?,y[`N#J", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt((-1336), (-1336), (-1336), 1970, 1970, "73n$X#+T2j8B4$Kb", "73n$X#+T2j8B4$Kb");
      int int0 = appt0.getStartMinute();
      assertEquals(1970, appt0.getStartMonth());
      assertEquals("73n$X#+T2j8B4$Kb", appt0.getTitle());
      assertEquals(-1336, appt0.getStartHour());
      assertEquals("73n$X#+T2j8B4$Kb", appt0.getDescription());
      assertEquals((-1336), int0);
      assertEquals(-1336, appt0.getStartDay());
      assertEquals(1970, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt((-3209), (-3209), (-3209), (-3209), (-3209), (String) null, (String) null);
      String string0 = appt0.getDescription();
      assertEquals(-3209, appt0.getStartYear());
      assertEquals(-3209, appt0.getStartMonth());
      assertEquals(-3209, appt0.getStartMinute());
      assertEquals(-3209, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertNotNull(string0);
      assertEquals(-3209, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(23, 0, 15, 23, 1618, "", "");
      int int0 = appt0.getStartMonth();
      assertEquals(23, int0);
      assertEquals(15, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(1618, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(23, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, "", "");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t12/12/12 at 12:12pm ,, \n", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(12, 31, 31, 157, 4306, "\t", "\t");
      String string0 = appt0.toString();
      assertEquals("\t", appt0.getDescription());
      assertEquals(31, appt0.getStartDay());
      assertEquals(157, appt0.getStartMonth());
      assertEquals(12, appt0.getStartHour());
      assertEquals(31, appt0.getStartMinute());
      assertEquals(4306, appt0.getStartYear());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(15, (-1531), 519, 519, 519, "vcp}", "vcp}");
      int int0 = appt0.getStartHour();
      assertEquals(-1531, appt0.getStartMinute());
      assertEquals(519, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(519, appt0.getStartMonth());
      assertEquals(15, int0);
      assertEquals("vcp}", appt0.getTitle());
      assertEquals(519, appt0.getStartYear());
      assertEquals("vcp}", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt((-409), 213, 213, 213, (-409), "_?", "_?");
      appt0.setStartHour(0);
      appt0.setStartMinute(59);
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, " ,", "Dc[HXIN!>oxTP0A");
      appt0.setStartYear(1);
      assertTrue(appt0.getValid());
      assertEquals("Dc[HXIN!>oxTP0A", appt0.getDescription());
      assertEquals(1, appt0.getStartYear());
      assertEquals(1, appt0.getStartHour());
      assertEquals(1, appt0.getStartDay());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, appt0.getStartMonth());
      assertEquals(" ,", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(23, 0, 15, 23, 1618, "", "");
      assertEquals(23, appt0.getStartMonth());
      
      appt0.setStartMonth(0);
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "E", "E");
      String string0 = appt0.toString();
      assertEquals("\t11/11/11 at 11:11am ,E, E\n", string0);
      assertNotNull(string0);
  }
}