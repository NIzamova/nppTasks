package myjava.npp.homework;
import static java.lang.Math.*;
/**
 * Created by N on 29.03.14.
 */

    public class Complex implements trigonometric, complexAction, ComplexMath{
        private  double A;
        private  double B;

        public double getA(){
            return A;
        }
        public double getB(){
            return B;
        }
        public void setA(int a){
            this.A=a;
        }
        public void setB(int b){
            this.B=b;
        }

        public void setAB(int a,int b){
            this.A=a; this.B=b;
        }
        public String toString(){
            String str=new String();
            str= A+ " " + B + "i";
            return str;
        }


        public Complex(){
            final int DEFAULT_VALUE =0;
            this.A=DEFAULT_VALUE; this.B=DEFAULT_VALUE;
        }

        public Complex(int a, int b){
            this.A=a; this.B=b;
        }
        public double getModul(){
            return sqrt(A * A + B * B);
        }

          
        public double getArg(){
            return atan(B/A);
        }

        public void conjugate(){
        this.B=-B;
        }
        public void sum(Complex complex){
            this.A+=complex.A;
            this.B+=complex.B;
        }
        public void difference(Complex complex){
            this.A-=complex.A;
            this.B-=complex.B;
        }
        public void productOnNumber(double number){
            this.A*=number;
            this.B*=number;
        }



    }

