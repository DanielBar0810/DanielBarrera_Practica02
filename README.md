# DanielBarrera_Practica02

package poo_práctica02;

/*
Primero se crea la clase personaje, y ya creada en este primer apartado se definen los atributos.
*/
public class personaje {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private double ta;
    
    /*
    Esta segunda parte del codigo utilizamos el metodo constructor para crear un objeto, en este caso un personaje
    a partir de la clase personaje ya creada.
    */
    public personaje()
    {
        this.setName("Fighter_1");
        this.setHealth(100);
        this.setAttack(40);
        this.setDefense(60);
    }
    
    /*
    Este apartado es para realizar la encapsulación
    */
    
    public void setName(String _name_){
    this.name = _name_;
    }
    
    public String getName(){
    return this.name;
    }
    
    public void setHealth(int _health_){
        this.health = _health_;
    }
    
    public int getHealth(){
        return this.health;
    }
    
    public void setAttack(int _attack_) {
        this.attack = _attack_;
    }
    
    public int getAttack(){
        return this.attack;
    }
    
    public void setDefense(int _defense_){
        this.defense = _defense_;
    }
    
    public int getDefense(){
        return this.defense;
    }
    
    public void setTa(double _ta_){
        this.ta = _ta_;
    }
    
    public double getTa(){
        return this.ta;
    }
    
    /*
    Finalmente en este apartado se crean los distintos metodos del personaje, en los que tenemos el ser atacado y
    el metodo de esquivar, que también incluye un bool para determinar si este sigue con vida o no. 
    Finalizando así el codigo.
    */
    
    public void attacked (int _ataque)
	{
	int danho = _ataque-this.defense;
	int vidaRestante=this.health;
	if(danho>0){
	vidaRestante-=danho;
	System.out.println(this.name+"Golpe supereficaz, menos "+danho+" puntos de vida");
	}else {
	System.out.println(this.name+"Golpe recibido nada eficaz");
	}
	this.health= vidaRestante;
	System.out.println(this.name+" contiene "+this.health+" puntos de vida restante.");
	}
    
    public void Esquivar()
	{
	System.out.println(this.name+"¡Lo ha esquivado!");
	}
    
    public boolean alive()
    {
        boolean life = true;
        
        if(this.getHealth()<=0) life = false;
        
        return life;
    }
    
}
