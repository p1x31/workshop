/**
 * Created by Vadim on 18/10/2015.
 */
public class MyArrayList {

        private String[] ArrayOfStrings;
        private int stored;
        private int size;

        public MyArrayList(String[] Strings, int size)
        {
        this.stored = stored;
        this.size = size;
        this.ArrayOfStrings = new String[10];
        }
  /*  public void add(String string){
        this.ArrayOfStrings.add(string);
    }*/
    public String get(int stored)
    {
        return this.ArrayOfStrings[stored];
    }
}
