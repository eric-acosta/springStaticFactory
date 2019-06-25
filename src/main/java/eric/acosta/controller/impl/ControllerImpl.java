package eric.acosta.controller.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eric.acosta.controller.IController;
import eric.acosta.services.IService;

public class ControllerImpl implements IController {
	
	private IService service;
	
	
	  public void execute() { System.out.println("Inicializa execute Controller");
	  service.execute();
	  
	  }
	
	 public ControllerImpl(IService service) { this.service =service; }
	 

}
