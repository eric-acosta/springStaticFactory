package eric.acosta.dao.impl;

import eric.acosta.dao.IDaoConexion;

public class DaoFactory {
	private DaoFactory() {
		
	}
	public static IDaoConexion getDaoConexion(String daoType) {
		IDaoConexion daoConexion = null;
		if("jdbc".equalsIgnoreCase(daoType)) {
			daoConexion = new JdbcDao();
		}
		if("hibernate".equalsIgnoreCase(daoType)) {
			daoConexion = new HibernateDao();
		}
		return daoConexion;
	}

}
