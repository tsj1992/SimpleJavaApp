package algo;

/**
 * Generic Algorithm class which encapsulate basic information regarding an algorithm
 * @param <T>
 */
public abstract class Algorithm<T>
{
    private T data;
    private boolean cloneData;

    public abstract void setData( T data );

    public boolean isCloneData()
    {
        return cloneData;
    }

    public void setCloneData( boolean cloneData )
    {
        this.cloneData = cloneData;
    }
}
