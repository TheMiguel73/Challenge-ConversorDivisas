import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Conversor {
	
	public static void main(String[] args) {
		
        
        String[] opciones = {"Moneda","Temperatura","Datos de Almacenamiento"};
        ImageIcon icon = new ImageIcon("src/imagen/ico.png");
        
        String opcion = (String)JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "CONVERSOR DE DIVISAS", JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[2]);
        System.out.println(opcion);
        if (opcion == null)
       	{
        	JOptionPane.showMessageDialog(null, "ADIOS!!!");
        	
       	}
        else
        {
	        switch(opcion) 
			{    		  
			  case "Moneda":
				      cambioMoneda();	
				      continuara();
			    break;
			  case "Temperatura":
				      cambioTemperatura();
				      continuara();
			    break;
			  case "Datos de Almacenamiento":
				   cambioDatos();
				   continuara();
			    break;
			}
        }
	}

	private static void cambioMoneda() {
		  //double entradaDato;
		  
		  System.out.println("La conversion de moneda ");
		  
		    double entradaDato = 0;
	        boolean validar = true;
	        
	        
	        do {
	            String ingresar = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir");
	            if (ingresar==null)
	            {
	            	System.exit(0);
	            	
	            }
	            else
	            {	
		            try 
		            {
		            	entradaDato = Double.parseDouble(ingresar);
		                validar = true;
		            } 
		            catch (NumberFormatException e) 
		            {
		                JOptionPane.showMessageDialog(null, "Desbes ingresar algun valor", "Error", JOptionPane.ERROR_MESSAGE);
		                validar = false;
		            }
	            }
	 
	        } while (!validar);
	        
	      String[] cambiar = {"De Bolivianos a Dolares","De Bolivianos a Euros","De Bolivianos a Yenes","De Bolivianos a Libras","De Bolivianos a Won","De Dolares a Bolivianos","De Euros a Bolivianos","De Yen a Bolivianos","De Libras a Bolivianos","De Won a Bolivianos"};
	      
	      boolean validar2;
	      String opcion2 = " ";
	      try 
          {
          	  //opcion2 =(JOptionPane.showInputDialog(null, "Selecciona tu opcion de conversion","CONVERSOR",JOptionPane.PLAIN_MESSAGE,null,cambiar,"Selecciona tu opcion")).toString();
	    	  ImageIcon icon = new ImageIcon("src/imagen/Moneda.png");
	    	  opcion2 = (String)JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "CONVERSOR DE MoNEDA", JOptionPane.QUESTION_MESSAGE, icon, cambiar, cambiar[5]);
          	  validar2 = true;
          } 
          catch (NullPointerException e) 
          {
              JOptionPane.showMessageDialog(null, "Desbes seleccionar alguna opcion", "Error", JOptionPane.ERROR_MESSAGE);
              validar2 = false;
          }
	
	      System.out.println(opcion2);
	    	if (opcion2 == "De Bolivianos a Dolares")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato / (6.97);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"$ Dolares");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == "De Bolivianos a Euros")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato / (7.29);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"€ Euros");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == "De Bolivianos a Yenes")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato / (0.051);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"¥ Yenes");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == "De Bolivianos a Libras")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato / (8.43);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"¥ Yenes");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == "De Bolivianos a Won")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato / (0.0053);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"W Wones");
	    		System.out.println(cambio);
	    	}
	    	//conversiones contrarias
	    	if (opcion2 == "De Dolares a Bolivianos")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato * (6.97);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"Bs Bolivianos");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == "De Euros a Bolivianos")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato * (7.29);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"Bs Bolivianos");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == "De Yen a Bolivianos")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato * (0.051);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"Bs Bolivianos");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == "De Libras a Bolivianos")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato * (8.43);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"Bs Bolivianos");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == "De Won a Bolivianos")
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato * (0.0053);
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+"Bs Bolivianos");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == null)
	    	{
	    		System.exit(0);
	    	}
	}

	private static void continuara() 
	{
		int n = JOptionPane.showConfirmDialog(null,"Desea Continuar?","Continuará",JOptionPane.YES_NO_OPTION);
        System.out.println(n);   
            if(n == 0)
    	        {    
    	        	//JOptionPane.showMessageDialog(null, " HOLA!!! ");
    	        	Conversor.main (null);
    	        }   
            if(n == 1) 
                JOptionPane.showMessageDialog(null, "ADIOS!!!");
	}

	private static void cambioTemperatura() {
		  System.out.println("La conversion de temperatura ");
		  
		    double entradaDato = 0;
	        boolean validar = true;
	        
	        
	        do {
	            String ingresar = JOptionPane.showInputDialog(null, "Ingrese el nivel de Temperatura que deseas convertir");
	            if (ingresar==null)
	            {
	            	System.exit(0);
	            	
	            }
	            else
	            {	
		            try 
		            {
		            	entradaDato = Double.parseDouble(ingresar);
		                validar = true;
		            } 
		            catch (NumberFormatException e) 
		            {
		                JOptionPane.showMessageDialog(null, "Desbes ingresar algun valor", "Error", JOptionPane.ERROR_MESSAGE);
		                validar = false;
		            }
	            }
	 
	        } while (!validar);
	        
	      String[] cambiar = {"De Grados Celsius a Fahrenheit","De Grados Celsius a Kelvin","De Grados Celsius a Rankine","De Grados Fahrenheit a Celsius","De Grados Fahrenheit a Kelvin","De Grados Fahrenheit a Rankine","De Kelvin a Celsius","De Kelvin a Fahrenheit","De Rankine a Celsius"};
	      
	      boolean validar2;
	      String opcion2 = " ";
		      try 
		        {
		    	     ImageIcon icon = new ImageIcon("src/imagen/Temperatura.png");
		    	     opcion2 = (String)JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "CONVERSOR DE TeMPERATURA", JOptionPane.QUESTION_MESSAGE, icon, cambiar, cambiar[3]);
                     validar2 = true;
		        } 
		        catch (NullPointerException e) 
		        {
		            JOptionPane.showMessageDialog(null, "Desbes seleccionar alguna opcion", "Error", JOptionPane.ERROR_MESSAGE);
		            validar2 = false;
		        }
	
	      System.out.println(opcion2);
	    	if (opcion2 == cambiar[0])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato *1.8+32;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" °F");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == cambiar[1])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato + 273.15;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" K");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == cambiar[2])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = (entradaDato + 273.15)* 1.8;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" R");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == cambiar[3])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = (entradaDato - 32) /1.8;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" °C");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == cambiar [4])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = (entradaDato +459.67)/1.8;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" K");
	    		System.out.println(cambio);
	    	}
	    	
	    	if (opcion2 == cambiar[5])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato + 459.67;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" R");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == cambiar[6])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato -273.15;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" °C");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == cambiar[7])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = 9*entradaDato -459.67;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" °F");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == cambiar[8])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = (entradaDato /1.8)-273.15;
	    		JOptionPane.showMessageDialog(null,"El cambio es: "+Math.round(cambio * 100.0)/100.0+" °C");
	    		System.out.println(cambio);
	    	}
	    	if (opcion2 == null)
	    	{
	    		System.exit(0);
	    	}
	    	
	}
	
	private static void cambioDatos() {
		    
		
		    System.out.println("La conversion de Datos");  
		    double entradaDato = 0;
	        boolean validar = true;
	        
	        
	        do {
	            String ingresar = JOptionPane.showInputDialog(null, "Ingrese la dimesion de datos que deseas convertir");
	            if (ingresar==null)
	            {
	            	System.exit(0);
	            	
	            }
	            else
	            {	
		            try 
		            {
		            	entradaDato = Double.parseDouble(ingresar);
		                validar = true;
		            } 
		            catch (NumberFormatException e) 
		            {
		                JOptionPane.showMessageDialog(null, "Desbes ingresar algun valor", "Error", JOptionPane.ERROR_MESSAGE);
		                validar = false;
		            }
	            }
	 
	        } while (!validar);
	        
	      String[] cambiar = {"De Terabytes a Gigabytes","De Gigabytes a Terabytes","De Gigabytes a Megabytes","De Gigabytes a Kilobytes","De Megabytes a Terabytes","De Megabytes a Gigabytes","De Megabytes a Kilobytes","De Kilobytes a Megabytes"};
	                          // 
	      boolean validar2=true;
	      String opcion2 = " ";
		      try 
		        {
		    	     ImageIcon icon = new ImageIcon("src/imagen/Datos.png");
		    	     opcion2 = (String)JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "CONVERSOR DE DaTOS DE ALMACENAMIENTO", JOptionPane.QUESTION_MESSAGE, icon, cambiar, cambiar[3]);
                   validar2 = true;
		        } 
		        catch (NullPointerException e) 
		        {
		            JOptionPane.showMessageDialog(null, "Desbes seleccionar alguna opcion", "Error", JOptionPane.ERROR_MESSAGE);
		            validar2 = false;
		        }
	
	      System.out.println(opcion2);
	        if (opcion2 == cambiar[0])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato * (1024);
	    		JOptionPane.showMessageDialog(null,"La conversion de "+ entradaDato+" Terabytes es: "+Math.round(cambio)+" Gigabytes");
	    		System.out.println("La conversion de Terabytes a Gigabyte es: "+cambio);
	    	}
	    	if (opcion2 == cambiar[1])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato / (1024);
	    		JOptionPane.showMessageDialog(null,"La conversion de "+ entradaDato+" Gigabytes es: "+Math.round(cambio)+" Terabytes");
	    		System.out.println("La conversion de Gigabytes a Terabytes es: "+cambio);
	    	}
	    	if (opcion2 == cambiar[2])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato / (1024);
	    		JOptionPane.showMessageDialog(null,"La conversion de "+ entradaDato+" Gigabytes es: "+(cambio)+" Megabytes");
	    		System.out.println("La conversion de Gigabytes a Megabytes es: "+cambio);
	    	}
	    	if (opcion2 == cambiar [3])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato * (1000000);
	    		JOptionPane.showMessageDialog(null,"La conversion de "+ entradaDato+" Gigabytes es: "+(cambio)+" Kilobytes");
	    		System.out.println("La conversion de Gigabytes a Kilobytes es: "+cambio);
	    	}
	    	if (opcion2 == cambiar[4])//De Megabytes a Terabytes
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato / (1000000);
	    		JOptionPane.showMessageDialog(null,"La conversion de "+ entradaDato+" Megabytes es: "+(cambio)+" Terabytes");
	    		System.out.println("La conversion de Megabytes a Terabytes es: "+cambio);
	    	}
	    	if (opcion2 == cambiar[5])
	    	{
	    		double cambio1 = entradaDato / (1024);
	    		JOptionPane.showMessageDialog(null,"La conversion de "+ entradaDato+" Megabytes es: "+Math.round(cambio1 * 100.0)/100.0+" Gigabytes");
	    		System.out.println("La conversion de Megabytes a Gigabytes es: "+cambio1);
	    	}
	    	if (opcion2 == cambiar[6])//De Megabytes a Kilobytes
	    	{
	    		System.out.println(entradaDato);
	    		double cambio = entradaDato * (1024);
	    		JOptionPane.showMessageDialog(null,"La conversion de "+ entradaDato+" Megabytes es: "+(cambio)+" Kilobytes");
	    		System.out.println("La conversion de Megabytes a Kilobytes es: "+cambio);
	    	}
	    	if (opcion2 == cambiar[7])
	    	{
	    		System.out.println(entradaDato);
	    		double cambio2 = entradaDato / (1024);
	    		JOptionPane.showMessageDialog(null,"La conversion de "+ entradaDato+" Kilobytes es: "+Math.round(cambio2 * 100.0)/100.0+" Megabytes");
	    		System.out.println("La conversion de Kilobytes a Megabytes es: "+cambio2);
	    	}   	
	    	if (opcion2 == null)
	    	{
	    		System.exit(0);
	    	}
	}

}
