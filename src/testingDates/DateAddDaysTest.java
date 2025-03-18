package testingDates;

import static org.junit.Assert.*;
import org.junit.*;

public class DateAddDaysTest {
	Date theDate, testerSM, testerOOM, testerOOY, testerDSDT;
	@Before 
	public void setUp() throws Exception{
		Date theDate = new Date("December", 31, 2019);
		Date testerSM = new Date("November", 30, 2019);
		Date testerOOM = new Date("December", 31, 2019);
		Date testerOOY = new Date("December", 31, 2018);
		Date testerDSDT = new Date("February", 28, 2020);
	}
	
	@Test
	public void sameMonthTest() {
		assertFalse(testerSM.getMonth() == theDate.getMonth());
		assertTrue(testerSM.addOneDay().getMonth() == theDate.getMonth());
		assertTrue(theDate.getDay() > testerSM.getDay());
	}
	@Test
	public void outOfMonthTest() {
		assertTrue(testerOOM.getMonth() == theDate.getMonth());
		assertFalse(testerOOM.addOneDay().getMonth() == theDate.getMonth());
	}
	@Test
	public void outOfYearTest() {
		assertFalse(testerOOY.getYear() == theDate.getYear());
		assertTrue(testerOOY.addOneDay().getYear()==theDate.getYear());
	}
	@Test
	public void DateSetDateTest() {
		testerDSDT.setDate(2,29,2020);
		assertEquals(28, testerDSDT.getDay());
		testerDSDT.setDate(20, 20, 2999);
		assertEquals(testerDSDT.getMonth(), 2);
		testerDSDT.setDate(11, 30, -200);
		assertEquals(2020, testerDSDT.getYear());
	}
	
//	
}
