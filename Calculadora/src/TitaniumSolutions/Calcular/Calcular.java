package TitaniumSolutions.Calcular;

public class Calcular {

    private int num1;
    private int num2;

    public void setNum1(int num1) {

        this.num1 = num1;
    }

    public void setNum2(int num2) {

        this.num2 = num2;
    }

    public int getNum1() {

        return this.num1;
    }

    public int getNum2() {

        return this.num2;
    }

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public float division(int num1, int num2) {
        return ((float)(num1 / num2));
    }

}
