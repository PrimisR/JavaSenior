public class Message
{
    private int code;
    private String name;
    private String to;
    private String message;
    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }
    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }

}