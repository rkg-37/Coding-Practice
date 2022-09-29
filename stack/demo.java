public class demo{
    public static void main(String[] args){
        int pow_set_size = 8;
        int set_size = 3;
        for(int counter = 0; counter < pow_set_size; counter++)
        {
            for(int j = 0; j < set_size; j++)
            {
                System.out.print(counter & (1 << j));
            }            
            System.out.println();
        }
    }
}