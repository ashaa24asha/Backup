package SingletonExample.SingletonExample;

/**
 * Hello world!
 *
 */
public class ContactDAO 
{
	public ContactDAO(){
		
	}
	
	private static ContactDAO contactDAO = null;
	
	private static ContactDAO getInstance()
	{
		if(contactDAO == null)
		{
			contactDAO = new ContactDAO();
		}
		return contactDAO;

	}
	public void contactDetails()
	{
		System.out.println("Contact Details");
	}
    public static void main( String[] args )
    {
        ContactDAO obj1 = ContactDAO.getInstance();
        System.out.println(obj1);
        ContactDAO obj2 = ContactDAO.getInstance();
        System.out.println(obj2);
    }
}
