package cc.openhome;

public class Magician extends Role {
    @Override
    public void fight() {
        System.out.println("魔法攻擊");
    }
    
    public void cure() {
        System.out.println("魔法治療");
    }
}
