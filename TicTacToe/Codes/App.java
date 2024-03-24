import board.Board;
import player.Player;
import java.util.Scanner;
import game.Game;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First project -> tictactoe");
        Scanner scn=new Scanner(System.in);
        System.out.println("enter board size");
        int size=scn.nextInt();
        Board b=new Board(size,'-');
       

        Player p1=new Player();
        
        //System.out.println("enter the symbol:");
        //char symbol=scn.nextLine().charAt(0);
        p1.setPlayerNameAndSymbol("p1", 'X');
        p1.getPlayerNameAndSymbol();

        Player p2=new Player();
        //System.out.println("enter player 2 name and symbol");
        //String name1=scn.nextLine();
        //System.out.println("enter the symbol:");
        //char symbol1=scn.nextLine().charAt(0);
        p2.setPlayerNameAndSymbol("p2",'O');
        p2.getPlayerNameAndSymbol();
       
        Game game=new Game(new Player[] {p1,p2}, b);
        game.play();

    }
}
