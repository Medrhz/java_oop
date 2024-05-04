package PhoneCompany;

import java.util.ArrayList;

public class Plan {
    private  String name;
    private String code;
    private float monthlyFee;
    private float costPerMinute;
    private ArrayList<Contract> contracts;

    public Plan (String name, String code, float monthlyFee, float costPerMinute) {
        this.contracts = new ArrayList<>();
        this.name = name;
        this.code = code;
        this.monthlyFee = monthlyFee;
        this.costPerMinute = costPerMinute;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getCode () {
        return code;
    }

    public void setCode (String code) {
        this.code = code;
    }

    public float getMonthlyFee () {
        return monthlyFee;
    }

    public void setMonthlyFee (float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public float getCostPerMinute () {
        return costPerMinute;
    }

    public void setCostPerMinute (float costPerMinute) {
        this.costPerMinute = costPerMinute;
    }

    public ArrayList<Contract> getContracts () {
        return contracts;
    }

    public void setContracts (ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }
    public void addContract(Contract contract){
        this.contracts.add(contract);
    }

    @Override
    public String toString () {
        //TODO please update
        String result =  "- name='" + name + '\'' + "\n- code=" + code + "\n- monthlyFee=" + monthlyFee + "\n- costPerMinute=" + costPerMinute +" "+(contracts.isEmpty() ?"any contract in this plan" :  "\n- contracts = "+contracts.size());
        for(Contract contract:contracts)result += "\n- "+contract.getTelephoneNumber();
        return  result;
    }
}
