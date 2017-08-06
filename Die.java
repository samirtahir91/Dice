/*
 * Die.java
 *
 * Created on 15-Nov-2010, 10:31:32
 */

/**
 *
 * @author Samir
 */
public class Die {

    private int noFaces;
    public int faceValue;

    /**
     * @param faces the number of faces on the new die
     */
    public Die(int faces) {

        noFaces = faces;

    } // constructor

    /**
     * @return the value a newly-selected face is set to
     */
    public int roll() {
        faceValue = (int) (Math.random() * noFaces) + 1;
        // System.out.println("New face set to value: " + faceValue);
        return faceValue;
    }
}
