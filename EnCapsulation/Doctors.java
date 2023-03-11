package EnCapsulation;
// import javax.sound.midi.SoundbankResource;
// import javax.sql.rowset.spi.SyncResolver;

class Doctor{
    private String name, id, hospital,phoneNo;
    public void setData( String name,String id,String hospital,String phoneNo)
    {
    this.name=name;
    this.id=id;
    this.hospital =hospital;
    this.phoneNo=phoneNo;
    }
    public String getName()
    {
        return this.name;
    }

    public String getID()
    {
        return this.id;
    }
    public void display(){
        System.out.println("Name="+name);
        System.out.println("id="+id);
        System.out.println("hospital="+hospital);
        System.out.println("phoneNo="+phoneNo);
    
    }
}


public class Doctors {                                                                                                                                                                                                                                                                                                  
    public static void main(String[] args)
   {
    Doctor D= new Doctor();
    D.setData( "shoaib"," 221-15-4955","tomok","1929284982");
    D.getName();
    D.getID();
    D.display();
    
   }
}
