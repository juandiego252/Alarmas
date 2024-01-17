package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(DiasSemana.LUNES, 6, 30);
		Alarma alarma2 = new Alarma(DiasSemana.MARTES, 4, 35);
		Alarma alarma3 = new Alarma(DiasSemana.MIERCOLES, 3, 15);
		Alarma alarma4 = new Alarma(DiasSemana.JUEVES, 2, 30);
		Alarma alarma5 = new Alarma(DiasSemana.VIERNES, 1, 30);
		Alarma alarma6 = new Alarma(DiasSemana.SABADO, 7, 30);
		Alarma alarma7 = new Alarma(DiasSemana.DOMINGO, 10, 30);
		AdminAlarmas alarmas = new AdminAlarmas();
		alarmas.agregarAlarma(alarma1);
		alarmas.agregarAlarma(alarma2);
		alarmas.agregarAlarma(alarma3);
		alarmas.agregarAlarma(alarma4);
		alarmas.agregarAlarma(alarma5);
		alarmas.agregarAlarma(alarma6);
		alarmas.agregarAlarma(alarma7);
		
		ArrayList<Alarma> alarmasActuales = AdminAlarmas.getAlarmas();
		System.out.println(alarmasActuales);
	}

}
