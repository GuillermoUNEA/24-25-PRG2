class Board {

    private char[][] places;

    public Board(){
        
        places=new char[3][3];

        for(int i=0;i<places.length,i++){
            for (int j=0;j<places`[i].length;j++) {
                places[i][j]="_";

            }
        }       
    }

    public void show() {
        cleanScreen();
        for(int i=0;i<places.length,i++){
            for (int j=0;j<places[i].length;j++) {
                System.out.println(places[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isFull(Player player) {
        int countPieces=0;
        for (int i=0;i<places.length;i++) {
            for (int j=0; j<places[i].length; j++) {
                if(places[i][j]==player.color){
                    countPieces=countPieces+1;
                }
            }
        }
        return countPieces==3;
    }

    public boolean theresAWin() {
        return this.theresAWin("x")||this.theresAWin("o")
        int rows
    }

    private boolean theresAWin(char color){
        int[] lines=new int[3];
        int[] rows=new int[3];
        int diagonal=0;
        int otherDiagonal=0;
                for (int i=0;i<places.length;i++) {
            for (int j=0; j<places[i].length; j++) {
                rows=rows+1;
                lines=lines+1;
                diagonal=diagonal+((i=j)?1:0);
                otherDiagonal=otherDiagonal+((i+j=2)?1:0);
                if(lines=3||rows=3||diagonal=3||otherDiagonal=3){
                    return true;
                }
            }
        }

    }
    return false; 

}
