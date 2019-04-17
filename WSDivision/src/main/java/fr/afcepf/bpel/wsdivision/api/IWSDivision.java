package fr.afcepf.bpel.wsdivision.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://wsdivision.afcepf.fr")
public interface IWSDivision
{	
	@WebMethod (operationName = "diviser")
	@WebResult (name = "resultatDivision")
	int diviser (@WebParam(name = "paramDiviseur") int a, @WebParam (name = "paramDividende") int b);
}