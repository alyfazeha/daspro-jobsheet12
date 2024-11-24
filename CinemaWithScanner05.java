import java.util.Scanner;

public class CinemaWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, next;
        int row, column;
        String[][] audience = new String[4][2];
        int menu;

        System.out.println("Menu : \n 1. Input audience data \n 2. Show audience list \n 3. Exit");
        while (true) {
            System.out.print("What do you want to do? ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Enter a name : ");
                        name = sc.nextLine();
                        System.out.print("Enter row number : ");
                        row = sc.nextInt();
                        System.out.print("Enter column number : ");
                        column = sc.nextInt();
                        sc.nextLine();
                        
                        if (audience[row-1][column-1] != null){
                            System.out.println("This place is not available, you can take another place");
                        } else {
                            audience[row-1][column-1] = name;
                        }
                        
                        System.out.print("Are there any other audiences to be added? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }    
                    }
                    break;
                case 2:
                    for(int i=0; i<audience.length; i++){
                        for(int j=0; j<audience[i].length; j++){
                            if (audience[i][j] == null) {
                                System.out.print("***" + "\t");
                            } else {
                                System.out.print(audience[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                default:
                    break;
            }
            if (menu==3) {
                break;
            }
        }
    }
}
