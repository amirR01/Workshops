// what if I say T extends Number in the SimpleGeneric class ?
public class SimpleGeneric<T> {
    private T obj;
    public SimpleGeneric(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }
}
