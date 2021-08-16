package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@ContextConfiguration
@Log4j
public class SampleTests {

	@Setter(onMethod_ = @Autowired)
	private Restaurant restaurant;
	
	@
}
