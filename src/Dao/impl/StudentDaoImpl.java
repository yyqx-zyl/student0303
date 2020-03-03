package Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.StudentDao;
import entity.Students;
import utils.BaseDao;
/**
 * 提取实体类中的数据
 * @author Zylyyqx
 *
 */
public class StudentDaoImpl extends BaseDao implements StudentDao  {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	
	
	@Override
	public List<Students> ShowAll() {
		List<Students> list=new ArrayList<Students>();
		try {
			conn=getConnection();
			String sql="SELECT * FROM students";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while (rs.next()) {
				list.add(new Students(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			CloseAll(rs, pst, conn);
		}
		
		return list;
	}

}
