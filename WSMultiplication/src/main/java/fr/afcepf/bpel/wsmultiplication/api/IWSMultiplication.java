package fr.afcepf.bpel.wsmultiplication.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://wsmultiplication.afcepf.fr")
public interface IWSMultiplication
{	
	@WebMethod (operationName = "multiplier")
	@WebResult (name = "resultatMultiplication")
	int multiplier (@WebParam(name = "facteurX") int a, @WebParam (name = "facteurY") int b);
}