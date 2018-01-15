package hht.dragon.mapper;

import hht.dragon.entity.User;
import hht.dragon.entity.UserWithBLOBs;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    UserWithBLOBs selectByPrimaryKey(String userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}