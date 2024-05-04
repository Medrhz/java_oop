package PhoneCompany;

import java.util.Date;

public class Contract {
    private String telephoneNumber;
    private  Date StartDate;
    private Client client;
    private Plan plan;


    public Contract (String telephoneNumber,Date startDate,Client client,Plan plan) {
        this.telephoneNumber = telephoneNumber;
        this.StartDate = startDate;
        this.client = client;
        this.plan = plan;
    }

    public String getTelephoneNumber () {
        return telephoneNumber;
    }

    public void setTelephoneNumber (String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Date getStartDate () {
        return StartDate;
    }

    public void setStartDate (Date startDate) {
        StartDate = startDate;
    }

    public Client getClient () {
        return client;
    }

    public void setClient (Client client) {
        this.client = client;
    }

    public Plan getPlan () {
        return plan;
    }

    public void setPlan (Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString () {
        return "Contract{" + "telephoneNumber='" + telephoneNumber + '\'' + "\n- StartDate=" + StartDate + "\n- client=" + client.getName() + "\n- plan=" + plan.getName() + '}';
    }
}
