public class chessboard
{
    public static void main(String[] args)
    {
        int size=8;
        for(int i=0;i<size;i++) {
            System.out.print("\n");

            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" w ");
                } else {
                    System.out.print(" b ");
                }
            }
        }
    }
}