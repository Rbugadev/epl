package fr.afcepf.bpel.wsaddition.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import fr.afcepf.bpel.wsaddition.api.IWSAddition;

@WebService(targetNamespace = "http://wsaddition.afcepf.fr", endpointInterface = "fr.afcepf.bpel.wsaddition.api.IWSAddition")
@Remote (IWSAddition.class)
@Stateless
public class WSAddition implements IWSAddition 
{
	public int additionner(int a, int b) 
	{
		return a + b;
	}
}