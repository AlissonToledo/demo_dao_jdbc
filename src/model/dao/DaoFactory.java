package model.dao;

import db.DB;
import model.dao.Impl.DepartmentDaoJDBC;
import model.dao.Impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao  creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDaoJDBC createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
