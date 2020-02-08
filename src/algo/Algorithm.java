package algo;

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
