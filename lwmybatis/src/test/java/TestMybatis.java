import com.linkwe.bean.User;
import com.linkwe.mapper.UserMapper;
import com.linkwe.sqlsession.MySqlsession;

/**
 * @Author: zenglw
 * @Date: 2019-01-31
 */
public class TestMybatis {

    public static void main(String[] args) {
        MySqlsession sqlsession = new MySqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");
        System.out.println(user);
    }
}
