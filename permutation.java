public class permutation
{

    private static void permute(String str, String perm, boolean[] used) 
    {
        if (perm.length() == str.length()) 
        {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) 
        {
            if (!used[i]) {
                used[i] = true;
                permute(str, perm + str.charAt(i), used);
                used[i] = false; 
            }
        }
    }

    public static void main(String[] args) 
    {
        String str = "ABCDEF";
        boolean[] used = new boolean[str.length()];
        permute(str, "", used);
    }
}

