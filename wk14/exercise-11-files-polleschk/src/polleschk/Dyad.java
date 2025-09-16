/*
 * Course: CSC1110
 * Exercise 11 - Files
 * Name: Kaiden Pollesch
 * Last Updated: 10/28/23
 */
package polleschk;

import java.io.Serializable;

/**
 * Dyad record
 *
 * @param first  the first integer
 * @param second the second integer
 */
public record Dyad(int first, int second) implements Serializable {
    @Override
    public String toString() {
        return first + "\n" + second;
    }
}
