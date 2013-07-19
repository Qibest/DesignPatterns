package com.zq.test;

import com.zq.creator.IWorkFacoty;
import com.zq.creatorImpl.StudentWorkFactory;
import com.zq.creatorImpl.TeacherWorkFactory;
import com.zq.product.Work;

public class Test {
	public static void main(String[] args) {
		IWorkFacoty teacherWorkFactory = new TeacherWorkFactory();
		teacherWorkFactory.getWork().doWork();
		IWorkFacoty studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();
		
		//´úÂë¸´ÓÃ
		executeDoWork(new TeacherWorkFactory());
		executeDoWork(new StudentWorkFactory());
	}
	
	private static void executeDoWork(IWorkFacoty workFactory){
		workFactory.getWork().doWork();
	}
}
