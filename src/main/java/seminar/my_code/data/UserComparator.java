package seminar.my_code.data;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T u1, T u2) {
        int firstNameComparison = u1.getFirstName().compareTo(u2.getFirstName());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return u1.getLastName().compareTo(u2.getLastName());
    }
}

