import sun.security.util.Length;

public class Tabla{
    private String tablero[][]={{'B','B','B','B','M','M','M','M','M'},
                            {'B','B','B','B','M','L','L','L','M'},
                            {'B','B','B','B','M','L','L','L','M'},
                            {'B','B','M','M','M','L','L','L','M','M'},
                            {'B','B','M','L','L','L','L','L','L','M'},
                            {'M','M','M','L','M','L','M','M','L','M','B','B','B','M','M','M','M','M','M','M'},
                            {'M','L','L','L','M','L','M','M','L','M','M','M','M','M','L','L','L','L','L','M'},
                            {'M','L','L','L','L','L','L','L','L','L','L','L','L','L','L','L','L','L','L','M'},
                            {'M','M','M','M','M','L','M','M','M','L','M','L','M','M','L','L','L','L','L','M'},
                            {'B','B','B','B','M','L','L','L','L','L','M','M','M','M','M','M','M','M','M','M'},
                            {'M','B','B','B','M','M','M','M','M','M','M','B','B','B','B','B','B','B','B','B'}};
    public Tabla(){

    }

    public void imprimirTabla(){
        for(int i;i<tablero.length;i++){
            for(int j;j<tablero[i].length;j++){
                System.out.println(tablero[i][j]);
            }
        }
    }
    public int distanciaX(){
        return tablero.length;
    }
    public int distanciaY(int x){
        return tablero[x].length;
    }
}