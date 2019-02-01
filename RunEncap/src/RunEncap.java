public class RunEncap
{
    public static void main(String[] args)
    {
    	EncapTest encap = new EncapTest();

    	encap.setName("Kobe");
    	encap.setAge(24);
    	encap.setIdNum ("12343ms");

    	System.out.println("Name: " + encap.getName() + "\nAge: " + encap.getAge() + "\nID Number: " + encap.getIdNum());
    }
}
