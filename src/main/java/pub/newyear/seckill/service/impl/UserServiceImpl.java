package pub.newyear.seckill.service.impl;

import pub.newyear.seckill.pojo.User;
import pub.newyear.seckill.mapper.UserMapper;
import pub.newyear.seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author newyear
 * @since 2021-08-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
