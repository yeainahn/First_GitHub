package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component //Component: 재사용이가능함
@Data
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired ) //     _필요
	private Chef chef;

	
	
	
}
