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
				
				
				
				//Instancia de Paciente con todos los datos
				Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Doc. Simi Lares", false);
				
			 System.out.println("*****************");
			 System.out.println(Chencho);
			 
			 
			 
			 
			 //Instancia de Pacientes con datos obligatorios 
			 Paciente Masiosare = new Paciente("MAS12345", false, false);
			 System.out.println("*****************");
			 System.out.println(Masiosare);
			 
			 
		
	         //Cambiar el false de seguroMedico a true
			 Masiosare.seguroGastosMedicos = true;
			 
			 
			 System.out.println("*****************");
			 System.out.println(Masiosare);
			 
			 
	
	}//cierre metodo main

}//cierre clas Persona
