# Medical Diagnostic

## Overview

The Medical Diagnostic System is an expert system designed to assist in the identification of diseases based on a patient's symptoms and medical history. The system leverages rule-based reasoning to provide potential diagnoses, guiding users to seek appropriate medical attention if necessary. It uses a knowledge base of predefined rules to analyze input data and offer potential diagnoses.

### Technologies used

- **Java**: The primary programming language for developing the application.
- **Spring Boot**: Framework used to build and run the application.
- **Drools**: Business rule management system used for defining and executing rules.

## Examples of some possible scenarios and system responses

### Scenario 1: Flu Diagnosis

**User Inputs:**
1. **Do you have a chronic disease? (yes/no)**: `no`
2. **Do you have a family history of chronic diseases? (yes/no)**: `no`
3. **Do you have high blood pressure or have been diagnosed with hypertension? (yes/no)**: `no`
4. **Do you have a smoking history? (yes/no)**: `no`
5. **Enter symptom (or type 'done' to finish)**: `fever`
6. **Enter severity of fever (1-5)**: `3`
7. **Enter symptom (or type 'done' to finish)**: `cough`
8. **Enter severity of cough (1-5)**: `4`
9. **Enter symptom (or type 'done' to finish)**: `done`

**System Response:**
- **Flu**: You may have the Flu. Consider seeing a doctor.

### Scenario 2: COVID-19 Diagnosis

**User Inputs:**
1. **Do you have a chronic disease? (yes/no)**: `no`
2. **Do you have a family history of chronic diseases? (yes/no)**: `no`
3. **Do you have high blood pressure or have been diagnosed with hypertension? (yes/no)**: `no`
4. **Do you have a smoking history? (yes/no)**: `no`
5. **Enter symptom (or type 'done' to finish)**: `fever`
6. **Enter severity of fever (1-5)**: `4`
7. **Enter symptom (or type 'done' to finish)**: `dry cough`
8. **Enter severity of dry cough (1-5)**: `5`
9. **Enter symptom (or type 'done' to finish)**: `loss of smell`
10. **Enter severity of loss of smell (1-5)**: `2`
11. **Enter symptom (or type 'done' to finish)**: `done`

**System Response:**
- **COVID-19**: You may have COVID-19. Please get tested immediately.

### Scenario 3: Hypertension Diagnosis

**User Inputs:**
1. **Do you have a chronic disease? (yes/no)**: `no`
2. **Do you have a family history of chronic diseases? (yes/no)**: `no`
3. **Do you have high blood pressure or have been diagnosed with hypertension? (yes/no)**: `yes`
4. **Do you have a smoking history? (yes/no)**: `no`
5. **Enter symptom (or type 'done' to finish)**: `headache`
6. **Enter severity of headache (1-5)**: `4`
7. **Enter symptom (or type 'done' to finish)**: `dizziness`
8. **Enter severity of dizziness (1-5)**: `3`
9. **Enter symptom (or type 'done' to finish)**: `done`

**System Response:**
- **Hypertension**: You may have hypertension. Please consult a healthcare provider.
