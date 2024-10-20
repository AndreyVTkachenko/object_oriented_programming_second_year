package seminar.my_code.controller;

import seminar.my_code.data.User;

public interface UserController<T extends User> {
    void create(T user);
}

