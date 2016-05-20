package gpig.group2.maps.geographic;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 19/05/2016.
 */

@XmlRootElement(name="point")
public class Point {
    @XmlAttribute(name="latitude")
    private float latitude;
    @XmlAttribute(name="longitude")
    private float longitude;

	public float getLatitude() {
		return latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public Point(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
}
