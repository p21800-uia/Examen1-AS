package uia.com.contabilidad.cheques;

import uia.com.contabilidad.clientes.Cliente;
import uia.com.contabilidad.cuentas.Cuenta;

public class GestorCheques 
{
	private Cuenta miCCheques;
	Cheque miCheque = null;

	public void GestorCheques()
	{}

	public void registraCheque(Cuenta ccheques, String cuentaCheques, String nomCheque) 
	{
		this.miCCheques = ccheques;
		
		int miId = miCCheques.getItems().size()+1;
		miCheque = new Cheque(miId, nomCheque, "devuelto", "14-11-2020");
		
		miCheque.agregaNotaDebito(nomCheque);
			
		miCCheques.getItems().add(miCheque);
		
		
			
	}
	
}
