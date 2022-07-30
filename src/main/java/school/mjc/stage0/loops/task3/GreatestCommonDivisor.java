package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int  gcd = 0;
        int min = first;
        if(first> second){
            min = second;
        }
      if(first > 0  && second > 0) {
          for (int i = 1; i <= min; i++) {
              if (first % i == 0 && second % i == 0) {
                  gcd = i;
              }
          }
      }else{
          if (first == 0){
              gcd = second;
          } else if (second == 0) {
              gcd = first;
          }
      }
        System.out.println(gcd);

    }
}
