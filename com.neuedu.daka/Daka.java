import java.util.Date;

public class Daka
{
    private Employee e;
    private Date checkin;
    private Date checkout;

    /**
     * @param checkin the checkin to set
     */
    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }
    /**
     * @param checkout the checkout to set
     */
    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }
    /**
     * @param e the e to set
     */
    public void setE(Employee e) {
        this.e = e;
    }
    /**
     * @return the checkin
     */
    public Date getCheckin() {
        return checkin;
    }
    /**
     * @return the checkout
     */
    public Date getCheckout() {
        return checkout;
    }
    /**
     * @return the e
     */
    public Employee getE() {
        return e;
    }
    

}