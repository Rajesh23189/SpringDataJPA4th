package com.rajesh;

import com.rajesh.Entity.Vaccine;
import com.rajesh.Services.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa4thApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext container =
				SpringApplication.run(SpringDataJpa4thApplication.class, args);


		VaccineService vaccineService = container.getBean(VaccineService.class);

		/**   SearchVaccineById
		Vaccine vaccine = vaccineService.SearchVaccineById(2);
		System.out.println(vaccine.toString()  );
		 **/

		/**    SearchVaccineByInfo
		Vaccine vaccine = new Vaccine("Covaxin","BharatBio",56333.2);
		vaccine.setId(54);
		vaccineService.SearchVaccineByInfo(vaccine).forEach(vaccine1 -> System.out.println(vaccine1));
		 **/



		/**
		List<Integer> listOfIds = new ArrayList<>();
		listOfIds.add(102);
		listOfIds.add(53);
		listOfIds.add(54);
		String status =vaccineService.DeleteAllByIdInBatch(listOfIds);
		System.out.println(status);
		 **/



	}

}
