package service;

import pojo.UserAddress;

import java.util.List;

/**
 * 用户服务
 */
public interface UserService {
    /**
     * 按照用户id返回收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
