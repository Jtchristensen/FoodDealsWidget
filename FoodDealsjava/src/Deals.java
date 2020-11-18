
public class Deals {
    String Name;
    Location Location;
    Double Distance;
    public Deals (String name, String lat , String lon){
        this.Name = name;
        this.Location = new Location(name,Double.parseDouble(lat),Double.parseDouble(lon));
    }
    public void setDistance(Location l){
        this.Distance = this.Location.distanceTo(l);
    }


}

