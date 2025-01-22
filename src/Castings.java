/**
 * @author Bruno
 * @since 2025
 * @version 1.0
 */
public class Castings {
    private int numero1 = 12;
    private short numero2 = 0;
    private Integer numero3 = 2;

    /**
     *
     * @return Retorna o casting de int para long.
     */
    public long castigToLong() {
        long newNumber = numero1;
        System.out.println(newNumber);
        return newNumber;
    }

    /**
     *
     * @return Retorna o casting de int para Integer(Wrapper).
     */
    public Integer castingToInteger() {
        Integer newNumber = (Integer) numero1;
        System.out.println(newNumber);
        return newNumber;
    }

    /**
     *
     * @return Retorna o casting de Integer para int(primitivo).
     */
    public int castingToInt() {
        int newNumber = (int) numero3;
        System.out.println(newNumber);
        return newNumber;
    }

    /**
     *
     * @return Retorna o casting de int para Double(Wrapper).
     */
    public Double castingToDouble() {
        Double newNumber = Double.valueOf(numero1);
        System.out.println(newNumber);
        return newNumber;
    }

    /**
     *
     * @return Retorna o casting de int para short.
     */
    public int castingIntToShort() {
        short newNumber = (short) numero1;
        System.out.println(newNumber);
        return newNumber;
    }
}
