package com.medical.diagnostic;

import com.medical.diagnostic.models.Disease;
import com.medical.diagnostic.models.MedicalHistory;
import com.medical.diagnostic.models.Symptom;
import com.medical.diagnostic.service.DiagnosisService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MedicalDiagnosticApplication implements CommandLineRunner {

	private final DiagnosisService diagnosisService;

	public MedicalDiagnosticApplication(DiagnosisService diagnosisService) {
		this.diagnosisService = diagnosisService;
	}

	public static void main(String[] args) {
		SpringApplication.run(MedicalDiagnosticApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// Initialize a Scanner for user input
		Scanner scanner = new Scanner(System.in);
		List<Symptom> symptoms = new ArrayList<>();
		MedicalHistory history = new MedicalHistory();

		System.out.println("Welcome to the Medical Diagnosis System");

		// Prompt user to input whether they have a chronic disease
		System.out.println("Do you have a chronic disease? (yes/no)");
		history.setHasChronicDisease(scanner.nextLine().equalsIgnoreCase("yes"));

		// Prompt user to input whether they have a family history of chronic diseases
		System.out.println("Do you have a family history of chronic diseases? (yes/no)");
		history.setHasFamilyHistory(scanner.nextLine().equalsIgnoreCase("yes"));

		// Prompt user to input whether they have high blood pressure
		System.out.println("Do you have high blood pressure or have been diagnosed with hypertension? (yes/no)");
		history.setHighBloodPressure(scanner.nextLine().equalsIgnoreCase("yes"));

		// Prompt user to input whether they have a smoking history
		System.out.println("Do you have a smoking history? (yes/no)");
		history.setSmokingHistory(scanner.nextLine().equalsIgnoreCase("yes"));

		// Collect symptoms from the user
		while (true) {
			System.out.println("Enter symptom (or type 'done' to finish):");
			String symptomName = scanner.nextLine();
			if (symptomName.equalsIgnoreCase("done")){
				break;
			}

			// Prompt user to enter severity of the symptom
			System.out.println("Enter severity of " + symptomName + " (1-5):");
			int severity = Integer.parseInt(scanner.nextLine());

			// Create a Symptom object and add it to the list
			Symptom symptom = new Symptom();
			symptom.setName(symptomName);
			symptom.setSeverity(severity);
			symptoms.add(symptom);
		}

		// Call diagnosis service diagnose based on symptoms and medical history
		List<Disease> diseases = diagnosisService.diagnose(symptoms, history);

		// Output results to the user
		if (diseases.isEmpty()) {
			System.out.println("No specific disease diagnosed based on provided symptoms.");
		} else {
			System.out.println("Possible diagnoses:");
			for (Disease disease : diseases) {
				System.out.println("- " + disease.getName() + ": " + disease.getDiagnosis());
			}
		}
	}
}
