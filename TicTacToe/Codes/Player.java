package player;

public class Player {
    private String name;
    private char symbol;
    private String addr;
    private String phNo;
    private int age;

    public void  setPlayerDetails(String name,char symbol,String addr,String phNo,int age){
        this.name=name;
        this.symbol=symbol;
        this.addr=addr;
        this.phNo=phNo;
        this.age=age;
    }

    public void setPlayerNameAndSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public void changeSymbol(char symbol){
        this.symbol=symbol;
    }
    public void getPlayerNameAndSymbol(){
        System.out.println("name:"+this.name);
        System.out.println("symbol:"+this.symbol);
    }
    public void  getPlayerDetails(){
        System.out.println("player name:"+this.name);
        System.out.println("player symbol:"+this.symbol);
        System.out.println("player ph number:"+this.phNo);
        System.out.println("player address:"+this.addr);
        System.out.println("player age:"+this.age);
    }

    public String getPlayerName(){
        return this.name;
    }

    public char getPlayerSymbol(){
        return this.symbol;
    }

}
