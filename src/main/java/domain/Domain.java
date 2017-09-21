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

        System.out.println(userRepository.findByFirstName("Jesus"));
        System.out.println(userRepository.findByLastName("Jesus"));
        System.out.println(userRepository.findByFirstNameOrLastName("Jesus", "Pikuza"));


    }
}
