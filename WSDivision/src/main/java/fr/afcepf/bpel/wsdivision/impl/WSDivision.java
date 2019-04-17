package fr.afcepf.bpel.wsdivision.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import fr.afcepf.bpel.wsdivision.api.IWSDivision;

@WebService(targetNamespace = "http://wsdivision.afcepf.fr", endpointInterface = "fr.afcepf.bpel.wsdivision.api.IWSDivision")
@Remote (IWSDivision.class)
@Stateless
public class WSDivision implements IWSDivision 
{
	public int diviser(int a, int b) 
	{
		return a / b;
	}
}