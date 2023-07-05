public class DefangingIP {
    public static void main(String args[]){
        String address = "1.1.1.1";
        System.out.println(DefangingIP.defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }
}
