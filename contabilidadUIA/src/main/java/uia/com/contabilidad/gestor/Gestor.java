package uia.com.contabilidad.gestor;

import java.util.Map;

import uia.com.contabilidad.clientes.InfoUIA;

public class Gestor extends AGestor{

	
	public Gestor(String nomFile) {
		super(nomFile);
		// TODO Auto-generated constructor stub
	}


	public void Gestor()
	{	
	}
	
	
	@Override
	public void Print() {
		super.Print();		
	}

	@Override
	public void Lee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Busca() {
		
		
	}


	@Override
	public IGestor getGestor() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setGestor(IGestor p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Map<String, InfoUIA> getCatalogoMaestro() {
		return super.getCatalogoMaestro();
	}

}
