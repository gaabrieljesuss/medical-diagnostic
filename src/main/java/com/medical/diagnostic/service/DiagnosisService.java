package com.medical.diagnostic.service;

import com.medical.diagnostic.models.Disease;
import com.medical.diagnostic.models.Symptom;
import com.medical.diagnostic.models.MedicalHistory;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiagnosisService {

    @Autowired
    private KieSession kieSession;

    // Diagnose diseases based on symptoms and medical history
    public List<Disease> diagnose(List<Symptom> symptoms, MedicalHistory history) {
        List<Disease> diseases = new ArrayList<>();

        // Set the global variable 'diseases' for the KieSession
        kieSession.setGlobal("diseases", diseases);
        // Insert symptoms and medical history into the KieSession
        symptoms.forEach(kieSession::insert);
        kieSession.insert(history);

        // Fire all rules to process the data
        kieSession.fireAllRules();
        // Dispose of the KieSession after processing
        kieSession.dispose();

        return diseases;
    }
}
