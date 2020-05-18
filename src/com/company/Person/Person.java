package JAVA2.src.com.company.Person;

import JAVA2.src.com.company.Transport.AirTransport;
import com.wmt.BeastOfPrey;

/**
 * @description:
 * @author: wj
 * @date: Created in 2020/4/3 15:13
 * @version: v1.0
 * @modified By:
 */

public class Person {
    private String id; //对象的唯一标识

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}
