class Board {

    private char[][] places;

    public Board(){
        for(int i=0;i<places.length,i++){
            for (int j=0;j<places.length;j++) {
                places[i][j]=0;
                // aqui falta
            }
        }       
    }

    public void show() {
        places=new char[3][3];
        for(int i=0;i<places.length,i++){
            for (int j=0;j<places.length;j++) {
                System.out.println(places[i][j]);
            }
        }

    }

    public boolean isFull(Player player) {
        int 
        // aqui cambia las variables entre casillas y fichas pe
    }

    public boolean theresAWin() {
        int rows
    }


}
