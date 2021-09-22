package service.impl;

import pojo.UserAddress;
import service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1,"北京市昌平区科技园3楼","1","李老师","010-123123","Y");
        UserAddress userAddress2 = new UserAddress(2,"深圳市宝安区硅谷大厦2楼","1","赵老师","010-123456","N");

        return Arrays.asList(userAddress1,userAddress2);
    }
}
