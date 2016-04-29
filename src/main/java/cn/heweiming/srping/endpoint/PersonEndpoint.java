package cn.heweiming.srping.endpoint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Service;

import cn.heweiming.srping.model.Person;
import cn.heweiming.srping.request.PersonRequest;
import cn.heweiming.srping.response.PersonResponse;

@Service("personEndpoint")
@WebService
//@SOAPBinding(style = Style.RPC)
public class PersonEndpoint {

	public PersonResponse getPersons(PersonRequest request) {
		int count = request.getPersonCount();
		// String companyName = request.getCompanyName();
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < count; i++) {
			Person person = new Person();
			person.setAge(i);
			person.setName("person" + (i + 1));
			person.setBirthday(new Date());
			person.setSalary(i * 100.0);
			person.setGender(i % 2 == 0 ? "女" : "男");
			persons.add(person);
		}
		PersonResponse response = new PersonResponse();
		response.setPersons(persons);
		return response;
	}

}
