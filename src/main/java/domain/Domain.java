package domain;

import entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jesus on 21.09.2017.
 */
public class Domain {

    public static void main(String [] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserRepository userRepository = context.getBean(UserRepository.class);

        User u1 = new User();
        u1.setId(1L);
        u1.setFirstName("Jesus");
        u1.setLastName("Raichuk");

        User u2 = new User();
        u2.setId(2L);
        u2.setFirstName("Sofia");
        u2.setLastName("Pikuza");

        User u3 = new User();
        u3.setId(3L);
        u3.setFirstName("Andriy");
        u3.setLastName("Jesus");

        User u4 = new User();
        u4.setId(4L);
        u4.setFirstName("Dima");
        u4.setLastName("Kozak");

        userRepository.save(u1);
        userRepository.save(u2);
        userRepository.save(u3);
        userRepository.save(u4);

        System.out.println(userRepository.findByFirstName("Jesus"));
        //System.out.println(userRepository.findByLastName("Jesus"));


    }
}
