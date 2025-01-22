public class Castings {
    private int numero1 = 12;
    private short numero2 = 0;
    private Integer numero3 = 2;
    private char numero4 = 'C';

    public void exibeNumero() {
        System.out.println(this.numero1);
    }

    public long castigToLong() {
        long newNumber = numero1;
        return newNumber;
    }

    public Integer castingToInteger() {
        Integer newNumber = (Integer) numero1;
        return newNumber;
    }

    public int castingToInt() {
        int newNumber = (int) numero3;
        return newNumber;
    }

    public char castingToChar() {
        char newChar = (char) numero2;
        return  newChar;
    }

    public Double castingToDouble() {
        Double newNumber = Double.valueOf(numero1);
        return newNumber;
    }
}
