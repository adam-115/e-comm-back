package com.it.dto;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class UserDtoTest {
	
	@Test
	public void test() {
		List<UserDto > lisDtos = new ArrayList<>() ;
		lisDtos.add(null) ;
		System.out.println(lisDtos.size());
		
	}

}
