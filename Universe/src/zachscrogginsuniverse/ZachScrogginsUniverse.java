// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 05/06/2020

/*
 * Modify the existing program to expand the current universe. A. Add one Star called Sun B. Two
 * planets called Earth (name="Blue Planet") with one moon (called blueMoon), and Mars
 * (name="Red Planet") with two moons (Deimus and Phobos). C. Research the size of each
 * CelestialObject and its distance from the sun (for planets) and the distance of the moons from
 * the planets D. Calculate the distance between any two CelestialObject (e.g. between 2 planets and
 * or between two moons 1. Follow the naming patterns used by DBPM for all classes 2. Comments
 * "**MODIFICATION NEEDED**" will indicate if additional coding is required
 */
package zachscrogginsuniverse;

import java.util.ArrayList;

// NO CHANGES REQUIRED FOR THIS CLASS
// CelestialObject is a fully DBPM implemented class with an abstract method:
// a default constructor, overloaded constructors, setters and getters
abstract class CelestialObject {
    private String name; // name attribute
    private double size; // size attribute
    private long distance; // distance attribute

    public CelestialObject() {
        this.name = "";
        this.size = 0.0;
        this.distance = 0;
    } // default constructor

    public CelestialObject(String name) {
        this.name = name;
        this.size = 0.0;
        this.distance = 0;
    } // overloaded constructor name

    public CelestialObject(double size) {
        this.name = "";
        this.size = size;
        this.distance = 0;
    } // overloaded constructor size

    public CelestialObject(int distance) {
        this.name = "";
        this.size = 0.0;
        this.distance = distance;
    } // overloaded constructor distance

    public CelestialObject(String name, double size, int distance) {
        this.name = name;
        this.size = size;
        this.distance = distance;
    } // overloaded constructor name,sizedistancer

    public void setName(String name) {
        this.name = name;
    } // setter method name

    public void setSize(double size) {
        this.size = size;
    } // setter method size

    public void setDistance(long distance) {
        this.distance = distance;
    } // setter method distance

    public String getName() {
        return this.name;
    } // getter method name

    public double getSize() {
        return this.size;
    } // getter method size

    public long getDistance() {
        return this.distance;
    } // getter method distance

    abstract public double calculateDistanceBetweenCelestialObject(CelestialObject otherObj);// abstract
                                                                                             // method
}


// **MODIFICATION NEEDED**
// write the concrete method for calculateDistanceBetweenCelestialObject()
// Star Class
class Star extends CelestialObject {
    public double calculateDistanceBetweenCelestialObject(CelestialObject otherStar) {
        return this.getDistance() - otherStar.getDistance();
    }
}


// **MODIFICATION NEEDED**
// write the concrete method for calculateDistanceBetweenCelestialObject()
// Moon Class
class Moon extends CelestialObject {
    public double calculateDistanceBetweenCelestialObject(CelestialObject otherMoon) {
        return this.getDistance() - otherMoon.getDistance();
    }
}


// NO CHANGES REQUIRED:
// Planet Class
class Planet extends CelestialObject {
    private ArrayList<Moon> moon = new ArrayList<Moon>(); // moon attribute

    public Planet() {
    } // default constructor

    public Planet(Moon moon) {
        this.moon.add(moon);
    } // adding a moon the the planet

    public Planet(ArrayList<Moon> moon) {
        this.moon = moon;
    } // adding an array of moons the the planet

    public void setMoon(Moon moon) {
        this.moon.add(moon);
    } // adding a moon the the planet

    public void setMoon(ArrayList<Moon> moon) {
        this.moon = moon;
    } // adding an array of moons the the planet

    public ArrayList<Moon> getMoon() {
        return this.moon;
    } // get the array of moons

    public Moon getMoon(int position) {
        return this.moon.get(position);
    } // get an individual moon

    public double calculateDistanceBetweenCelestialObject(CelestialObject otherPlanet) {
        return this.getDistance() - otherPlanet.getDistance();
    }
}


// **MODIFICATION NEEDED**
// Use the DBPM format to complete the class.
// Review the Planet class for the moon attribute as an example to follow.
// For the planet attribute:
// Create 2 overloaded constuctors, two setters, two getters
class SolarSystem {
    private Star star;
    private ArrayList<Planet> planet = new ArrayList<Planet>();

    public SolarSystem() {
    } // default constructor

    public SolarSystem(Star star) {
        this.star = star;
    } // overloaded constructor star

    public SolarSystem(Star star, Planet planet) {
        this.star = star;
        this.planet.add(planet);
    } // adding a star/planet to the solarsystem

    public SolarSystem(Star star, ArrayList<Planet> planet) {
        this.star = star;
        this.planet = planet;
    } // adding a star/planets to the solarsystem

    public SolarSystem(Planet planet) {
        this.planet.add(planet);
    }// overloaded constuctor to add a planet

    public SolarSystem(ArrayList<Planet> planet) {
        this.planet = planet;
    }// overloaded constuctor to add planets

    public void setPlanet(Planet planet) {
        this.planet.add(planet);
    }// add a planet to the SolarSystem

    public void setPlanet(ArrayList<Planet> planet) {
        this.planet = planet;
    }// add planets to the SolarSystem

    public ArrayList<Planet> getPlanet() {
        return this.planet;
    }// get array of planets

    public Planet getPlanet(int position) {
        return this.planet.get(position);
    }// get single planet

    public void setStar(Star star) {
        this.star = star;
    } // setter method name

    public Star getStar() {
        return this.star;
    } // getter method name

}


// **MODIFICATION NEEDED**
// Use the DBPM format to complete the class.
// Review the SolarSystem class for the Star attribute as an example to follow.
// For the solarSystem attribute:
// Create 1 default constructor, 1 overloaded constuctor, 1 setter, 1 getter
class Galaxy {
    private SolarSystem solarSystem;

    public Galaxy() {
        this.solarSystem = new SolarSystem();
    }

    public Galaxy(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

    public void setSolarSystem(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

    public SolarSystem getSolarSystem() {
        return this.solarSystem;
    }
}


// **MODIFICATION NEEDED**
// Use the DBPM format to complete the class.
// Review the SolarSystem class for the Star attribute as an example to follow.
// Create a galaxy attribute of type Galaxy:
// Create 1 default constructor, 1 overloaded constuctor, 1 setter, 1 getter
public class ZachScrogginsUniverse {
    // Create a galaxy attritute of type Galaxy
    private Galaxy galaxy;

    public ZachScrogginsUniverse() {
        this.galaxy = new Galaxy();
    }

    public ZachScrogginsUniverse(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public void setGalaxy(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public Galaxy getGalaxy() {
        return this.galaxy;
    }

    // **MODIFICATION NEEDED**
    public static void main(String[] args) {
        // Create a star call Sun and set the name to SOL, set the size, no distance is needed
        Star Sun = new Star();
        Sun.setName("SOL");
        Sun.setSize(864938.0);
        // Create two planet objects called Earth and Mars
        Planet Earth = new Planet();
        Planet Mars = new Planet();
        // Set the Planet names (Blue Planet and Red Planet), the size of each planet and the
        // distance from the sun
        Earth.setName("Blue Planet");
        Earth.setSize(3959);
        Earth.setDistance(92960000);
        Mars.setName("Red Planet");
        Mars.setSize(2106);
        Mars.setDistance(141600000);
        // Create one moon for Earth called BlueMoon (named Blue moon), set the size and the
        // distance from the Earth object
        Moon BlueMoon = new Moon();
        BlueMoon.setName("Blue Moon");
        BlueMoon.setSize(1097.6);
        BlueMoon.setDistance(238900);
        // set the BlueMoon to Earth object
        Earth.setMoon(BlueMoon);
        // Create two moons for Mars called Phobos and Deimus (use as the name), set the size and
        // the distance from the Mars object
        Moon Phobos = new Moon();
        Phobos.setName("Phobos");
        Phobos.setSize(6.9);
        Phobos.setDistance(5738);
        Moon Deimus = new Moon();
        Deimus.setName("Deimus");
        Deimus.setSize(3.9);
        Deimus.setDistance(14576);
        // set the two moons to Mars
        Mars.setMoon(Phobos);
        Mars.setMoon(Deimus);
        // Create a solarSystem called InterStellerSpace
        // Set Sun (which is a star) to the SolarSystem InterStellerSpace
        SolarSystem InterStellarSpace = new SolarSystem(Sun);
        // Set the Planets, Earth and Mars to the SolarSystem InterStellerSpace
        InterStellarSpace.setPlanet(Earth);
        InterStellarSpace.setPlanet(Mars);
        // Create a galaxy object called MilkyWay
        // Set InterStellerSpace solarSystem to the galaxy MilkyWay
        Galaxy MilkyWay = new Galaxy(InterStellarSpace);

        // NO CHANGES REQUIRED
        // This will test your logic and should show the sun, two planets with their own moons and
        // all the details
        System.out.println("The Solor System contains the following");
        System.out.println("-- Sun Information --");
        System.out.println("   Name    : " + MilkyWay.getSolarSystem().getStar().getName());
        System.out.println("   Size    : " + MilkyWay.getSolarSystem().getStar().getSize());
        for (int i = 0; i < MilkyWay.getSolarSystem().getPlanet().size(); i++) {
            System.out.println("  ++ Planet Information ++");
            System.out
                    .println("     Name    : " + MilkyWay.getSolarSystem().getPlanet(i).getName());
            System.out
                    .println("     Size    : " + MilkyWay.getSolarSystem().getPlanet(i).getSize());
            System.out.println(
                    "     Distance: " + MilkyWay.getSolarSystem().getPlanet(i).getDistance());
            // for the moons for each planet
            for (int m = 0; m < MilkyWay.getSolarSystem().getPlanet(i).getMoon().size(); m++) {
                System.out.println("    !! Moon Information !!");
                System.out.println("       Name    : "
                        + MilkyWay.getSolarSystem().getPlanet(i).getMoon(m).getName());
                System.out.println("       Size    : "
                        + MilkyWay.getSolarSystem().getPlanet(i).getMoon(m).getSize());
                System.out.println("       Distance: "
                        + MilkyWay.getSolarSystem().getPlanet(i).getMoon(m).getDistance());
            }
        }
        // **MODIFICATION NEEDED**
        // Calculate the distance between the two planets
        System.out
                .println("The Distance between " + MilkyWay.getSolarSystem().getPlanet(0).getName()
                        + " and " + MilkyWay.getSolarSystem().getPlanet(1).getName() + " is "
                        + MilkyWay.getSolarSystem().getPlanet(1)
                                .calculateDistanceBetweenCelestialObject(
                                        MilkyWay.getSolarSystem().getPlanet(0)));
    }
}
