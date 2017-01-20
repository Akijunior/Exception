package Principal;

public class ClasseA {
	
	public void metodo1(){
		System.out.println("Início 1.");
		metodo2();
		System.out.println("Fim 1.");
	}
	
	public void metodo2(){
		System.out.println("Início 2.");
		metodo3();
		System.out.println("Fim 2.");
	}
	
	public void metodo3() throws RuntimeException{
		System.out.println("Início 3.");
		try{
			metodo4();
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("...");
			throw new RuntimeException("O método 4 não resistiu...");
		}
		System.out.println("Fim 3.");
	}

	
	public void metodo4(){
		System.out.println("Início 4.");
		int[] numeros = new int[10];
		int numero = numeros[10];
		System.out.println("Fim 4.");
	}

}
