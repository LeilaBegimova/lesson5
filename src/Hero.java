public class Hero {
    private String name;
    private String health;
    private String domage;
    private String superpower;


    public String getName() {
        return name ="LEVI";
    }



    public String getSuperpower() {
        return superpower="Способность Magec";
    }

    public String getDomage() {
        return domage="Урон 50 ";
    }

    public String getHealth() {

        return health="Здоровье 100";
    }

    public Hero( String name, String health, String domage, String superpower){
        this.name = name;
        this. health =health;
        this.domage =domage;
        this.superpower=superpower;

    }
    public Hero(String health, String domage){
        this.health = health;
        this.domage = domage;
    }




}
