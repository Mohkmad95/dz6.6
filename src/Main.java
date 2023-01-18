public class Main {
     public static void main(String[] args){
         Boss boss  = new Boss();
         boss.setHealth(1000);
         boss.setDamage(246);

         boss.weapon.setWeaponType(WeaponType.GUNSHOT);
         boss.weapon.setWeaponName("Боец");
         System.out.println(" Health: " + boss.getHealth() + " Damage: " + boss.getDamage() +
                 "WeaponType:" + boss.weapon.getWeaponType() + " Weapon: " + boss.weapon.getWeaponName());

         System.out.println(boss.printinfo());
           Skeleton skeleton = new Skeleton();
           skeleton.setHealth(100);
           skeleton.setDamage(53);
            skeleton.weapon.setWeaponType(WeaponType.LASER_WEAPON);

            skeleton.weapon.setWeaponName("Луч");
         System.out.println(" Health: " + skeleton.getHealth() + " Damage: " + skeleton.getDamage()
               + " WeaponTYPE: " + skeleton.weapon.getWeaponType() + " WeaponName: " +
                 skeleton.weapon.getWeaponName());

         Skeleton skeleton2 = new Skeleton();
           skeleton2.setHealth(120);
           skeleton2.setDamage(34);
           skeleton2.weapon.setWeaponType(WeaponType.LASER_WEAPON);
           skeleton2.weapon.setWeaponName("Звезда");
         System.out.println(" Health; " + skeleton2.getHealth() + "Damage: "
                 + skeleton2.getDamage() +" WeaponTYPE:" + skeleton2.weapon.getWeaponType() + " Weapon Name:"
                 + skeleton2.weapon.getWeaponName()); 

            }
     }

