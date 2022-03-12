public class Book implements Comparable<Book>{

    private String name;
    private int pageNumber;
    private String authorName;
    private int date;
    
    public Book(String name, int pageNumber, String authorName, int date) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        return this.getName().compareTo(o.getName()); //***
    }


}