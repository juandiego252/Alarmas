package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private static ArrayList<Alarma> alarmas = new ArrayList<Alarma>();
	
	

	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}

	public static ArrayList<Alarma> getAlarmas() {
		return alarmas;
	};
	
	

}
