class GettingFullName {
    private String firstName;
    private String lastName;
    
    public GettingFullName() {
        this.firstName = "";
        this.lastName = "";
    }
    
    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }
    
    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }
    
    public String getFullName() {
        String fullName = "";
        
        if (firstName != null && !firstName.isEmpty()) {
            if (lastName != null && !lastName.isEmpty()) {
                fullName = firstName + " " + lastName;
            } else {
                fullName = firstName;
            }
        }
        
        if (firstName == null || firstName.isEmpty()) {
            if (lastName == null || lastName.isEmpty()) {
                fullName = "Unknown";
            } else {
                fullName = lastName;
            }
        }
        return fullName; // write your code here
    }
    /*
    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName()); // Tim Towler
    
        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName()); // Katie (without additional spaces)
    }
    */
}
