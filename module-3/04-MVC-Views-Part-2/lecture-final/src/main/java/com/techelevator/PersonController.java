package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	@RequestMapping("/personList")
	public String showPersons(HttpServletRequest request) {
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Mike", "Mazzullo", 21));
		personList.add(new Person("Asher", "Díaz", 22));
		personList.add(new Person("Sondra", "Coffin", 23));
		personList.add(new Person("Jeff", "Prescott", 12));

		request.setAttribute("personList", personList);
		
		Person doug = new Person("Doug", "Rogers", 45);
		Address dougAddress = new Address("123 Some Street", "Columbus", "Ohio", "43220");
		doug.setAddress(dougAddress);
		
		request.setAttribute("doug", doug);
		
		
		
		return "personList";
	}
}
