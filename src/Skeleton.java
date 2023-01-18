public class Skeleton extends Boss {
    public  int shot;
    public int getShot(){
        return shot;
    }
    public void setShot(int shot){
        this.shot = shot;
    }
    @Override
    public String printinfo(){
        return super.printinfo() + " Number of arrows: " + shot;

    }

}




