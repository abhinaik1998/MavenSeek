package com.mavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutor.App;

public class userLoginTest {

	@Test
	public void userLoginTestSuccess() {
		App app=new App();
		Assert.assertEquals(1, app.userLogin("abhi", "abhi@@"));
	}
}
