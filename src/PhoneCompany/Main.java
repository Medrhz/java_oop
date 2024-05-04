package PhoneCompany;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main (String[] args) {
           Plan p1 = new Plan("plan speak More","p101",500,2);
           Plan p2 = new Plan("More less","p201",450,0.5f);

           Client client1 = new Client("Mohamed","sale",101);
           Client client2 = new Client("fati","agadir",102);

           GregorianCalendar calendar1 = new GregorianCalendar(2023,0,5);
           Date startDay1 = calendar1.getTime();
           GregorianCalendar calendar2 = new GregorianCalendar(2023,0,5);
           Date startDay2 = calendar2.getTime();

           Contract contract1 = new Contract("0666606056",startDay1,client1,p1);
           Contract contract2 = new Contract("0665432134",startDay2,client2,p2);



          client1.addSubscriptionContract(contract1);
          client1.addSubscriptionContract(contract2);
          client2.addSubscriptionContract(contract2);


          p1.addContract(contract1);
          p2.addContract(contract2);

          contract2.setPlan(p1);
          contract2.setPlan(p2);

        System.out.println(client1);
        System.out.println("====================");
        System.out.println(client2);
        System.out.println("====================");
        System.out.println(contract1);
        System.out.println("====================");
        System.out.println(contract2);
        System.out.println("====================");
        System.out.println(p1);
        System.out.println("====================");
        System.out.println(p2);


    }
}
