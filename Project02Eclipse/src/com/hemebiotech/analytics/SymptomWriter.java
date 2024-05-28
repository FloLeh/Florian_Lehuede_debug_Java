package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Write symptoms into an output text file
 */
public interface SymptomWriter {

  /**
   * Write one line per symptom and the number of occurences according to keys and
   * values of a map
   */
  public void writeSymptoms(Map<String, Integer> symptoms);
}
