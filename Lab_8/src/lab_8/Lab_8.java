package lab_8;

import java.util.Scanner;

public class Lab_8 {
    public static void main(String[] args) {
        Question q = new Question();
        ChoiceQuestion chq = new ChoiceQuestion();
        
        System.out.println(chq instanceof Question);
        System.out.println(chq instanceof ChoiceQuestion);
        System.out.println(q instanceof Question);
        System.out.println(q instanceof ChoiceQuestion);
        
        
        
        
        
//        Scanner input = new Scanner(System.in);
//        ChoiceQuestion chq = new ChoiceQuestion();
//        chq.setText("Which Programming Language is the best ? ");
//        chq.addChoice("python", false);
//        chq.addChoice("java", true);
//        chq.addChoice("cpp", false);
//        chq.addChoice("php", false);
//        chq.display();
//        System.out.println("Enter Your Answer : ");
//        String ans = input.next().toLowerCase();
//        System.out.println("Your Answer is : "+chq.checkAnswer(ans));
    }
    
}
