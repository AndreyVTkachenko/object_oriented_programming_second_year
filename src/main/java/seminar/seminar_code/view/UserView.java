package seminar.seminar_code.view;

import seminar.seminar_code.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
