public class Dad {
    private String name ;
    private  String ID;
    protected String Job;
    public String dadName;
    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public void  SetID(String ID){
        this.ID= ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

   public  Dad(){}

    public Dad(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void SetName (String name){
        this.name=name;
    }
}
