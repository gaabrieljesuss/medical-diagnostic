package com.medical.diagnostic.models;

public class MedicalHistory {
    private boolean hasChronicDisease;
    private boolean hasFamilyHistory;
    private boolean highBloodPressure;
    private boolean smokingHistory;

    public boolean isHasChronicDisease() {
        return hasChronicDisease;
    }

    public void setHasChronicDisease(boolean hasChronicDisease) {
        this.hasChronicDisease = hasChronicDisease;
    }

    public boolean isHasFamilyHistory() {
        return hasFamilyHistory;
    }

    public void setHasFamilyHistory(boolean hasFamilyHistory) {
        this.hasFamilyHistory = hasFamilyHistory;
    }

    public boolean isHighBloodPressure() {
        return highBloodPressure;
    }

    public void setHighBloodPressure(boolean highBloodPressure) {
        this.highBloodPressure = highBloodPressure;
    }

    public boolean isSmokingHistory() {
        return smokingHistory;
    }

    public void setSmokingHistory(boolean smokingHistory) {
        this.smokingHistory = smokingHistory;
    }
}
