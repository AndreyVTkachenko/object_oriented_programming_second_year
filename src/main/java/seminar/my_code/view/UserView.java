package seminar.my_code.view;

import seminar.my_code.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> students);
}

