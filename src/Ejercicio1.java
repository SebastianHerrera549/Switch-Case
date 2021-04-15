
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int motor = (int)(Math.random()*5);//arroja muneros aleatorios de 0 a 4 
	System.out.println("Motor tipo "+motor);
	
	switch (motor) 
	{
	
	case 0:
		System.out.println("No hay establecido un valor definido para el tipo");
		break;
	case 1:
		System.out.println("Agua");
		break;
	case 2:
		System.out.println("Gasolina");
		break;
	case 3:
		System.out.println("Hormigon");
		break;
	default:
		System.out.println("No existe un valor válido");
		
	}

	}

}
