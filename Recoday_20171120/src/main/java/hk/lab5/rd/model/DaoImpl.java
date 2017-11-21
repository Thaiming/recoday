package hk.lab5.rd.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hk.lab5.rd.dtos.PageDto;

@Repository
public class DaoImpl implements IDao {

	private final String NAMESPACE = "hk.lab5.rd.";
	
	@Autowired
	private SqlSessionTemplate sqlSession;  
	
	@Override
	public List<PageDto> selectPageList() {
		return sqlSession.selectList(NAMESPACE+"selectPageList");

	}

}
