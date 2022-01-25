package zad1;

public class Task extends Thread {
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
