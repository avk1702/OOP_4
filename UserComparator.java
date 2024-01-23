package OOP_4;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T user1, T user2) {
        int resultOfComparing = user1.getFirstName().compareTo(user2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = user1.getLastName().compareTo(user2.getLastName());
            if (resultOfComparing == 0) {
                return user1.getMiddleName().compareTo(user2.getMiddleName());

           
        } else {
            return resultOfComparing;
        } 
        
        
      } else {
        return resultOfComparing;
      }

    }
}