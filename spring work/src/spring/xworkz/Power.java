package spring.xworkz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Power {

  @Autowired
  @Qualifier("one")
  private int pink;


public Power() {
	this.pink=pink;
}

public int getPink() {
	return pink;
}

  
}
