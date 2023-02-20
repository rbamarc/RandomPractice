import java.util.Random;
// import random java utility packages

public class RandomPractice {
    public static void main(String[] args) throws Exception {
        //create a random object 
        Random rng = new Random();
        // generate 10 random numbers
        for (int i = 0; i < 10; i++){
            int randomNumber =  rng.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
