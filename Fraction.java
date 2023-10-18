public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be zero. Setting to 1.");
            this.denominator = 1;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction addFractions(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        return new Fraction(newNumerator, commonDenominator);
    }
}