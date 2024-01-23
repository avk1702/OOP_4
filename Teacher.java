package OOP_4;



public class Teacher extends User implements Comparable <Teacher> {

    private Long teacherid;
    
    
    public Long getTeacherid() {
        return teacherid;
    }
        

    @Override
    public int compareTo(Teacher o) {
        return this.teacherid.compareTo(o.teacherid);
    }
    
}



