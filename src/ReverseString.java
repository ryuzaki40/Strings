package src;
public class ReverseString
{
    public static String reverseIterative(String str)
    {
        StringBuilder reversed = new StringBuilder();
        for(int i=str.length()-1; i>=0;i--)
        {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverseRecursive(String str)
    {
        if(str.isEmpty()) return str;
        return reverseRecursive(str.substring(1))+ str.charAt(0);
    }
    public static void main(String args[])
    {
        String s= "Hello";
        System.out.println("Iterative: "+reverseIterative(s));
        System.out.println("Recursive: "+reverseRecursive(s));
    }
}