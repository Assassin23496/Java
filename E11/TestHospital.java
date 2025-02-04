package E11;

public class TestHospital {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("A",1.2);
        Hospital hospital2 = new Hospital("B",2.2);
        Hospital hospital3 = new Hospital("C",3.2);
        Hospital hospital4 = new Hospital("D",4.2);
        Hospital hospital5 = new Hospital("E",5.2);
        Clinic clinic = new Clinic("a",10.0,10.0);
        Clinic clinic1 = new Clinic("b",20.0,10.0);
        Clinic clinic2 = new Clinic("c",30.0,10.0);
        Clinic clinic3 = new Clinic("d",40.0,10.0);
        Clinic clinic4 = new Clinic("e",50.0,10.0);
        System.out.println(hospital1.equals(clinic));
        System.out.println(clinic1.hashCode());
    }
}
