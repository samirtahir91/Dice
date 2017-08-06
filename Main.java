/*
 * Main.java
 *
 * Created on 15-Nov-2010, 10:31:32
 */

/**
 *
 * @author Samir
 */
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;   // creates a button to be used to roll the dice.
    private javax.swing.JButton jButton2;   // creates a button to be used to start a new game.
    private javax.swing.JLabel jLabel1; // creates a label for the users image icon of their dice face.
    private javax.swing.JLabel jLabel2; // creates a label for the computers image icon of their dice face.
    private javax.swing.JLabel jLabel3; // creates a label for the score field.
    private javax.swing.JLabel jLabel4; // creates a label for the game message.
    private int score;  // score field to hold the users value for the wins and losses in game.
    private Die myDie = new Die(6); // creates a new Die object with 6 faces to be used in the main method.
    private ImageIcon image1 = createImageIcon("images/0.png", "Computers Roll");   // creates an ImageIcon object to be used as the computers dice image and sets it to the default blank image.
    private ImageIcon image2 = createImageIcon("images/0.png", "Your Roll");        // creates an ImageIcon object to be used as the users dice image and sets it to the default blank image.
    private int comp;   // comp field to hold the value of the computers die face value.
    private int user;   // user field to hold the value of the users die face value.

    /** Constructor for the Main class, initialises the components of the class including the java buttons */
    public Main() {

        initComponents();

    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path,
            String description) {
        java.net.URL imgURL = Main.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }

    }

    /** Method to display the "New Game" button that will run the proceeding code once pressed.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel(image2);
        jLabel2 = new javax.swing.JLabel(image1);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Roll Dice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("New Game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Score: ");

        jLabel4.setText("Result: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(309, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(65, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(151, Short.MAX_VALUE).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(144, 144, 144)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(66, 66, 66).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)).addGap(78, 78, 78)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE).addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton1).addGap(35, 35, 35).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));

        pack();
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        comp = 0;     // resets the computers dice value to 0.
        user = 0;    // resets the users dice value to 0.
        jLabel4.setText("");     // clears the result mesage from the window.
        image1 = createImageIcon("images/0.png", "Computers Roll");  // sets  the computers dice image object to the default blank image and names it.
        image2 = createImageIcon("images/0.png", "Your Roll");       // sets the users dice image object to the default blank image and names it.
        jLabel1.setIcon(image2); //sets the labels icon to the users dice image, "image2".
        jLabel2.setIcon(image1); // sets the labels icon to the computers dice image, "image1".
        jButton1.setEnabled(true);  // sets the "Roll Dice" button as enabled to press.

    }

    /** Method to display the "Roll Dice" button that will run the proceeding code once pressed.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (1 <= comp && comp <= 6) // if the computer has a valid die face value, continue.
        {

            user = myDie.roll();    // calls the roll() method for the die object and sets it to the users die face value.

            switch (user) // for each case of 1-6 of the users die face value the result is different.
            {
                case 1:
                    image2 = createImageIcon("images/1.gif", "Your Roll");
                    break;   // if the users die face value is 1, then the users igame icon, "image2" is set to the die image of 1.
                case 2:
                    image2 = createImageIcon("images/2.gif", "Yout Roll");
                    break;   // if the users die face value is 2, then the users igame icon, "image2" is set to the die image of 2.
                case 3:
                    image2 = createImageIcon("images/3.gif", "Your Roll");
                    break;   // if the users die face value is 3, then the users igame icon, "image2" is set to the die image of 3.
                case 4:
                    image2 = createImageIcon("images/4.gif", "Your Roll");
                    break;   // if the users die face value is 4, then the users igame icon, "image2" is set to the die image of 4.
                case 5:
                    image2 = createImageIcon("images/5.gif", "Your Roll");
                    break;   // if the users die face value is 5, then the users igame icon, "image2" is set to the die image of 5.
                case 6:
                    image2 = createImageIcon("images/6.gif", "Your Roll");
                    break;   // if the users die face value is 6, then the users igame icon, "image2" is set to the die image of 6.
                default:
                    image2 = createImageIcon("images/0.png", "Your Roll");
                    break;  // else the default image is set.

            }
            jLabel1.setIcon(image2);  // sets the labels icon to the users dice image, "image2".
            jButton1.setEnabled(false); // sets the "Roll Dice" button as disabled to press.
        } else {
            comp = myDie.roll();    // else if comp does not have a valid dice face value of 1-6, calls the roll() method for the die object and sets it to the computers die face value.

            switch (comp) // for each case of 1-6 of the computers die face value the result is different.
            {
                case 1:
                    image1 = createImageIcon("images/1.gif", "Computers Roll");
                    break;  // if the computers die face value is 1, then the computers igame icon, "image1" is set to the die image of 1.
                case 2:
                    image1 = createImageIcon("images/2.gif", "Computers Roll");
                    break;  // if the computers die face value is 2, then the computers igame icon, "image1" is set to the die image of 2.
                case 3:
                    image1 = createImageIcon("images/3.gif", "Computers Roll");
                    break;  // if the computers die face value is 3, then the computers igame icon, "image1" is set to the die image of 3.
                case 4:
                    image1 = createImageIcon("images/4.gif", "Computers Roll");
                    break;  // if the computers die face value is 4, then the computers igame icon, "image1" is set to the die image of 4.
                case 5:
                    image1 = createImageIcon("images/5.gif", "Computers Roll");
                    break;  // if the computers die face value is 5, then the computers igame icon, "image1" is set to the die image of 5.
                case 6:
                    image1 = createImageIcon("images/6.gif", "Computers Roll");
                    break;  // if the computers die face value is 6, then the computers igame icon, "image1" is set to the die image of 6.
                default:
                    image1 = createImageIcon("images/0.png", "Computers Roll");
                    break; // else the default image is set.
            }
            jLabel2.setIcon(image1);    // sets the labels icon to the users dice image, "image1".
        }

        if (1 <= comp && comp <= 6 && 1 <= user && user <= 6 && user > comp) // if both users and comp have valid dice face values of 1-6 and the user value is greater than the comp value (if the users wins).
        {
            score++;    // increment the score by 1.
            score++;    // increment the score by 1.
            jLabel3.setText("Score: " + score); // sets the score label to display the new score.
            jLabel4.setText("Result: You Win!"); // sets the message label to display the win message.
        } else if (1 <= comp && comp <= 6 && 1 <= user && user <= 6 && user < comp) // if both users and comp have valid dice face values of 1-6 and the user value is less than the comp value (if the users loses).
        {
            score--;    //reduce the score by 1.
            jLabel3.setText("Score: " + score); // sets the score label to display the new score.
            jLabel4.setText("Result: You Lose");    // sets the message label to display the lose message.
        } else if (1 <= comp && comp <= 6 && 1 <= user && user <= 6 && user == comp) // if both users and comp have valid dice face values of 1-6 and the user value is the same asthe comp value (if the users draws).
        {
            jLabel3.setText("Score: " + score); // sets the score label to display the current score.
            jLabel4.setText("Result: You Drew");    // sets the message label to display the draw message.
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
				
            public void run() {
                new Main().setVisible(true);
					 
            }
        });
    }
}
