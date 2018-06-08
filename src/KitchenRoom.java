public class KitchenRoom extends Rooms {
    public String description(){
        return "You are in kitchen. You see bats. (you can (1) exit to north (2) exit to west.";
    }

    public Rooms next(char description){
        switch(description) {
            case '1':
                return new ParlorRoom();
            case '2':
                return new FrontRoom();
            case 'Q':
                System.exit(0);
        }
        return new KitchenRoom();
    }
}