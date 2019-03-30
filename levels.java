public class levels {
    private int levelActual;
    private int levels;

    public levels(){
        this.levelActual = 1;
        this.levels = 10;
    }
    public void upLevel(){
        this.levelActual += 1;
    }

    public void getLevel(){
        return this.levelActual;
    }
}