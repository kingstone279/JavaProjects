package JavaProjects;

import java.util.Random;

public class PassGen {

    public static  String PassGenerator(int len){
        Random rand = new Random();    
		String Small_letters = "abcdefghijklmnopqrstuvwxyz";
        String Capital_letters = Small_letters.toUpperCase();
		String numbers = "0123456789"; 
		String symbols = "!@#$%^&*_=+-/.?<>)"; 
        StringBuilder randPass = new StringBuilder();
        for (int i = 0; i < len;i++){
            int randDig = rand.nextInt(4);
            switch (randDig) {
                case 0:
                    randPass.append(Capital_letters.charAt(rand.nextInt(Capital_letters.length())));
                    break;
                case 1:
                    randPass.append(Small_letters.charAt(rand.nextInt(Small_letters.length())));
                    break;
                case 3:
                    randPass.append(numbers.charAt(rand.nextInt(numbers.length())));
                    break;
                case 2:
                    randPass.append(symbols.charAt(rand.nextInt(symbols.length())));
                    break;
                default:
                    throw new AssertionError();
            }

        }
        return randPass.toString();
    }
    public static void main(String[] args) {
        System.out.println(PassGenerator(6));
    }

}
