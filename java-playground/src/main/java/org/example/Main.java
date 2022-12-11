package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public class Main {
  public static void main(String[] args) {
  }

  // Nullable warning example
  static void log(@Nullable Object x) {
    System.out.println(x.toString());
  }

  static void foo() {
    log(null);
  }

  static void displayErrorProneWarning() {
    //Set<Short> s = new HashSet<>();
    //for (short i = 0; i < 100; i++) {
    //  s.add(i);
    //  s.remove(i - 1);
    //}
    //System.out.println(s.size());
    //
    //LocalDateTime d = LocalDateTime.parse("2009-06-15T13/*:45:30");
    //d.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME); // ERROR*/
  }
}