package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements SymptomWriter {

  public WriteSymptomDataToFile() {
  }

  @Override
  public void writeSymptoms(Map<String, Integer> symptoms) {
    try {
      FileWriter fileWriter = new FileWriter("result.out");
      BufferedWriter writer = new BufferedWriter(fileWriter);

      for (String symptom : symptoms.keySet()) {
        writer.write(symptom + ": " + symptoms.get(symptom));
        writer.newLine();
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
