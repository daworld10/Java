package service;

import entity.Studenttest;
import entity.Teachertest;

public  class Testrelation 
{
	public static void giveClass(Studenttest s)
	{
		System.out.println("The rollno is = "+s.getRollno());
	}
	public static void takeClass(Teachertest t)
	{
		System.out.println("The name is = "+t.getTname());
	}
}
