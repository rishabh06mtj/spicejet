package com.vtiger.testscripts;

import org.testng.annotations.Test;

public class FetchDataFromMvn {
	@Test
public void test()
{
  String url=System.getProperty("url");
  System.out.println(url);
  String password=System.getProperty("password");
  System.out.println(password);
  String login=System.getProperty("login");
  System.out.println(login);
			}
}
