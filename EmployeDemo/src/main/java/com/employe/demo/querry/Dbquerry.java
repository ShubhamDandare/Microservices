package com.employe.demo.querry;

public class Dbquerry {
	public static final String SAVE_EMP_INFO = "insert into employeinfo(empId,name,department,salary,contact,login) values(?,?,?,?,?,?)";
	public static final String UPDATE_EMP_INFO ="update employeinfo set name=? where empId=? ";
	public static final String GET_EMP_INFO_BY_ID ="select * from employeinfo where empId=?";
	public static final String DELETE_EMP_INFO_BY_ID ="delete from employeinfo where empId=?";
	public static final String GET_ALL_EMP_INFO ="select * from employeinfo";
}
