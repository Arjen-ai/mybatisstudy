import edu.xalead.dao.UserMapper;
import edu.xalead.pojo.User;
import edu.xalead.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("-----------------------");

        mapper.updateUser(new User(2,"admin","121212"));
        sqlSession.close();
    }
}
