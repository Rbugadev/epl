package fr.afcepf.bpel.wsmultiplication.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import fr.afcepf.bpel.wsmultiplication.api.IWSMultiplication;

@WebService(targetNamespace = "http://wsmultiplication.afcepf.fr", endpointInterface = "fr.afcepf.bpel.wsmultiplication.api.IWSMultiplication")
@Remote (IWSMultiplication.class)
@Stateless
public class WSMultiplication implements IWSMultiplication 
{
	public int multiplier(int a, int b) 
	{
		return a * b;
	}
}