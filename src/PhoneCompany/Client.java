package PhoneCompany;

import java.util.ArrayList;

public class Client {
    private  String name;
    private String address;
    private  int id;
    private ArrayList<Contract> subscriptionContracts;

    public Client (String name, String address, int id) {
        this.subscriptionContracts = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public ArrayList<Contract> getSubscriptionContracts () {
        return subscriptionContracts;
    }

    public void setSubscriptionContracts (ArrayList<Contract> contracts) {
        this.subscriptionContracts = contracts;
    }
    public void addSubscriptionContract(Contract contract){
        this.subscriptionContracts.add(contract);
    }

    @Override
    public String toString () {
        //TODO please update
        String result = "- name :'" + name + '\'' + "\n- address: '" + address + '\'' + "\n- id=" + id + "\n- contracts :" ;
        for(Contract contract:subscriptionContracts) result +="\n- Start : "+contract.getStartDate() + " | =>"+contract.getTelephoneNumber() +"  ";

        return  result;
    }
}
