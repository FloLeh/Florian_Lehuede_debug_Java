package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements SymptomWriter {

  private Map<String, Integer> symptoms;

  /**
   * 
   * @param symptoms symptoms as keys and occurences as values
   */
  public WriteSymptomDataToFile(Map<String, Integer> symptoms) {
    this.symptoms = symptoms;
  }

  @Override
  public void writeSymptoms() {
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
