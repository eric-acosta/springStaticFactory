package eric.acosta.dao.impl;

import eric.acosta.dao.IDaoConexion;

public class JdbcDao implements IDaoConexion {

	public String getConexion() {
		String info = "se conecto a JDbC";
		System.out.println(info);
		return info;
	}

}
