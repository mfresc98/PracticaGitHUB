package Calculadora;

public class Calculadora {

	double op1;
	double op2;
	
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	double suma() {
		return op1+op2;
	}
	
	double resta() {
		return op1-op2;
	}
	
	double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
		}
		return op1/op2;
	}
	
	double potencia() {
		if(op2==0) {
			return 1;
		}else(op2<0){
			
		}
		return Math.pow(op1, op2);
	}
	
	@Override
	public String toString() {
		return "Calculadora Miguel Franco [op1=" + op1 + ", op2=" + op2 + ", suma=" + suma + ", resta=" + resta + ", division="
				+ division + "]";
	}
	
	
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}
