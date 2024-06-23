public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this. imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void add(double a, double b){
        this.real = this.real + a;
        this.imaginary = this.imaginary+b;
    }
    public void add(ComplexNumber complexNumber){
        this.real = this.real + complexNumber.real;
        this.imaginary = this.imaginary + complexNumber.imaginary;
    }
    public void subtract(double a, double b){
        this.real = this.real -a;
        this.imaginary = this.imaginary -b;
    }
    public void subtract(ComplexNumber complexnumber){
        this.real = this.real - complexnumber.real;
        this.imaginary = this.imaginary - complexnumber.imaginary;
    }
}
