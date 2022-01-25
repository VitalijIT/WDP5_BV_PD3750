/**
 *
 *  @author Bodnar Vitali PD3750
 *
 */

package zad1OneFile;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Letters letters = new Letters("ABCD");
    for (Thread t : letters.getThreads()) System.out.println(t.getName());
    for (Thread t : letters.getThreads()) t.start();

    Thread.sleep(5000);
    for (Thread t : letters.getThreads()) t.stop();
    System.out.println("\nProgram skończył działanie");
  }

  private static class Task extends Thread {
    private String code;

    public Task(String value) {
      super.setName("Thread " + value);
      code = value;
    }

    @Override
    public void run() {
      while (true) {
        System.out.print(code);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private static class Letters {
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
}
