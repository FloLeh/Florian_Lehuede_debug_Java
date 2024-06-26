package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter implements Counter {

    private SymptomReader reader;
    private SymptomWriter writer;

    public AnalyticsCounter(SymptomReader reader, SymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public List<String> getSymptoms() {
        return reader.getSymptoms();
    }

    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> symptomsMap = new HashMap<String, Integer>();

        for (String symptom : symptoms) {
            if (!symptomsMap.containsKey(symptom)) {
                symptomsMap.put(symptom, 1);
            } else {
                symptomsMap.put(symptom, symptomsMap.get(symptom) + 1);
            }
        }

        return symptomsMap;
    }

    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        return new TreeMap<String, Integer>(symptoms);
    }

    public void writeSymptoms(Map<String, Integer> symptoms) {
        writer.writeSymptoms(symptoms);
    }

}
