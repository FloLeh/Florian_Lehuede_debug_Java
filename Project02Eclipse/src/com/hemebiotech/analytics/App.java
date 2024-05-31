package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class App {

  public static void main(String args[]) throws Exception {
    SymptomReader readerInstance = new ReadSymptomDataFromFile("../symptoms.txt");
    SymptomWriter writerInstance = new WriteSymptomDataToFile();
    AnalyticsCounter analyticsCounter = new AnalyticsCounter(readerInstance, writerInstance);

    List<String> symptoms = analyticsCounter.getSymptoms();

    Map<String, Integer> symptomsMap = analyticsCounter.countSymptoms(symptoms);

    Map<String, Integer> sortedSymptomsMap = analyticsCounter.sortSymptoms(symptomsMap);

    analyticsCounter.writeSymptoms(sortedSymptomsMap);
  }

}
