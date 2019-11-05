package sqycanada.elastic.bean;

import java.util.List;
import java.util.Map;

import org.springframework.data.geo.Point;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CaProject {
	public Boolean is_square;
	public String zip;
	public String ltype;
	public String eid;
	public String Ml_num;
	public String status;
	public String loc;
	public String address;
	public String municipality;
	public String locality;
	public String state;
	public String pstype;
	public Map price;
	public Double minPrice;
	public Double maxPrice;
	public Double latitude;
	public Double longitude;
	public Point coordinates;
	public String dimage;
	public String yrb;
	public String updatedOn;
	public String extras;
	public String uri;
	public int in_suggestion;
	public String s_County;
	public String s_Area;
	public String s_Municipality;
	public String s_Community;
	public String ptype;
   public String city;
   public List Area;
	public Double minArea;
   public Double maxArea; 
  public	String name;
  public	String description;
  public	String prkSpce;
public Boolean getIs_square() {
	return is_square;
}
public void setIs_square(Boolean is_square) {
	this.is_square = is_square;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public String getLtype() {
	return ltype;
}
public void setLtype(String ltype) {
	this.ltype = ltype;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getMl_num() {
	return Ml_num;
}
public void setMl_num(String ml_num) {
	Ml_num = ml_num;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMunicipality() {
	return municipality;
}
public void setMunicipality(String municipality) {
	this.municipality = municipality;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPstype() {
	return pstype;
}
public void setPstype(String pstype) {
	this.pstype = pstype;
}
public Map getPrice() {
	return price;
}
public void setPrice(Map price) {
	this.price = price;
}
public Double getMinPrice() {
	return minPrice;
}
public void setMinPrice(Double minPrice) {
	this.minPrice = minPrice;
}
public Double getMaxPrice() {
	return maxPrice;
}
public void setMaxPrice(Double maxPrice) {
	this.maxPrice = maxPrice;
}
public Double getLatitude() {
	return latitude;
}
public void setLatitude(Double latitude) {
	this.latitude = latitude;
}
public Double getLongitude() {
	return longitude;
}
public void setLongitude(Double longitude) {
	this.longitude = longitude;
}
public Point getCoordinates() {
	return coordinates;
}
public void setCoordinates(Point coordinates) {
	this.coordinates = coordinates;
}
public String getDimage() {
	return dimage;
}
public void setDimage(String dimage) {
	this.dimage = dimage;
}
public String getYrb() {
	return yrb;
}
public void setYrb(String yrb) {
	this.yrb = yrb;
}
public String getUpdatedOn() {
	return updatedOn;
}
public void setUpdatedOn(String updatedOn) {
	this.updatedOn = updatedOn;
}
public String getExtras() {
	return extras;
}
public void setExtras(String extras) {
	this.extras = extras;
}
public String getUri() {
	return uri;
}
public void setUri(String uri) {
	this.uri = uri;
}
public int getIn_suggestion() {
	return in_suggestion;
}
public void setIn_suggestion(int in_suggestion) {
	this.in_suggestion = in_suggestion;
}
public String getS_County() {
	return s_County;
}
public void setS_County(String s_County) {
	this.s_County = s_County;
}
public String getS_Area() {
	return s_Area;
}
public void setS_Area(String s_Area) {
	this.s_Area = s_Area;
}
public String getS_Municipality() {
	return s_Municipality;
}
public void setS_Municipality(String s_Municipality) {
	this.s_Municipality = s_Municipality;
}
public String getS_Community() {
	return s_Community;
}
public void setS_Community(String s_Community) {
	this.s_Community = s_Community;
}
public String getPtype() {
	return ptype;
}
public void setPtype(String ptype) {
	this.ptype = ptype;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List getArea() {
	return Area;
}
public void setArea(List area) {
	Area = area;
}
public Double getMinArea() {
	return minArea;
}
public void setMinArea(Double minArea) {
	this.minArea = minArea;
}
public Double getMaxArea() {
	return maxArea;
}
public void setMaxArea(Double maxArea) {
	this.maxArea = maxArea;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPrkSpce() {
	return prkSpce;
}
public void setPrkSpce(String prkSpce) {
	this.prkSpce = prkSpce;
}
  
}
