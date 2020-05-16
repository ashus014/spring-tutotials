package com.ashu.springAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mediatek implements MobileProcessor {

	@Override
	public void process() {
		
		System.out.println("Second Best CPU");

	}

}
