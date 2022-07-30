package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int series = 0;
        int sum = 0;
        for(int i = 1; i <= lengthOfLastNumber; i++){
            series= (10*series) + 9;
            sum+=series;
        }
        System.out.println(sum);

    }
}
