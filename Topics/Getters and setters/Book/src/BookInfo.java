class BookInfo {
    
    private String title;
    private int yearOfPublishing;
    private String[] authors;
    
    /*
    public Book() {
        this.title = "Title";
        this.yearOfPublishing = 0;
        this.authors = new String[] {"Author1", "Author2"};
    }
    */
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    
    public String[] getAuthors() { // 2 code style errors
        //return authors; // Returning 'authors' may expose an internal array.
        return authors.clone();
    }
    
    public void setAuthors(String[] authors) { // 2 code style errors
        //this.authors = authors; // The user-supplied array 'authors' is stored directly.
        this.authors = authors.clone();
    }
    /*
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Advanced Java Programming");
        book.setAuthors(new String[] {"Dragan Cajic", "Драган Ћајић"});
        book.setYearOfPublishing(2021);
    }
    */
}
