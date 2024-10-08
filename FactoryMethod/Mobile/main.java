public class main {
    public static void main(String[] args) {
        mobileFactory mb=new mobileFactory();
        Mobile mobile=mb.creatMobile("IPHONE");
        mobile.createMobile();

        Mobile mobile2=mb.creatMobile("Samsung");
        mobile2.createMobile();

        Mobile mobile3=mb.creatMobile("onePlus");
        mobile3.createMobile();
        
    }
}
