import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingese su primer numero :");
		Scanner sc=  new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("ingese su segundo numero :");
		Scanner sc2=  new Scanner(System.in);
		int num2 = sc2.nextInt();
		System.out.println("ingese el signo de la operacion qe desea realizar");
		System.out.println(" (+)suma, (-)Resta, (*)Multiplicacion, (/)Divicion:");
		Scanner sig=  new Scanner(System.in);
		char c = sig.next().charAt(0);
		
		switch (c) {
		case '+':
			int res =num+num2;
			System.out.println("Resultado de la Suma es = "+res);
			break;
		case '-':
			int res2 =num-num2;
			System.out.println("Resultado de la Resta es = "+res2);
			break;
		case '*':
			int res3 =num*num2;
			System.out.println("Resultado de la Multiplicacion es = "+res3);
			break;
		case '/':
			int res4 =num/num2;
			System.out.println("Resultado de la Divicion es = "+res4);
			break;
			
			default:
				System.err.println("Error Operacion invalida");
			
		
		}


	}

}
