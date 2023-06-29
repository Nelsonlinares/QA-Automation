package service;

import java.util.Scanner;

import entidad.Raices;

public class RaicesService {
	
	public RaicesService() {
		cargarCoeficientes();
	}
	
	private Raices raices = new Raices();
	
	private void cargarCoeficientes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el coeficiente a: ");
		raices.setA(sc.nextInt());
		System.out.println("Ingrese el coeficiente b: ");
		raices.setB(sc.nextInt());
		System.out.println("Ingrese el coeficiente c: ");
		raices.setC(sc.nextInt());
		sc.close();
	}
	
	private double getDiscriminante() {
		double discriminante = Math.pow(raices.getB(), 2)-(4*raices.getA()*raices.getC());
		return discriminante;
	}
	
	private boolean tieneRaices() {
		return getDiscriminante() > 0;
	}
	
	private boolean tieneRaiz() {
		return getDiscriminante() == 0;
	}
	
	private void obtenerRaices() {
		double segundoTermino = (Math.sqrt(getDiscriminante()))/2*raices.getA();
		double raizUno = (-raices.getB())+segundoTermino;
		double raizDos = (-raices.getB())-segundoTermino;
		System.out.println("La raiz A es: "+raizUno+", y la raiz B es: "+raizDos);
	}
	
	private void obtenerRaiz() {
		double raizUnica = (-raices.getB());
		System.out.println("La raiz de la ecuación es: "+raizUnica);
	}
	
	public void calcular() {
		if (tieneRaices()) {
		obtenerRaices();
		}else if(tieneRaiz()){
		obtenerRaiz();
		}
		else {
			System.out.println("Esta ecuación no tiene solución real");
		}
	}

	
}
