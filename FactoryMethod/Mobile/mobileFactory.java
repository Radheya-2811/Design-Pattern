public class mobileFactory {
   public Mobile creatMobile(String companyName){
        if(companyName==null || companyName.isEmpty()) return null;
        else if(companyName.equals("IPHONE")) return new Iphone();
        else if(companyName.equals("Samsung")) return new samsung();
        else if(companyName.equals("OnePlus")) return new onePlus();
        else return null;
   }
   
}
