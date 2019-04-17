package fr.afcepf.bpel.wsaddition.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://wsaddition.afcepf.fr")
public interface IWSAddition 
{	
	@WebMethod (operationName = "additionner")
	@WebResult (name = "resultatAddition")
	int additionner (@WebParam(name = "paramA") int a, @WebParam (name = "paramB") int b);
}