package ciclos;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arroba = '@';
		String cadena = "sdfs@dfasf";
		for (int i = 0; i < cadena.length(); i++){
		    char letra = cadena.charAt(i);
		    if(arroba == letra) {
		    	System.out.println("correo valido");
		    }
		    else {
		    	System.out.println("No valido");
		    }
		}
		
		
	}

}
