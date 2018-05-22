import java.util.HashMap;
public class AStarState
{
    private Map2D map;
    private HashMap<Location, Waypoint> openWp;
    private HashMap<Location, Waypoint> closeWp;
    
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
        openWp = new HashMap<Location, Waypoint>();
        closeWp = new HashMap<Location, Waypoint>();
    }

    public Map2D getMap()
    {
        return map;
    }

    public Waypoint getMinOpenWaypoint()
    {
        Waypoint wp_min = null;
        float min = Float.POSITIVE_INFINITY;
        for (Waypoint point: openWp.values()) {
        	float weight = point.getTotalCost();
        	if (weight < min) {
        		min = weight;
        		wp_min = point;
            }
        }
        return wp_min;
    }

    public boolean addOpenWaypoint(Waypoint newWP)
    {
        Waypoint other = openWp.get(newWP.getLocation());
        
        if(other == null || newWP.getPreviousCost() < other.getPreviousCost())
        {
            openWp.put(newWP.getLocation(), newWP);
            return true;
        }
        return false;
    }

    public int numOpenWaypoints()
    {
        return openWp.size();
    }

    public void closeWaypoint(Location loc)
    {
        Waypoint p = openWp.remove(loc);
        if(p != null)
        {
            closeWp.put(loc, p);
        }
    }

    public boolean isLocationClosed(Location loc)
    {
        return closeWp.containsKey(loc);
    }
}
