import java.lang.reflect.Type;

public class ObjectHolder {
    private Object obj;
    private Type type;
    public ObjectHolder(Object obj , Type type) {
        this.obj = obj;
        this.type = type;
    }
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        this.obj = obj;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
