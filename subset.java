public class subset
{
    public static void main(String[] args) 
    {
        String[] set = {"a", "b", "c"};
        generateSubsets(set, 0, new String[0]);
    }

    public static void generateSubsets(String[] set, int index, String[] currentSubset) 
    {

        if (index == set.length) {
            printSubset(currentSubset);
            return;
        }


        String[] newSubset = new String[currentSubset.length + 1];
        System.arraycopy(currentSubset, 0, newSubset, 0, currentSubset.length);
        newSubset[currentSubset.length] = set[index];
        generateSubsets(set, index + 1, newSubset);


        generateSubsets(set, index + 1, currentSubset);
    }

    public static void printSubset(String[] subset)
     {
        System.out.print("{");
        for (int i = 0; i < subset.length; i++) 
        {
            System.out.print(subset[i]);
            if (i < subset.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
