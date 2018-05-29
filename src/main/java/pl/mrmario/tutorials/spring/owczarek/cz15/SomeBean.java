package pl.mrmario.tutorials.spring.owczarek.cz15;

import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean{

	public void init() {
		System.out.println("Inicjalizacja beana");
	}
	
	public void checkIsWorking() {
		System.out.println("Dzia³am !!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Odpalamy afterPropertiesSet !!!");
		
	}
}
