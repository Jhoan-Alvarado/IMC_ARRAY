import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		 ArrayList<Persona> personas = new ArrayList<>();
	        ArrayList<Double> imc = new ArrayList<Double>();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de personas: ");
	        int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas"));

	        for (int i = 0; i < cantidadPersonas; i++) {
	            System.out.println("Persona " + (i + 1));
	            String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
	            System.out.println("Nombre: "  + nombre);
	            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura en metros"));
	            System.out.print("Altura : " + altura);
	            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso En Kilogramos"));

	            Persona persona = new Persona(nombre, altura, peso);
	            personas.add(persona);
	            
	        }

	        System.out.println("Resultados:");
	        
	      

	        for (Persona persona : personas) {
	            System.out.println("Nombre: " + persona.getNombre());
	            System.out.println("IMC: " + persona.calcularIMC(imc));
	           
	            System.out.println();
	        }
	        
	    }
	}

	class Persona {
	    private String nombre;
	    private double altura;
	    private double peso;

	    public Persona(String nombre, double altura, double peso) {
	        this.nombre = nombre;
	        this.altura = altura;
	        this.peso = peso;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String calcularIMC(ArrayList<Double> imc) {
	    	
	    	double calculo = peso / (altura * altura);
	    	String result = null;
	    	if (calculo < 18) {
	    		result =  "Anorexia";
	    	}
	    	else if (calculo>= 18 && calculo < 20) {
	    		result = "Delgadez";
	    	}
	    	else if (calculo >= 20 && calculo < 27) {
	    		result =  "Normalidad";
	    	}
	    	else if (calculo >= 27 && calculo < 30	) {
	    		result = "Obesidad (Grado 1)";
	    	}
	    	else if (calculo >= 30 && calculo < 35	) {
	    		result = "Obesidad (Grado 2)";
	    	}
	    	else if (calculo >= 35 && calculo < 40	) {
	    		result = "Obesidad (Grado 1)";
	    	}
	    	else if (calculo >= 40	) {
	    		result = "Obesidad Morbida";
	    	}
	    	imc.add(calculo);
	    	
	    	
	      
	    	return result;
	       	
	    }
	    public void LlenarImc() {
			
		}
	
	}


