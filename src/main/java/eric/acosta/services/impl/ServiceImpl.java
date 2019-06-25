package eric.acosta.services.impl;

import eric.acosta.dao.IDaoConexion;
import eric.acosta.dao.impl.JdbcDao;
import eric.acosta.services.IService;

public class ServiceImpl implements IService{
	private IDaoConexion daoConexion;
	
	public void setDaoConexion(IDaoConexion daoConexion) {
		this.daoConexion=daoConexion;
	}

	public void execute() {
		System.out.println("Ejecuta servicio");
		daoConexion.getConexion();
		
	}

}
