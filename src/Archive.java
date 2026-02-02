import java.lang.reflect.Array;
import java.util.Arrays;

public class Archive<T>{
    private T[] elements;
    private int cardinality;
    private int dl;

    public Archive(int cardinality){
        this.cardinality = cardinality;
        this.dl = 0;
        this.elements = (T[]) new Object[cardinality];

    }

    public T getByIndex(int index) throws Exception{
        if (index < 0 || index > cardinality){
            throw new Exception("Bad index");
        }else {
            return elements[index];
        }
    }

    public void add(T element) throws Exception{
        if (dl < cardinality){
            elements[dl] = element;
            dl++;
        } else {
            throw new Exception("The archive is full");
        }
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < elements.length; i++){
            str += elements[i] + "\n";
        }

        return str;
    }
}
