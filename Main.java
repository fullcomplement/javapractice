import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {

    int score = 5;
    double score2 = 5.0;
    char c = 'x';
    boolean canDrive = true;
    doSomething();
    doSomethingElse(score,score2);
    System.out.print(doSomethingBetter(canDrive));
  }

  public static void doSomething() {
     System.out.println("Hello");

  }

  public static void doSomethingElse(int s, double s2) {
     System.out.println("Score: " + s);
     System.out.println("Score #2: " + s2);
  }

  public static int doSomethingBetter(boolean b) {
     if (b == true)
      return 0;
     else
      return 1;
  }



}