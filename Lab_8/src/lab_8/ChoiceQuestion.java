/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_8;

public class ChoiceQuestion extends Question {

    private String choices[];
    private int i;

    public ChoiceQuestion() {
        choices = new String[4];
        i = 0;
    }

    public void addChoice(String choice, boolean state) {
        choices[i] = choice;
        if(state==true){
            setAnswer(choice);
        }
        i++;
    }

    @Override
    public void display() {
        super.display();
        for (int j = 0; j < choices.length; j++) {
            System.out.println("   "+(j+1)+" - "+choices[j]);
            
        }
    }
    
    
    

}
