package com.max_pw_iw.info_fetcher;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.max_pw_iw.info_fetcher.constants.PathConstants;
import com.max_pw_iw.info_fetcher.entity.Person;
import com.max_pw_iw.info_fetcher.repository.PersonRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class InfoFetcherApplication implements CommandLineRunner{

	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(InfoFetcherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MappingIterator<Person> personIter = new CsvMapper().readerWithTypedSchemaFor(Person.class).readValues(PathConstants.CSV_PATH);
		List<Person> people = personIter.readAll();
		personRepository.deleteAll();
		personRepository.saveAll(people);
	}

}
