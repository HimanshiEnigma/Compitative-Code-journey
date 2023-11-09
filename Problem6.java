import java.util.*;



class Codechef {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        scan.nextLine(); 

        while (t-- > 0) {

            String x = scan.nextLine();

            String y = scan.nextLine();

            if (canMatch(x, y)) 

            {

                System.out.println("Yes");

            } else 

            {

                System.out.println("No");

            }

        }

        scan.close();

    }



    public static boolean canMatch(String x, String y) 

    {

        for (int i = 0; i < x.length(); i++) {

            if (x.charAt(i) != '?' && y.charAt(i) != '?' && x.charAt(i) != y.charAt(i)) 

            {

                return false;

            }

        }

        return true;

    }

}
