package org.ju;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleJunit {
	
		@BeforeClass
		public static void LaunchBrowser() {
			System.out.println("Launch");
		}
		@AfterClass
		public static void CloseBrowser() {
			System.out.println("close");
		}
		@Before
		public void endtime() {
			System.out.println("Start");
		}
		@After
		public void starttime() {
			System.out.println("End");
		}
		@Test
		public void aTest() {
			System.out.println("A");
		}
		@Test
		public void bTest() {
			System.out.println("B");
		}
		
		
		}
		


