package Calculadora;
/**
 * Esta clase define el funcionamiento de las operaciones que puede hacer nuestra
 * calculadora
 * @author miguel
 */

public class Calculadora {
	//Campos de la clase
	double op1;
	double op2;
	
	/**
	 * Constructor de la clase Calculadora
	 */
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	 /**
	  * Devuelve el resultado de la operacion suma
	  * @return el resultado de nuestra suma
	  */
	double suma() {
		return op1+op2;
	}
	
	/**
	 * Funcion de nuestra calculadora para operacion de resta
	 * @return devuelve la operacion de resta
	 */
	double resta() {
		return op1-op2;
	}
	/**
	 * Funcion de nuestra calculadora para la operacion de division
	 * al intentar dividir por cero creara una excepcion que devolvera
	 * un error
	 * @return devuelve la operacion de division
	 */
	double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
		}
		return op1/op2;
	}
	/**
	 * Funcion de nuestra calculadora en la que la potencia al ser elevada por 0
	 * siempre nos tendra que devolver por resultado un 1
	 * @return devuelve la operacion de potencia
	 */
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
	
}//Cierre del constructor
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}//Fin de programa
