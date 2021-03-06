public class FoyerRoom extends Rooms {
    public String description(){
        return "You are standing in the foyer of an old house. You see a dead scorpion. {You can (1)exit to the north or press Q to quit}";
    }

    public Rooms next(char description){
        switch(description) {
            case '1':
                return new FrontRoom();
        }
        return new FoyerRoom();
    }

    public double Money(){
        return 9800.00;
    }
    public String items(){
        return "Dead Scorpion";
    }
}
