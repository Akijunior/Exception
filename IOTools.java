package Utils;

import javax.swing.JOptionPane;

public class IOTools {
	
	public static String getString(String msg, boolean required){
		String entrada = JOptionPane.showInputDialog(msg);
		if (required && entrada.isEmpty()){
			showError("Opção obrigatória, digite algo válido. ");
			return getString(msg, required);
		}
		return entrada;
	}
	
	public static int getInt(String msg, boolean required){
		
		try{
			int entrada = Integer.valueOf(getString(msg, required));
			return entrada;
		}
		catch(NumberFormatException e){
			showError("Por favor, digite números inteiros.");
			return getInt(msg, required);
		}
	}
	
	public static void showError(String msg){
		JOptionPane.showMessageDialog(null, msg, "L1 Corp", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg, "L1 Corp", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	

}
