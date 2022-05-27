package cn.aopanno.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public double add(int a, int b) {
        return a / b;
    }
}
