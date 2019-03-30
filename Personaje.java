public class Personaje{
    private String name;
    private int speed;
    private int width;
    private int height;
    private int keyup;
    private int keyfornt;

    public Personaje(String name, int speed, int width, int height){
        this.name = name;
        this.speed = speed;
        this.width = width;
        this.height = height;
        this.keyup = 0;
        this.keyfornt = 0;
    }

    public String getName(String names){
        return this.name;
    }
    public setName(String name){
        this.name =  name;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getWidth(){
        this.width;
    }
    public setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return this.height;
    }
    public setHeight(int height){
        this.height = height;
    }
    public setkeyUp(int up){
        this.keyup +=up;
    }
    public setkeydown(int down){
        this.keyup-=down;
    }
    public setKeyfornt(int front){
        this.keyfornt +=front;
    }
    public setKyeback(int back){
        this.keyfornt -=back;
    }
}