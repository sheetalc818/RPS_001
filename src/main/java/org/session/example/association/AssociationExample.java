package org.session.example.association;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("ABCD");

        Mobile mobileNo = new Mobile();
        mobileNo.setMobileNo("234567");
        //mobileNo.setMobileName("samsung");

        Mobile mobileNo1 = new Mobile();
        mobileNo1.setMobileNo("5673785");
       // mobileNo.setMobileName("vivo");

        List<Mobile> noList = new ArrayList<Mobile>();
        noList.add(mobileNo);
        noList.add(mobileNo1);
        person.setNumbers(noList);
        System.out.println(person.getName() + " is having the mobile no as : "+person.getNumbers());
    }
}
