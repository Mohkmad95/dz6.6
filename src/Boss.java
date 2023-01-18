public class Boss  extends  GameEntitiy {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon; //
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printinfo(){
        return " Health: " + getHealth() + " Damage: " + getDamage() + " WeaponType: " + weapon.getWeaponType() +
                " Weapon Name:" + weapon.getWeaponName();

    }
}
