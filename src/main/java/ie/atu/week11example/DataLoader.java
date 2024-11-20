package ie.atu.week11example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person testData = new Person(1L, "shine", 20, "fywyeg@example.com", "Mr", "243561", "wfuwigffewfo", "iwygfiu");
        Person testData1 = new Person(2L, "shine1", 45, "fwebfwnfwwefsdvg@example.com", "Ms", "24384431", "uuouihpneugfo", "ihfouwghouiu");
        Person testData2 = new Person(3L, "shine2", 60, "wiuefgiuweg@example.com", "Mr", "247246871", "wihoihjmugfo", "irhduofoiu");
        personRepository.save(testData);
        personRepository.save(testData1);
        personRepository.save(testData2);
    }
}
