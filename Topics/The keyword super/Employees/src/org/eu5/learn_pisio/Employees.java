package org.eu5.learn_pisio;

class Employees {
    
    // write fields
    protected String name;
    protected String email;
    protected int experience;
    
    // write constructor
    public Employees(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }
    
    // write getters
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getExperience() {
        return experience;
    }
}

class Developer extends Employees {
    
    // write fields
    protected String mainLanguage;
    protected String[] skills;
    
    // write constructor
    public Developer(String name, String email, int experience,
                     String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills.clone();
    }
    
    // write getters
    public String getMainLanguage() {
        return mainLanguage;
    }
    
    public String[] getSkills() {
        return skills.clone();
    }
}

class DataAnalyst extends Employees {
    
    // write fields
    protected boolean phd;
    protected String[] methods;
    
    // write constructor
    public DataAnalyst(String name, String email, int experience,
                       boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods.clone();
    }
    
    // write getters
    public boolean isPhd() {
        return phd;
    }
    
    public String[] getMethods() {
        return methods.clone();
    }
    /*
    public static void main(String[] args) {
        String[] skills = {"git", "Scala", "JBoss", "UML"};
        Developer developer = new Developer("Mary", "mary@mail.com", 3,
                "Java", skills);
    
        String[] methods = {"neural networks", "decision tree", "bayesian algorithms"};
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2,
                true, methods);
        
        developer.email = "dragan@mail.com";
        System.out.println(developer.getEmail());
    }
    */
}
