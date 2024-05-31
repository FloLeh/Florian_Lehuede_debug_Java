package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Count the occurrence of symptoms from a text file then write the result in
 * another file
 */
public interface Counter {

  /**
   * Only get a list of symptoms, does not sort or deduplicate
   * 
   * @return list of symptoms
   */
  List<String> getSymptoms();

  /**
   * Count symptoms from a list
   * 
   * @param symptoms
   * @return map of symptoms and their occurrence
   */
  Map<String, Integer> countSymptoms(List<String> symptoms);

  /**
   * Sort symptoms keys by alphabetical order in a map
   * 
   * @param symptoms
   * @return map of sorted symptoms and their occurrence
   */
  Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms);

  /**
   * Write a line by symptom and their occurrence
   * 
   * @param symptoms
   */
  void writeSymptoms(Map<String, Integer> symptoms);
}
