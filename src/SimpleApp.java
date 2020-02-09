public class SimpleApp
{
    long runtime = 0;

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
	    return "Name: " + name;
    }

    public long getRuntime()
    {
        return runtime;
    }

    public void setRuntime( long runtime )
    {
        this.runtime = runtime;
    }
}
