package com.zq.creatorImpl;

import com.zq.creator.IWorkFacoty;
import com.zq.product.Work;
import com.zq.productImpl.TeacherWork;

public class TeacherWorkFactory implements IWorkFacoty {

	@Override
	public Work getWork() {
		return new TeacherWork();
	}

}
