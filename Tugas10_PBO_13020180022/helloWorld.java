import javax.swing.*; 

public class helloWorld extends JFrame {
    helloWorld(String title) { 
        this.setSize(250,250); 
        setTitle(title); 
         
    }

    public static void main(String[] args) {
       helloWorld window = new helloWorld("..::Hello::..");
       window.setVisible(true);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       JLabel label = new JLabel("I just want to say HELL-O WORLD");
       window.getContentPane().add(label);
       
        
    }
    
 
}
