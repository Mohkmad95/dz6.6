public class Weapon {
    private WeaponType weaponType;// Название оружие
    private String weaponName;// Холодное ор
    public WeaponType getWeaponType(){
        return weaponType;
    }
    public void setWeaponType(WeaponType weaponType){
        this.weaponType = weaponType;
    }
    public String getWeaponName(){
        return weaponName;
    }
    public void setWeaponName(String weaponName){
        this.weaponName = weaponName;
    }
}
