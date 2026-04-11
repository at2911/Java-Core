public class wrapperCaching {
    public static void main(String[] args) {
        int x=100;
        int y=100;
        System.out.println(x==y); //true, because x and y are primitive types, and they are compared by their values, so since both x and y have the value 100, the expression x==y will evaluate to true
        Integer a=200;
        Integer b=200;
        System.out.println(a==b); //false, because a and b are wrapper class objects, and they are compared by their references, so since a and b are two different objects in memory, the expression a==b will evaluate to false, even though they have the same value 200, because they are different objects in memory, so they have different references, and when we compare them using == operator, it compares their references, not their values, so it will return false
        System.out.println(a.intValue()==b.intValue()); 
        System.out.println(a.equals(b));     //true, because the equals() method of the Integer class compares the values of the objects, so since a and b have the same value 200, the expression a.equals(b) will evaluate to true, because it compares the values of a and b, not their references, so it will return true
        Integer c=100;
        Integer d=100;
        System.out.println(c==d); //true, because of integer caching, the Integer class caches the values from -128 to 127, so when we create an Integer object with a value in that range, it will return the same object from the cache, so in this case, since c and d are both assigned the value 100, which is in the range of -128 to 127, they will both refer to the same object in memory, so the expression c==d will evaluate to true, because they have the same reference, and they are the same object in memory, so it will return true
      
    }
} 
