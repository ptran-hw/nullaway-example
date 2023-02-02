package org.example;

import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Main {

  static void displayCompilerActualValueWarning(Object x) { // argument always null warning
    System.out.println(x.toString());
  }

  static void displayCompilerNullArgumentWarning() {
    displayCompilerActualValueWarning(null); // null used for parameter annotated as @NotNull (default)
  }

  // Nullable warning example
  static void displayCompilerNullPointerExceptionWarning(@Nullable Object x) {
    System.out.println(x.toString()); // NullPointerException warning
  }

  static void displayCompilerError() {
    Set<Short> s = new HashSet<>();
    for (short i = 0; i < 100; i++) {
      s.add(i);
//      s.remove(i - 1); // CollectionIncompatibleType error
    }
    System.out.println(s.size());

    LocalDateTime d = LocalDateTime.parse("2009-06-15T13/*:45:30");
//    d.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME); // ReturnValueIgnored error
  }
}