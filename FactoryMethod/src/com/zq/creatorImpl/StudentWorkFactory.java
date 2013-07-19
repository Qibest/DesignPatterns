package com.zq.creatorImpl;

import com.zq.creator.IWorkFacoty;
import com.zq.product.Work;
import com.zq.productImpl.StudentWork;

public class StudentWorkFactory implements IWorkFacoty{
	public Work getWork() {
		return new StudentWork();
	};
}
