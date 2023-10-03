package Persona;

public class Test {

	
		//Metodo principal para instanciar mis clases
	public static void main(String[] args) {

		
		//Instancia de Persona
		Persona Felipe = new Persona ("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		
		System.out.println(Felipe);//imprimir lugar memoria 
		Felipe.imprimirInfo();//imprime informacion 
		Felipe.saludar();//imprime saludo
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr.Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontologia", "55113344", "Consultorio 500", "intermedio", "matutino", 500);
				System.out.println("*****************");
				Simi.calcularSalario();
				Simi.imprimirInfoDentista();	
		
	}//cierre metodo main

}//cierre clas Persona
