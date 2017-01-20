package Principal;

import Utils.IOTools;
import Utils.IOTools.*;

public class ExceptionApp {
	
	public static void main(String[] args) {
		System.out.println("Teste: ");
		String menu = "1 - Idade\n 0 - Sair";
		
		while(true){
			
			int op = IOTools.getInt(menu, true);
			switch(op){
			
			case 1:
				
				break;
				
			case 0:
				break;
			
			default:
				IOTools.showError("Opção Inválida!");
				break;
			}
		}
	}
}
