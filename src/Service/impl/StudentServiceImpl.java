package Service.impl;

import java.util.List;

import Dao.StudentDao;
import Dao.impl.StudentDaoImpl;
import Service.StudentService;
import entity.Students;

public class StudentServiceImpl implements StudentService {
	StudentDao dao=new StudentDaoImpl();
	
	@Override
	public List<Students> ShowAll() {
		List<Students> list=dao.ShowAll();
		if (list!=null) {
			return dao.ShowAll();
		}
		else {
			return null;
		}
	}

}
