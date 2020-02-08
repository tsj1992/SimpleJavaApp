public class SimpleApp
{
    private static String name = null;

    public static void main( String[] args )
    {
        System.out.println( "Hello There" );
    }

    public static String getName()
    {
        return name;
    }

    public static void setName( String name )
    {
        SimpleApp.name = name;
    }

    public String toString()
    {
	System.out.println( "Name: " + name );
    }
}
