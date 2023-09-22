public class Boss {
    private String health;
    private String name;
    private String domade;
    private  String protection;


    public void setProtection(String protection) {
        this.protection = protection;
    }

    public void setDomade(String domade) {
        this.domade = domade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getProtection() {
        return protection;
    }

    public String getDomade() {
        return domade;
    }



    public String getHealth() {
        return health;
    }
    public Boss(String name,String health, String domade, String protection){
        this.name=name;
        this.health=health;
        this.domade=domade;
        this.protection=protection;
    }
}
