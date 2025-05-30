package obj;

public class ObjectGeneral 
{
    protected String id;
    protected String name;

    public ObjectGeneral(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public void setId(String id) 
    {
        this.id = id;
    }
    public String getName() { return name; }
    public void setName(String name) 
    {
        this.name = name;
    }

    /*public ArrayList<Object> createObject(Object obj);

    public ArrayList<Object> deleteObject(Object obj);

    public ArrayList<Object> editObject(Object obj);

    public ArrayList<Object> readObject(Object obj);*/

}
