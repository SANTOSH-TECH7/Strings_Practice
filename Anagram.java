class Anagram{
    public static void main(String[] args) {
        String s1="dog";
        String s2="odg";
        String str=s1.concat(s2);// checks whether the element is present or not
        if(str.contains(s2))
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}