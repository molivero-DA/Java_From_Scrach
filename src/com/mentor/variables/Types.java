package com.mentor.variables;

import java.util.Objects;

public class Types {

    public Types() {
    }

    /** Basics Concepts
     *  - What is a variable?
     *  - How we can instance a variable?
     *  - How we can assign value to the variable?
     *  - What means that variable are mutable or immutable?
     *
     *  -> Trello:
     *  -> https://trello.com/c/SjA16bfy/7-variables
     * */

    public char varChar = 'c'; // Primitive variable
    public String stringChars = "we can set any other string of chars here"; // Class Object of this variable

    // as Primitives
    public byte primitiveByte = 5;
    public int primitiveNumbers = 1234556;
    public short primitiveShort = 123;
    public long primitiveLongNumbers = 12313123131213123L; // L -> Represent that this number will be type of Long.

    // as Objects
    public Byte ourbyte = 5;
    public Integer ourNumbers = 1234556;
    public Short aShort = 123;
    public Long ourLongNumbers = 12313123131213123L; // L -> Represent that this number will be type of Long.

    public String getStringChars() {
        return stringChars;
    }

    public void setStringChars(String stringChars) {
        this.stringChars = stringChars;
    }

    @Override
    public String toString() {
        return "\n types {" +
                "\n primitiveChar=" + varChar + "," +
                "\n stringChars='" + stringChars + '\'' + "," +
                "\n primitiveByte=" + primitiveByte + "," +
                "\n primitiveNumbers=" + primitiveNumbers + "," +
                "\n primitiveShort=" + primitiveShort + "," +
                "\n primitiveLongNumbers=" + primitiveLongNumbers + "," +
                "\n ourbyte=" + ourbyte + "," +
                "\n ourNumbers=" + ourNumbers + "," +
                "\n aShort=" + aShort + "," +
                "\n ourLongNumbers=" + ourLongNumbers + "," +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Types types = (Types) o;

        if (!Objects.equals(stringChars, types.stringChars)) return false;
        return Objects.equals(ourLongNumbers, types.ourLongNumbers);
    }

    @Override
    public int hashCode() {
        int result = varChar;
        result = 31 * result + (stringChars != null ? stringChars.hashCode() : 0);
        result = 31 * result + (int) primitiveByte;
        result = 31 * result + primitiveNumbers;
        result = 31 * result + (int) primitiveShort;
        result = 31 * result + (int) (primitiveLongNumbers ^ (primitiveLongNumbers >>> 32));
        result = 31 * result + (ourbyte != null ? ourbyte.hashCode() : 0);
        result = 31 * result + (ourNumbers != null ? ourNumbers.hashCode() : 0);
        result = 31 * result + (aShort != null ? aShort.hashCode() : 0);
        result = 31 * result + (ourLongNumbers != null ? ourLongNumbers.hashCode() : 0);
        return result;
    }
}
