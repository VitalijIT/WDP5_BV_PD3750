package zad1;

import java.util.List;
import java.util.stream.Collectors;

public class Letters {
  private final List<Task> threads;

  public Letters(String str) {
    threads = str.chars()
            .mapToObj(c -> (char) c)
            .map(String::valueOf)
            .map(Task::new)
            .collect(Collectors.toList());
  }

  public List<Task> getThreads() {
    return threads;
  }
}
