package lab_8;

public class Question {
    private String text ;
    private String answer ;

    public Question() {
        text = null;
        answer = null;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer.toLowerCase();
    }

    public String getText() {
        return text;
    }
    
    public void display(){
        System.out.println(" Q ) "+getText());
    }
    
    public boolean checkAnswer(String answer){
        return this.answer.equals(answer);
    }
}
