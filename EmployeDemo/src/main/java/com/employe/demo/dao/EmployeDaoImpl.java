package com.employe.demo.dao;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employe.demo.Entity.EmployeInfo;
import com.employe.demo.querry.Dbquerry;

@Repository
public class EmployeDaoImpl implements EmployeDao {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public EmployeInfo saveEmp(EmployeInfo emp) {
//		return template.query(Dbquerry.SAVE_EMP_INFO, (ResultSet rs) -> {
//			EmployeInfo employe = new EmployeInfo();
//			employe.setEmpId(rs.getInt(0));
//
//			return employe;
//		}, emp);

		template.update(Dbquerry.SAVE_EMP_INFO, emp.getEmpId(), emp.getName(), emp.getDepartment(), emp.getSalary(),
				emp.getContact(), emp.getLogin());
		return emp;
	}

//		
//		template.batchUpdate(Dbquerry.SAVE_EMP_INFO, new BatchPreparedStatementSetter() {
//
//	        @Override
//	        public void setValues(PreparedStatement ps, int i)
//	            throws SQLException {
//
//	        	EmployeInfo employee = empList.get(i);
//	            ps.setInt(1, employee.getEmpId());
//	            ps.setString(2, employee.getName());
//	            ps.setString(3, employee.getDepartment());
//	            ps.setDouble(4, employee.getSalary());
//	            ps.setInt(5, employee.getContact());
//	            ps.set
//
//	        }
//
//	        @Override
//	        public int getBatchSize() {
//	            return myPojoList.size();
//	        }
//	    });
//
//	}
//		
//	}
	@Override
	public EmployeInfo updateEmp(EmployeInfo emp) {
		template.update(Dbquerry.UPDATE_EMP_INFO, emp.getName(), emp.getEmpId());
		return emp;

	}

}
