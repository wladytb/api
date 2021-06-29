/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

/**
 *
 * @author wladi
 */
public class operaciones {

    double a, b;

    public operaciones() {
    }

    public operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double sumar() {
        return this.a + this.b;
    }

    public double restar() {
        return this.a - this.b;
    }

    public double multiplicar() {
        return this.a * this.b;
    }
}
